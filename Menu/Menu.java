import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Menu{

    public Menu(){
        JFrame frame = new JFrame("Start Menu");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}