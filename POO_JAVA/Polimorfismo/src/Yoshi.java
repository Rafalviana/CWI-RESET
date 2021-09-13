public class Yoshi extends Personagem{
        private int qtdFrutasComidas = 0;
        private int velocidadedoYoshi = 10;

        public Yoshi( String nome, int idade, double altura){
            super(nome,idade,altura);
        }

    @Override
    public void crecer() { //  *** POLIMORFISMO POR SOBREPOSIÇÂO ***
        this.altura = this.altura * 1.1;
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
