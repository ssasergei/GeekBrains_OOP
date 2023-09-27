package Interfaces;

public interface iCalculable {

    /**
     * Математические действия 
     */
    iCalculable sum(double[] arg);   
    iCalculable multi(double[] arg);
    iCalculable sub(double[] arg);
    iCalculable div(double[] arg);

    double[] getResult();
    
}
