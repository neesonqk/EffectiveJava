public class SingletonWithPublicStaticFactory {
    private static SingletonWithPublicStaticFactory instance = null;
    private String message;

    public static SingletonWithPublicStaticFactory getInstance() {
        if (instance == null) {
            instance = new SingletonWithPublicStaticFactory();
        }
        return instance;
    }

    private SingletonWithPublicStaticFactory() {
        message = "Singleton with public static factory";
    }

    @Override
    public String toString() {
        return this.hashCode() + ", " + message;
    }

    public static void main(String[] args) {
        //create object from static factory method
        //Create singleton with public static field
        SingletonWithPublicStaticFactory singleton1 = SingletonWithPublicStaticFactory.getInstance();
        System.out.println(singleton1.toString());

        SingletonWithPublicStaticFactory singleton2 = SingletonWithPublicStaticFactory.getInstance();
        System.out.println(singleton2.toString());

        System.out.println(singleton1 == singleton2);
    }
}
