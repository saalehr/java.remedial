public class TestAnimal {

    public static void main(String[] args) {

        Animal a = new Animal();
        Horse h = new Horse();

        makeAnimalEat(a);
        makeAnimalEat(h);

        // Passes IS-A protocol
        Animal anAnimal = new Horse();

        makeAnimalEat(anAnimal);

        Horse horse = (Horse) anAnimal;
        horse.pitiko();

        // Compiler error: Animal cannot be cast to Horse
        //Horse notAHorse = (Horse) a;

    }

    public static void makeAnimalEat(Animal a) {
        a.eat();
    }
}
