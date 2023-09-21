public class Employee {
    private String name;
    private String email = "не задан";
    private int numberOfPhone = 0;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Employee(String name, int numberOfPhone) {
        this.name = name;
        this.numberOfPhone = numberOfPhone;
    }
    public Employee(String name, String email, int numberOfPhone) {
        this.name = name;
        this.email = email;
        this.numberOfPhone = numberOfPhone;
    }
    public void printInfo() {
        System.out.println("Имя: " + name + "\n" + "E-mail: " + email + "\n" +
                "Телефон: " + ((numberOfPhone > 0) ? numberOfPhone : "не задан"));
        System.out.println();
    }
}
