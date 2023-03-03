public class Animal {
    private String name;
    private String color;
    private int pawsCount;

    // Конструкторы
    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    //Сэттеры
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    //Геттеры
    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    //Поведение
    public void speak() {
        System.out.println("Yarr!!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    private void wakeUp() {
        System.out.println("Wake up..");
    }

    private void findFood() {
        System.out.println("Found food..");
    }

    private void eat() {
        System.out.println("Ate..");
    }

    public void toPlay() {
        System.out.println("Played..");
    }

    public void goToSleep() {
        System.out.println("Already asleep..");
    }
    public void toFly() {
        System.out.println("Ииии полетели.....!");
    }
    public void toGo(){
        System.out.printf("Идет!");
    }
    public void toSwim(){
        System.out.printf("Плывет!!!");
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Цвет: %s", this.name, this.color);
    }
}
