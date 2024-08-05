class Solution {
    public String interpret(String command) {
        StringBuilder newcommand = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                newcommand.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    newcommand.append("o");
                    i++;
                } else if (command.substring(i, i + 4).equals("(al)")) {
                    newcommand.append("al");
                    i += 3; 
                }
            }
        }
        return newcommand.toString();
    }
}
