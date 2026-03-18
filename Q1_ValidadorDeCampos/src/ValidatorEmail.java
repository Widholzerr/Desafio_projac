public class ValidatorEmail implements validatorStrategy {

    @Override
    public boolean valida(String s) {
        int arroba = s.indexOf('@');
        int point = s.indexOf('.');

        return !(arroba <= 0 || point <=0);
    }
}
