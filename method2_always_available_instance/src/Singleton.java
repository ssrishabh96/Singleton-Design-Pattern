public class Singleton {

    private static Singleton instance= new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public String getDescription(){
        return "Method 2: Always available instance to all";
    }
}
