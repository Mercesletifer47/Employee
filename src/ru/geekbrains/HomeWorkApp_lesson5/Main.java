package ru.geekbrains.HomeWorkApp_lesson5;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 3000, 30);
        persArray[1] = new Employee("Gevorgan Robert", "Programmist", "GevorganRobert@mailbox.com", "89261110033", 300000, 25);
        persArray[2] = new Employee("Matveev Artem", "QA", "MatveevArtem@mailbox.com", "89261231251", 70000, 23);
        persArray[3] = new Employee("Kyznetcoff Fedor", "Engineer", "KyznetcoffFedor@mailbox.com", "892315963", 40000, 18);
        persArray[4] = new Employee("Arslanov Vitalii", "Support", "ArslanovVitalii@mailbox.com", "892375296", 50000, 50);
        for (Employee employee : persArray)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}
    class Employee{
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            return(name+ "\n"
                    +position+ "\n"
                    +email+ "\n"
                    +phone+ "\n"
                    +salary+ "\n"
                    +age);
        }
        public void info() {
            System.out.println("ФИО: " + name + "; Должность: " + position + "; email: " + email + "; телефон: " + phone + "; зарплата: " + salary + "; Возраст: " + age);
        }
    }



