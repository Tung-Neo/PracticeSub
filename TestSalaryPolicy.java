package Practice.PracticeSub;

import Practice.SalaryPolicy;

import java.util.Scanner;

public class TestSalaryPolicy{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        float Salary = Scanner.nextFloat();
        SalaryPolicy sa= new EmployeePartTime(Salary);
        System.out.println(sa);
        SalaryPolicy sa1 =  new EmployeeFullTime(Salary);
        System.out.println(sa1);
    }
}
