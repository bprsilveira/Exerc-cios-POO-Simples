package lista2;

public class MainCandidatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Exercício Candidatos: \n");
		
		Partido p1 = new Partido("Partido 1", "Centro", "P1", 66);
		Partido p2 = new Partido("Partido 2", "Direita", "P2", 31);
		Partido p3 = new Partido("Partido 3", "Esquerda", "P3", 52);
		
		Candidato c1 = new Candidato("Dr. Luis Manuel", p1);
		c1.mostraDadosCandidato();
		c1.mudaPartido(p2);
		System.out.println("\n");
		c1.mostraDadosCandidato();
		System.out.println("\n");
		
		Candidato c2 = new Candidato("Seu Richard", p3);
		c2.mostraDadosCandidato();


	}

}
