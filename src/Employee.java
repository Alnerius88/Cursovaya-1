public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private final String id;
    private static int counter = 1;

    public Employee (String fullName, int department, int salary) {
        counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = String.valueOf((counter));
    }

    @Override
    public String toString() {
        return "Employee{" + "Ф.И.О. " + fullName + '\'' + " Отдел: " + department + " Зарплата: " + salary + " ID: " + id +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public String getId() {
        return id;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
