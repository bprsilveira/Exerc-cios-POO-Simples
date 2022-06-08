package lista2;

public enum TipoLivro {
	
	FISICO(1), PDF(2), EPUB(3);
	
	private int codLivro;
	
	TipoLivro(int codLivro){
		
		this.codLivro = codLivro;
		
	}
	
	public int GetTipo() {
		
		return this.codLivro;
	}

}
