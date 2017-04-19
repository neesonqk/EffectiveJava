/**
** Single element enum is the suggested and best way to implement singleton,
** page 18.
**/
public enum SingletonWithEnum {
       INSTANCE;
       private String message;

       private SingletonWithEnum() {
           this.message = "SingletonWithEnum";
       }

       @Override
       public String toString() {
           return this.hashCode() + ", " + this.message;
       }

       public static void main(String[] args) {
           //create object from static factory method
           //Create singleton with public static field
           SingletonWithEnum singleton1 = SingletonWithEnum.INSTANCE;
           System.out.println(singleton1.toString());

           SingletonWithEnum singleton2 = SingletonWithEnum.INSTANCE;
           System.out.println(singleton2.toString());

           System.out.println(singleton1 == singleton2);
       }
}
