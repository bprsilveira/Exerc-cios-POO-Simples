package lista2;

public class Bateria {
	
	private int carga;
	
	public Bateria(int carga) {
		
		this.carga = carga;
		
	}
	
	public int GetCarga() {
		
		return this.carga;
		
	}

	public void descarrega() {
		
		if(GetCarga() > 0) {
			
			if(this.carga >= 10) {
			
			  this.carga = this.carga - 10;
			
			}else {
				
			  this.carga = 0;
				
			}
		}
		
	}
	
	public void carrega() {
		 
		if(GetCarga()<100) {
			
			if(this.carga <= 95) {
				
				this.carga = this.carga + 5;
			}else {
				
				this.carga = 100;
				
			}
			
		}
		
	}
	
}
