package Arrays;

public class Arrays {
    static void main() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : numbers) {
            for (int value : row) IO.print(value + " ");
            IO.println();
        }
    }
}
