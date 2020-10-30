class Main {
  public static void main(String[] args) {
    //Pessoa p1 = new Pessoa(); <- não funciona porque a classe Pessoa é abstrata

    Visitante v1 = new Visitante();
    v1.setNome("Juvenal");
    v1.setIdade(22);
    v1.setSexo("M");
    v1.mostra();

    Aluno a1 = new Aluno();
    a1.setNome("Cláudio");
    a1.setMatricula(1111);
    a1.setCurso("Informática");
    a1.setIdade(16);
    a1.setSexo("M");
    a1.pagarMensalidade();
    a1.mostra();

    Bolsista b1 = new Bolsista();
    b1.setNome("Fernando Mambambam");
    b1.setMatricula(1112);
    b1.setCurso("Informática");
    b1.setIdade(16);
    b1.setSexo("M");
    b1.setBolsa(12.5f);
    b1.pagarMensalidade();
    b1.mostra();

    Professor p1 = new Professor();
    p1.setNome("Serigo");
    p1.setSexo("M");
    p1.setIdade(45);
    p1.setSalario(2500.5f);
    p1.receberAumento(400.5f);
    p1.setEspecialidade("Programação");
    p1.mostra();

    Tecnico t1 = new Tecnico();
    t1.setNome("Dona Francisca");
    t1.setSexo("F");
    t1.setIdade(19);
    t1.setMatricula(1113);
    t1.setCurso("Informática");
    t1.setRegistroProfissional("Auxiliadora");
    t1.mostra();
  }
}
