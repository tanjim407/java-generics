public class Pair<T, S> {
  // define the class members
  private T first;
  private S second;

  // constructor
  public Pair(T firstElement, S secondElement) {
    // set class elements
    first = firstElement;
    second = secondElement;
  }

  // getter for first
  public T getFirst() {
    // return the value
    return first;
  }

  // getter for second
  public S getSecond() {
    // return the second
    return second;
  }
}