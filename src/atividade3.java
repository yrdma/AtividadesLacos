import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();


        System.out.println("O fatorial de " + numero + " é: " + fatorial(numero));
    }


    public static int fatorial(int n) {
        int resultado = 1;
        int i = n;


        do {
            resultado *= i;
            i--;
        } while (i > 1);

        return resultado;
    }
}