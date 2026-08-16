public class Manager extends Employee {

    private int teamSize;
    
    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String introduce() {
        return getName() + " who makes $" + getSalary() + " an hour has a team size of " + teamSize;
    }
}
