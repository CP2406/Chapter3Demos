import textio.TextIO;

public class Various {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 100);
        int y;
        if (x < 0) {
            y = 1;
        }
        // try uncommenting line 9 and commenting line 10...
//        if (x >= 0) {
        else {
            y = 2;
        }
        System.out.println(y);

        char option = TextIO.getAnyChar();

        switch (option) {
            case 'a', 'A' -> System.out.println("execute option A");
            case 'b', 'B' -> System.out.println("execute option B");
            default -> System.out.println("unknown option");
        }

        if (option == 'a') {
            System.out.println("execute option A");
        } else if (option == 'b') {
            System.out.println("execute option B");
        } else {
            System.out.println("unknown option");
        }

        int[] numbers = new int[1_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RandomHelper.nextInt(1, 10);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                sum += numbers[i];
        }
        System.out.println("sum of evens: " + sum);


        double average = sum / numbers.length;
        System.out.println("average: " + average);

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println("max: " + max);

        int[][] matrix = new int[10][10]; // a 10x10 2D array
        for (int row = 0; row <matrix.length; ++row) {
            // create a row
            matrix[row] = new int [10];
        }

//        for (int number : numbers) {
//            System.out.println(number);
//        }
    }
}
