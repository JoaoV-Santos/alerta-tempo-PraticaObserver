public interface AlertaClima {

    void registrarObserver(Observer observer);

    void removerObserver(Observer observer);

    void notificarObserver(String mensagem);
}
