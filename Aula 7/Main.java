class Main {
  public static void main(String[] args) {
    Lutador l[] = new Lutador[6];

    l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);

    l[1] = new Lutador("Putscrit", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

    l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

    l[3] = new Lutador("Deadcode", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

    l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);

    l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

    l[0].apresentar();
    l[1].apresentar();
    l[2].apresentar();
    l[3].apresentar();
    l[4].apresentar();
    l[5].apresentar();

    l[0].ganharLuta();
    l[1].empatarLuta();
    l[2].ganharLuta();
    l[3].perderLuta();
    l[4].perderLuta();
    l[5].empatarLuta();

    System.out.println("\n\n");
    l[0].status();
    l[1].status();
    l[2].status();
    l[3].status();
    l[4].status();
    l[5].status();
    
  }
}
