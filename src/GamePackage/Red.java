package GamePackage;


import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.color.*;
import java.awt.event.*;



class Red
{

    JFrame frame = new JFrame("Snakes & Ladders");

    JLabel  dice1, dice2, boardBoxes[], m[];                                    //dice gif, board, number rolled
    JTextField field1, field2;                                                          // text fields for player names
    JButton roll1, roll2;                                                               //ROLL button
    JButton reset, New, Close;
    JTextField screen;                                                                  // display
    JLabel image1, image2 = new JLabel(" ");

    JLayeredPane pane;
    JLabel background;

    ListenerRed o = new ListenerRed(this);


    Red()
    {


        pane = new JLayeredPane();
        background = new JLabel();
        background.setIcon(new ImageIcon(".//blackback.jpg"));
        background.setBounds(0,0,1115,725);
        pane.add(background);
        pane.setLayer(background, 0);



        boardBoxes = new JLabel[101];    				                        //Snake Board
        m = new JLabel[6];			                                        //start, and both pieces



        //Start point with player pieces

        /*******************************************************************************/

        //Player 1 piece at start point

        m[1]=new JLabel();
        m[1].setBounds(12,545,20,52);
        m[1].setIcon(new ImageIcon(".//player1.png"));
        pane.add(m[1]);
        pane.setLayer(m[1], 1);

        //Player 2 piece at start point

        m[2]=new JLabel();
        m[2].setBounds(3,545,20,52);
        m[2].setIcon(new ImageIcon(".//player2.png"));
        pane.add(m[2]);
        pane.setLayer(m[2], 1);


        //start point

        m[3]=new JLabel();
        m[3].setBounds(35,549,155,60);
        m[3].setIcon(new ImageIcon(".//start3.jpg"));
        pane.add(m[3]);
        pane.setLayer(m[3], 1);

        //finish point

        m[0] = new JLabel();
        m[0].setBounds(35,27,155,60);
        m[0].setIcon(new ImageIcon(".//finish3.jpg"));
        pane.add(m[0]);
        pane.setLayer(m[0], 1);


        /*********************************************************************************/

        //player pieces in front of their text fields

        m[4]=new JLabel();
        m[4].setBounds(810,635,20,52);
        m[4].setIcon(new ImageIcon(".//player2.png"));
        pane.add(m[4]);
        pane.setLayer(m[4], 1);

        m[5]=new JLabel();
        m[5].setBounds(270,635,20,52);
        m[5].setIcon(new ImageIcon(".//player1.png"));
        pane.add(m[5]);
        pane.setLayer(m[5], 1);








        //Board Boxes 0 - 100

        /**************************************************************************************/

        int j=0;
        for(int i=100;i>90;i--)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),20,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        j=0;
        for(int i=81;i<91;i++)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),80,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        j=0;
        for(int i=80;i>70;i--)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),140,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        j=0;
        for(int i=61;i<71;i++)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),200,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }
        j=0;
        for(int i=60;i>50;i--)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),260,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        j=0;
        for(int i=41;i<51;i++)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),320,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }
        j=0;
        for(int i=40;i>30;i--)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),380,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        j=0;
        for(int i=21;i<31;i++)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),440,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        j=0;
        for(int i=20;i>10;i--)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),500,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        j=0;
        for(int i=1;i<11;i++)
        {
            boardBoxes[i]=new JLabel();
            boardBoxes[i].setBounds((200+j*70),560,70,70);
            boardBoxes[i].setIcon(new ImageIcon(".//Red/"+i+".jpg"));
            pane.add(boardBoxes[i]);
            pane.setLayer(boardBoxes[i], 1);
            j++;
        }

        /****************************************************************************************/



        // New Game button

        New = new JButton();
        New.setText("New Game");
        New.setBounds(910,20,170,50);       //y = 20     25
        New.setBackground(Color.decode("#e6b817"));
        New.setForeground(Color.black);
        New.setBorderPainted(false);
        New.addActionListener(o);
        pane.add(New);
        pane.setLayer(New, 1);



        // Close Game button

        Close = new JButton();
        Close.setText("Quit Game");
        Close.setBounds(910,575,170,50);            //y = 575  625
        Close.setBackground(Color.decode("#e6b817"));
        Close.setBorderPainted(false);
        Close.setForeground(Color.black);
        Close.addActionListener(o);
        pane.add(Close);
        pane.setLayer(Close, 1);



        //Reset Button

        reset=new JButton("Reset Game");
        reset.addActionListener(o);
        reset.setBackground(Color.decode("#e6b817"));
        reset.setBorderPainted(false);
        reset.setForeground(Color.black);
        reset.setBounds(910,95,170,50);         // y = 95   80
        pane.add(reset);
        pane.setLayer(reset, 1);




        //Text field with Message about whose turn it is

        screen= new JTextField("  Roll The Dice");                                    //roll the dice text field
        screen.setBounds(465,635,170,55);
        screen.setBackground(Color.decode("#c0c8bd"));
        screen.setForeground(Color.BLACK);
        pane.add(screen);
        pane.setLayer(screen, 1);




        //Text Fields with Player names

        field1=new JTextField();
        field1.setBounds(295,645,150,35);
        field1.setText(" Player 1 ");                                                       // player name text field infornt of gottian
        pane.add(field1);
        pane.setLayer(field1, 1);
        field1.setBackground(Color.decode("#330000"));
        field1.setForeground(Color.WHITE);

        field2=new JTextField();
        field2.setBounds(655,645,150,35);
        field2.setText(" Player 2 ");
        pane.add(field2);
        pane.setLayer(field2, 1);
        field2.setBackground(Color.decode("#330000"));
        field2.setForeground(Color.WHITE);





        //Number rolled display for p1 and p2

        image1 =new JLabel(" ");
        image1.setForeground(Color.WHITE);
        image1.setBounds(150, 230, 100,100);      //150 230 100 100       130 220 100 100
        pane.add(image1);
        pane.setLayer(image1, 1);

        image2 =new JLabel(" ");
        image2.setForeground(Color.WHITE);
        image2.setBounds(1050 ,230, 100, 100);     //1050 230 100 100      1030 220 100 100
        pane.add(image2);
        pane.setLayer(image2, 1);





        // dice gif for player 1

        dice1=new JLabel();
        dice1.setBounds(65,220,120,120);        //40
        dice1.setText("");
        dice1.setIcon(new ImageIcon(".//dice.gif"));
        pane.add(dice1);
        pane.setLayer(dice1, 1);

        // dice gif for player 2

        dice2=new JLabel();
        dice2.setBounds(965,220,120,120);       //940
        dice2.setText("");
        dice2.setIcon(new ImageIcon(".//dice.gif"));
        pane.add(dice2);
        pane.setLayer(dice2, 1);







        //Roll Button for Player1

        roll1=new JButton();
        roll1.setBounds(15,340,170,60);
        roll1.setText("Roll");
        roll1.setBorderPainted(false);
        roll1.setToolTipText("Player 1 Press to roll dice");
        roll1.setVisible(true);
        roll1.addActionListener(o);
        pane.add(roll1);
        pane.setLayer(roll1, 1);


        //Roll Button for Player2

        roll2 = new JButton("Roll");
        roll2.setBounds(915,340,170,60);
        roll2.addActionListener(o);
        roll2.setVisible(false);
        roll2.setBorderPainted(false);
        roll2.setToolTipText("Player 2 Press to roll dice");
        pane.add(roll2);
        pane.setLayer(roll2, 1);





        /***************************************************************************************************/

        //FONTS
        Font font = new Font("Book Antiqua", Font.BOLD,20);

        Font font1 = new Font("Tecton Pro", Font.BOLD,26);

        Font font2=new Font("Comic Sans MS",Font.BOLD,18);

        Font font3=new Font("Franklin Gothic Medium Italic",Font.BOLD,27);

        Font font4=new Font("Florencesans SC", Font.BOLD,19);






        //Set Fonts

        field1.setFont(font);
        field2.setFont(font);

        screen.setFont(font2);

        image1.setFont(font3);
        image2.setFont(font3);

        New.setFont(font4);

        Close.setFont(font4);

        reset.setFont(font4);

        dice1.setFont(font1);
        dice2.setFont(font1);

        roll1.setFont(font3);
        roll2.setFont(font3);





        pane.setSize(1115,725);
        frame.add(pane);


        //JFrame Characteristics
        frame.setLayout(null);
        frame.setSize(1115,725);
        frame.setVisible(true);
        frame.setResizable(false);





    }



}





class ListenerRed implements ActionListener
{
    private Red redInstance;                                   // instance of project class created
    private int randomNumber,x1,y1;                                 // x, y coordinates.
    static int player1Position,player2Position;                     //current positions of players
    static int w;                                                   // variable to check whose turn it is
    Rectangle rectangle = new Rectangle();
    double y,z;




    ListenerRed(Red redInstance)
    {
        this.redInstance = redInstance;
    }

    void randomNumber1()
    {

        Random generator = new Random();
        randomNumber = generator.nextInt(6) + 1;

        redInstance.image1.setText(String.valueOf(randomNumber));


        try { 	 redInstance.dice1.setVisible(false);
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }

        redInstance.dice1.setVisible(true);


    }

    void randomNumber2()
    {
        Random generator = new Random();
        randomNumber = generator.nextInt(6) + 1;

        redInstance.image2.setText(String.valueOf(randomNumber));


        try { 	 redInstance.dice2.setVisible(false);
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }

        redInstance.dice2.setVisible(true);


    }



    public void actionPerformed(ActionEvent e)
    {   /********************************************/

        //Reset Button event handled
        if(e.getSource()==redInstance.reset)
        {
            redInstance.m[1].setBounds(12,545,20,52);      //25 575
            redInstance.m[2].setBounds(3,545,20,52);       //3 575
            redInstance.image1.setText(" ");
            redInstance.image2.setText(" ");
            player1Position=0;
            player2Position=0;
            w=1;


        }

        //New Button event handled
        if(e.getSource()==redInstance.New)
        {
            redInstance.m[1].setBounds(12,545,20,52);      //25 575
            redInstance.m[2].setBounds(3,545,20,52);       //3 575
            redInstance.image1.setText(" ");
            redInstance.image2.setText(" ");
            player1Position=0;
            player2Position=0;
            w=1;

        }

        //Close Button event handled
        if(e.getSource() == redInstance.Close) {
            redInstance.frame.dispose();
        }




        if(w%2 == 0) {
            redInstance.screen.setText("Player 2 turn");
            redInstance.roll1.setVisible(false);       //if player 2 turn then disable roll button for player 1
            redInstance.roll2.setVisible(true);

            w++;
        }
        else {

            redInstance.screen.setText("Player 1 turn");
            redInstance.roll2.setVisible(false);           //if player 1 turn then disble roll button for player 2
            redInstance.roll1.setVisible(true);

            w++;
        }



        //When Player 1 Rolls
        if(e.getSource()== redInstance.roll1)
        {
            randomNumber1();

            if((player1Position + randomNumber) < 101)
            {
                player1Position = player1Position + randomNumber;
                rectangle = redInstance.boardBoxes[player1Position].getBounds();
                y=rectangle.getX();
                z=rectangle.getY();
                x1=(int)Math.round(y);
                y1=(int)Math.round(z);
                redInstance.m[1].setBounds((x1+25),(y1+12),20,52); //x1 +25, y1 + 12



                //Check for ladders

                int c[]=new int[]{4,14,31,39,47,64,72};
                int f[]=new int[]{23,35,51,58,75,98,91};

                for(int i=0; i<c.length; i++)
                {
                    if(player1Position == c[i])
                    {
                        rectangle = redInstance.boardBoxes[f[i]].getBounds();
                        y=rectangle.getX();
                        z=rectangle.getY();
                        x1=(int)Math.round(y);
                        y1=(int)Math.round(z);
                        redInstance.m[1].setBounds((x1+25),(y1+12),20,52); //x1+25, y1+12
                        player1Position=f[i];

                    }
                }

                //check for snakes

                int a[]=new int[]{33,57,73,93,99};
                int b[]=new int[]{29,45,52,85,41};

                for(int i=0; i<a.length; i++)
                {
                    if(player1Position == a[i])
                    {
                        rectangle=redInstance.boardBoxes[b[i]].getBounds();
                        y=rectangle.getX();
                        z=rectangle.getY();
                        x1=(int)Math.round(y);
                        y1=(int)Math.round(z);
                        redInstance.m[1].setBounds((x1+25),(y1+12),20,52);     //x1+25, y1+12
                        player1Position = b[i];

                    }
                }
            }
        }


        //When Player2 rolls
        if(e.getSource()== redInstance.roll2)
        {
            randomNumber2();

            if((player2Position+randomNumber)<101)
            {
                player2Position = player2Position + randomNumber;
                rectangle=redInstance.boardBoxes[player2Position].getBounds();
                y=rectangle.getX();
                z=rectangle.getY();
                x1=(int)Math.round(y);
                y1=(int)Math.round(z);
                redInstance.m[2].setBounds((x1+25),(y1+12),20,52);     //x1+25, y1+12


                // Snakes.
                int a[]=new int[]{33,57,73,93,99};
                int b[]=new int[]{29,45,52,85,41};


                for(int i=0;i<a.length;i++)
                {
                    if(player2Position == a[i])
                    {
                        rectangle=redInstance.boardBoxes[b[i]].getBounds();
                        y=rectangle.getX();
                        z=rectangle.getY();
                        x1=(int)Math.round(y);
                        y1=(int)Math.round(z);
                        redInstance.m[2].setBounds((x1+25),(y1+12),20,52); //x1+25, y1+12
                        player2Position=b[i];

                    }
                }


                // Ladders.
                int c[]=new int[]{4,14,31,39,47,64,72};
                int f[]=new int[]{23,35,51,58,75,98,91};

                for(int i=0;i<c.length;i++)
                {

                    if(player2Position == c[i])
                    {
                        rectangle=redInstance.boardBoxes[f[i]].getBounds();
                        y=rectangle.getX();
                        z=rectangle.getY();
                        x1=(int)Math.round(y);
                        y1=(int)Math.round(z);
                        redInstance.m[2].setBounds((x1+25),(y1+12),20,52); //x1+25, y1+12
                        player2Position=f[i];

                    }
                }
            }
        }







        //*************************If any player wins***************************/

        if( player1Position == 100) {

            redInstance.screen.setText("Player 1 wins");

            redInstance.m[1].setBounds(12,25 , 20,52);
            JOptionPane.showMessageDialog(redInstance.frame, "Congratulations! Player 1 has won the game!");
            redInstance.frame.dispose();

        }


        else if( player2Position == 100) {

            redInstance.screen.setText("Player 2 wins");

            redInstance.m[2].setBounds(12,25,20,52);
            JOptionPane.showMessageDialog(redInstance.frame, "Congratulations! Player 2 has won the game!");
            redInstance.frame.dispose();
        }
    }
}






