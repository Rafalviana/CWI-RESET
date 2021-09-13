//extensao do personagem yoshi
public class Yoshi extends Personagem{
    private int qtdFrutasComidas = 0;
    private int velocidadedoYoshi = 10;

    public Yoshi( String nome, int idade, double altura){
        super(nome,idade,altura);
    }

    public void comerFruta(){
        qtdFrutasComidas++;
        if (qtdFrutasComidas % 2 == 0){
            velocidadedoYoshi *=2;
        }
    }

    public int getVelocidadedoYoshi(){
        return velocidadedoYoshi;
    }
}
