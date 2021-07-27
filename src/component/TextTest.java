package component;

import javax.swing.*;
import java.awt.*;

public class TextTest extends JFrame {

    public TextTest() {
        super("TextTest");

        setLayout(new GridLayout(3,2));

        JLabel label1 = new JLabel("이름 : ");
        JTextField text = new JTextField("이름을 입력해주세요.");

        JLabel label2 = new JLabel("비밀번호 : ");
        JPasswordField pass = new JPasswordField("비번을 입력해주세요.");

        JLabel label3 = new JLabel("비고 : ");
        JTextArea area = new JTextArea("입력!");

        add(label1);
        add(text);
        add(label2);
        add(pass);
        add(label3);
        add(area);

        setBounds(300,300,600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
