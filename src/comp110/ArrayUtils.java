package comp110;

/**
 * Author:
 *
 * ONYEN:
 *
 * Collaborator(s):
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been received
 * or given in the completion of this work. I certify that I understand and
 * could now rewrite on my own, without assistance from collaborators or course
 * staff, the problem set code I am submitting.
 */
public class ArrayUtils {

  /* Part 1. Reducers */

  public static int reduceSum(int[] a) {
	  int sum = 0;
	  for (int i: a){
		  sum +=i;
	  }
	  return sum;
  }

  public static int reduceProduct(int[] a) {
	  int product = 1;
	  for (int i: a){
		  product *= i;
	  }
	  return product;
  }

  public static int reduceCount(int[] a, int n) {
      int count = 0;
      for (int i : a){
    	  if (n == i) count++;
      }
	  return count;
  }

  public static int reduceCountOdds(int[] a) {
	  int count = 0;
	  for (int i : a){
		  if (i%2 == 1) count++;
	  }
	  return count;
  }

  public static int reduceMin(int[] a) {
	  int min = a[0];
	  int i = 1;
	  while (i < a.length){
		  if (a[i] < min) {
			  min = a[i];
		  }
		  i++;
	  }
	  return min;
  }

  public static int reduceMax(int[] a) {
	  int max = a[0];
	  int i = 1;
	  while (i < a.length){
		  if (a[i] > max) {
			  max = a[i];
		  }
		  i++;
	  }
	  return max;
  }

  /* Part 2. Logical Tests */

  public static boolean contains(int[] a, int n) {
	  int i = 0;
	  while (i < a.length) {
		  if (a[i] == n){
			  return true;
		  }
		  i++;
	  }
	  return false;
  }

  public static boolean every(int[] a, int n) {
	  int i = 0;
	  while (i < a.length) {
		  if (a[i] != n) {
			  return false;
		  }
		  i++;
	  }
	  return true;
  }

  public static boolean equals(int[] a, int[] b) {
	  if (a.length != b.length){
		  return false;
	  }
	  int i = 0;
	  while (i < a.length) {
		  if (a[i] != b[i]){
			  return false;
		  }
		  i++;
	  }
	  return true;
  }

  /* Part 3. Stringify and Clone */

  public static String stringify(int[] a) {
	  String s = "{";
	  int i = 0;
	  while (i < a.length) {
		  if (i == 0) {
			  s += a[i];
		  } else {
			  s += (", " + a[i]); 
		  }
		  i++;
	  }
	  s += "}";
	  return s;
  }

  public static void print(int[] a) {
    System.out.println(ArrayUtils.stringify(a));
  }

  public static int[] clone(int[] a) {
	  int[] copy = new int[a.length];
	  int i = 0;
	  while (i < a.length) {
		  copy[i] = a[i];
		  i++;
	  }
	  return copy;
  }

  /* Part 4. Mappers */

  public static int[] mapSquare(int[] a) {
	  int[] squred = new int[a.length];
	  int i = 0;
	  while (i < a.length) {
		  squred[i] = a[i]*a[i];
		  i++;
	  }
	  return squred;
  }

  public static int[] mapAdd(int[] a, int n) {
	  int[] added = new int[a.length];
	  int i = 0;
	  while (i < a.length) {
		  added[i] = a[i] + n;
		  i++;
	  }
	  return added;
  }

  public static int[] mapMultiply(int[] a, int n) {
	  int[] multiply = new int[a.length];
	  int i = 0;
	  while (i < a.length) {
		  multiply[i] = a[i] * n;
		  i++;
	  }
	  return multiply;
  }

  /* Part 5. Utilities */

  public static int[] reverse(int[] a) {
	  int[] reverse = new int[a.length];
	  int i = 0;
	  while (i < a.length) {
		  reverse[i] = a[a.length - i - 1];
		  i++;
	  }
	  return reverse;
  }

  public static int[] concatenate(int[] a, int[] b) {
	  int[] con = new int[a.length + b.length];
	  int i = 0;
	  while (i < a.length) {
		  con[i] = a[i];
		  i++;
	  }
	  i = a.length;
	  while (i < a.length+b.length) {
		  con[i] = b[i - a.length];
		  i++;
	  }
	  return con;
  }

  public static int[] subarray(int[] a, int start, int end) {
    return null;
  }

  public static int[] without(int[] a, int n) {
    return null;
  }

  public static int[] interleave(int[] a, int[] b) {
    return null;
  }

  public static int[] splice(int[] a, int offset, int[] b) {
    return null;
  }

}