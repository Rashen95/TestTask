class CheckingForTheNumberOfOperators {
    static boolean check(String input) {
        int count = 0;
        if (input.indexOf("+") == input.lastIndexOf("+") && input.contains("+")) {
            count++;
        }
        if (input.indexOf("-") == input.lastIndexOf("-") && input.contains("-")) {
            count++;
        }
        if (input.indexOf("*") == input.lastIndexOf("*") && input.contains("*")) {
            count++;
        }
        if (input.indexOf("/") == input.lastIndexOf("/") && input.contains("/")) {
            count++;
        }
        return count == 1;
    }
}
