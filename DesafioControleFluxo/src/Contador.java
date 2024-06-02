import java.util.Scanner;

/**
 * A classe Contador contém o método principal e o método contar que
 * realiza uma contagem de números baseados em parâmetros fornecidos pelo
 * usuário.
 * <p>
 * O método principal solicita os parâmetros ao usuário, chama o método contar e
 * lida com possíveis exceções lançadas.
 * </p>
 * 
 * @author Cauan Augusto
 * @version 1.0
 * @since 2024-06-02
 */
public class Contador {

    /**
     * O método principal que serve como ponto de entrada para o programa.
     * Solicita dois parâmetros ao usuário, chama o método
     * {@link #contar(int, int)},
     * e lida com possíveis exceções lançadas.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        terminal.close();
    }

    /**
     * Conta e imprime os números de 1 até a diferença entre os parâmetros
     * fornecidos.
     *
     * @param parametroUm   O primeiro parâmetro, que deve ser menor ao
     *                      segundo parâmetro.
     * @param parametroDois O segundo parâmetro, que deve ser maior ao
     *                      primeiro parâmetro.
     * @throws ParametrosInvalidosException se parametroUm for maior que
     *                                      parametroDois.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("Parâmetro dois deve ser maior que o parâmetro um.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
