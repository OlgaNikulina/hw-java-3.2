public class Main {
    public static void main(String[] args) {
      int before = 100;
      int bonus;
      int after = 1200;
      int limit = 1000;
      int refill = (after - before);
      if (refill > limit) {
          bonus = (refill / 100);
      } else {
          bonus = 0;
      }
      int total = before + bonus + refill;
        System.out.println(bonus);
    }
}
