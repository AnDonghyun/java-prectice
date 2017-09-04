public class ClassA {
    public void methodA() {
        ClassB classB = new ClassB();
        classB.getValue();
    }
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
    }
}

class ClassB {
    public ClassC classC = new ClassC();

    public String getValue() {
        return classC.getValue();
    }
}

class ClassC {
    public String value;

    public String getValue() {
        value = "ClassB";
        return value;
    }
}
