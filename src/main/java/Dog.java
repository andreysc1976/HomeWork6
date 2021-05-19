public class Dog extends Animal{
    private static int countDog;
    private int runLength = 500;
    private int swimmLength=10;
    private float jumpHeigth=0.5f;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int length) {
        if (runLength>=length){
            System.out.format("Пес %s пробежал %d метров\n",super.getName(),length);
        } else {
            System.out.format("Пес %s сказал, что не сможет пробежать %d метров\n",super.getName(),length);
        }
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    @Override
    public void swimming(int length) {
        if (swimmLength>=length){
            System.out.format("Пес %s проплыл %d метров\n",super.getName(),length);
        } else {
            System.out.format("Пес %s сказал, что не сможет проплыть %d метров\n",super.getName(),length);
        }
    }

    @Override
    public void jump(float heigth) {
        if (jumpHeigth>=heigth){
            System.out.format("Пес %s перепрыгнул %.1f метров\n",super.getName(),heigth);
        } else {
            System.out.format("Пес %s сказал, что не сможет перепрыгнуть %.1f метров\n",super.getName(),heigth);
        }
    }


    public static int getCountDog() {
        return countDog;
    }
}
