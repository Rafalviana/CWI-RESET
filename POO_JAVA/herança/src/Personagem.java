public abstract class Personagem {
    //atributos
    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    private int moedas;
    private int vidas;

    public Personagem( String nome, int idade, double altura){ //metodo construtor
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estamina = 100;
        this.moedas = 0;
        this.vidas = 1;
    }

    public void imprimiratributos(){ // imprime informações
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("ALTURA: " + altura);
        System.out.println("Estamina: " + estamina);
        System.out.println("Moedas: = " + moedas);
        System.out.println("Vidas: = " + vidas);
    }
    public void imprimesuperpoders(){ //imprime superpoderes
        System.out.println("Os super poderes são super pulo, super corrida, etc . . .");
    }

    public void quantidadeVidas(){ // adiciona 1 vida
        this.vidas = vidas +1;
    }
    public void moedasColetadas(){ // coleta 1 moeda e a cada 10 moedas soma 1 vida
        this.moedas = this.moedas + 1;
        if ( moedas %10 ==0 ){
            vidas++;
        }
        if ( vidas >=0 ){
            revigorarEstamina();
        }
    }
    public void crecer(){ // metodo para dobrar a altura
        this.altura = this.altura *2;
    }
    public void revigorarEstamina(){ // regula estamina para o maximo 100
        this.estamina =  100;
    }
    public void morrerMario(){ // zera estamina e vida de personagem
        this.estamina = estamina = 0;
        this.vidas = vidas -1;
        if ( vidas < 0){
            vidas = 0;
        } else {
            revigorarEstamina();
        }
    }
    public void saltarAltura(){ // salta se mario 1/2 da altura se luigi o dobro da altura
        if (this.nome == "Mario"){
            System.out.println("O personagem " + nome + " pula uma altura de " + this.altura * 0.5);
        }
        if(this.nome == "Luigi"){
            System.out.println("O personagem " + nome + " pula uma altura de " + this.altura * 2);
        }
    }



}
