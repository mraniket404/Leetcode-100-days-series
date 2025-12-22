public class Day58 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int count = 1;

        int minRow = 0, maxRow = n - 1;
        int minCol = 0, maxCol = n - 1;

        while (count <= n * n) {

            for (int c = minCol; c <= maxCol; c++) {
                arr[minRow][c] = count++;
            }

            for (int r = minRow + 1; r <= maxRow; r++) {
                arr[r][maxCol] = count++;
            }

            for (int c = maxCol - 1; c >= minCol; c--) {
                arr[maxRow][c] = count++;
            }

            for (int r = maxRow - 1; r >= minRow + 1; r--) {
                arr[r][minCol] = count++;
            }

            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Day58 obj = new Day58();
        int[][] result = obj.generateMatrix(3);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
