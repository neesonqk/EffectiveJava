class Main {
    public static void main(String[] args) {
        //create object from static factory method
        StaticFactoryMethod object = StaticFactoryMethod.create();
        System.out.println(object.toString());

        object = StaticFactoryMethod.createWithParams(1, 23, 34, 55);
        System.out.println(object.toString());

        //Create object from builer nested class
        BuilderMethod object2 = new BuilderMethod.Builder(10, 20)
        .setP3(20).setP4(30).build();
        System.out.println(object2.toString());
    }
}
