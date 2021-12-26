package pl.mkluzniak;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //JLabel = a GUI display are for a string of text, an image or both

        ImageIcon image = new ImageIcon("pobrane.jpg");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label = new JLabel();//creaate label
        label.setText("Do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //option set LEFT, RIGHT
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text vertical
        label.setForeground(new Color(0x00FF00)); //set background color to what we want
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set font of text
        label.setIconTextGap(100); //set gap of text image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position icon+txt within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position icon+txt within label
//        label.setBounds(100,100,250,250);//will set x,y position and dimension




        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //pack method to auto size what is inside window





    }
}
