public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("-------------- 1 ----------------");
        System.out.println(checkSum(1,1));
        System.out.println("-------------- 2 ----------------");
        System.out.println(checkNumber(-55));
        System.out.println("-------------- 3 ----------------");
        System.out.println(checkNumberNew(62));
        System.out.println("-------------- 4 ----------------");
        repeatSentence("Привет Java!",6);
        System.out.println("-------------- 5 ----------------");
        System.out.println(checkYear(2022));
    }

    /*
    ------------------------------------ 1 --------------------------------------
        Написать метод, принимающий на вход два целых
    числа и проверяющий, что их сумма лежит в пределах
    от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false..
    */
    public static boolean checkSum(int a, int b){
        int c = a + b;
        boolean result;
        if (c > 10 && c <=20) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    /*
    ------------------------------------ 2 --------------------------------------
        Написать метод, которому в качестве параметра
    передается целое число, метод должен напечатать в
    консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    public static String checkNumber(int a){
        String result;
        if (a >= 0) {
            result = "Вы передали положительный число: " + a;
        }
        else {
            result = "Вы передали отрицательный число: " + a;
        }
        return result;
    }

    /*
    ------------------------------------ 3 --------------------------------------
        Написать метод, которому в качестве параметра
    передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
    */
    public static boolean checkNumberNew(int a){
        boolean result;
        if (a >= 0) {
            result = false;
        }
        else {
            result = true;
        }
        return result;
    }

    /*
    ------------------------------------ 4 --------------------------------------
        Написать метод, которому в качестве аргументов
    передается строка и число, метод должен отпечатать
    в консоль указанную строку, указанное количество раз;
    */
    public static void repeatSentence(String sentence, int count){
        for(int i = 1; i <= count; i ++){
            System.out.println(sentence);
        }
    }

    /*
    ------------------------------------ 5 --------------------------------------
        * Написать метод, который определяет,
    является ли год високосным, и возвращает boolean
    (високосный - true, не високосный - false). Каждый
    4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный.
    */
    public static boolean checkYear(int year){
        boolean result = false;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                result = true;
            }
        }
        return result;
    }
}
