public class Main {
    public static void main(String[] args) {
      int before = 100;
      int bonus;
      int refill = 1100;
      int treshold = 1000;
      int after = (refill + before);
      if (refill > treshold) {
          bonus = (refill / 100);
      } else {
          bonus = 0;
      }
      int total = bonus + after;
        System.out.println(bonus);
    }
}
