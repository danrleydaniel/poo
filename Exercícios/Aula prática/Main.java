class Main {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("Ronaldo", 17, "Masculino");
    Livro l = new Livro("Viagem ao Centro da Terra", "Júlio Verne", 240, p);

    l.abrir();
    l.detalhes();
    l.avancarPag();
    l.folhear(54);
    l.detalhes();
    l.voltarPag();
    l.detalhes();
    l.reiniciar();
    l.fechar();
    l.detalhes();
  }
}
