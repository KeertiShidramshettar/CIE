package CIE;

class Grandfather {
    void print() {
        System.out.println("I'm the Grandfather");
    }
}

class Father extends Grandfather {
    void print1() {
        System.out.println("I'm the Father");
    }

    class Son extends Father {
        void print2() {
            System.out.println("I'm the Son");
            System.out.println("Im a good son");

        }
    }
}

public class Inhe {
    public static void main(String[] args) {
        Father father = new Father();
        Father.Son mySon = father.new Son();
        
        mySon.print();   
        mySon.print1();  
        mySon.print2(); 
    }
}
