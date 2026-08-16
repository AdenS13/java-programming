public class Main {
    
    public static void main(String[] args) {
        Employee adenD = new Developer("Aden", 100, "Java");
        Employee adenE = new Employee("Aden", 100);
        Employee destM = new Manager("Destiny", 250, 52);


        System.out.println(adenE.introduce());
        System.out.println(adenD.introduce());
        System.out.println(destM.introduce());

    }
}
