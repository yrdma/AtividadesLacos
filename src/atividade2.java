import java.util.Scanner;

import static java.lang.Thread.sleep;

public class atividade2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para realizar uma contagem regreciva: ");
        int num = sc.nextInt();

        System.out.println("Vamos começar a contagem Regreciva");
        while (num > 0) {
            sleep(1000);
            System.out.println(num);
            num--;
        }

    }

}