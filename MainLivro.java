package lista2;

public class MainLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Exercício livro: \n");
		
		Livro l1 = new Livro("Livro 1", TipoLivro.FISICO);
		
		l1.CalculaValor();
		
		System.out.println("Valor: " + l1.GetValor());
		
        Livro l2 = new Livro("Livro 2", TipoLivro.PDF);
		
		l2.CalculaValor();
		
		System.out.println("Valor: " + l2.GetValor());
		
        Livro l3 = new Livro("Livro 3", TipoLivro.EPUB);
		
		l3.CalculaValor();
		
		System.out.println("Valor: " + l3.GetValor());

	}

}
