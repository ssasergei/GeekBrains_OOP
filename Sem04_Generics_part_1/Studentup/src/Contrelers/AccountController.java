package Contrelers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccountController {
    public static <T extends Teacher> void paySalery(T person, int salery) {
        System.out.println(person.getName() + " выплачено зарплата " + salery + " р.");
    }
/**
 * 
 * @param <T>  - дженирик
 * @param persons список персонала 
 * @return средний возраст
 */
    public static <T extends Person> double averageAge(List<T> persons){
        double sum = 0.0;
        for (T pers: persons){
            sum+=pers.getAge();
        }
        return sum/persons.size();

    }
}
