public class Country implements Measurable<Country> {
  // define the class members
  private String name;
  private double area;

  // define the constructor Country
  public Country(String aName, double anArea) {
    // set the value of class members
    name = aName;
    area = anArea;
  }

  // define a method getName()
  public String getName() {
    // return the name
    return name;
  }

  // define a method getArea()
  public double getArea() {
    // return the area
    return area;
  }

  // define a method getMeasure()
  public double getMeasure() {
    // return area
    return area;
  }
}
