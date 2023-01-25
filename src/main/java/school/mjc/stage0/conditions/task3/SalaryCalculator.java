package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxes;
        if (salary <= 10000) {
            taxes = 0.15;
        } else if (salary > 10000 && salary <= 20000) {
            taxes = 0.18;
        } else if (salary > 20000) {
            taxes = 0.20;
        } else {
            System.out.println("wrong input!");
            return;
        }
        System.out.println(salary - (salary * taxes));
    }
}
