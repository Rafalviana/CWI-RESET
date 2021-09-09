public class RelacionamentoAgregacao {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Mario",40,1.6);


        Personagem personagem2 = new Personagem("Luigi",40,1.8);

        Jogo jogo = new Jogo(personagem1,personagem2);
        jogo.jogar();
    }
}
