package iphone;
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Reprodução de música
        iphone.reproduzirMusica("Música 1");
        iphone.pausarMusica();
        iphone.avancarFaixa();
        iphone.reproduzirMusica("Música 2");

        // Fazendo chamadas
        iphone.fazerChamada("123-456-789");
        iphone.encerrarChamada();

        // Navegação na internet
        iphone.abrirPaginaWeb("www.example.com");
        iphone.navegarPagina("www.example.com");
        iphone.fecharPaginaWeb();

        // Exemplo de como obter a faixa atual
        String faixaAtual = iphone.getFaixaAtual();
        System.out.println("Faixa Atual: " + faixaAtual);
    }
}
