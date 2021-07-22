package container;

import javax.swing.*;
import java.awt.*;

public class JFrameTest2 {

    // 컨테이너 생성 방법 2
    // 메소드를 통해 JFrame을 직접 생성

    public void showFrm() {

        //객체 생성
        JFrame frm = new JFrame("프레임 제목");

        //프레임 잡기
        Rectangle r = new Rectangle(300, 300, 400, 400);
        frm.setBounds(r);

        // 종료 메소드
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //리사이즈 방지
        frm.setResizable(false);

        //화면 표시
        frm.setVisible(true);

    }
}
