package animal;

public class Cachorro {
	//atributos (estado)
	
	public String nome;
	public String raca;
	public boolean fome = true;
	public boolean sono = true;
	
    public Tutor mestre;
	
	
	//metodos (comportamento)
	
	public void latir (int latidos) {
		System.out.println("Au Au");
		System.out.println(this.nome + "latindo");
		for (int i = 0; i < latidos; i ++) {
			System.out.printf("Au Au");
		}
	}
	
	public void info () {
		System.out.printf("Nome: %s%nRaça:  %s%n" , this.nome , this.raca );
		
		//condição ? valor se v : valor se f
		System.out.println(fome ? "Estou com fome" : "Não estou com fome");
	}
	
	public void comer() {
		if(fome == true) {
			fome = false;
		}
	}
	
	public void dormir() {
		System.out.println(" zzzzzzzzzzzzz");
		fome = true;
	}
	
	private void chorar() {
		System.out.println("uim uim uim uim :(");
	}
	
	public void morder(Cachorro dog) {
		dog.chorar();
		dog.fome = true;
	}

	public void tutor (){

	}
}
