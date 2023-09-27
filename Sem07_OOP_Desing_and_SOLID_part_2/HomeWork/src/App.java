import java.util.logging.Logger;

import Interfaces.iCalculable;
// import Models.Calculator;
import View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        
        ViewCalculator view = new ViewCalculator();
        view.run();
    }
}
