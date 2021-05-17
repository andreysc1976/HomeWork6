public class Cat extends Animal{
    public static int countCat=0;
    private int runLength = 200;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void run(int length) {
        if (runLength>=length){
            System.out.format("Кот %s пробежал %d метров\n",name,length);
        } else {
            System.out.format("Кот %s сказал, что не сможет пробежать %d метров\n",name,length);
        }
    }

    @Override
    public void swimming(int length) {
        System.out.format("Кот %s сказал что не умеет плавать\n",name);
    }

}
