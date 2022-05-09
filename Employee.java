package Lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getSalary() {
        return salary;
    }

    int getAge() {
        return age;
    }

    String getShowInfo() {
        return "Full name: " + this.fullName + ", position: " + this.position + ", email: " + this.email + ", phone: "
                + this.phone + ", salary: " + this.getSalary() + " RUB, " + this.getAge() + " years old";
    }

}