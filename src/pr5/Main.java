package pr5;

public class Main {
    public static void main(String[] args) {

        Singleton1 s1 = new Singleton1();

        Singleton2 s2 = Singleton2.INSTANCE;

        Singleton3 s3 = new Singleton3();
    }
}
