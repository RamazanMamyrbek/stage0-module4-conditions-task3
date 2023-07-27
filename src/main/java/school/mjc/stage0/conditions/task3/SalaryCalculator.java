package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            double taxPercentage = 0.15;
            double taxes = salary * taxPercentage;
            double netSalary = salary - taxes;
            System.out.println(netSalary);
        } else if (salary <= 20000) {
            double taxPercentage = 0.18;
            double taxes = salary * taxPercentage;
            double netSalary = salary - taxes;
            System.out.println(netSalary);
        } else {
            double taxPercentage = 0.20;
            double taxes = salary * taxPercentage;
            double netSalary = salary - taxes;
            System.out.println(netSalary);
        }
    }
}
