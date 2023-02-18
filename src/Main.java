import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Workers> workers = new ArrayList<>();
        workers.add(new HRManagers(1, "Aya Shalkar", 300000));
        workers.add(new HRManagers(2, "Tomiris Zhangazinova", 250000));
        workers.add(new HRManagers(3, "Kylie Jenner", 500000));
        workers.add(new HRManagers(4, "Kendall Jenner", 450000));
        workers.add(new HRManagers(5, "Elizabeth Olsen", 700000));
        workers.add(new Programmers(1, "KOKSSS", 300000, 150000, 1));
        workers.add(new Programmers(2, "Rahahahahaha", 1500000, 500000, 0.9));
        workers.add(new Programmers(3, "Middle", 800000, 200000, 0.8));
        workers.add(new Programmers(4, "ProGamer", 400000, 100000, 0));
        workers.add(new Programmers(5, "S1mple", 700000, 400000, 1));

        int maxSalary = Integer.MIN_VALUE;
        for(Workers worker: workers) {
            if(worker.getSalary() > maxSalary) maxSalary = worker.getSalary();
        }
        for(Workers worker : workers) {
            if(worker.getSalary() == maxSalary) System.out.println("The highest salary: " + worker.getWorkerData());
        }

        Collections.sort(workers, new WorkersComparator());

        for(Workers w : workers) {
            System.out.println(w.getWorkerData());
        }



    }
}