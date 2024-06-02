/**
 * Uma exceção personalizada que é lançada quando parâmetros inválidos são
 * encontrados.
 * Esta exceção é uma subclasse de {@link Exception}.
 */
public class ParametrosInvalidosException extends Exception {

    /**
     * Constrói uma nova {@code ParametrosInvalidosException} com a mensagem detalhada especificada.
     *
     * @param message - a mensagem detalhada, salva para posterior recuperação pelo método {@link #getMessage()}.
     */
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}