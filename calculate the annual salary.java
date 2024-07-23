public class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    double salary;

    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(123, "John Doe", 50000);
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Annual Salary: " + annualSalary);
    }
}
