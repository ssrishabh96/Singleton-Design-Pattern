public class SIngletonClient {

    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance();
        System.out.println("Method 1: "+singleton.getDescription());
    }
}
