public class Homework3_cont {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Task 5");
        System.out.println("Print all elements which are between 24.12 and 467.23");

        double[] dblArray = {10.2, 11.6, 8.9, 24.12, 26.7, 128.8, 249.5, 365.4, 467.23, 563.14};
        for (int j = 0; j < dblArray.length; j++) {
            double x = dblArray[j];
            if (x > 24.12 && x < 467.23) {
                System.out.println(x);
            }
        }


        System.out.println();
        System.out.println("Task 6");
        System.out.println("Print count of elements which can be divided by 2");

        int[] array = {2, 5, 9, 8, 25, 16, 52, 36, 7, 27, 13, 19, 136, 78};
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            int y = array[j];
            if (y % 2 == 0) ;
            {
                count++;
            }
        }
        System.out.println(count);

    }
}

