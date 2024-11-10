public class AppNotificacao implements Observer{


    @Override
    public void atualizar(String mensagem) {
        System.out.println("App de notificação exibe alerta " + mensagem);
    }
}
