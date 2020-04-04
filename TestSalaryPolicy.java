package Practice.PracticeSub;

import Practice.SalaryPolicy;

public class TestSalaryPolicy {
    public static void main(String[] args) {
        SalaryPolicy s1 = new EmployeeFullTime(1000000);
        System.out.println(s1);

        SalaryPolicy s2 = new EmployeePartTime(500000);
        System.out.println(s2);
    }
}
