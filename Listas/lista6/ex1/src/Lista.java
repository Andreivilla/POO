public class Lista <T>{
    private T[] lista;
    private int tam;
    //private Iterator<T> iteratorImpar = new IteratorListaImpar<>(this);

    public Lista(int tam){
        this.tam = tam;
        this.lista = (T[]) new Object[this.tam];
    }

    //getters
    public T get(int i){
        return this.lista[i];
    }
    public int getTam() {
        return tam;
    }


    //setters
    public void set(int i, T add){
        this.lista[i] = add;
    }
    public void setLista(T[] lista) {
        this.lista = lista;
    }
    public void setTam(int tam) {
        this.tam = tam;
    }
}
