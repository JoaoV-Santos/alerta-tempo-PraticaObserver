public class Principal {
    public static void main(String[] args) {


        EstacaoMetereologica estacao = new EstacaoMetereologica();

        Observer radio = new EstacaoRadio();
        Observer sms = new EstacaoRadio();
        Observer app = new EstacaoRadio();

        estacao.registrarObserver(radio);
        estacao.registrarObserver(sms);
        estacao.registrarObserver(app);


        estacao.setCondicaoClimatica("Tempestade forte");
        System.out.println();


        estacao.removerObserver(sms);
        estacao.setCondicaoClimatica("Chuva leve");
    }
}
