import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FonteDeDados dados = new FonteDeDados();

        VisualizadorDeMedia vm = new VisualizadorDeMedia();
        VisualizadorDeSomatorio vs = new VisualizadorDeSomatorio();

        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("\nDigite um valor");
            System.out.println("-1: ligar media");
            System.out.println("-2: ligar somatorio");
            System.out.println("-3: desativar");
            System.out.println("0: sair");

            int valor = Integer.parseInt(in.nextLine());

            if(valor == 0) break;

            switch (valor){
                case -1 -> {
                    dados.addObservador(vm);
                    System.out.println("Media ativada");
                    break;
                }
                case -2 -> {
                    dados.addObservador(vs);
                    System.out.println("Somatorio ativado");
                    break;
                }
                case -3 -> {
                    dados.removeObservador(vm);
                    System.out.println("Media desativada");
                    break;
                }
                default -> {
                    dados.add(valor);
                }
            }
        }

    }
}
