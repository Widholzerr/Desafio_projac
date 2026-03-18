public class Validador {

    public boolean valida(Tipo tipo, String valor) {
        validatorStrategy strategy = validatorFactory.getValidator(tipo);
        return strategy.valida(valor);
    }
}