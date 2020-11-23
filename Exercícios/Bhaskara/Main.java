import java.util.Scanner;

/*
  ax² + bx + c = 0

  Δ = b² - 4 * a * c

      -b ± √Δ
  x = ---------
        2*a

*/

class Main {
  public static void main(String[] args) {
    int a, b, c;
    Scanner l = new Scanner(System.in);

    a = l.nextInt();
    b = l.nextInt();
    c = l.nextInt();

    l.close();

    Bhaskara bh = new Bhaskara(a, b, c);
    bh.resolucao();
  }
}
