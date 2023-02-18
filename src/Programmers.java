public class Programmers implements Workers{
    public int id;
    public String nickname;
    public int salary;
    public int bonusSalary;
    private double KPIValue;

    public void setKPIValue(double kpiValue) {
        if(kpiValue >= 0 && kpiValue <= 1) this.KPIValue = kpiValue;
        else this.KPIValue = 0;
    }

    public Programmers(int id, String nickname, int salary, int bonusSalary, double kpivalue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        if (kpivalue >= 0 && kpivalue <= 1) this.KPIValue = kpivalue;
        else KPIValue = 0;
    }

    @Override
    public String getWorkerData(){
        return "Id: " + id + " " + "nickname: " + nickname + "\n" + "Salary: " + getSalary();
    }
    @Override
    public int getSalary(){
        return (int) (salary + (KPIValue * bonusSalary));
    }
}
