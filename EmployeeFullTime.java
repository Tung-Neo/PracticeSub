package Practice.PracticeSub;

import Practice.SalaryPolicy;

public class EmployeeFullTime extends SalaryPolicy {
    private float rate;

    public EmployeeFullTime(float salary){
        super(salary);
        this.rate = (float) 4.0;
    }

    @Override
    public float baseSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Salary = " + rate * super.getSalary();
    }
}
