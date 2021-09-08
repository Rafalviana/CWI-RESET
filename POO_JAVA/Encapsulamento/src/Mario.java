public class Mario {
    //atributos
    private String nome;
    private int idade;
    private double altura;
    private int estamina;
    private int moedas;
    private int vidas;


    public Mario() { // valores inicial atributos
        this.nome = "Mario";
        this.idade = 42;
        this.altura = 1.50;
        this.estamina = 100;
        this.moedas = 0;
        this. vidas = 1;

    }

    public void imprimiratributos(){ // imprime informações
        System.out.println("NOME " + nome);
        System.out.println("IDADE " + idade);
        System.out.println("ALTURA " + altura);
        System.out.println("Estamina " + estamina);
        System.out.println("Moedas = " + moedas);
        System.out.println("Vidas = " + vidas);
    }

    //metodos
    public void perderEstamina(){
        this.estamina -= 50;
            if (this.estamina <0 ){
                this.estamina = 0;
            }
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
    public void revigorarEstamina(){ // regula estamina para o maximo 100
        this.estamina =  100;
    }
    public void morrerMario(){ // zera estamina e vida de mario
        this.estamina = estamina = 0;
        this.vidas = vidas -1;
            if ( vidas < 0){
                vidas = 0;
            } else {
                revigorarEstamina();
            }
    }


}
