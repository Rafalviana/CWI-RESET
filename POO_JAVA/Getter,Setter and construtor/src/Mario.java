
public class Mario { // atributos do objeto
    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    private boolean superpoderes;

     public Mario() {
        this.nome = "Mario";
        this.idade = 40;
        this.altura = 1.50;
        this.estamina = 100;
        this.superpoderes = true;
    }

    public Mario( String nome, int idade, double altura,boolean superpoderes,int estamina){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.superpoderes = superpoderes;
    }

    public void imprimcaract (){ // metodo para impressão na tela das caracteristicas
        System.out.println("O nome do personagem é " + nome);
        System.out.println("Sua idade é " + idade +  " anos");
        System.out.println("Qual altura o  personagem tem ? " + altura + " metros");
        System.out.println("Quanto o personagem tem de estamina " + estamina );
        

    }

    protected void imprimpoderes (){ // metodo para impressão dos superpoderes
        if (superpoderes){
            System.out.println("Os superpoderes de " + nome + " são: super corrida,salto e força");
        }
        else
            System.out.println("Voçe deve se informar melhor " + nome + " não tem superpoderes");
    }


    public String getNome(){

         return nome;
    }
    public void setNome( String nome ){

         this.nome = nome;
    }
    public  int getIdade(){

         return idade;
    }
    public void setIdade( int idade ){

         this.idade = idade;
    }

    public double getAltura() {

         return altura;
    }
    public void setAltura(  double altura ){

         this.altura = idade;
    }
    public boolean getSuperpoderes(){
         return superpoderes;
    }
    public void setSuperpoderes( boolean superpoderes){
         this.superpoderes = superpoderes;
    }

    public int getEstamina(){
         return estamina;
    }
    public void setEstamina( int estamina ){
         this.estamina = estamina;
    }

}
