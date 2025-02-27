public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música "+musica);
    }

    @Override
    public void exibirPagina(String url) {
    System.out.println("Página sendo exibida...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Atualizando página...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número... "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    
    
}
