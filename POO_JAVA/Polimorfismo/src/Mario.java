public class Mario extends Personagem{
    private  Yoshi yoshi;

    public Mario(String nome, int idade,double altura){ // construtor mario
        super( nome, idade, altura );
    }

    @Override
    public void crecer() { //  *** POLIMORFISMO POR SOBREPOSIÇÂO ***
        this.altura = this.altura * 1.5;
    }

    public void montarYoshi( Yoshi yoshi){ // metodo montar no yoshi
        this.yoshi = yoshi;
    }

    public void imprimimontouYoshi(){ //metodo montar no yoshi
        if ( this.yoshi != null){
            System.out.println("Mario montou no Yoshi");
        } else {
            System.out.println("Mario não chamou o Yoshi");
        }
    }


}
