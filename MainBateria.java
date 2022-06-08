package lista2;

public class MainBateria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Exercício Bateria: \n");
		
		Bateria bat = new Bateria(50);
		Bateria bat2 = new Bateria(80);
		Bateria bat3 = new Bateria(21);
		Bateria bat4 = new Bateria(5);
		
		Celular cel = new Celular("USUÁRIO 1", "996776666", false, bat3);
		
		cel.liga();
		cel.mostraCarga();
		cel.estado();
		cel.recargaCelular();
		cel.recargaCelular();
		cel.recargaCelular();
		cel.recargaCelular();
		cel.mostraCarga();
	
		System.out.println("\n");
		
		Celular cel2 = new Celular("Usuário 2", "996885555", false, bat2);
		
		cel2.liga();
		cel2.som();
		cel2.mostraCarga();
		cel2.desliga();
		cel2.estado();
	
		System.out.println("\n");
				
        Celular cel3 = new Celular("USUÁRIO 3", "988993322", false, bat);
		
		cel3.liga();
		cel3.som();
		cel3.mostraCarga();
		cel3.desliga();
		cel3.estado();
		System.out.println("\n");
	

	}

}
