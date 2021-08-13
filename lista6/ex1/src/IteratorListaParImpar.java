public class IteratorListaParImpar <T> implements Iterator{
    private Lista<T> lista;

    private IteratorListaPar<T> iteretorListaPar; //= new IteratorListaPar<>(this.lista);
    private IteratorListaImpar<T> iteratorListaImpar; // = new IteratorListaImpar<>(this.lista);

    public IteratorListaParImpar(Lista<T> lista) {
        this.lista = lista;
        this.iteretorListaPar = new IteratorListaPar<>(this.lista);
        this.iteratorListaImpar = new IteratorListaImpar<>(this.lista);
    }


    @Override
    public boolean hasNext() {
        if (this.iteretorListaPar.hasNext()){
            return true;
        }else if (this.iteratorListaImpar.hasNext()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public T next() {
        if (this.iteretorListaPar.hasNext()){
            return this.iteretorListaPar.next();
        }else{
            return this.iteratorListaImpar.next();
        }

    }

    @Override
    public void reset() {
        this.iteratorListaImpar.reset();
        this.iteretorListaPar.reset();
    }
}
