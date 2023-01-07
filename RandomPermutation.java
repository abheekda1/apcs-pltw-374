import java.util.ArrayList;

/**********************************************************************
 * Sample solution for Activity 3.6.4
 **********************************************************************/
/**
 * Generate random permutations of integers
 */
public class RandomPermutation {
  /**
   * Genereates one permutation of random integers. The number of
   * integers to generate is designated by length and the
   * randomized list of integers is returned.
   *
   * Initial conditions: length cannot be negative
   */
  public static ArrayList<Horse> next(ArrayList<Horse> horses) {
    int length = horses.size();

    int[] r = new int[length];
    int[] p = new int[length];

    for (int i = 0; i < length; i++)
      p[i] = i + 1;

    for (int n = length; n > 0; n--) {
      int pos = (int) (Math.random() * n);
      r[n - 1] = p[pos];
      p[pos] = p[n - 1];
    }

    ArrayList<Horse> ret = new ArrayList<Horse>();

    for (int i : r) {
      // just use the randomized number permutation
      // as indexes for the randomized horse ArrayList
      ret.add(horses.get(i - 1));
    }

    // debug: System.out.println(java.util.Arrays.toString(r));
    return ret;
  }

}