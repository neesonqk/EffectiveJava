//#### Static Method Pattern ####
//Consider static factory method instead of constructors

//Static method patterh might work well with non or less variables (<=4) classes.
//immutable class
public class StaticFactoryMethod {
    private final int p1;
    private final int p2;
    private final int p3;
    private final int p4;

    //prevents instantiation from outside
    //within this private constructor, all final variables have to be initiallized.
    //else it'll throw variable(s) might not have been initialized
    private StaticFactoryMethod(){
        this.p1 = 0;
        this.p2 = 0;
        this.p3 = 0;
        this.p4 = 0;
    }

    private StaticFactoryMethod(int p1, int p2, int p3, int p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    };

    //no argument
    public static StaticFactoryMethod create() {
        return new StaticFactoryMethod();
    }

    public static StaticFactoryMethod createWithParams(int p1, int p2, int p3, int p4) {
        return new StaticFactoryMethod(p1, p2, p3, p4);
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %s, %s", p1, p2, p3, p4);
    }
}
