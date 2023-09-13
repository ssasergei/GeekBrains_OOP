import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Contrelers.AccountController;
import Domen.Employee;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;
import Services.EmployeeService;
import Services.TeacherService;

public class App {

    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Маша", 22);
        Student s8 = new Student("Коля", 22);
        Student s9 = new Student("Петя", 22);
        Student s10 = new Student("Саша", 21);
        Student s11 = new Student("Анна", 21);
        Student s12 = new Student("Света", 24);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        // StudentGroup group5123 = new StudentGroup(listStud, 5123);
        // System.out.println(group5123);
        // for (Student s : group5123) {
        // System.out.println(s);
        // }
        // System.out.println("---------Сортировка---------");

        // Collections.sort(group5123.getGroup());
        // for (Student s : group5123) {

        // }
        
        // Урок 3 ООП   домашнее задание
         

        // List<Student> listStud1 = new ArrayList<Student>();
        // listStud1.add(s7);
        // listStud1.add(s8);
        // listStud1.add(s9);

        // List<Student> listStud2 = new ArrayList<Student>();
        // listStud2.add(s10);
        // listStud2.add(s11);
        // listStud2.add(s12);

        // /**
        // * Создание списка групп
        // */

        // StudentGroup group5123 = new StudentGroup(listStud, 5123);
        // StudentGroup group5124 = new StudentGroup(listStud1, 5124);
        // StudentGroup group5125 = new StudentGroup(listStud2, 5125);

        // /**
        // * Создания потока
        // */
        // List<StudentGroup> steam1 = new ArrayList<StudentGroup>();
        // steam1.add(group5123);
        // steam1.add(group5124);
        // steam1.add(group5125);

        // StudentSteam steam2024 = new StudentSteam(steam1, 2024);

        // Collections.sort(steam2024.getSteam());
        // System.out.println(steam2024);

      
        // Урок 4 ООП: Обобщения .ч1
        

        
        //  список учетелей и работников
        Teacher t1 = new Teacher("Галина", 50, "Doctor");
        Teacher t2 = new Teacher("Татьяна", 45, "Doctor");
        
        Employee e1 = new Employee("Вася", 40, "Электрик");
        Employee e2 = new Employee("Коля", 35, "Программист");
       
        //  группы учителей и работников
        
        List<Teacher> listTeach = new ArrayList<Teacher>();
        listTeach.add(t1);
        listTeach.add(t2);

        List<Employee> listEmpl = new ArrayList<Employee>();
        listEmpl.add(e1);
        listEmpl.add(e2);

        
        //  вывод компаратора (дженирика)
        
        System.out.println(new PersonComparator<Student>().compare(s1, s3));
        System.out.println(new PersonComparator<Teacher>().compare(t1, t2));

        // AccountController controller = new AccountController();
        // controller.paySalery(t1, 50000);
        // controller.paySalery(s1, 50000);
        AccountController.paySalery(t1, 55555);
        // AccountController.averageAge(listStud);
        // System.out.println(AccountController.averageAge(listStud));

        // Домашнее задание.

        // Вывод результата метода подчета среднего возраста

        System.out.println("Средний возрат Учиника "+ AccountController.averageAge(listStud));
        System.out.println("Средний возрат учителя "+ AccountController.averageAge(listTeach));
        System.out.println("Средний возрат " + AccountController.averageAge(listEmpl));

          }
}
Ё
