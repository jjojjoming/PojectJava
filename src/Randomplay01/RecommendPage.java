package Randomplay01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RecommendPage {

    protected static final String[] RestaurantDto = null;

    public RecommendPage() {

        // 프레임 생성
        JFrame frame = new JFrame();
        frame.setTitle("맛집이");
        frame.setSize(408, 800);
        frame.getContentPane().setBackground(Color.white);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 설정^
        frame.getContentPane().setLayout(null);

        JButton RestaurantListBtn = new JButton("★☆오늘의 추천 랜덤 맛집은?☆★");
        RestaurantListBtn.setBounds(0, 100, 400, 60);
        RestaurantListBtn.setBackground(new Color(255, 255, 204));
        RestaurantListBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));
        JButton showRestaurantListBtn = new JButton("★☆맛집이의 리스트 확인하기☆★");
        showRestaurantListBtn.setBounds(0, 160, 400, 60);
        showRestaurantListBtn.setBackground(new Color(255, 255, 204));
        showRestaurantListBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));
        JButton closeBtn = new JButton("뒤로가기");
        closeBtn.setBounds(0, 0, 100, 40);
        closeBtn.setBackground(new Color(255, 255, 204));
        closeBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));

        JLabel infoLabel = new JLabel(); // 라벨달았기?
        infoLabel.setBounds(50, 50, 300, 30);
        infoLabel.setText("♡맛집이가 점심메뉴를 책임질께요♡");
        infoLabel.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        infoLabel.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));
        frame.getContentPane().add(infoLabel);

        // --------------------프레임 설정

        frame.getContentPane().add(RestaurantListBtn);
        RestaurantListBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "중식", "일식", "한식", "양식" }));
            }
        });
        frame.getContentPane().add(showRestaurantListBtn);
        showRestaurantListBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new InfoPanel());
            }
        });
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });

        frame.getContentPane().add(closeBtn);
        // 이미지 설정
        JLabel imgLabel = new JLabel();
        ImageIcon bgImg = new ImageIcon("./src/foodrandomplay/realfood.jpg");

        // 이미지 설정
        imgLabel.setIcon(bgImg);
        imgLabel.setBounds(0, 0, 400, 800);
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(imgLabel);
        frame.setVisible(true); // 버튼이 눌렸을때 보이기

    }
}