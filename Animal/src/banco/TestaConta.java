package banco;

public class TestaConta {
	public static void main(String[] args) {
		//criando uma conta
		ContaCorrente c1 = new ContaCorrente();
		c1.banco = "Itau";
		c1.agencia = "4889";
		c1.nrConta = "1234-5";
		c1.titular = "Ana Maria";
		c1.depositar(200);
		
		System.out.println(c1.exibirSaldo());
		
		// if(c1.sacarDinheiro(200)) {
		// 	System.err.println("saque reaalizado com sucesso");
		// }else {
		// 	System.err.println("Não foi possivell realizar o saque");
		// }
		// System.out.println(c1.exibirSaldo());
		
		
	}
	
	
	
}
