package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogTest extends JFrame {

    public JDialogTest() {
        super("다이얼로그 테스트");

        JPanel panel = new JPanel();

        JButton btn1 = new JButton("기본 다이얼로그");

        Dialog dialog = new Dialog(this, "기본 다이얼로그입니다.");

        dialog.setBounds(300, 300, 150, 150);
        dialog.add(new JLabel("다이얼로그 내용..."));

        panel.add(btn1);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);                //dialog 객체는 따로 보여줘야함.
            }
        });


        JButton btn2 = new JButton("닫기 버튼");

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();           //dispose 하면 dialog 객체가 닫힘.
            }
        });
        panel.add(btn2);


        JButton btn3 = new JButton("입력값 작성 버튼");

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("안녕하세요");
                int result = JOptionPane.showConfirmDialog(panel, "약관 동의");
                System.out.println("result : " + result + str);
            }
        });

        panel.add(btn3);

        add(panel);


        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JDialogTest();
    }
}
