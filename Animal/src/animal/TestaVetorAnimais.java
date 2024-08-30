package animal;

public class TestaVetorAnimais {
    public static void main(String[] args) {
        Cachorro [] cachorros = new Cachorro[10];
        
        for (int i = 0; i < cachorros.length; i++){
            cachorros[i] = new Cachorro("cachorro" + i, "Poodle");
        }

        for(int i = 0; i < cachorros.length; i ++){
            cachorros[i].latir(10);
        }
        
    }
}
