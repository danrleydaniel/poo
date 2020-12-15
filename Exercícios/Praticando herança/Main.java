class Main {
  public static void main(String[] args) {
    ContaBancaria b = new ContaBancaria();
    b.setCliente("Bernado");
    b.setNum_conta(1);
    b.setSaldo(100f);

    ContaEspecial e = new ContaEspecial();
    e.setCliente("Elisangela");
    e.setNum_conta(2);
    e.setSaldo(100f);
    e.setLimite(50);

    ContaPoupanca p = new ContaPoupanca();
    p.setCliente("Pedro");
    p.setNum_conta(3);
    p.setSaldo(100f);

    b.show();
    e.show();
    p.show();

    b.sacar(101f);
    e.sacar(101f);
    p.sacar(101f);

    b.show();
    e.show();
    p.show();

    b.sacar(50f);
    e.sacar(101f);
    p.sacar(54f);

    b.show();
    e.show();
    p.show();

    e.depositar(120f);
    b.depositar(130f);
    p.depositar(140f);
    
    b.show();
    e.show();
    p.show();

    p.calcularNovoSaldo(5f);
    p.show();
  }
}
