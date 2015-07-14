
import br.com.resources.views.ViewPrincipal;
import java.util.ArrayList;

/**
 * @see Classe utilizada para iniciar o programa, seleciona o look and feal e
 * abre a tela principal.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 * @version 0.0000.00.00 Alfa
 */
public class Index {

    /**
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

        //teste restricões...
//        String x = "0123456789abcdefghijklmnopqrstuvwxyz";
//        if (x.contains("r")) {
//            System.out.println("ok");
//        } else {
//            System.out.println("no");
//        }

        //Instancia o ViewPrincipal para setar sua visibilidade como verdadeira.
//        ViewPrincipal viewPrincipal = new ViewPrincipal();
//        viewPrincipal.setVisible(true);
    }
}
