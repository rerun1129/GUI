package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextTest2 extends JFrame {

    public TextTest2(){

        super("홍길동's 제곱수 계산기 ver 1.0");

        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("숫자 입력 : ");
        JTextField text1 = new JTextField(15);          //들어가는 글자수가 아니고 필드 길이임.

        JLabel label2 = new JLabel("결과 확인 : ");
        JTextField text2 = new JTextField(15);

        text2.setEditable(false); // 사용자가 수정 못하게 설정

        JButton button = new JButton("제곱 계산하기");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //계산하기 클릭시 작동할 코드 생성
                // 텍스트 필드의 숫자 값을 가져와서
                // 숫자라면 int로 변환하기

                String temp = text1.getText();
                //입력란에 문자열을 쓰면 에러 캐치
                try{
                    int num = Integer.parseInt(temp);
                    text2.setText(String.valueOf( num * num ));
                }catch (NumberFormatException n){
                    text2.setText("숫자가 아닙니다.");
                }catch (StackOverflowError n){
                    text2.setText("계산 범위에서 벗어났습니다.");
                }
            }
        });

        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(button);

        add(panel);

        setBounds(300,300,300,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TextTest2();
    }
}
