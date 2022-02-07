public class Cat extends Animals{

    public static int countCat = 0;
    public static String typeThisClass = "Кот";

    Cat(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countCat;
    }
    @Override
    protected int swim(float distance) {
        return Animals.SWIM_NONE;
    }
}