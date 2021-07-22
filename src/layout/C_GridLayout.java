package layout;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class C_GridLayout extends JFrame {


    public C_GridLayout() {

        super("그리드 프레임 제목");

        setBounds(300, 300, 600, 600);  //초기 좌표 x,y 창 크기 w,h


        setLayout(new GridLayout(5, 5, 10, 20));


        //랜덤 빙고판 만들기
        //1 ~ 25 까지 랜덤한 수 만들기

        Set<Integer> bing = new LinkedHashSet<>();

        while (bing.size() < 25){
        int num = (int) (Math.random() *25 +1);
        bing.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(bing);

        for(int i : list)
            add(new JButton(i + "번"));


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
