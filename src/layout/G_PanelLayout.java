package layout;

import javax.swing.*;
import java.awt.*;

public class G_PanelLayout extends JFrame {

    public G_PanelLayout() {
        super("컴포넌트 레이아웃");

        setLayout(null);        //전체 레이아웃 단계의 구성 선언
        setBounds(300, 300, 500, 500);
        //전체 레이아웃 선언이 없으면 무조건 패널 레이아웃 선언이 전체 레이아웃을 대신하기 때문에
        //패널의 크기변경이 되지 않는다.


        // JPanel은 기본 레이아웃이 FlowLayout 이다.
        JPanel panel = new JPanel();
        panel.setLayout(null);      //패널 레이아웃 단계의 구성 선언
        panel.setBounds(0, 0, 400, 400);
        panel.setBackground(Color.white);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 500);
        panel1.setBackground(Color.magenta);

        JLabel label = new JLabel("아이디 : ");
        label.setBounds(50, 100, 150, 50);
        JTextField text = new JTextField("아이디를 입력하세요.");
        text.setBounds(150, 100, 150, 50);
        JButton button = new JButton("로그인");
        button.setBounds(300, 100, 100, 50);

        //패널 겹치기(계층별로 순서 정렬해야 제대로 나옴)
        //패널 뒤에 컴포넌트들이 선언되면 패널이 다 덮어버림
        add(panel);
        add(panel1);
        //무조건 패널보다 위에 컴포넌트들이 오게하고 싶으면 패널 인스턴스에 메서드를 깔아줘야 한다.
        //이런식으로
        panel.add(label);
        panel.add(text);
        panel.add(button);




        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
