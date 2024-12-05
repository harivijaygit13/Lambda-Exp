package LambdaExp;
// 10 Lambda Exp & 5 with Exception Handling
interface LambdaInter {
    void call();
}
interface Vehicle {
    void run(double speed);
}
interface Transaction{
    void payment(int a);
}
interface Create{
    void draw(String dia);
        }
interface Switch {
    boolean state(boolean x);
    }
    interface Employee {
    void work();
    }
    interface Student {
        void study();
    }
    interface Calculation {
        void sum(int x,int y);
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
         Vehicle vc = (double speed)->{
            System.out.println("This is Car running at speed of "+speed);
        };

//3
        Transaction tr = (int a)->{
            System.out.println("Transaction is in process...");
        };
//4
        Create cr = (String dia)-> {
            System.out.println("Drawing...");
        };
//5
        Switch sw = (boolean x)-> {
            return x;
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
        Calculation cal = (int x, int y)->{
            System.out.println("Sum is "+(x+y));
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
        vc.run(26.5);
        tr.payment(100);
        cr.draw("rectangle");
        cal.sum(45,67);
        cat.sleeping();
        clk.click();
        sw.state(true);
        em.work();
        st.study();

    }
}