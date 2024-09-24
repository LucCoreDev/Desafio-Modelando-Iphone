package modelagem;

public class Main {
 public static void main(String[] args) {
	Iphone meuIphone = new Iphone();
	
	//Reprodutor Musical
	meuIphone.selecionarMusica("Freno - infância");
	meuIphone.tocar();
	meuIphone.pausar();
	
	// AparelhoTelefonico
	meuIphone.ligar("(11)987373873");
	meuIphone.atender();
	meuIphone.iniciarCorreioVoz();
	
	// NavegadorInternet
	meuIphone.exibirPagina("www.youtube.com");
	meuIphone.adicionarNovaAba();
	meuIphone.atualizarPagina();
}
}
