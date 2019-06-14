import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
public class MainMenu{

    public MainMenu(){
        JFrame frame = new JFrame("Start Menu");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton onePlayerButton = new JButton("One Player");
        JButton twoPlayerButton = new JButton("Two Player");
        JButton exitButton = new JButton("Exit");
        onePlayerButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                onePlayerButton.setText("Worked");
            }
            @Override
            public void mouseDragged(MouseEvent e){

            }
            @Override
            public void mouseEntered(MouseEvent e){

            }
            @Override
            public void mouseExited(MouseEvent e){

            }
            @Override
            public void mouseMoved(MouseEvent e){

            }
            @Override
            public void mousePressed(MouseEvent e){

            }
            @Override
            public void mouseReleased(MouseEvent e){

            }
            @Override
            public void mouseWheelMoved(MouseWheelEvent e){

            }
        });
        twoPlayerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                onePlayerButton.setText("Worked");
            }
            @Override
            public void mouseDragged(MouseEvent e){

            }
            @Override
            public void mouseEntered(MouseEvent e){

            }
            @Override
            public void mouseExited(MouseEvent e){

            }
            @Override
            public void mouseMoved(MouseEvent e){

            }
            @Override
            public void mousePressed(MouseEvent e){

            }
            @Override
            public void mouseReleased(MouseEvent e){

            }
            @Override
            public void mouseWheelMoved(MouseWheelEvent e){

            }
        });
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                onePlayerButton.setText("Worked");
            }
            @Override
            public void mouseDragged(MouseEvent e){

            }
            @Override
            public void mouseEntered(MouseEvent e){

            }
            @Override
            public void mouseExited(MouseEvent e){

            }
            @Override
            public void mouseMoved(MouseEvent e){

            }
            @Override
            public void mousePressed(MouseEvent e){

            }
            @Override
            public void mouseReleased(MouseEvent e){

            }
            @Override
            public void mouseWheelMoved(MouseWheelEvent e){

            }
        });
        panel.add(onePlayerButton);
        panel.add(twoPlayerButton);
        panel.add(exitButton);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}