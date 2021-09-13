public class Herança {
    public static void main(String[] args) {
        System.out.println("- - +- - +- - +- - +- - +- - +- - +- - +- - +- - +- - +");
        Mario mario = new Mario("Broiz",40,1.60); // instancia mario

        Luigi luigi = new Luigi("Luigizin",42,1.80); // instancia luigi

        Yoshi yoshi = new Yoshi("Yoshiz",20, 0.85); // instancia yoshi

        mario.imprimimontouYoshi(); //imprime yoshi vazio
        mario.montarYoshi(yoshi); //mario monta no yoshi
        mario.imprimimontouYoshi(); ////agora imprime mario montado no yoshi

        System.out.println("- - +- - +- - +- - +- - +- - +- - +- - +- - +- - +- - +");

        luigi.luigiVoar(); //luigi voa

        System.out.println("- - +- - +- - +- - +- - +- - +- - +- - +- - +- - +- - +");

        System.out.println("Velocidade do yoshi é " + yoshi.getVelocidadedoYoshi() );
        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println("Velocidade do yoshi é " + yoshi.getVelocidadedoYoshi() );
    }
}
