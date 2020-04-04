package Practice.PracticeSub;

import Practice.SalaryPolicy;

public class EmployeePartTime extends SalaryPolicy {
    private float rate;

    public EmployeePartTime(float baseSalary) {
        super(baseSalary);
        this.rate = 2.5f;
    }

    @Override
    public String toString() {
        return "Salary Employee partime: " + getSalary() * rate;
    }
}
