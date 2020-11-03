class Main {
  public static void main(String[] args) {
    //Animal n = new Animal(); <- não funcional, pois Animal é uma classe abstrata, ou seja, não pode ser instanciada

    Mamifero m = new Mamifero();
    Reptil r = new Reptil();
    Peixe p = new Peixe();
    Ave a = new Ave();
    Canguru c = new Canguru();
    Cachorro k = new Cachorro();
    Cobra j = new Cobra();
    Tartaruga t = new Tartaruga();
    Goldfish g = new Goldfish();
    Arara e = new Arara();

    System.out.println("\nSubclasses herdadas de Animal:\n");
    m.locomover();
    m.alimentar();
    m.emitirSom();
    r.locomover();
    r.alimentar();
    r.emitirSom();
    p.locomover();
    p.alimentar();
    p.emitirSom();
    a.locomover();
    a.alimentar();
    a.emitirSom();

    System.out.println("\nSubclasses herdadas de Mamifero:\n");
    c.locomover();
    k.emitirSom();

    System.out.println("\nSubclasses herdadas de Reptil:\n");
    j.locomover();
    t.locomover();

    System.out.println("\nSubclasses herdadas de Peixe:\n");
    g.locomover();

    System.out.println("\nSubclasses herdadas de Ave:\n");
    e.locomover();
  }
}
