public class Engineer extends Employee {
    public Engineer(String name, int salary) {
        super(name, salary);
    }


    public int getBonus() {
        return (int) (super.getSalary() * 0.1);
    }
}


