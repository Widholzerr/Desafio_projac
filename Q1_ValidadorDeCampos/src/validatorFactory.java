public class validatorFactory {
    public static validatorStrategy getValidator(Tipo t){
        switch (t){
            case INTEIRO -> {
                return new ValidatorInteiro();
            }
            case EMAIL -> {
                return new ValidatorEmail();
            }
            case MATRICULA -> {
                return new ValidatorMatricula();
            }
            default ->{
                throw new IllegalArgumentException("Tipo nao suportado");
            }
        }
    }
}
