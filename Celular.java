package lista2;

public class Celular {

	private String nomeUser;
	private String numero;
	private boolean ligado;
	private Bateria bateria;
	
	public Celular(String nomeUser, String numero, boolean ligado, Bateria bateria) {
		
		this.nomeUser = nomeUser;
		this.numero = numero;
		this.ligado = ligado;
		this.bateria = bateria;
		
	}
	
	public void liga() {
		
		if(ligado == false && bateria.GetCarga() > 20) {
		  
		  this.ligado = true;
		  bateria.descarrega();
		  bateria.descarrega();
			
		  if(bateria.GetCarga() > 20) {	
			 
		    System.out.println("Nome: " + this.nomeUser);
		    System.out.println("Número: " + this.numero);
		
		  }else if(bateria.GetCarga() > 0 && bateria.GetCarga() < 20) {
			  
			  System.out.println("Bateria fraca");
			  
		  }
		}
	}
	
	
	public void desliga() {
		
		if(ligado == true) {
			bateria.descarrega();
			
			this.ligado = false;
			
			if(bateria.GetCarga() > 10) {
				
				System.out.println("Desligando aparelho");
				
			}
		}
		
	}
	
	public void som() {
		
		if(ligado = true && bateria.GetCarga() > 10) {
			
			System.out.println("Som!");
			
		}
		
	}
	
	public void estado() {
		
		if(ligado == true) {
			
			System.out.println("Aparelho ligado");
			
		}else {
			
			System.out.println("Aparelho desligado");
		}
		
	}
	
	
	public void mostraCarga() {
		
		System.out.println("Bateria: " + bateria.GetCarga());
		
	}
	
	public void recargaCelular() {
		
		bateria.carrega();
	}
	
}
