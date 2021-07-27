package component;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBoxTest extends JFrame {

    public ComboBoxTest() {
        super("콤보박스 테스트");

        String[] item = { "sip", "Batta", "what", "wow" };  //지금 이미지 폴더의 파일이름과 연동되어있음.

        JComboBox itemList = new JComboBox(item);


        //기본값 정의
        itemList.setSelectedIndex(2);

        JLabel label = new JLabel();

        itemList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                //System.out.println(box.getSelectedItem());

                String filename = (String) box.getSelectedItem();

                Image myImg = new ImageIcon("images/"+filename+".gif").getImage().
                        getScaledInstance(150,150,DO_NOTHING_ON_CLOSE);
                label.setIcon(new ImageIcon(myImg));
            }
        });

        setLayout(new BorderLayout());
        add(itemList, "North");
        add(label,"Center");

        setSize(300, 200);
        setLocation(300, 300);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxTest();

    }

}
