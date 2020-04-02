package reflect;

public class Person {
    private String a;
    private int b;
    public int c;

    public Person() {

    }

    public Person(String a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void eat(){
        System.out.println("eat......");
    }

    @Override
    public String toString() {
        return "Person{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
