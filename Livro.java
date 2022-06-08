package lista2;

public class Livro {

	private String nome;
	private TipoLivro tipo;
	private double valor;
	
	public Livro(String nome, TipoLivro tipo) {
		
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String GetNome() {
		
		return this.nome;
	}
	
	public TipoLivro GetTipo() {
		
		return this.tipo;
	}
	
	public void CalculaValor() {
		
		if (this.tipo.GetTipo() == 1){
			
			this.valor = 80;
		}else if (this.tipo.GetTipo() == 2){
			
			this.valor = 40;
		}else {
			
			this.valor = 20;
		}
	}
	
	public double GetValor() {
		
		return this.valor;
	}
	
}
