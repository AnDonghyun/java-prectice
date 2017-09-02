class A {
    public void method1() {
        try {
            B b = new B();
            b.method2();
        } catch (TestException te) {
            throw new RuntimeException(te);
        }
    }
}

class B {
    public void method2() throws TestException {
        throw new TestException();
    }
}

class TestException extends Exception { }

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
    }
}
