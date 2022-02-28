package Randomplay01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartPage {
        public static void main(String[] args) {

                // ������ ����
                JFrame frame = new JFrame();
                frame.setTitle("������");
                frame.setSize(408, 800);

                // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // ���̾ƿ� ����
                frame.getContentPane().setLayout(null);
                frame.getContentPane().setBackground(Color.white);

                ImageIcon showRestaurantBtn = new ImageIcon("./src/Randomplay01/rbtn.png");
                ImageIcon recommendRestaurantBtn = new ImageIcon("./src/Randomplay01/cbtn.png");

                // ��ư���� 3��
                JButton showRestaurantBtn1 = new JButton(showRestaurantBtn);
                JButton recommendRestaurantBtn2 = new JButton(recommendRestaurantBtn);
                JButton showNewRestaurantBtn = new JButton("�ظ����� �����");

                showRestaurantBtn1.setBounds(0, 550, 200, 170);
                recommendRestaurantBtn2.setBounds(194, 550, 200, 170);
                showNewRestaurantBtn.setBounds(0, 720, 400, 45);
                showRestaurantBtn1.setBackground(new Color(255, 204, 204));
                showRestaurantBtn1.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 35));
                recommendRestaurantBtn2.setBackground(new Color(255, 204, 204));
                recommendRestaurantBtn2.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 35));
                showNewRestaurantBtn.setBackground(new Color(255, 102, 102));
                showNewRestaurantBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));

                JLabel lbl = new JLabel(); // �󺧴ޱ�
                lbl.setBounds(50, 20, 300, 30);
                lbl.setText("�������̿��� ������ ������ �ð��ּ��䢽");
                lbl.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
                lbl.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 22));
                frame.getContentPane().add(lbl);
                // --------------------������ ����

                frame.getContentPane().add(showRestaurantBtn1);
                showRestaurantBtn1.addActionListener((ActionListener) new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                new RecommendPage();
                        }
                });
                frame.getContentPane().add(recommendRestaurantBtn2);
                recommendRestaurantBtn2.addActionListener((ActionListener) new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                new CategoryPage();
                        }
                });
                frame.getContentPane().add(showNewRestaurantBtn);
                showNewRestaurantBtn.addActionListener((ActionListener) new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                        }
                });

                // �̹��� �߰�
                JLabel imgLabel = new JLabel();
                ImageIcon bgImg = new ImageIcon("./src/Randomplay01/ImageIcon.png");

                // �̹��� ����
                imgLabel.setIcon(bgImg);
                imgLabel.setBounds(0,0,400,800);
                imgLabel.setHorizontalAlignment(JLabel.CENTER);
                frame.getContentPane().add(imgLabel);

                frame.setVisible(true); // ��ư�� �������� ���̱�
        }
}
