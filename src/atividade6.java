import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        Double somaDosNumeros = 0.0;
        System.out.println("Digite a quantidade de numeros que você quer fazer a media: ");
        n = sc.nextInt();
        int[] valores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores que deseja fazer a media: ");
            valores[i] = sc.nextInt();

            somaDosNumeros = valores[i] + somaDosNumeros;
        }
        System.out.printf("A média será de:" + somaDosNumeros / n);



    }
}
