package homework22022020;

/*Wall Area
Write a class with the name Wall.
The class needs two fields (instance variables) with name width and height of type double.
The class needs to have two constructors.
The first constructor does not have any parameters (no-arg constructor).
The second constructor has parameters width and height of type double and it needs to initialize the fields.
In case the width is less than 0 it needs to set the width field value to 0,
in case the height parameter is less than 0 it needs to set the height field value to 0.
 */

public class Wall {

    //2 instance variables
    double width;
    double height;

    //first constructor (no-arg constructor)
    public Wall() {
            }

    public Wall(double width, double height) {
        //System.out.println(width < 0 && width == 0 );
        if (width < 0) {
            width = 0;}
        if (height < 0){
            height = 0;}
    }

    //instance method getWidth without any parameters
    // returning value of instance variable width
    public double getWidth() {
        setWidth(width);
        return width;
    }

    //instance method getHeight without any parameters
    // returning value of instance variable height
    public double getHeight() {
        setHeight(height);
        return height;
    }

    //instance method setWidth with one parameter type double
    public double setWidth(double width) {
        if (width <0 && width ==0) {
            //System.out.println(0);
        }
        return width;
    }

    //instance method setHeight with one parameter type double
    public double setHeight(double height) {
        if (height < 0 && height == 0) {
            //System.out.println(0);
        }
        return height;
       }

    public double getArea() {
        double area = (width * height);
        return area;
    }

    //main method
    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
                //wall.getHeight();
                //wall.getWidth();
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());
    }
}