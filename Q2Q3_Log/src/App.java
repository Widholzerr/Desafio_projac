public class App {
    public static void main(String[] args) {
        LogSimples logger = LogSimples.getInstance();
        
        logger.log("Iniciando sistema parte do Fabricio");
        logger.log("Verificando padrões de projeto...");

        LogSimples outroAcesso = LogSimples.getInstance();
        outroAcesso.log("Finalizando tarefa!");

        System.out.println("As instâncias são iguais? " + (logger == outroAcesso));
        System.out.println("Mensagens no Log Único");
        
        for (String m : logger) {
            System.out.println(m);
        }
    }
}