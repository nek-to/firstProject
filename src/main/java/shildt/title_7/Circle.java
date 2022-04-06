package shildt.title_7;

public class Circle extends TwoDShape {
    private double radius;

    public Circle(){
        super();
    }

    public Circle(double x){
        super(x, "circle");
    }

    public Circle(Circle ob){
        super(ob);
    }

    double area(){
        return (getWidth()/2 * getWidth()/2 * 3.14);
    }
}

