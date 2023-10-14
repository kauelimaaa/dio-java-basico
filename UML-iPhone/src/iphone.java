
import AparelhoTelefonico.Telefone;
import NavegadorInternet.Internet;
import ReprodutorMusical.Ipod;

public class iphone  {

    public static void main(String[] args) {

        Telefone celularTelefone = new Telefone();

        celularTelefone.fazerLigacao();
        celularTelefone.iniciarCorreioDeVoz();
        celularTelefone.atenderLigacao();

        Internet celularInternet = new Internet();

        celularInternet.abrirPagina();
        celularInternet.atualizarPagina();
        celularInternet.abrirNovaPagina();

        Ipod celularIpod = new Ipod();

        celularIpod.selecionarMusica();
        celularIpod.TocarMusica();
        celularIpod.PausarMusica();
    }
}
