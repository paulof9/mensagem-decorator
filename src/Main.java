public class Main {

    public static void main(String[] args) {
        Elemento mensagem = new Mensagem("Boa noite");
        System.out.println(mensagem.imprimeTexto());

        mensagem = new NegritoDecorator(mensagem, "Boa");
        System.out.println(mensagem.imprimeTexto());

        mensagem = new ItalicoDecorator(mensagem, "*");
        System.out.println(mensagem.imprimeTexto());
    }
}
