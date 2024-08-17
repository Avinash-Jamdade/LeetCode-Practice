class Solution {

    public boolean isSafe(List<String> chess, int col, int row) {
        for (int i = 0; i < row; i++) {
            if (chess.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.get(0).length(); i--, j++) {
            if (chess.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void printNQueens(List<String> chess, List<List<String>> solutions, int row) {
        if (chess.size() == 0) return;

        if (row == chess.size()) {
            solutions.add(new ArrayList<>(chess));
            return;
        }

        for (int i = 0; i < chess.get(0).length(); i++) {
            if (isSafe(chess, i, row)) {
                StringBuilder sb = new StringBuilder(chess.get(row));
                sb.setCharAt(i, 'Q');
                chess.set(row, sb.toString());

                printNQueens(chess, solutions, row + 1);

                sb.setCharAt(i, '.');
                chess.set(row, sb.toString());
            }
        }
    }

    public int totalNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        List<String> chess = new ArrayList<>();
        String rowString = ".".repeat(n);

        for (int i = 0; i < n; i++) {
            chess.add(rowString);
        }

        printNQueens(chess, solutions, 0);
        return solutions.size();
    }
}
