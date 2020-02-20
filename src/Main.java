public class Main {
    public static void main(String[] args) {
      int before = 100;
      int bonus;
      long amount = 1100;
      int after = (int) (before + amount);
      if (after > 1100) {
          bonus = (int) (amount / 100);
      } else {
          bonus = 0;
      }
      long total = bonus + before + amount;
        System.out.println(total);
    }
}
