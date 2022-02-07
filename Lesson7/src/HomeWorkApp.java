public class HomeWorkApp {
    private static String limiter = " ----------------------------------";
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] arrayCats = new Cat[] {
                new Cat("Вова", 10),
                new Cat("Степа", 13),
                new Cat("Барсик", 33),
                new Cat("Ева", 14),
                new Cat("Пуся", 11),
                new Cat("Макс", 42),
        };

        System.out.println(plate);
        for (Cat cat: arrayCats ) {
            System.out.println(cat.printSatiety());
        }
        limiter();
        for (Cat cat: arrayCats) {
            cat.eat(plate);
            System.out.println(plate);
        }

        limiter();
        for (Cat cat: arrayCats) {
            System.out.println(cat.printSatiety());
        }

        plate.addFood(100);
        limiter();
        for (Cat cat: arrayCats) {
            cat.eat(plate);
        }

    }
    private static void limiter() {
        System.out.println(limiter);
    }
}
