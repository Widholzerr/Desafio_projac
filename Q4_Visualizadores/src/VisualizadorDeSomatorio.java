import java.util.List;

public class VisualizadorDeSomatorio implements Observador{

    private List<Integer> valores;

    @Override
    public void att(List<Integer> v) {
        int soma = v.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("somatório: " + soma +
                ", quantidade" + v.size());
    }
}
