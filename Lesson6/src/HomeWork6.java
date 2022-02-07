public class HomeWork6{
    public static void main(String[] args) {
        String tempWinEvent = " это получилось";
        String tempLoseEvent = " это не получилось";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("Барсик", 2, 200);
        Cat cat2 = new Cat("Мурзик", 5, 400);
        Dog dog1 = new Dog("Тузик", 0.5f, 500);
        Dog dog2 = new Dog("Бобик", 1.5f, 350);

        Animals[] animals = {cat1, cat2, dog1, dog2};
        float runLength = 230;
        float swimLength = 7;

        for (int i = 0; i < animals.length; i++){
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = "пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLoseEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплыть на " + animals[i].getMaxSwim() + " м. Пытается проплить на ";
            eventResult = (swimResult == Animals.SWIM_OK) ? tempWinEvent : tempLoseEvent;

            if (swimResult == Animals.SWIM_NONE)
                eventResult = " это не получилось, так как не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }
        System.out.println("Все животные = " + Animals.countAnimal + " Количество кошек = " + Cat.countCat + " Количество собак = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " и и " + resultEvent);
    }
}

