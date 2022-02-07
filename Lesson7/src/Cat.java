public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String printSatiety() {
        if (satiety) {
            return name + " сытый";
        }
        else {
            return name + " голодный";
        }
    }

    public void eat(Plate p) {
        if (!satiety && p.decreaseFood(appetite)) {
            satiety = true;
        }
    }
}
