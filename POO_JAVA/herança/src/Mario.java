// extensão do personagem mario
public class Mario extends Personagem{
    private  Yoshi yoshi;

    public Mario(String nome, int idade,double altura){ // construtor mario
        super( nome, idade, altura );
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
