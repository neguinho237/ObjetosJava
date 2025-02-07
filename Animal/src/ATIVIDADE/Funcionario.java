package ATIVIDADE;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public double getSalario () {
		return salario;
	}
	
	public void setSalario(double novoSalario, Gerente gerente) {
		if(gerente != null) { //Apenas um gerente pode alterar
			this.salario = novoSalario;
			System.out.println("Salario de " + nome + "alterado para " + salario);
		}else {
			System.out.println("Apenas um Gerente pode alterar o salario!");
		}
	}
}
