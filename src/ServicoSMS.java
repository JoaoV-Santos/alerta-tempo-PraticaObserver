public class ServicoSMS implements Observer{
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Serviçco de SMS enviando alerta: " + mensagem);
    }
}
