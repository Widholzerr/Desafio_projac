import java.util.List;

public class VisualizadorDeMedia implements Observador{
    private List<Integer> valores;

    @Override
    public void att(List<Integer> v) {
        double media = valores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Media: " + media +
                ", quantidade" + v.size());
    }
}
