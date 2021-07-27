package component;

import java.awt.BorderLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest extends JFrame {

    public CheckBoxTest() {
        super("과일 선택하기");

        String[] fruit = {
                "수박", "멜론", "복숭아", "두리안", "키위"
        };

        JCheckBox[] box = new JCheckBox[5];

        // 체크박스 반복문
        for(int i = 0; i < box.length ; i++) {
            box[i] = new JCheckBox(fruit[i]);
        }

        JPanel pan = new JPanel();

        for(int i = 0 ; i < box.length ; i++) {
            pan.add(box[i]);
        }

        JLabel label = new JLabel("과일을 선택해주세요!");

        setLayout(new BorderLayout());

        add(pan, "Center");
        add(label, "South");

        setBounds(300, 300, 500, 600);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new CheckBoxTest();

    }

}











