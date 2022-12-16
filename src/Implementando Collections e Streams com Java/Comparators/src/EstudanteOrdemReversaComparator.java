import java.util.Comparator;

public class EstudanteOrdemReversaComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante obj1, Estudante obj2) {
        return obj2.getIdade() - obj1.getIdade();
    }
}
