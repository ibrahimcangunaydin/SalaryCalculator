public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int now;
    double tax;
    double bonus;
    double raiseSalary;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.now = 2021;
    }

    public double tax() {
        if (this.salary <= 1000) {
            this.tax = 0;
        } else if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }
        return this.tax;
    }

    public double bonus() {
        if (this.workHours <= 40) {
            this.bonus = 0;
        } else {
            this.bonus = (this.workHours - 40) * 30;
        }
        return this.bonus;
    }

    public double raiseSalary() {
        if (this.now - this.hireYear < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if (this.now - this.hireYear > 9 && this.now - this.hireYear < 20) {
            this.raiseSalary = this.salary * 0.10;
        } else {
            this.raiseSalary = this.salary * 0.15;
        }
        return this.raiseSalary;
    }

    public String toString() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Working time: " + this.workHours);
        System.out.println("Start date: " + this.hireYear);
        System.out.println("Tax: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Salary increase: " + this.raiseSalary());
        System.out.println("Salary with tax and bonus: " + (this.salary - this.tax + this.bonus));
        System.out.println("Total Salary: " + (this.salary + this.raiseSalary));

        return null;
    }
}
