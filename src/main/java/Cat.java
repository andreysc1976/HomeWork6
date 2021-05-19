public class Cat extends Animal{
    private static int countCat=0;
    private int runLength = 200;
    private float jumpHeigth=2f;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void run(int length) {
        if (runLength>=length){
            System.out.format("Кот %s пробежал %d метров\n",super.getName(),length);
        } else {
            System.out.format("Кот %s сказал, что не сможет пробежать %d метров\n",super.getName(),length);
        }
    }

    @Override
    public void swimming(int length) {
        System.out.format("Кот %s сказал что не умеет плавать\n",super.getName());
    }

    @Override
    public void jump(float heigth) {
        if (jumpHeigth>=heigth){
            System.out.format("Кот %s перепрыгнул %.1f метров\n",super.getName(),heigth);
        } else {
            System.out.format("Кот %s сказал, что не сможет перепрыгнуть %.1f метров\n",super.getName(),heigth);
        }
    }

    public static int getCountCat() {
        return countCat;
    }
}
