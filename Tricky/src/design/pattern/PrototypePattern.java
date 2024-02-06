package design.pattern;
//The Prototype Pattern involves creating new objects by copying an existing object
//Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.
interface Prototype{
	Prototype clone();
}
class Rectangle implements Prototype {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this.width, this.height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void displayInfo() {
        System.out.println("Rectangle - Width: " + width + ", Height: " + height +"->"+this.hashCode());
    }
}
class Circle implements Prototype {
	private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius +"->"+this.hashCode());
    }
}

public class PrototypePattern {
	
	public static void main(String[] args) {
		Prototype rectanglePrototype = new Rectangle(10, 20);
        Prototype circlePrototype = new Circle(5);
        
        
        Prototype clonedRectangle = rectanglePrototype.clone();
        Prototype clonedCircle = circlePrototype.clone();
        
        ((Rectangle) clonedRectangle).displayInfo();
        ((Circle) clonedCircle).displayInfo();
        
        
        ((Rectangle) clonedRectangle).setWidth(15);
        ((Circle) clonedCircle).setRadius(8);
        
        ((Rectangle) clonedRectangle).displayInfo();
        ((Circle) clonedCircle).displayInfo();
		
	}

}
