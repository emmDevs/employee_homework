package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private Double salary;

    public Employee(String name, String nINumber, Double salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getnINumber() {
        return this.nINumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raisesalary(Double number){
        this.salary += ((getSalary() * number) / 100);
    }

    public Double payBonus(){
        return this.salary / 100;

    }
}