 class Libro{
    private String titulo;
    private String autor;
    private String isbn;
    public Libro(String titulo,String autor,String isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
    }
    public String getTitulo (){return titulo;}
    public String getAutor(){return autor;}
    public String getisbn(){return isbn;}
    public void setTitulo (String titulo){this.titulo=titulo;}
    public void setAutor(){this.autor=autor;}
    public void setisbn(){this.isbn=isbn;}
}

class Lista{
    private Nodo cabeza=null;
    private int longitud;
    private class Nodo{
        public Libro libro;
        public Nodo siguiente=null;
        public Nodo(Libro libro){
            this.libro=libro;
        }
    }
    public void insertarPrincipio(Libro libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente=cabeza;
        cabeza=nodo;
        longitud++;
    }
    public void insetarAlFinal(Libro libro){
        Nodo nodo = new Nodo(libro);
        Nodo puntero = cabeza;
        while(puntero.siguiente!=null){
            puntero = puntero.siguiente;

        }
        puntero.siguiente=nodo;
        longitud++;
    }
    public void insertarDespues(int n,Libro libro){
        Nodo nodo = new Nodo(libro);
        if(cabeza==null){
            cabeza=nodo;
        }
        else{ 
        Nodo puntero = cabeza;
        int contador = 0;
        while (puntero.siguiente!=null&&contador<n) {
            puntero=puntero.siguiente;
            contador++;
        }
        nodo.siguiente=puntero.siguiente;
        puntero.siguiente=nodo;}
    }
    public Libro obtener(int n ){
        if(cabeza==null){
            return null;
        }
        else{
            int contador = 0 ;
            Nodo puntero = cabeza;   
            while (puntero.siguiente!=null && contador <n) {
                puntero=puntero.siguiente;
                contador++;
            }
            if(contador!=n){
                return null;
            }
            else{
                return puntero.libro;
            }
        }
    }
    public int contar(){
        return longitud;
    }
    public void eliminarPrimero(){
        if(cabeza!=null){ 
        Nodo primer = cabeza;
        cabeza= cabeza.siguiente;
        primer.siguiente = null;
        longitud--;}
    }
    public void eliminarUltimo(){
        if(cabeza!=null){
            if(cabeza.siguiente==null){
                cabeza=null;
            }
            else{ 
            Nodo puntero = cabeza;
            while (puntero.siguiente.siguiente==null) {
                puntero=puntero.siguiente;
            }
            puntero.siguiente=null;
            longitud--;
        }}
    }
    public void eliminarLibro(int n){
        if(cabeza != null){
            if(n==0){
                Nodo primer = cabeza;
                cabeza=cabeza.siguiente;
                primer.siguiente=null;
                longitud--;
            }
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador<n-1) {
                puntero=puntero.siguiente;
                contador++;
            }
            Nodo temp = puntero.siguiente;
            puntero.siguiente=temp.siguiente;
            temp.siguiente=null;
            longitud--;
        }
    }
}












public class ListaEnl{
    public static void main(String[] args) {
        
    }
}

