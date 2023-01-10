import java.util.Arrays;

public class App {

  public static int globalValue = 3;

  public static void main(String[] args) throws Exception {
    System.out.println("=======================================");

    int[] vect = new int[] { 3, 4, 5 };
    changeOddValues(vect);
    System.out.println(Arrays.toString(vect));
    System.out.println("=======================================");
  }

  public static void changeOddValues(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 0) {
        numbers[i] += globalValue;
      }
    }
  }
}
