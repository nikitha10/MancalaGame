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

//import com.sun.org.glassfish.gmbal.ManagedAttribute;

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
      
        JPanel mainPanel = new JPanel(); //CONTAINS BOTH PANELS WITH NULL LAYOUT
        mainPanel.setLayout(null);
        
        JPanel mancalaPanel = new JPanel()/*{
            @Override
            public void paint(Graphics g){
                //g.setColor(new Color(199, 219, 226));
                //g.fillRect(300, 200, 1000, 500);
            }
        }*/;
        mancalaPanel.setBackground(new Color(199, 219, 226));
        //mancalaPanel.setSize(1000, 500);
        mancalaPanel.setBounds(300, 200, 1000, 500);
        mancalaPanel.setLayout(null);
        mancalaPanel.setOpaque(true);
        mancalaPanel.repaint();
        
        JPanel playerTwoGoal = new JPanel()/*{
            @Override
            public void paint(Graphics g){
                g.setColor(new Color(198, 25, 25));
                g.fillRect(0, 0, 100, 250);
            }
        }*/;
        playerTwoGoal.setBackground(new Color(198, 25, 25));
        playerTwoGoal.setBounds(0, 0, 100, 250);
        playerTwoGoal.setOpaque(true);
        playerTwoGoal.repaint();
        
        mainPanel.add(mancalaPanel);
        //mainPanel.add(playerTwoGoal); //ALTERNATLEY COMMENT THIS OUT
        mancalaPanel.add(playerTwoGoal); //AND UNCOMMENT THIS AND SEE
                                        //CHANGE IN BEHAVIOR
        
        
        frame.add(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}