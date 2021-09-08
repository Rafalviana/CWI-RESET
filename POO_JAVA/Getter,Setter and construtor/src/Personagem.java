import java.sql.SQLOutput;

public class Personagem {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.imprimcaract();
        mario.imprimpoderes();

        System.out.println("- - - - - - - - - - - - - - - - - - - ");

        Mario mario2 = new Mario("Mario Bros", 40, 1.5,true,100 );
        mario2.imprimcaract();
        mario2.imprimpoderes();

        System.out.println("- - - - - - - - - - - - - - - - - - - ");

        Mario mario3 = new Mario("teste",29,1.70,false,50);
        mario3.imprimcaract();

        System.out.println("- - - - - - - - - - - - - - - - - - - ");

        mario3.setNome("Broizin");
        mario3.setAltura(1.65);
        mario3.imprimcaract();
        mario3.imprimpoderes();


    }
}
