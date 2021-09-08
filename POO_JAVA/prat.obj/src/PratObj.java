public class PratObj {
    public static void main(String[] args) {
        Mario mario1 = new Mario();
        mario1.imprimeAtributos();
        mario1.imprimePoderes();

        Mario mario2 =new Mario("Broiz",42,1.5);
        mario2.perderEstamina();
        mario2.ganharEstamina();
        mario2.imprimeAtributos();
        mario2.cogumelos = 2;
        mario2.crescerCogumelos();

    }
}
