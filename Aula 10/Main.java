class Main {
  public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();

    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Cláudio");
    p4.setNome("Fabiana");

    p1.setSexo("M");
    p4.setSexo("F");
    p2.setIdade(18);

    p2.setCurso("Informática");
    p3.setSalario(2500.75f);
    p4.setSetor("Estoque");

    // COMANDOS QUE DÃO ERRADO //
    //p1.receberAum(550.20f); // <- p1 é Pessoa, apenas Professor pode receber aumento
    //p2.mudarTrabalho();     // <- p2 é Aluno, apenas Funcionario pode mudar trabalho
    //p4.cancelarMat();       // <- p4 é Funcionario, apenas Aluno pode cancelar matrícula
    ////////////////////////////

    p1.mostra();
    p2.mostra();
    p3.mostra();
    p4.mostra();

  }
}
