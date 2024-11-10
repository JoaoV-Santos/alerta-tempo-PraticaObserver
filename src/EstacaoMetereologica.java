import java.util.ArrayList;
import java.util.List;

public class EstacaoMetereologica implements AlertaClima{
    private List<Observer> observerList = new ArrayList<>();
    private String condicaoClimatica;

    @Override
    public void registrarObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notificarObserver(String mensagem) {
        for (Observer observer: observerList) {
            observer.atualizar(mensagem);
        }
    }

    public void setCondicaoClimatica(String novaCondicao) {
        this.condicaoClimatica = novaCondicao;
        System.out.println("Clima mudou para: " + novaCondicao);
        notificarObserver(novaCondicao);
    }
}
