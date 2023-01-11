class Calculations {
    static String start(String[] numbers, String operator) {
        String resultString;
        if (isDigit(numbers[0]) && isDigit(numbers[1])) {
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            resultString = calculator(a, b, operator);
        } else {
            if (RomanCheck.check(numbers[0]) && RomanCheck.check(numbers[1])) {
                int a = RomanConverter.romToArab(numbers[0]);
                int b = RomanConverter.romToArab(numbers[1]);
                resultString = calculator(a, b, operator);
                if (resultString.equals("0") || resultString.contains("-")) {
                    resultString = "Вы ввели неверные данные";
                } else {
                    resultString = RomanConverter.arabToRom(resultString);
                }
            } else {
                resultString = "Вы ввели неверные данные";
            }
        }
        return resultString;
    }

    static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static String calculator(int a, int b, String operator) {
        String resultString = "";
        switch (operator) {
            case "plus" -> {
                if (a > 0 && a <= 10 && b > 0 && b <= 10) {
                    resultString = Integer.toString(a + b);
                } else {
                    resultString = "Вы ввели неверные данные";
                }
            }
            case "-" -> {
                if (a > 0 && a <= 10 && b > 0 && b <= 10) {
                    resultString = Integer.toString(a - b);
                } else {
                    resultString = "Вы ввели неверные данные";
                }
            }
            case "mult" -> {
                if (a > 0 && a <= 10 && b > 0 && b <= 10) {
                    resultString = Integer.toString(a * b);
                } else {
                    resultString = "Вы ввели неверные данные";
                }
            }
            case "/" -> {
                if (a > 0 && a <= 10 && b > 0 && b <= 10) {
                    resultString = Integer.toString(a / b);
                } else {
                    resultString = "Вы ввели неверные данные";
                }
            }
        }
        return resultString;
    }
}
