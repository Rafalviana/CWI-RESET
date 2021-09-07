package OoCaneta;

public class MetodoPincipal {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampada = false; //chamada p/ atributos OBS: SEM ()
        c1.status(); // chamada p/ metodo COM ()
    }
}
