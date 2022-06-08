package lista2;

import java.util.ArrayList;

public class Doc {

	private ArrayList<Cliente> clientes;
	private double quantia;
	
	public Doc(double quantia) {
		
		this.clientes = new ArrayList<Cliente>();
		this.quantia = quantia;
		
	}
	
	public void adicionaCliente(Cliente clt) {
		
		if(clt != null) {
			
			clientes.add(clt);
		}
	}
	
	public double GetQuantia() {
		
		return this.quantia;
	}
	
	public void mostraClientes() {
		
		for(Cliente c: clientes) {
			
			System.out.println(c.GetNome());
		}
		
	}
	
	public void transfere() {
		
		clientes.get(0).sacar(this.quantia);
		clientes.get(1).depositar(this.quantia);
		
	}
	
		
}
