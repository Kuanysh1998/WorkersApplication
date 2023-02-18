public class HRManagers implements Workers{
    public int id;
    public String fullName;
    public int salary;

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData(){
        return "Id: " + id + " " + fullName + "\n" + "Salary: " + getSalary();
    }

    @Override
    public int getSalary(){
        return salary;
    }
}
