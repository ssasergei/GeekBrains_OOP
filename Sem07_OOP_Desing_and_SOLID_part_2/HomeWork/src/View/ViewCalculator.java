package View;

import java.util.Scanner;

import Interfaces.iCalculable;
import Logger.Logger;
import Models.Calculator;
import Models.Decorator;

public class ViewCalculator {

    private iCalculable calculator;     

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double[] promptArry(String message) {        
        Scanner in = new Scanner(System.in);
        double[] arry = new double[2];
        System.out.print(message);
        System.out.print("Введите вещественную часть: ");
        arry[0] = Double.parseDouble(in.nextLine());
        System.out.print("Введите мнимую часть:");
        arry[1] = Double.parseDouble(in.nextLine());
        return arry;
    }
    
     public ViewCalculator() {
        this.calculator = new Decorator (new Calculator(), new Logger());
        }
    

    public void run() {
        while (true) {
            double[] primaryArg = promptArry("\u001B[32mВведите первый аргумент:\n\u001B[0m");
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("\u001B[32mВведите команду (*, /, +, - , =) : \u001B[0m");
                if (cmd.equals("*")) {
                    double[] arg = promptArry("\u001B[32mВведите второй аргумент:\n\u001B[0m");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double[] arg = promptArry("\u001B[32mВведите второй аргумент:\n\u001B[0m");
                    calculator.sum(arg);
                    continue;
                }

                if (cmd.equals("/")) {
                    double[] arg = promptArry("\u001B[32mВведите второй аргумент:\n\u001B[0m");
                    calculator.div(arg);
                    continue;
                }

                if (cmd.equals("-")) {
                    double[] arg = promptArry("\u001B[32mВведите второй аргумент:\n\u001B[0m");
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double[] result = calculator.getResult();
                    System.out.printf("\u001B[34mРезультат: %s + %si\n\u001B[0m",
                    Math.round(result[0] * 1000.0) / 1000.0,
                    Math.round(result[1] * 1000.0) / 1000.0); // результат округляю до трех знаков после запятой
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (y/n)?");
            if (cmd.equals("y")) {
                continue;
            }
            break;
        }
    }

}
