package Randomplay01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CategoryPage {

    public CategoryPage() {

        // 프레임 생성
        JFrame frame = new JFrame();
        frame.setTitle("맛집이");
        frame.setSize(408, 600);
        frame.getContentPane().setBackground(new Color(255, 192, 203));

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 설정
        frame.getContentPane().setLayout(null);

        JButton koreanBtn = new JButton("한식");
        JButton westernBtn = new JButton("양식");
        JButton chineseBtn = new JButton("중식");
        JButton japaneseBtn = new JButton("일식");

        koreanBtn.setBounds(0, 150, 200, 150);
        westernBtn.setBounds(200, 150, 200, 150);
        chineseBtn.setBounds(200, 300, 200, 150);
        japaneseBtn.setBounds(0, 300, 200, 150);
        koreanBtn.setBackground(new Color(255,255,204));
        koreanBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 40));
        westernBtn.setBackground(new Color(255,255,204));
        westernBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 40));
        chineseBtn.setBackground(new Color(255,255,204));
        chineseBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 40));
        japaneseBtn.setBackground(new Color(255,255,204));
        japaneseBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 40));

        JLabel infoLabel = new JLabel(); // 라벨달았기?

        infoLabel.setBounds(50, 50, 300, 30);
        infoLabel.setText("★☆먹고싶은 종류를 선택해주세요☆★");
        infoLabel.setHorizontalAlignment(JLabel.CENTER);
        infoLabel.setFont(new Font("나눔손글씨 성실체", Font.BOLD,20));
        // 수평 가운데 정렬

        frame.getContentPane().add(infoLabel);

        // --------------------프레임 설정

        frame.getContentPane().add(koreanBtn);
        koreanBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "한식" }));
            }
        });

        frame.getContentPane().add(westernBtn);
        westernBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "양식" }));
            }
        });

        frame.getContentPane().add(chineseBtn);
        chineseBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "중식" }));
            }
        });

        frame.getContentPane().add(japaneseBtn);
        japaneseBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "일식" }));
            }
        });

        JButton closeBtn = new JButton("뒤로가기");
        closeBtn.setBounds(0, 0, 100, 40);

        closeBtn.setBackground(new Color(204,204,255));
        closeBtn.setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));
        

        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        frame.getContentPane().add(closeBtn);
        frame.setVisible(true); // 버튼이 눌렸을때 보이기
    }
}
