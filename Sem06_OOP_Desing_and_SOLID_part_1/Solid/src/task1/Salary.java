package task1;

    /**
     * Класс который работет с зарплатой 
     */

public class Salary {
    private Employee employee;
        private int baseSalary;

        public Salary(Employee employee, int baseSalary){
            this.employee = employee;
            this.baseSalary = baseSalary;
        }

        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25);// calculate in otherway
            return baseSalary - tax;
        }
     }
