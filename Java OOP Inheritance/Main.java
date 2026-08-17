import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Developer adenD = new Developer("Aden", 79, "Java");
        Developer gravyD = new Developer("Gravy", 2, "Shopping");
        Employee sarahE = new Employee("Sarah", 143);
        Manager destM = new Manager("Destiny", 37, 52);
        Manager jeffM = new Manager("Jewf", 46, 6);

        ArrayList<Employee> employees = new ArrayList<>();

        int totalSalary = 0;
        double tempSalary = 0;
        double totalSalary2 = 0;
        double avgSalary2 = 0;
        double totalSalary3 = 0;
        double avgSalary3 = 0;
        Employee highestPaid = null;
        String searchName = "Aden";
        boolean found = false;
        boolean found2 = false;
        String luckyLad = "Sarah";
        int hugeRaise = 1000;
        Employee lowestPaid = null;
        double salaryInc = 0;
        Employee foundEmp = null;
        int highAverage = 0;
        double closeAverageHigh = 0;
        double closeAverageLow = 0;
        Employee closeAverage = null;
        double finalCloseAverage = 0;

        


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
            if(lowestPaid == null)  {
                lowestPaid = employee;
            } else if(employee.getSalary() < lowestPaid.getSalary()) {
                lowestPaid = employee;
            }
        }

        System.out.println(lowestPaid.getName() + " makes very little aka $" + lowestPaid.getSalary());

            for(Employee employee : employees) {
                if(avgSalary2 > employee.getSalary()) {
                    System.out.println(employee.getName() + " gets a 10% raise. While currently at $" + employee.getSalary() + " an hour.");
                    employee.setSalary(employee.getSalary() * 1.10);
                    System.out.println(employee.getName() + " now makes $" + employee.getSalary() + " an hour.");
            } else {
                    System.out.println(employee.getName() + " gets a 5% raise. While currently at $" + employee.getSalary() + " an hour.");
                    employee.setSalary(employee.getSalary() * 1.05);
                    System.out.println(employee.getName() + " now makes $" + employee.getSalary() + " an hour.");
            }
        }

        for(Employee employee : employees) {
            avgSalary3 += employee.getSalary();
        }

        avgSalary3 = avgSalary3 / employees.size();

        salaryInc = avgSalary3 - avgSalary2;

        System.out.println("Old company average: $" + avgSalary2);
        System.out.println("New company average: $" + avgSalary3);
        System.out.printf("Average increased by: $%.2f%n", salaryInc);

        for(Employee employee : employees) {
            if(employee.getName().equals(searchName)) {
                foundEmp = employee;
                break;
            }
        }

        if(foundEmp == null) {
            System.out.println("Employee not found.");
        } else {
            System.out.println(foundEmp.getName() + " makes $" + foundEmp.getSalary() + "/hour.");
        }

        for(Employee employee : employees) {
            if(employee.getSalary() > avgSalary3) {
                highAverage++;
            }
        }

        System.out.println(highAverage + " out of " + employees.size() + " make above the company average.");
        System.out.println("That's " + (double) highAverage / employees.size() * 100 + "% of the company.");

        for(Employee employee : employees) {
            if(employee.getSalary() >= avgSalary3) {
                closeAverageHigh = employee.getSalary() - avgSalary3;
            } else {
                closeAverageLow = avgSalary3 - employee.getSalary();
            }
            if(closeAverage == null) {
                closeAverage = employee;
            }
        }

        System.out.println(closeAverage + " is closest to the company average.");
        System.out.println("Salary: $" + closeAverage.getSalary());
        System.out.println("Difference: $" + finalCloseAverage);

    }
}
