import javax.swing.*;

public class JanelaPrincipal extends JFrame{
  private JMenuBar barra;
  private JMenu menuArquivo;
  private JMenu menuEditar;
  private JMenuItem itemNovo;
  private JMenuItem itemAbrir;
  private JMenuItem itemSalvar;
  private JMenuItem itemRecortar;
  private JMenuItem itemCopiar;
  private JMenuItem itemColar;

  public JanelaPrincipal(){
    barra = new JMenuBar();
    menuArquivo = new JMenu("Arquivo");
    menuEditar = new JMenu("Editar");
    itemNovo = new JMenuItem("Novo");
    itemAbrir = new JMenuItem("Abrir");
    itemSalvar = new JMenuItem("Salvar");
    itemRecortar = new JMenuItem("Recortar");
    itemCopiar = new JMenuItem("Copiar");
    itemColar = new JMenuItem("Colar");
    menuArquivo.add(itemNovo);
    menuArquivo.add(itemAbrir);
    menuArquivo.add(itemSalvar);
    menuEditar.add(itemRecortar);
    menuEditar.add(itemCopiar);
    menuEditar.add(itemColar);
    barra.add(menuArquivo);
    barra.add(menuEditar);
    super.setJMenuBar(barra);
  }
}
