
package All;
import All.view.TelaBits;
import All.view.TelaBitsString;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Mariana Souza - 3898
 */

public class Main {
    public static void main(String[] args){
        int size = 0;
        int option;
        Scanner scan = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.print("\n==============Atividade 04 - Projeto e Analise de Algoritmos=================\n");
                System.out.print("\n");
                System.out.print("Insira o tamanho do array de bits: ");

                size = scan.nextInt();
                continueLoop = false;
                System.out.println("\n============================================================================\n");


            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Tente novamente => Insira um inteiro");
                scan.nextLine();
            }
        } while (continueLoop);

        continueLoop = true;

        while (true) {
            mostrarMenu();
            do {
                try {
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            TelaBits tela = new TelaBits(size);
                            tela.telaInicial();
                            break;
                        case 2:
                            TelaBitsString telaString = new TelaBitsString(size);
                            telaString.telaInicial();
                            break;
                        default:
                            System.err.println("Opcao Invalida");
                    }
                    continueLoop = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Tente novamente => Inisra um inteiro");
                    scan.nextLine();
                }
            } while (continueLoop);
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n===================MENU===========================");
        System.out.println("|                Insira a opcao desejada:           |");
        System.out.println("|                   [1] Inteiro                     |");
        System.out.println("|                   [2] String                      |");
        System.out.println("===================================================\n");
    }
}
