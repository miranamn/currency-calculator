import controller.Controller;
import model.CurrencyLoader;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        ConsoleView view = new ConsoleView(controller);
        CurrencyLoader loader = new CurrencyLoader(view);
        controller.setLoader(loader);
    }
}