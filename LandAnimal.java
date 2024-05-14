public class LandAnimal extends Animal{
    @Override
    String move() {
        return " swing on trees";
    }

    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        monkey.name = "Monkey";
        System.out.println(monkey.move());
    }
}
