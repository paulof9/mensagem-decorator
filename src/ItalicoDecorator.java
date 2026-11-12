public class ItalicoDecorator extends MensagemDecorator {

    private String trecho;

    public ItalicoDecorator(Elemento elementoDecorado, String trecho) {
        super(elementoDecorado);
        this.trecho = trecho;
    }

    @Override
    public String imprimeTexto() {
        String texto = super.imprimeTexto();
        if (trecho.equals("*")) {
            return "_" + texto + "_";
        }
        return texto.replace(trecho, "_" + trecho + "_");
    }
}
