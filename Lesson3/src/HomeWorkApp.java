public class HomeWorkApp {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("-------------- 1 ----------------");
        changeElementOfArr();
        System.out.println("-------------- 2 ----------------");
        fillArray();
        System.out.println("-------------- 3 ----------------");
        workingWithArray();
        System.out.println("-------------- 4 ----------------");
        twoDimensionalArrays();
        System.out.println("-------------- 5 ----------------");
        createArray(9, 53);
        System.out.println("-------------- 6 ----------------");
        MaxMixElementOfArr();
        System.out.println("-------------- 7 ----------------");
        System.out.println(checkbalance(nums));
    }

    /*
    ------------------------------------ 1 --------------------------------------
        Задать целочисленный массив, состоящий из
    элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    public static void changeElementOfArr() {
        int[] nums = new int[]{0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                // Изменяем значения на 1
                nums[i] = 1;
            }
            else if (nums[i] == 1) {
                // Изменяем значения на 0
                nums[i] = 0;
            }
            System.out.println("nums[" + i + "]: " + nums[i]);
        }
    }

    /*
    ------------------------------------ 2 --------------------------------------
        Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    */
    public static void fillArray(){
        int [] nums = new int[100];
        String array = "";
        String delimiter;
        for (int i=0; i < nums.length; i++){
            nums[i] = i + 1;
        }
        // Выводим элементы массива
        for (int i = 0; i < nums.length; i++){
            delimiter = 0 == i ? "" : ", ";
            array = array + delimiter + nums[i];
        }
        System.out.println("{" + array + "}");
    }

    /*
    ------------------------------------ 3 --------------------------------------
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */
    public static void workingWithArray() {
        int[] nums = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        String array = "";
        String delimiter;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
            }
        }
        // Выводим элементы массива
        for (int i = 0; i < nums.length; i++) {
            delimiter = 0 == i ? "" : ", ";
            array = array + delimiter + nums[i];
        }
        System.out.println("{" + array + "}");
    }

    /*
    ------------------------------------ 4 --------------------------------------
       Создать квадратный двумерный целочисленный
    массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные
    элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей
    можно по следующему принципу: индексы таких элементов
    равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    */
    public static void twoDimensionalArrays() {
        int [][] table = new int[10][10];
        double random;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                random =  Math.random() * 100;
                // Диагональные элементы заполняем единицами
                if (i == j || i == (table.length - j - 1)) {
                    table [i][j] = 0;
                // остальные элементы заполняем случайными числами
                } else {
                    table [i][j] = (int) random;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table [i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    ------------------------------------ 5 --------------------------------------
       Написать метод, принимающий на вход два
    аргумента: len и initialValue, и возвращающий
    одномерный массив типа int длиной len, каждая
    ячейка которого равна initialValue;
    */
    public static int [] createArray(int len, int initialValue) {
        int nums[] = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = initialValue;
        }
        for (int i = 0; i < len; i++) {
            System.out.println("nums[" + i + "]: " + nums[i]);
        }
        return nums;
    }

    /*
    ------------------------------------ 6 --------------------------------------
        Задать одномерный массив и найти в нем
    минимальный и максимальный элементы ;
    */
    public static void MaxMixElementOfArr() {
        int nums[] = new int[100];
        double random;
        int min;
        int max;
        for (int i = 0; i < nums.length; i++) {
            random = Math.random() * 100;
            nums[i] = (int) random;
        }
        min = nums[0];
        max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    /*
    ------------------------------------ 7 --------------------------------------
        Написать метод, в который передается не
    пустой одномерный целочисленный массив, метод
    должен вернуть true, если в массиве есть место,
    в котором сумма левой и правой части массива равны.
    Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    */
    public static boolean checkbalance(int[] array){
        int leftSum = 0;
        boolean result = false;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                if (j > i) {
                    rightSum += array[j];
                } else {
                    rightSum += 0;
                }
            }
            //System.out.println("leftSum: " + leftSum + " rightSum: " + rightSum);
            if(leftSum == rightSum){
                result = true;
            }
        }
        return result;
    }
}
