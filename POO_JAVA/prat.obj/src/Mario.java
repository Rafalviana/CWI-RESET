public class Mario {
    //atributos
    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    public  int cogumelos;
    public double crescer;


    public Mario(){
        this.nome = "Mario";
        this.idade = 42;
        this.altura = 1.50;
        this.estamina = 100;
    }

    public Mario( String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
    }

    public void imprimeAtributos(){
        System.out.println("O nome é " + this.nome);
        System.out.println("A idade é " + this.idade);
        System.out.println("A altura é " + this.altura);
        System.out.println(this.estamina);


    }

    public void imprimePoderes(){
        System.out.println("Os superpoderes são super salto,super força, etc . . . ");

    }

    public void perderEstamina(){
        this.estamina = this.estamina -10;
            if (this.estamina < 0 ) {
                this.estamina = 0;
            }
    }

    public void ganharEstamina(){
        this.estamina = this.estamina +5;
        if (this.estamina > 100 ) {
            this.estamina = 100;
        }
    }

    public void crescerCogumelos(){
        crescer =cogumelos * this.altura;
        System.out.println("A nova altura é de " + crescer + " metros");
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
}
