import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args){

        employees [0] = new Employee("Астрагот Иван Евгеньевич",1, 150000);
        employees [1] = new Employee("Грозный Иван Васильевич",2,200000);
        employees [2] = new Employee("Городов Борислав Славгородович", 3, 145000);
        employees [3] = new Employee("Куркума Корица Бахчевна",4, 155000);
        employees [4] = new Employee("Чадов Дымобор Курьевич", 5,160000);
        employees [5] = new Employee("Брут Цезарь Антониевич", 1, 145000);
        employees [6] = new Employee("Коленвал Руль Штурвалович", 2, 152000);
        employees [7] = new Employee("Шиншила Шуба Пуховна", 3, 160000);
        employees [8] = new Employee("Большой Иван Шишкович",4, 165700);
        employees [9] = new Employee("Последний Данила Горцевич",5,120000);

        allEmloyees();
        allSalary();
        maxSalary();
        minSalary();
        middleSalary();
        allNames();

    }

    public static void allEmloyees(){
        for (Employee i: employees){
            System.out.println(i+" ");
        }
    }
    public static  void allSalary(){
        int sumSal = 0;
        for (Employee employee : employees) {
            sumSal += employee.getSalary();
        }
        System.out.println("Расходы на зарплату: " + sumSal);
    }
    public static void maxSalary (){
        int i =0;
        int maxSal = Integer.MIN_VALUE;
        for (;i < employees.length; i++){
            if (maxSal < employees[i].getSalary()) {
                maxSal = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная заработная плата в компании: " + maxSal);

    }
    public static void minSalary() {
        int i = 0;
        int minSal = Integer.MAX_VALUE;
        for (;i < employees.length; i++) {
            if (minSal > employees[i].getSalary()){
                minSal = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная заработная плата в компании: " + minSal);
    }
    public static void middleSalary () {
        int sumSal = 0;
        for (Employee employee : employees) {
            sumSal += employee.getSalary();
        }
        double midSal = sumSal / employees.length;
        System.out.println("Средняя зарплата в компании: " + midSal);
    }
    public static void allNames (){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }




}