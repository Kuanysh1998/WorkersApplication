import java.util.Comparator;

public class WorkersComparator implements Comparator<Workers> {
    @Override
    public int compare(Workers w1 , Workers w2) {
        if(w1.getSalary() == w2.getSalary()) return 0;
        if(w1.getSalary() < w2.getSalary()) return 1;
        return -1;
    }
}
