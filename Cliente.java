package lista2;

public class Cliente {
	
	private String nome;
	private double saldo, limite;
	
	public Cliente(String nome, double saldo, double limite) {
		
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		
	}
	
	public void sacar(double val) {
		
		if(val < this.limite + this.saldo) {
			
		   this.saldo = this.saldo - val; 
		
		}
	}
	
	public void depositar(double val) {
		
		this.saldo = this.saldo + val;
		
	}
	
	public double checaSaldo() {
		
		return this.saldo + this.limite;
		
	}
	
	public String GetNome() {
		
		return this.nome;
	}
	
	public double GetSaldo() {
		
		return this.saldo;
	}
	
	public double GetLimite() {
		
		return this.limite;
	}
}
