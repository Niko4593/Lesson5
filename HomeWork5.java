package Lesson5;

public class HomeWork5 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Boris Borisovich", "QA engineer", "Boris50@mail.ru",
                "+7(919)1234567)", 45000, 30);
        Employee employee2 = new Employee("Petrov Igor Igorevich", "Python developer", "Igor60@mail.ru",
                "+7(919)1230567)", 40000, 47);
        Employee employee3 = new Employee("Sidorov Egor Egorovich", "Java developer", "Egor80@mail.ru",
                "+7(919)1224567)", 47000, 33);
        Employee employee4 = new Employee("Petrova Olga Igorevna", "Java developer", "Olga30@mail.ru",
                "+7(919)1231567)", 43000, 43);
        Employee employee5 = new Employee("Ivanova Oksana Egorovna", "QA engineer", "Oksana40@mail.ru",
                "+7(918)1234567)", 41000, 35);

        Employee[] employees = { employee1, employee2, employee3, employee4, employee5 };

        getOldEmployees(employees);

    }

    private static void getOldEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].getShowInfo());
            }
    }
}