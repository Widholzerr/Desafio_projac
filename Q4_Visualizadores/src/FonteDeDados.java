import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observador> observadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificar();
    }

    public void addObservador(Observador o){
        observadores.add(o);
    }

    public void removeObservador(Observador o){
        observadores.remove(o);
    }

    private void notificar(){
        for (Observador o : observadores){
            o.att(new ArrayList<>());
        }
    }
}