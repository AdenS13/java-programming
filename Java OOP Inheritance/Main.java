import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Developer adenD = new Developer("Aden", 79, "Java");
        Developer gravyD = new Developer("Gravy", 2, "Shopping");
        Employee sarahE = new Employee("Sarah", 143);
        Manager destM = new Manager("Destiny", 37, 52);
        Manager jeffM = new Manager("Jewf", 46, 6);

        int totalSalary = 0;
        int tempSalary = 0;
        Employee highestPaid = null;

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(adenD);
        employees.add(gravyD);
        employees.add(sarahE);
        employees.add(destM);
        employees.add(jeffM);

        for(Employee employee : employees) {
            System.out.println(employee.introduce());
        }

        for(Employee employee : employees) {
            if(employee.getSalary() > 200) {
                System.out.println(employee.getName() + " makes a lot of money brokies");
            } else {
                System.out.println("I am a brokie");
            }
        }

        for(Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        System.out.println((double) totalSalary / employees.size());

        for(Employee employee : employees) {
            if(employee.getSalary() > tempSalary) {
                tempSalary = employee.getSalary();
                highestPaid = employee;
            }
        }
        
        System.out.println(highestPaid.getName() + " makes the most money cuz she a dawg");

    }
}
