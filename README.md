# WorkersApplication
Создайте интерфейс Workers.java в котором есть абстрактные методы:

 

String getWorkerData();

int getSalary();

 

Получается, вы создаете несколько классов, которые наследуют от интерфейса Workers.java:

 

Staff.java (Рабочие)

- int id;

- String name;

- String surname;

- int salary;

 

 

HRManagers.java (Отдел кадров)

- int id;

- String fullName;

- int salary;

 

Programmers.java (Программисты)

- int id;

- String nickname;

- int salary;

- int bonusSalary;

- double KPIValue;

 

Получается у каждого класса есть свои особенности, но ваша задача реализовать абстрактные методы.

В принципе при вызове метода getSalary() у всех классов возвращается значение зарплаты, но у программистов подсчет зарплаты идет таким образом: salary + KPIValue*bonusSalary. KPIValue - это коэффициент объема работы, выполненный за определенный период, и его значение от 0 до 1 включительно.

 

В основном классе Main.java создайте по 5 объектов рабочих, отдела кадров и программистов.

 

a. Выведите данные рабочего, у которого самая высокая зарплата.

b. Отсортируйте рабочих, по зарплате, по убыванию.
