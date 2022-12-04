
public class Coin implements Measurable {
  // declare the class members
  private double value;
  private String name;

  // define a Coin
  public Coin(double aValue, String aName) {
    // set the value of class members
    value = aValue;
    name = aName;
  }

  // getter for value
  public double getValue() {
    // return value
    return value;
  }

  // define method getMeasure()
  public double getMeasure() {
    // return value
    return value;
  }

  // define the method getName()
  public String getName() {
    // return the name
    return name;
  }

  // define the method toString()
  public String toString() {
    // return the value and name as strings
    return "Coin[value=" + value + ",name=" + name + "]";
  }
}