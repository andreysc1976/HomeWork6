public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Муха");
        Dog dog1 = new Dog("Бася");
        Dog dog2 = new Dog("Шарик");

        cat.swimming(10);
        cat.run(50);
        cat.run(500);

        dog.swimming(10);
        dog.swimming(20);
        dog1.run(50);
        dog2.run(600);

        System.out.format("Создано %d котов\n",Cat.countCat);
        System.out.format("Создано %d собак\n",Dog.countDog);
        System.out.format("Создано %d животных\n",Animal.getAnimalCount());
    }
}
