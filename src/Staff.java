public class Staff implements Workers {
    public int id;
    public String name;
    public String surname;
    public int salary;

    @Override
    public String getWorkerData() {
        return "Id: " + id + " " + name + " " + surname + "\n" + "Salary: " + getSalary();
    }
    @Override
    public int getSalary() {
        return salary;
    }

}
