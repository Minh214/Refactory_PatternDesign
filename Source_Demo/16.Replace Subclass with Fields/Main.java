public class Main {
    public static void main(String[] args) {
        Employee manager = new Employee("Minh", 50000.0, 0.2);
        System.out.println(manager.calculateBonus());


        Employee employee = new Employee("Dat", 30000.0, 0.1);
        System.out.println(employee.calculateBonus());

    }
}