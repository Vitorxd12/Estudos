package firstSteps;

public class IfElse {
    public static void main(String[] args) {
        int salary = 900;

        double newsalary = 0;

        if (salary > 1000){
            newsalary = salary * 1.1;
            System.out.println("Because your salary was over 1000, you got a 10% increase, totaling: " + newsalary);
        } else {
            newsalary = salary * 1.3;
            System.out.println("Because your salary was under 1000, you got a 30% increase, totaling: " + newsalary);
        }
    }
}
