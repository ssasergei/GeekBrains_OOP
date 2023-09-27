package Models;

import Interfaces.iCalculable;

public class Calculator implements iCalculable {

    private double[] primaryArg;

    /**
     * Создания массива
     */
    public Calculator() {
        this.primaryArg = new double[2];
    }

    /**
     * Сложение
     */
    @Override
    public iCalculable sum(double[] arg) {
        this.primaryArg[0] += arg[0];
        this.primaryArg[1] += arg[1];
        return this;
    }

    /**
     * Умножение
     */
    @Override
    public iCalculable multi(double[] arg) {
        this.primaryArg[0] = primaryArg[0] * arg[0] - this.primaryArg[1] * arg[1];
        this.primaryArg[1] = primaryArg[1] * arg[0] - this.primaryArg[0] * arg[1];
        return this;
    }

    /**
     * Вычитание
     */
    @Override
    public iCalculable sub(double[] arg) {
        this.primaryArg[0] -= arg[0];
        this.primaryArg[1] -= arg[1];
        return this;
    }

    /**
     * Деление
     */
    @Override
    public iCalculable div(double[] arg) {
        this.primaryArg[0] = (this.primaryArg[0] * arg[0] + this.primaryArg[1] * arg[1])
                / (Math.pow(arg[0], 2) + Math.pow(arg[1], 2));
        this.primaryArg[1] = (this.primaryArg[1] * arg[0] + this.primaryArg[0] * arg[1])
                / (Math.pow(arg[0], 2) + Math.pow(arg[1], 2));
        return this;
    }

    @Override
    public double[] getResult() {
        return this.primaryArg;
    }

}
