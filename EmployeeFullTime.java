package Practice.PracticeSub;

import Practice.SalaryPolicy;

public class EmployeeFullTime extends SalaryPolicy {
    float rate;

    public EmployeeFullTime(float baseSalary) {
        super(baseSalary);
        this.rate = 4;
    }

    @Override
    public String toString() {
        return "Salary Employee fulltime = "  + getSalary() * rate;
    }
}
