package animal;

public class TestaTutor {
    public static void main(String[] args) {
        // criando tutuor

      Tutor mestre = new Tutor();
      mestre.nome = "Bruno";
      mestre.tel = "11946244892";
      mestre.endereco = "Disney-Land";
    

    //   criando cachorros
      Cachorro dog1 = new Cachorro();
      dog1.nome = "Kha'zix";
      dog1.raca = "Vira-lata";
      dog1.mestre = mestre;


      Cachorro dog2 = new Cachorro();
      dog2.nome = "Klaus";
      dog2.raca = "Pastor-alemão";
      dog2.mestre = mestre;

      dog2.mestre.nome = "Osvaldo";
      System.out.println(dog1.mestre.nome);
      System.out.println(dog2.mestre.nome);
      System.out.println(mestre.nome);
      
    }
}
