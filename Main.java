public class Main {
    public static void main(String[] args){
     try {
        throw new NullPointerException();
// some code here
     } catch (NullPointerException e1) {
        System.out.print("a");
    } catch (Exception e2) {
        System.out.print("b");
    } finally {
        System.out.print("c");
    }
}
}

