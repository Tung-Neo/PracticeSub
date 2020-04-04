package Practice.PracticeSub;

import Practice.SalaryPolicy;

public class EmployeePartTime extends SalaryPolicy {
    private float rate;

    public EmployeePartTime(float salary){
        super(salary);
        this.rate = (float) 2.5;
    }

    @Override
    public float baseSalary() {
        return super.getSalary();
    }
    @Override
    public String toString() {
        return "Salaty = " + rate * super.getSalary();
    }
}
