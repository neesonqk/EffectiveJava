public class SingletonWithPublicStaticField {
    public static final SingletonWithPublicStaticField instance = new SingletonWithPublicStaticField();
    private String message;
    private SingletonWithPublicStaticField() {
        message = "Singleton with public static field";
    }

    @Override
    public String toString(){
        return this.hashCode() + ", " + this.message;
    }


    public static void main(String[] args) {
        //Create singleton with public static field
        SingletonWithPublicStaticField singleton1 = SingletonWithPublicStaticField.instance;
        System.out.println(singleton1.toString());

        SingletonWithPublicStaticField singleton2 = SingletonWithPublicStaticField.instance;
        System.out.println(singleton2.toString());

        System.out.println(singleton1 == singleton2);
    }
}
