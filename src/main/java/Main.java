public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Муха");
        Dog dog1 = new Dog("Бася");
        Dog dog2 = new Dog("Шарик");
        dog2.setRunLength(300);

        cat.swimming(10);
        cat.run(50);
        cat.run(500);
        cat.jump(12f);
        cat.jump(2f);

        dog.swimming(10);
        dog.swimming(20);
        dog1.run(400);
        dog2.run(400);
        dog1.jump(2f);
        dog2.jump(0.1f);

        System.out.format("Создано %d котов\n",Cat.getCountCat());
        System.out.format("Создано %d собак\n",Dog.getCountDog());
        System.out.format("Создано %d животных\n",Animal.getAnimalCount());
    }
}
