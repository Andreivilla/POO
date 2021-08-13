public interface Sujeito {
    public void adicionoar(Observador observador);
    public void remover(Observador observador);
    public void notificar();
}
