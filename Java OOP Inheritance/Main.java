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
        double totalSalary2 = 0;
        double avgSalary2 = 0;
        double totalSalary3 = 0;
        double avgSalary3 = 0;
        Employee highestPaid = null;
        String searchName = "Joe";
        boolean found = false;
        boolean found2 = false;
        String luckyLad = "Sarah";
        int hugeRaise = 1000;
        int lowestPaid = 0;

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

        for(Employee employee : employees) {
            if(employee.getName().equals(searchName)) {
                found = true;
            } 
        }
        if(found) {
            System.out.println("We found someone. He didn't wipe his ass!");
        } else {
            System.out.println("Not a soul left on this battefield sargent.");
        }

        for(Employee employee : employees) {
            if(employee.getName().equals(luckyLad)) {
                found2 = true;
                System.out.println("Currently my salary is $" + employee.getSalary() + " an hour!");
                employee.raiseTime(hugeRaise);
                System.out.println("Oh my gawd I am rich. I get paid $" + employee.getSalary() + " an  hour!");
            }
        }
        if(!found2) {
            System.out.println("employee is not real");
        }

        for(Employee employee : employees) {
            totalSalary2 += employee.getSalary();
        }

        avgSalary2 = (double) totalSalary2 /  employees.size();

        for(Employee employee : employees) {
            if(avgSalary2 > employee.getSalary()) {
                System.out.println(employee.getName() + " makes $" + employee.getSalary() + "/hour, which is below the company average of $" + avgSalary2);
            }
        }


        for(Employee employee : employees) {
            if(employee.getSalary() <= avgSalary2) {

                if()
            }
        }
    }
}
