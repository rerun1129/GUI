package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaTest extends JFrame {

    public TextAreaTest() {
        super("길동이의 나홀로 채팅방");

        JPanel pan = new JPanel();

        pan.setLayout(new BorderLayout());

        JTextArea area = new JTextArea();
        JTextField text = new JTextField();
        area.setEditable(false);

        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String str = text.getText(); //입력란에 문자열 입력하게 해줌
                area.append(str + "\n");    //area에 문자열을 전달하고 이어서 입력하게 해줌
                text.setText("");           //입력란의 문자열을 초기화시켜줌

            }
        });

        pan.add(area, "Center");
        pan.add(text, "South");
        add(pan);

        setBounds(300, 300, 500, 500);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TextAreaTest();
    }
}
