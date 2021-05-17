public class Dog extends Animal{
    public static int countDog;
    private int runLength = 500;
    private int swimmLength=10;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int length) {
        if (runLength>=length){
            System.out.format("Пес %s пробежал %d метров\n",name,length);
        } else {
            System.out.format("Пес %s сказал, что не сможет пробежать %d метров\n",name,length);
        }
    }

    @Override
    public void swimming(int length) {
        if (swimmLength>=length){
            System.out.format("Пес %s проплыл %d метров\n",name,length);
        } else {
            System.out.format("Пес %s сказал, что не сможет проплыть %d метров\n",name,length);
        }
    }


}
