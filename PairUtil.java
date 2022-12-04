public class PairUtil {
  // define a method minmax
  public static <E extends Measurable> Pair<E, E> minmax(E[] a)

  {
    // if length of a is 0
    if (a.length == 0)
      // return null
      return null;
    // declare a variable min and set first element of a to it
    E min = a[0];
    // declare a variable max and set first element of a to it
    E max = a[0];
    // iterate a for loop
    for (E element : a) {
      // if element is less than min
      if (element.getMeasure() < min.getMeasure())
        // set min equal to element
        min = element;
      // if element is greater than max
      if (element.getMeasure() > max.getMeasure())
        // set max equal to element
        max = element;
    }
    // create new pair and return it
    return new Pair<E, E>(min, max);
  }
}