package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageIconTest extends JFrame {

    public ImageIconTest() {
        super("이미지 표시 변경하기");

        JPanel panel = new JPanel();


        String[] fN = {"Batta", "sip", "what", "wow"};


        JLabel label = new JLabel();

        Image myImg1 = new ImageIcon("images/wow.gif").getImage().
                getScaledInstance(150, 150, 0);
        label.setIcon(new ImageIcon(myImg1));

        panel.add(label);

        JButton button = new JButton("이미지 변경");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Image myImg1 = new ImageIcon("images/what.gif").getImage().
                        getScaledInstance(150, 150, 0);
                    label.setIcon(new ImageIcon(myImg1));
            }
        });

        setLayout(new BorderLayout());

        add(panel, "North");
        add(button, "South");

        setBounds(300, 300, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {
        new ImageIconTest();
    }
}
