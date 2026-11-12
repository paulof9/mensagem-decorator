public class Mensagem extends Elemento {

    public Mensagem(String texto) {
        this.texto = texto;
    }

    @Override
    public String imprimeTexto() {
        return texto;
    }
}
