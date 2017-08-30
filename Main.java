import java.text.DateFormat;
import java.util.Date;
import java.util.*;

public class Main {
    interface A { 
        void x(); 
    }
    class B implements A { 
        public void x() {
            System.out.println("B.x()");
        } 
        public void y() {
            System.out.println("B.y()");
        } 
    }
    class C extends B { 
        public void x() {
            System.out.println("C.x()");
        } 
    } 
    public void main(String[] args) {
        java.util.List<A> list = new java.util.ArrayList<A>();
        list.add(new B());
        list.add(new C());
        for (A a : list) {
          a.x();
          // a.y();
      }
  }
}
