public class Dog {
    public int weightInPounds;

    public Dog(int w){
        weightInPounds = w;
    }

    public void makeNoise(){
        if (weightInPounds < 10){
            System.out.println("Yipyipyip!");
        }else if (weightInPounds < 30){
            System.out.println("Barkbark!");
        }else{
            System.out.println("Woooooof!");
        }
    }

    public static void main( String[] args ){
        Dog chihuahua = new Dog(7);
        chihuahua.makeNoise();

    }
}

