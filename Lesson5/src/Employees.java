public class Employees {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public int getAge() {
        return age;
    }

    public Employees(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("ФИО: %s \tДолжность: %s\tEmail: %s\tТелефон: %s\tЗарплата: %d\tВозраст: %d\n", name, position, email, phone, salary, age);
    }

}
