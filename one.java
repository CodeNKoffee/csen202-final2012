public class one {
    public static void main(String[] args) {
        // Test cases
        boolean[][] arr1 = { { true, false }, { true, true } };
        boolean[][] arr2 = { { false, false }, { false, false } };
        boolean[][] arr3 = { { true, true, false }, { false, true, true } };

        // Call the evaluate method for each test case and print the result
        boolean result1 = evaluate(arr1);
        boolean result2 = evaluate(arr2);
        boolean result3 = evaluate(arr3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }

    public static boolean evaluate(boolean[][] a) {
        boolean formula = false;
        for (int i = 0; i < a.length; i++) {
            boolean clause = true;
            for (int j = 0; j < a[i].length; j++) {
                clause = clause && a[i][j];
            }
            formula = formula || clause;
        }
        return formula;
    }
}
