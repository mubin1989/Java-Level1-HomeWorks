public class Dog extends Animals{
    public static int countDog = 0;
    public static String typeThisClass = "Пёс";

    Dog(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countDog;
    }

    @Override
    protected int swim(float distance) {
        return (distance <= this.maxSwim) ? SWIM_OK : SWIM_FAIL;
    }
}