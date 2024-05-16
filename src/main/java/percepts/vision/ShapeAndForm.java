package percepts.vision;

public class ShapeAndForm {
    // Properties
    private String shape;        // Represents the shape of the object
    private double size;         // Represents the size of the object
    private String outline;      // Represents the outline of the object
    private String structure3D;  // Represents the three-dimensional structure of the object

    // Constructor
    public ShapeAndForm(String shape, double size, String outline, String structure3D) {
        this.shape = shape;
        this.size = size;
        this.outline = outline;
        this.structure3D = structure3D;
    }

    // Getter and Setter methods
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getStructure3D() {
        return structure3D;
    }

    public void setStructure3D(String structure3D) {
        this.structure3D = structure3D;
    }

    // Method to resize the object
    public void resize(double newSize) {
        this.size = newSize;
    }

    // Method to change the outline of the object
    public void changeOutline(String newOutline) {
        this.outline = newOutline;
    }

    // Method to change the three-dimensional structure of the object
    public void changeStructure3D(String newStructure3D) {
        this.structure3D = newStructure3D;
    }
}

