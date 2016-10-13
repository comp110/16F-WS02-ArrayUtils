package comp110;

public class TestRunner {

  public static void main(String[] args) {

    TestRunner.reducers();

    // TODO: add additional static methods (and calls!)
    // for each of the other parts of the assignment.

  }

  public static void reducers() {
    System.out.println("=======================");
    System.out.println("   1. Reducers         ");
    System.out.println("=======================");

    System.out.println("1.1 reduceSum - expected: 0 - actual: " + ArrayUtils.reduceSum(new int[] {}));
    System.out.println("1.1 reduceSum - expected: 1 - actual: " + ArrayUtils.reduceSum(new int[] { 1 }));
    System.out.println("1.1 reduceSum - expected: 5 - actual: " + ArrayUtils.reduceSum(new int[] { 2, 3 }));
    System.out.println("1.1 reduceSum - expected: 15 - actual: " + ArrayUtils.reduceSum(new int[] { 4, 5, 6 }));

    // TODO: add additional reducers tests here

  }

}
