package ATIVIDADE;

public class Teste {
	public static void main(String[] args) {
	Gerente gerente = new Gerente(" Carlos");
	Funcionario func = new Funcionario(" João", 3780);
	Funcionario func2 = new Funcionario(" Ronaldo", 1500);
	
	System.out.println("Salario atual: " + func.getSalario());
	
	func.setSalario(5000, null);
	
	func.setSalario(4200, gerente);
	func2.setSalario(2000, gerente);
	
	System.out.println("Novo salario: " + func.getSalario());
}
}
