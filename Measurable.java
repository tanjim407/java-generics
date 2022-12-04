import java.util.ArrayList;

//define an interface Measurable
public interface Measurable<T> {
  // declare the method getMeasure()
  public double getMeasure();

  // define the method largest()
  public static <T extends Measurable<T>> T largest(ArrayList<T> objects) {
    // if the size of object is equal to size
    if (objects.size() == 0) {
      // return null
      return null;
    }
    // define a variable largest and set the first element of objects to it
    T largest = objects.get(0);
    // iterarate a for loop
    for (T obj : objects) {
      // if the condition is true
      if (obj.getMeasure() > largest.getMeasure()) {
        // set largest equal to obj
        largest = obj;
      }
    }
    // return the value of largest
    return largest;
  }
}