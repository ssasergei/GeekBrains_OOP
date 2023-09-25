package task1;

import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;

    /**
     * @param name Имя
     * @param dob  дятя
     */
    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}
