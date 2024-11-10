public class EstacaoRadio implements Observer{

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Estação de rádio transmitindo alerta de clima: " + mensagem);
    }
}
