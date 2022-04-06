package shildt.title_7;

/**
 * Создайте подкласс Circle, производный от класса TwoDShape. В нем должен быть определен метод area ( ) ,
 * вычисляющий площадь круга, а также конструктор с ключевым словом super для инициализации членов,
 * унаследованных от класса TwoDShape.
 */
public class TwoDShape {
    private double high;
    private double width;
    private String name;

    public TwoDShape() {
    }

    public TwoDShape(double x, String name) {
        high = width = x;
        this.name = name;
    }

    public TwoDShape(TwoDShape ob) {
        this.high = ob.high;
        this.width = ob.width;
        this.name = ob.name;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected void area(double v) {
    }
}
