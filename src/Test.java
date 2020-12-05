public class Test implements Cloneable {

    int a;

    Test cloning() {
        try {
            return (Test) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not ");
            return this;
        }
    }
}
    class Demo{
        public static void main(String[] args) {
            Test ob1 = new Test();
            Test ob2;
            ob1.a=10;
            ob2=ob1.cloning();
            ob2.a=20;
            System.out.println("Ob1a"+ob1.a);
            System.out.println("Ob2a"+ob2.a);
        }
    }

