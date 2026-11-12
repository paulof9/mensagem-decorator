public abstract class MensagemDecorator extends Elemento {

    protected Elemento elementoDecorado;

    public MensagemDecorator(Elemento elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

    @Override
    public String imprimeTexto() {
        return elementoDecorado.imprimeTexto();
    }
}
