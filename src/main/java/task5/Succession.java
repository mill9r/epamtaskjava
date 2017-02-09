package task5;

import task2.logic.Printer;

public class Succession {
    public static boolean isSuccession(long number) {
        boolean f = true;
        if (number > 9) {
            while (f & (number > 9)) {
                if (number % 10 <= (number / 10 % 10)) {
                    f = false;
                }
                number = number / 10;
            }
            if (f) {
                Printer.printString("This number is ascending sequence.");
                return true;
            } else {
                Printer.printString("This number isn't ascending sequence.");
                return false;
            }
        } else {
            Printer.printString("The number consists of one digit.");
            return false;
        }
    }
}
