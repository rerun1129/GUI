package layout;

import javax.swing.*;
import java.awt.*;

public class F_AbsoluteLayout extends JFrame {

    public F_AbsoluteLayout() {
        //절대값 레이아웃
        //개발자가 원하는 위치에 직접 컴포넌트를
        //배치하는 방식(NullLayout)

        super("절대영역 테스트");

        setBounds(300, 300, 600, 460);

        //기본은 BorderLayout
        //System.out.println(getLayout());

        setLayout(null);        //이렇게 선언해야 제대로 출력이 된다.
                                //기본은 BorderLayout이 잡히기 때문에
                                //원하는대로 출력이 안된다.

        JLabel label = new JLabel("아이디 : ");
        label.setLocation(50, 100);                 //라벨 위치
        label.setSize(150, 50);               //라벨 크기

        JTextField text = new JTextField();
        text.setLocation(300,100);
        text.setSize(150,50);

        add(label);
        add(text);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
