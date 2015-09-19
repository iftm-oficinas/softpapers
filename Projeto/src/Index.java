
import br.com.resources.views.ViewPrincipal;

/**
 * @see Classe utilizada para iniciar o programa, seleciona o look and feal e
 * abre a tela principal.
 * @author Marlon Andrel Coelho Freitas
 * @version 0.0000.00.00 Alfa
 */
public class Index {

    /**
     * @see Método principal da classe, carrega lookAndFeel padrão como Windows
     * e define a ViewPrincipal como visível.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tenta selecionar o Windows look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Instancia o ViewPrincipal para setar sua visibilidade como verdadeira.
        ViewPrincipal viewPrincipal = new ViewPrincipal();
        viewPrincipal.setVisible(true);

        //Teste restricões.
//        String x = "0123456789abcdefghijklmnopqrstuvwxyz";
//        if (x.contains("r")) {
//            System.out.println("ok");
//        } else {
//            System.out.println("no");
//        }
        //Esconder barra de título padrão JFrame e JDialog.
//        this.setUndecorated(true);
    }
}
