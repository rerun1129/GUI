package mytest;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyScoreFrame extends JFrame {

    public MyScoreFrame() {

        super("문제");

        Font d = new Font("맑은고딕", Font.BOLD, 40);
        setBounds(300, 300, 400, 400);

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();


        JLabel labelD = new JLabel("점수를 입력하세요");
        labelD.setFont(d);

        JLabel labelJ = new JLabel("자바 : ");
        JTextField textFieldJ = new JTextField(10);
        JLabel labelS = new JLabel("SQL : ");
        JTextField textFieldS = new JTextField(10);
        JButton button = new JButton("계산하기");
        JTextField textFieldT = new JTextField(10);
        JLabel labelT = new JLabel("총점 : ");
        JTextField textFieldA = new JTextField(10);
        JLabel labelA = new JLabel("평균 : ");

        panel.add(labelD, "North");
        panel1.add(labelJ, "South");
        panel1.add(textFieldJ, "South");
        panel1.add(labelS, "East");
        panel1.add(textFieldS, "East");
        panel2.add(button, "Center");
        panel3.add(labelT, "West");
        panel3.add(textFieldT, "West");
        panel3.add(labelA, "East");
        panel3.add(textFieldA, "East");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int j = Integer.parseInt(textFieldJ.getText());
                int s = Integer.parseInt(textFieldS.getText());
                textFieldT.setText(String.valueOf(j + s));
                textFieldA.setText(String.valueOf((j + s) / 2));
            }
        });


        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
