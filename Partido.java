package lista2;

public class Partido {
	
	private String nome, ideologia, sigla;
	private int numero;
	
	public Partido(String nome, String ideologia, String sigla, int numero) {
		
		this.nome = nome;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.numero = numero;
					
	}
	
	public void mostraDados() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Ideologia: " + this.ideologia);
		System.out.println("Sigla: " + this.sigla);
		System.out.println("Número: " + this.numero);
	
	}

}
