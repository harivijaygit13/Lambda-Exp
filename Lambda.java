package LambdaExp;
// 10 Lambda Exp & 5 with Exception Handling
interface LambdaInter {
    void call();
}
interface Vehicle {
    void run();
}
interface Transaction{
    void payment(int a);
}
interface Create{
    void draw();
        }
interface Switch {
    void on();
    }
    interface Employee {
    void work();
    }
    interface Student {
        void study();
    }
    interface Calculation {
        void sum();
    }
    interface Cat {
        void sleeping();
    }
    interface Mouse {
        void click();
    }
public class Lambda {
    public static void main(String[] args) {
//1
        LambdaInter lam =  ()->{
            System.out.println("This is Lambda Exp");
                };

//2
         Vehicle vc = ()->{
            System.out.println("This is Car");
        };

//3
        Transaction tr = (int a)->{
            System.out.println("Transaction is in process...");
        };
//4
        Create cr = ()-> {
            System.out.println("Drawing...");
        };
//5
        Switch sw = ()-> {
            System.out.println("Turning on...");
        };
//6
        Employee em = ()-> {
            System.out.println("Working...");
        };
//7
        Student st =()->{
            System.out.println("Studying...");
        };
//8
        Calculation cal = ()->{
            System.out.println("Calculating");
        };
//9
        Cat cat =()->{
            System.out.println("Sleeping...");
        };
//10
        Mouse clk=()->{
            System.out.println("Dragging...");
        };

        lam.call();
        vc.run();
        tr.payment(100);
        cr.draw();
        cal.sum();
        cat.sleeping();
        clk.click();
        sw.on();
        em.work();
        st.study();

    }
}