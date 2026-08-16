public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getLang() {
        return programmingLanguage;
    }

    @Override
    public String introduce() {
        return getName() + " who makes $" + getSalary() + " an hour is coding in " + programmingLanguage;
    }


}
