import java.util.Scanner;

public class LeituraNomesUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }
        System.out.println(nomes[0] +","+ nomes[1] +","+ nomes[2]);
    }
}
