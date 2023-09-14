import dispositivo.modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("-------------------------------");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("-------------------------------");
        iphone.pausar();
        iphone.tocar();
        iphone.selecionarMusica();
        System.out.println("-------------------------------");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
    }
}