public class App {
    public static void main(String[] args) throws Exception {
        Validador validador = new Validador();

        System.out.println(validador.valida(Tipo.INTEIRO, "123"));
        System.out.println(validador.valida(Tipo.EMAIL, "teste@email.com"));
        System.out.println(validador.valida(Tipo.MATRICULA, "12346"));
    }
}
