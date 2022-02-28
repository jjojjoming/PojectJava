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

                // 프레임 생성
                JFrame frame = new JFrame();
                frame.setTitle("맛집이");
                frame.setSize(408, 800);

                // 프레임을 닫았을 때 메모리에서 제거되도록 설정
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // 레이아웃 설정
                frame.getContentPane().setLayout(null);
                frame.getContentPane().setBackground(Color.white);

                ImageIcon showRestaurantBtn = new ImageIcon("./src/Randomplay01/rbtn.png");
                ImageIcon recommendRestaurantBtn = new ImageIcon("./src/Randomplay01/cbtn.png");

                // 버튼설정 3개
                JButton showRestaurantBtn1 = new JButton(showRestaurantBtn);
                JButton recommendRestaurantBtn2 = new JButton(recommendRestaurantBtn);
                JButton showNewRestaurantBtn = new JButton("※맛집이 종료※");

                showRestaurantBtn1.setBounds(0, 550, 200, 170);
                recommendRestaurantBtn2.setBounds(194, 550, 200, 170);
                showNewRestaurantBtn.setBounds(0, 720, 400, 45);
                showRestaurantBtn1.setBackground(new Color(255, 204, 204));
                showRestaurantBtn1.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 35));
                recommendRestaurantBtn2.setBackground(new Color(255, 204, 204));
                recommendRestaurantBtn2.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 35));
                showNewRestaurantBtn.setBackground(new Color(255, 102, 102));
                showNewRestaurantBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));

                JLabel lbl = new JLabel(); // 라벨달기
                lbl.setBounds(50, 20, 300, 30);
                lbl.setText("♡맛집이에게 오늘의 맛집을 맡겨주세요♡");
                lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
                lbl.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 22));
                frame.getContentPane().add(lbl);
                // --------------------프레임 설정

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

                // 이미지 추가
                JLabel imgLabel = new JLabel();
                ImageIcon bgImg = new ImageIcon("./src/Randomplay01/ImageIcon.png");

                // 이미지 설정
                imgLabel.setIcon(bgImg);
                imgLabel.setBounds(0,0,400,800);
                imgLabel.setHorizontalAlignment(JLabel.CENTER);
                frame.getContentPane().add(imgLabel);

                frame.setVisible(true); // 버튼이 눌렸을때 보이기
        }
}
