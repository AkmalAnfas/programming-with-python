public class Abstract {

}
abstract class Bike{
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("Running safley");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
abstract class Shape{
    abstract void draw();
}

class rectangle extends Shape{
    void draw(){System.out.println("Drawing Rectangle");}

}

class circle extends Shape{
    void draw(){System.out.println("Drawing circle");}
}

class test{
    public void main (String []args){
        Shape S =  new circle();
        S.draw();
    }
}

