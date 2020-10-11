import java.text.SimpleDateFormat;
import java.util.*;


class Main {
  public static void main(String[] args) {
    int h, m, s;
    Calendar c = Calendar.getInstance();
    Scanner ler = new Scanner(System.in);
    int hr = c.get(Calendar.HOUR_OF_DAY);
    int min = c.get(Calendar.MINUTE);
    int sec = c.get(Calendar.SECOND);
    Relogio r = new Relogio(hr, min, sec);
    r.showSchedule();

    System.out.println("\n\nINICIAR CRONÔNETRO. Digite a quantidade de horas, minutos e segundos: ");
    h = ler.nextInt();
    m = ler.nextInt();
    s = ler.nextInt();
    System.out.println("\n\nO cronômetro vai começar: " + h + " horas, " + m + " minutos e " + s + " segundos.");
    r.chronometer(h,m,s); //falta melhorar esse método colocando a espera de 1 segundo.

  }
}
