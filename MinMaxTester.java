public class MinMaxTester {
  // define the main method
  public static void main(String[] args) {
    // create a array coins of type Coin
    Coin[] coins = {
        // adding elements to array
        new Coin(0.1, "Dime"),
        new Coin(0.05, "Nickel"),
        new Coin(0.01, "Penny"),
        new Coin(0.25, "Quarter")
    };
    // define a Pair mm
    Pair<Coin, Coin> mm = PairUtil.minmax(coins);
    // print first coin
    System.out.println(mm.getFirst());
    // print the expected result
    System.out.println("Expected: Coin[value=0.01,name=Penny]");
    // print second coin
    System.out.println(mm.getSecond());
    // print the expected result
    System.out.println("Expected: Coin[value=0.25,name=Quarter]");
  }
}