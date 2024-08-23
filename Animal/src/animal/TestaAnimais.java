package animal;

import javax.swing.JOptionPane;

public class TestaAnimais {
	public static void main(String[] args) {
		//criando um cachorro
		
		Cachorro dog1 = new Cachorro();
		dog1.nome = " Rex ";
		dog1.raca = "Labrador";
		dog1.comer();
		
		dog1.info();
		
		Cachorro dog2 = new Cachorro ();
		dog2.nome = " Snow ";
		dog2.raca = "husky";
		
		dog2.dormir();
		dog2.info();
		
		System.out.println("mordida");
		dog1.info();
		dog2.morder(dog1);
		dog1.info();
		
	
	}
	
	
	
}
