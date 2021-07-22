package layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class D_CardLayout extends JFrame {

    public D_CardLayout() {

        // CardLayout :
        //    하나의 컨테이너 안에서
        //    여러 개의 컴포넌트들을 겹쳐 놓고
        //    각각의 컴포넌트에 순서를 매겨
        //    앞장, 뒷장의 배치 형태로
        //    특정 이벤트가 발생했을 때
        //    컴포넌트를 변경하는 방법

        super("카드 레이아웃 테스트");

        setBounds(300, 300, 500, 800);

        CardLayout cards = new CardLayout();

        setLayout(cards);

        // JPanel : 컴포넌트(요소)이면서
        //          각각이 컨테이너 역할을 하는
        //          배치 전용 컴포넌트

        JPanel[] cardPan = new JPanel[3];


        Set set = new TreeSet();
        for (int i = 0; true; i++) {
            set.add((int) (Math.random() * 3) + 1);
            if (set.size() == 3) {
                System.out.println(set);
                break;
            }
        }

        Iterator iter = set.iterator(); // 목록 형태로 처리됨

        for(int i= 0; i<cardPan.length; i++){
            int obj = (int) iter.next();
            cardPan[i] = new JPanel();
            switch (obj){
                case 1:
                    // 각 컴포넌트에 배경색 입히기
                    cardPan[i].setBackground(Color.ORANGE);
                    break;
                case 2:
                    cardPan[i].setBackground(Color.PINK);
                    break;
                case 3:
                    cardPan[i].setBackground(Color.GREEN);
                    break;
                default:
            }
            // JLabel : 이름표(평범한 문자열을 표기하는 컴포넌트)
            cardPan[i].add(new JLabel((i+1)+"번째 카드"));
            add(cardPan[i]);

            int finalI = i;
            cardPan[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getButton() == 1) {
                        // 왼쪽 클릭했느냐!
                        cards.next(cardPan[finalI].getParent());
                    } else if (e.getButton() == 3) {
                        // 우클릭이냐!
                        cards.previous(cardPan[finalI].getParent());
                    }

                }
            });
        }

        // 각 패널에 이벤트 추가하기
        // EventListener와 EventAdapter
        // EventListener는 특정 이벤트에 대한
        // 모든 감지요소를 가진 인터페이스이다.
        // 이러한 이벤트리스너는 내용을 구현 시
        // 미완성된 메소드 전부를 구현해야 하는 불편함이 있다.
        // 따라서 이를 보다 쉽게, 여러 이벤트 중 하나 등을 선택하여
        // 사용하기 위해 이벤트어댑터를 주로 사용한다.

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}