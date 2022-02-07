/**
 * 1)Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * 2)Конструктор класса должен заполнять эти поля при создании объекта;
 * 3)Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * 4)Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 * 5)С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class HomeWorkApp {
    public static void main(String[] args) {
        /*
        Employees employees1 = new Employees();
        employees1.name = "Андреева Ева Даниэльевна";
        employees1.position = "бухгалтер";
        employees1.email = "e.andreeva@geekbrains.ru";
        employees1.phone = "+79993334213";
        employees1.salary = 120000;
        employees1.age = 24;
        employees1.displayInfo();
        */

        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Андреева Ева Даниэльевна", "Генеральный директор", "test1@mail.ru", "992927960093", 450000,  25);
        employees[1] = new Employees("Орлова Анна Андреевна", "Заместитель директора по финансам", "test2@mail.ru", "992927960093", 31500,  29);
        employees[2] = new Employees("Лаптев Максим Артёмович", "Управляющий", "test3@mail.ru", "992927960093", 12000,  33);
        employees[3] = new Employees("Лебедев Артём Артёмович", "Главный бухгалтер", "test4@mail.ru", "992927960093", 135000,  44);
        employees[4] = new Employees("Фадеев Матвей Ибрагимович", "Главный инженер", "test5@mail.ru", "992927960093", 120000,  46);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].displayInfo();
            }
        }
    }

}

