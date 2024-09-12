import java.util.Scanner;

public class atividade1  {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber sua tabuaba: ");
        int num = sc.nextInt();
        System.out.println("O valor da tabuada do " + num + " é:");
        for(int i = 0; i < 10; i++){
         System.out.println(num + "x" + (i + 1) + ": " + (i + 1) * num);
        }
    }
}