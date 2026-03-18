public class ValidatorMatricula implements validatorStrategy {

    @Override
    public boolean valida(String s) {
        validatorStrategy inteiro = new ValidatorInteiro();

        if (!inteiro.valida(s)) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }

        int verificador = sum % 10;

        return verificador == Character.getNumericValue(s.charAt(s.length() - 1));
    }
}
