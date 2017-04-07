public class BuilderMethod {
    private final int p1; //compulsory
    private final int p2; //compulsory

    private final int p3; //optional
    private final int p4; //optional

    //refer: http://stackoverflow.com/questions/18293857/can-a-static-nested-class-be-instantiated-in-java
    //define all 'inner class' as static (static nested class, so call) is a good practise by default.
    //here the static keywords only indicates that the nested class doesn't require an instance of its enclosing class.
    //which is different from static methods.
    //once declared as static nest class, then you can instantiate nest class via
    //OuterClass.NestClass nc = new OuterClass.NestClass();
    public static class Builder {
        private final int p1; //compulsory
        private final int p2; //compulsory

        private int p3; //op
        private int p4; //op
        public Builder (int p1, int p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public Builder setP3 (int p3) {
            this.p3 = p3;
            return this;
        }

        public Builder setP4 (int p4) {
            this.p4 = p4;
            return this;
        }

        public BuilderMethod build () {
            return new BuilderMethod(this);
        }
    }

    private BuilderMethod (Builder builder) {
        this.p1 = builder.p1;
        this.p2 = builder.p2;
        this.p3 = builder.p3;
        this.p4 = builder.p4;
    }

    @Override
    public String toString () {
        return String.format("%s, %s, %s, %s", p1, p2, p3, p4);
    }
}
