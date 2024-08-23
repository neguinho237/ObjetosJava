package banco;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "José Carlos";
        c1.cpf = "111.222.333-44";
        
        Cliente c2 = new Cliente();
        c1.nome = "Maria Paula";
        c1.cpf = "111.222.333-54";

        ContaCorrente cont1 = new ContaCorrente();
        cont1.nrConta = "1234-5";
        cont1.agencia = "444";
        cont1.titular = c1;

        ContaCorrente cont2 = new ContaCorrente();
        cont2.nrConta = "1234-5";
        cont2.agencia = "777";
        cont2.titular = c2;

        c1.nome = "Carlos";
        c1 = null;
        System.err.println(cont1.titular.nome);
        System.err.println(cont2.titular.nome);
    }
}
