import java.util.Scanner;

public class LeituraValoresUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor: ");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("Os valores são: "+ numeros[0] +","+numeros[1] +","+ numeros[2] + "\nA média dos valores: "+ ((numeros[0]+numeros[1]+numeros[2])/3));
    }
}
