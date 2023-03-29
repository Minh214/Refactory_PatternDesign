public class Salesman extends Employee {
    public Salesman(String name, int salary) {
        super(name, salary);
    }


    public int getBonus() {
        return (int) (super.getSalary() * 0.15);
    }
}
