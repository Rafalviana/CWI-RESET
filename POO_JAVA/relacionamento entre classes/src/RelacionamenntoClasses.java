public class RelacionamenntoClasses {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Mario",40,1.6);
            personagem1.crecer();
            personagem1.imprimiratributos();
            personagem1.saltarAltura();

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        Personagem personagem2 = new Personagem("Luigi",40,1.8);
        personagem2.imprimiratributos();
        personagem2.saltarAltura();

    }

}
