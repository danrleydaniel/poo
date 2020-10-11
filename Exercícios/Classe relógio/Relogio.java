public class Relogio{
  private int hour;
  private int minutes;
  private int seconds;

  public Relogio(int h, int m, int s){
    this.setHour(h);
    this.setMinutes(m);
    this.setSeconds(s);
  }

  public void setHour(int h){
    this.hour = h-3; //diminui 3 aqui porque, por algum motivo, a função está retorando 3 horas a mais do que o horário atual
  }

  public int getHour(){
    return this.hour;
  }

  public void setMinutes(int m){
    this.minutes = m;
  }

  public int getMinutes(){
    return this.minutes;
  }

  public void setSeconds(int s){
    this.seconds = s;
  }

  public int getSeconds(){
    return this.seconds;
  }

  public void showSchedule(){
    System.out.println("São " + this.getHour() + ":" + this.getMinutes() + ":" + this.getSeconds());
  }

  public void chronometer(int hr, int min, int sec){
    int ho = 0;
    int mi = 0;
    int se = 0;
    while (true){
      se++;
      if(se > 59){
        se = 0;
        mi++;
        if(mi > 59){
          mi = 0;
          ho++;
          if(mi > 59){
            mi = 0;
            ho++;
            if(ho > 24){
              ho = 0;
            }
          }
        }
      }
      System.out.println(ho + " : " + mi + " : " + se);
      if((ho == hr) && (mi == min) && (se == sec)){
        break;
      }
    }
  }
}
