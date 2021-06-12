public class PolygonDriver
{
    public static void main(String[] args)
    {
        System.out.println("Triangle:");
        RegularPolygon poly = new RegularPolygon();
        System.out.println("Sides: " + poly.getNumSides());
        System.out.println("Side Length: " + poly.getSideLength());
        System.out.println("Vertex Angle: " + poly.vertexAngle());
        System.out.println("r: " + poly.getr());
        System.out.println("R: " + poly.getR());
        System.out.println("Perimeter: " + poly.perimeter());
        System.out.println("Area: " + poly.area());
        
        System.out.println("\n\nSquare:");
        poly = new RegularPolygon(4, 10);
        System.out.println("Sides: " + poly.getNumSides());
        System.out.println("Side Length: " + poly.getSideLength());
        System.out.println("Vertex Angle: " + poly.vertexAngle());
        System.out.println("r: " + poly.getr());
        System.out.println("R: " + poly.getR());
        System.out.println("Perimeter: " + poly.perimeter());
        System.out.println("Area: " + poly.area());
        
        System.out.println("\n\nOctagon:");
        poly = new RegularPolygon(8, 5.75);
        System.out.println("Sides: " + poly.getNumSides());
        System.out.println("Side Length: " + poly.getSideLength());
        System.out.println("Vertex Angle: " + poly.vertexAngle());
        System.out.println("r: " + poly.getr());
        System.out.println("R: " + poly.getR());
        System.out.println("Perimeter: " + poly.perimeter());
        System.out.println("Area: " + poly.area());
        
        System.out.println("\n\nEnneadecagon:");
        poly = new RegularPolygon(19, 2);
        System.out.println("Sides: " + poly.getNumSides());
        System.out.println("Side Length: " + poly.getSideLength());
        System.out.println("Vertex Angle: " + poly.vertexAngle());
        System.out.println("r: " + poly.getr());
        System.out.println("R: " + poly.getR());
        System.out.println("Perimeter: " + poly.perimeter());
        System.out.println("Area: " + poly.area());
        
        System.out.println("\n\nEnneacontakaihenagon:");
        poly = new RegularPolygon(91, 0.5);
        System.out.println("Sides: " + poly.getNumSides());
        System.out.println("Side Length: " + poly.getSideLength());
        System.out.println("Vertex Angle: " + poly.vertexAngle());
        System.out.println("r: " + poly.getr());
        System.out.println("R: " + poly.getR());
        System.out.println("Perimeter: " + poly.perimeter());
        System.out.println("Area: " + poly.area());
    }
}