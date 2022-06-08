package lista2;

public class MainClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		System.out.println("Exercício Clientes: \n");
		
		Cliente c1 = new Cliente("Luis Mario", 1000, 3000);
		Cliente c2 = new Cliente("Manoel", 3000, 5000);
		Cliente c3 = new Cliente("Djanira", 500, 8000);
		
		System.out.println(c1.GetNome());
		System.out.println("Saldo: " + c1.GetSaldo());
		System.out.println("Limite: " + c1.checaSaldo());
		
		System.out.println("\n");
		
		System.out.println(c2.GetNome());
		System.out.println("Saldo: " + c2.GetSaldo());
		System.out.println("Limite: " + c2.checaSaldo());
		System.out.println("\n");
		
		Doc doc1 = new Doc(300);
		
		doc1.adicionaCliente(c1);
		doc1.adicionaCliente(c2);
		
		doc1.mostraClientes();
		//System.out.println(doc1.GetQuantia());
		
		doc1.transfere();
		
		System.out.println(c1.GetNome());
		System.out.println("Saldo: " + c1.GetSaldo());
		System.out.println("Limite: " + c1.checaSaldo());
		
		System.out.println("\n");
		
		System.out.println(c2.GetNome());
		System.out.println("Saldo: " + c2.GetSaldo());
		System.out.println("Limite: " + c2.checaSaldo());
		System.out.println("\n");
				
		
		
	
	}

}
