import controller.Controller;
import model.CurrencyLoader;
import view.ConsoleView;
import view.View;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new ConsoleView(controller);
        CurrencyLoader loader = new CurrencyLoader(view);
        controller.setLoader(loader);
        Scanner scanner = new Scanner(System.in);
        view.init(scanner);
    }
}