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

        // ������ ����
        JFrame frame = new JFrame();
        frame.setTitle("������");
        frame.setSize(408, 600);
        frame.getContentPane().setBackground(new Color(255, 192, 203));

        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ���̾ƿ� ����
        frame.getContentPane().setLayout(null);

        JButton koreanBtn = new JButton("�ѽ�");
        JButton westernBtn = new JButton("���");
        JButton chineseBtn = new JButton("�߽�");
        JButton japaneseBtn = new JButton("�Ͻ�");

        koreanBtn.setBounds(0, 150, 200, 150);
        westernBtn.setBounds(200, 150, 200, 150);
        chineseBtn.setBounds(200, 300, 200, 150);
        japaneseBtn.setBounds(0, 300, 200, 150);
        koreanBtn.setBackground(new Color(255,255,204));
        koreanBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 40));
        westernBtn.setBackground(new Color(255,255,204));
        westernBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 40));
        chineseBtn.setBackground(new Color(255,255,204));
        chineseBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 40));
        japaneseBtn.setBackground(new Color(255,255,204));
        japaneseBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 40));

        JLabel infoLabel = new JLabel(); // �󺧴޾ұ�?

        infoLabel.setBounds(50, 50, 300, 30);
        infoLabel.setText("�ڡٸ԰���� ������ �������ּ���١�");
        infoLabel.setHorizontalAlignment(JLabel.CENTER);
        infoLabel.setFont(new Font("�����ձ۾� ����ü", Font.BOLD,20));
        // ���� ��� ����

        frame.getContentPane().add(infoLabel);

        // --------------------������ ����

        frame.getContentPane().add(koreanBtn);
        koreanBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "�ѽ�" }));
            }
        });

        frame.getContentPane().add(westernBtn);
        westernBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "���" }));
            }
        });

        frame.getContentPane().add(chineseBtn);
        chineseBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "�߽�" }));
            }
        });

        frame.getContentPane().add(japaneseBtn);
        japaneseBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "�Ͻ�" }));
            }
        });

        JButton closeBtn = new JButton("�ڷΰ���");
        closeBtn.setBounds(0, 0, 100, 40);

        closeBtn.setBackground(new Color(204,204,255));
        closeBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));
        

        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        frame.getContentPane().add(closeBtn);
        frame.setVisible(true); // ��ư�� �������� ���̱�
    }
}
