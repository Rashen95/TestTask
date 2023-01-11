import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println();
        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b");
        System.out.println("Если захотите завершить работу приложения просто введите 0");
        while (!flag) {
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            if (input.replace(" ", "").equals("0")) {
                System.out.println("Завершаю работу калькулятора");
                s.close();
                flag = true;
            } else {
                System.out.println(Main.calc(input));
            }
        }
    }
}