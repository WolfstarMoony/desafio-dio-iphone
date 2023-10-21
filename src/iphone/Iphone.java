package iphone;

public class Iphone {
    // Atributos
    private boolean reproduzindoMusica;
    private boolean emChamada;
    private boolean navegandoNaInternet;
    private String faixaAtual;
    private String numeroChamadaAtual;
    private String paginaAtual;

    // Construtor
    public Iphone() {
        reproduzindoMusica = false;
        emChamada = false;
        navegandoNaInternet = false;
        faixaAtual = "";
        numeroChamadaAtual = "";
        paginaAtual = "";
    }

    // Métodos para o Reprodutor Musical
    public void reproduzirMusica(String musica) {
        faixaAtual = musica;
        reproduzindoMusica = true;
        System.out.println("Reproduzindo: " + musica);
    }

    public void pausarMusica() {
        if (reproduzindoMusica) {
            System.out.println("Pausando música");
            reproduzindoMusica = false;
        }
    }

    public void avancarFaixa() {
        if (reproduzindoMusica) {
            System.out.println("Avançando para a próxima faixa");
        }
    }

    public void retrocederFaixa() {
        if (reproduzindoMusica) {
            System.out.println("Retrocedendo para a faixa anterior");
        }
    }

    // Métodos para o Aparelho Telefônico
    public void fazerChamada(String numero) {
        numeroChamadaAtual = numero;
        emChamada = true;
        System.out.println("Chamando: " + numero);
    }

    public void receberChamada(String numero) {
        numeroChamadaAtual = numero;
        emChamada = true;
        System.out.println("Recebendo chamada de: " + numero);
    }

    public void encerrarChamada() {
        if (emChamada) {
            System.out.println("Encerrando chamada com: " + numeroChamadaAtual);
            emChamada = false;
        }
    }

    // Métodos para o Navegador na Internet
    public void abrirPaginaWeb(String url) {
        paginaAtual = url;
        navegandoNaInternet = true;
        System.out.println("Abrindo página: " + url);
    }

    public void fecharPaginaWeb() {
        if (navegandoNaInternet) {
            System.out.println("Fechando página: " + paginaAtual);
            navegandoNaInternet = false;
        }
    }

    public void navegarPagina(String url) {
        if (navegandoNaInternet) {
            System.out.println("Navegando para: " + url);
            paginaAtual = url;
        }
    }

    public String getFaixaAtual() {
        return faixaAtual;
    }
}
