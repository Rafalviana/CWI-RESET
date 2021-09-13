public class Luigi extends Personagem{
        public  Luigi( String nome, int idade, double altura ){
            super( nome, idade, altura );
        }

    @Override
    public void crecer() { //  *** POLIMORFISMO POR SOBREPOSIÇÂO ***
        this.altura = this.altura * 1.75;
    }

    public void luigiVoar(){
            System.out.println("Luigi está voando");
        }

}
