import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.org.glassfish.gmbal.ManagedAttribute;

import javax.swing.Box;
import javax.swing.JComponent;

public class GameMenu{

    private JFrame frame;
    private Game game;

    public GameMenu(Game game){
        frame = new JFrame("Mancala");
        frame.getContentPane().getInsets().set(0, 0, 0, 0);
        frame.setSize(new Dimension(1600, 900));
        this.game = game;

        JPanel mancalaFrame = new JPanel(){
            @Override
            public void paint(Graphics g){
                g.setColor(new Color(199, 219, 226));
                g.fillRect(300, 200, 1000, 500);
            }
        };
        frame.add(mancalaFrame);
        mancalaFrame.setSize(1000, 500);
        mancalaFrame.setBounds(300, 200, 1000, 500);
        //mancalaFrame.setLayout(null);
        mancalaFrame.setOpaque(true);
        mancalaFrame.repaint();

        JPanel playerTwoGoal = new JPanel(){
            @Override
            public void paint(Graphics g){
                g.setColor(new Color(198, 25, 25));
                g.fillRect(0, 0, 100, 250);
            }
        };
        mancalaFrame.add(playerTwoGoal);
        playerTwoGoal.setBounds(0, 0, 100, 250);
        playerTwoGoal.setOpaque(true);
        playerTwoGoal.repaint();
        playerTwoGoal.setOpaque(true);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}