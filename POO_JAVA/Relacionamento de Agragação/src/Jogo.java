import java.util.Random; // importa classe aleatorio

public class Jogo { // classe jogo
    private Personagem player1; // define os personagens
    private Personagem player2; // define os personagens

    public Jogo(Personagem player1, Personagem player2){ //define quem vai participar do jogo
        this.player1 = player1;
        this.player2 = player2;
    }

    public void jogar(){ //metodo jogar
        Random geradorAleatoio = new Random(); // cria novo objeto aleatorio

        int quantidadePlayer1Coleta = geradorAleatoio.nextInt(30); // coleta de moedas do player1
            for(int coleta = 0; coleta < quantidadePlayer1Coleta;coleta++){
                player1.moedasColetadas();
            }
        int quantidadePlayer2Coleta = geradorAleatoio.nextInt(30); // coleta de moedas do player2
        for(int coleta = 0; coleta < quantidadePlayer2Coleta;coleta++){
            player2.moedasColetadas();
        }

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("Quantidade coletada pelo player1 = " +quantidadePlayer1Coleta);
        System.out.println("Player1");
        player1.imprimiratributos();

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("Quantidade coletada pelo player2 = " +quantidadePlayer2Coleta);
        System.out.println("Player2");
        player2.imprimiratributos();

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        if (quantidadePlayer1Coleta > quantidadePlayer2Coleta){
            System.out.println("Player 1 venceu");
        }
        if (quantidadePlayer2Coleta > quantidadePlayer1Coleta){
            System.out.println("Player 2 venceu");
        }
        if (quantidadePlayer1Coleta == quantidadePlayer2Coleta){
            System.out.println("EMPATE");
        }
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
}
