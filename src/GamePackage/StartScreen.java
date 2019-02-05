package GamePackage;



//Name:     SAIM RAZA GONDAL(173087) & DANIAL AHMED KHAN TAREEN(177103)
//Class:    BSCS 6C

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.StrokeBorder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.color.*;
import java.awt.event.*;


public class StartScreen{



    JFrame startFrame = new JFrame();       // frame
    JLabel label1, blueBoard, redBoard;     //
    JLayeredPane pane;                      // layered pane so background can be added to below layer
    JLabel background;                      //label for background image





    StartScreen(){

        //Start Window Displaying name of the Game

/*************************************************************************/
        //Start Window

        JWindow start = new JWindow();
            start.getContentPane().add(new JLabel("", new ImageIcon(".//pic2.jpg"), SwingConstants.LEFT));

            //get size of screen
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();         //get the size of the screen
            start.setSize(screenSize.width, screenSize.height);                         //set size of window equal to the screen

        start.setBounds(0,0,screenSize.width, screenSize.height);
        start.setVisible(true);

            //The screen will be displayed for # of milli seconds
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


        start.dispose();


/**************************************************************************/



        pane = new JLayeredPane();

    //BACKGROUND IMAGE

        background = new JLabel();
        background.setIcon(new ImageIcon(".//bg8.jpg"));
        background.setBounds(0,0,1115,725);
        pane.add(background);
        pane.setLayer(background, 0);


/*****************************************************************************/

        label1 = new JLabel("Select a board: ");
        label1.setBounds(420,50,700,50);
        label1.setForeground(Color.WHITE);
        pane.add(label1);
        pane.setLayer(label1, 1);


        Font font = new Font("Century751 SeBd BT", Font.BOLD, 36);
        label1.setFont(font);


        //IMAGES OF BOARDS


        //BLUE BOARD
        blueBoard = new JLabel(new ImageIcon(".//blueBoard450.jpg"));

        pane.add(blueBoard);
        pane.setLayer(blueBoard, 1);

        blueBoard.setBounds(77,150,450,450);
        blueBoard.setBorder(new LineBorder(Color.BLUE, 2, true));
        blueBoard.addMouseListener(new MouseAdapter() {

            @Override                                   //if user clicks blue board then game will start with blue board
            public void mouseClicked(MouseEvent e) {
                startFrame.dispose();
                new Project();
            }

        });


        //RED BOARD
        redBoard = new JLabel(new ImageIcon(".//redBoard450.jpg"));

        pane.add(redBoard);
        pane.setLayer(redBoard, 1);

        redBoard.setBounds(590,150,450,450);
        redBoard.setBorder(new LineBorder(Color.red, 2, true));
        redBoard.addMouseListener(new MouseAdapter() {
            @Override                                     //if user clicks red board then game will start with red board
            public void mouseClicked(MouseEvent e) {
                startFrame.dispose();
                new Red();
            }

        });


    /*******************************************************************************************************************/






        pane.setSize(1110,720);

        //add pane to main frame
        startFrame.add(pane);

        startFrame.setLayout(null);
        startFrame.setTitle(" Snakes & Ladders ");
        startFrame.setVisible(true);
        startFrame.setSize(1115,725);
        startFrame.setResizable(false);

    }



    /*******DRIVER CLASS*************/
    public static void main(String [] args)

    {
        new StartScreen();

    }


}










