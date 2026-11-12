public class NegritoDecorator extends MensagemDecorator {

    private String trecho;

    public NegritoDecorator(Elemento elementoDecorado, String trecho) {
        super(elementoDecorado);
        this.trecho = trecho;
    }

    @Override
    public String imprimeTexto() {
        String texto = super.imprimeTexto();
        if (trecho.equals("*")) {
            return "*" + texto + "*";
        }
        return texto.replace(trecho, "*" + trecho + "*");
    }
}
