
import br.com.resources.views.ViewPrincipal;

/**
 * 
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class Index {

    /**
     * @see Classe utilizada para iniciar o programa, seleciona o look and feal 
     * e abre a tela principal.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Seleciona o Windows look and feel
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
    }
}
