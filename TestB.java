class TestA {
    public void start() { System.out.println("TestA"); }
}
public class TestB extends TestA {
    public void start() { System.out.println("TestB"); }
    public static void main(String[] args) {
        // ((TestA)new TestB()).start();
        TestB tb = new TestB();
        tb.start();
        ((TestA)tb).start();
    }
}
