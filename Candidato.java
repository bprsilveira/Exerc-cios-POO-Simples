package lista2;

public class Candidato {

	private String nome;
	private Partido partido;
	
	public Candidato(String nome, Partido partido) {
		
		this.nome = nome;
		this.partido = partido;
		
	}
	
	public void mostraDadosCandidato() {
		
		System.out.println("Nome: " + nome);
		partido.mostraDados();
		
	}
	
	void mudaPartido(Partido novopartido) {
		
		this.partido = novopartido;
		
	}
	
}
