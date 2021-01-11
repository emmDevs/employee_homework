package staff.management;

import staff.Employee;

public class Director extends Employee {

    private Double budget;

    public Director(String name, String nINumber, Double salary, Double budget){
        super(name, nINumber, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return this.budget;
    }

    @Override
    public Double payBonus(){
        return 2*(super.payBonus());

    }
}
