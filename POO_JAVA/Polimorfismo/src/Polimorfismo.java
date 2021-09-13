public class Polimorfismo {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario Bros",40,1.60);

        Luigi luigi = new Luigi("Luigi",40,1.80);

        Yoshi yoshi = new Yoshi("Yoshi",20,1.2);

        mario.saltarAltura(2);
        luigi.saltarAltura(3);
        yoshi.saltarAltura(4);
    }
}
