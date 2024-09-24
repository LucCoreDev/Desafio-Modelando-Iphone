package modelagem;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

	// Reprodutor Musical
	public void tocar() {
		System.out.println("Reproduzindo a Música");
	}
	public void pausar() {
		System.out.println("Parando a Música");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada " + musica);
	}
	
	// Aparelho telefonico
	public void ligar(String numero) {
		System.out.println("Ligando para  " + numero);
	}
	public void atender() {
		System.out.println("Atendendo chamada");
	}
	public void iniciarCorreioVoz(){
		System.out.println("Correio de voz ativado");
	}
	
	// NavegadorInternet
	public void exibirPagina(String url) {
		System.out.println("Exibir a página " + url);
	}
	public void adicionarNovaAba() {
		System.out.println("Nova aba adiconada");
	}
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}
}
