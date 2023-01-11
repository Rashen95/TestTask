class Main {
    public static String calc(String input) {
        input = input.replace(" ", "");
        String resultString = "";
        if (CheckingForTheNumberOfOperators.check(input)) {
            if (input.contains("+")) {
                input = input.replace("+", "plus");
                String[] numbers = input.split("plus");
                resultString = Calculations.start(numbers, "plus");
            } else if (input.contains("-")) {
                String[] numbers = input.split("-");
                resultString = Calculations.start(numbers, "-");
            } else if (input.contains("*")) {
                input = input.replace("*", "mult");
                String[] numbers = input.split("mult");
                resultString = Calculations.start(numbers, "mult");
            } else if (input.contains("/")) {
                String[] numbers = input.split("/");
                resultString = Calculations.start(numbers, "/");
            }
        } else {
            resultString = "Вы ввели неверные данные";
        }
        return resultString;
    }
}
