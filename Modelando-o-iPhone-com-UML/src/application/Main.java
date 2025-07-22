package application;
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funções do reprodutor musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.pausar();

        // Testando funções do telefone
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funções do navegador
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
