package banco;

public class TestaContrutorConta {
    public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(0,10001, "1234", "777-7", "Itaú",
				new Cliente ("Paulo", "777.444-88"));
		System.out.println(conta.titular.nome);
	
	}
}
