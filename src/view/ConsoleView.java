package view;

import controller.Controller;
import model.Stream;
import model.Values;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView implements View{
    private Controller controller;
    public ConsoleView(Controller controller){
        this.controller = controller;
    }
    public void init(Scanner scanner){
        System.out.println(Values.START);
        String example = scanner.nextLine();

        System.out.println(Values.REPEAT);
        String answer = scanner.nextLine();
        switch (answer) {
            case Values.YES:
                init(scanner);
            case Values.NO:
                break;
            default:
                System.out.println(Values.OUTPUT);
        }
    }
}
