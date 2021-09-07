package Loop;

public class LoopWhile {

    public static void main(String[] args) {

        int i = 1;
        int max = 15;

        while ( i <= max ){
            System.out.println("O valor de i 'e " + i);
            i++;
        }
        System.out.println(i);
        System.out.println("--------------------");

        int x = 1;

        do{
            x++;
            System.out.println("O valor de x 'e " + x);
        } while ( x < 15);
        System.out.println(x);

    }
}
