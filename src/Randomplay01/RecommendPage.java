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

        // ������ ����
        JFrame frame = new JFrame();
        frame.setTitle("������");
        frame.setSize(408, 800);
        frame.getContentPane().setBackground(Color.white);

        // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ���̾ƿ� ����^
        frame.getContentPane().setLayout(null);

        JButton RestaurantListBtn = new JButton("�ڡٿ����� ��õ ���� ������?�١�");
        RestaurantListBtn.setBounds(0, 100, 400, 60);
        RestaurantListBtn.setBackground(new Color(255, 255, 204));
        RestaurantListBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));
        JButton showRestaurantListBtn = new JButton("�ڡٸ������� ����Ʈ Ȯ���ϱ�١�");
        showRestaurantListBtn.setBounds(0, 160, 400, 60);
        showRestaurantListBtn.setBackground(new Color(255, 255, 204));
        showRestaurantListBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));
        JButton closeBtn = new JButton("�ڷΰ���");
        closeBtn.setBounds(0, 0, 100, 40);
        closeBtn.setBackground(new Color(255, 255, 204));
        closeBtn.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));

        JLabel infoLabel = new JLabel(); // �󺧴޾ұ�?
        infoLabel.setBounds(50, 50, 300, 30);
        infoLabel.setText("�������̰� ���ɸ޴��� å�������䢽");
        infoLabel.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
        infoLabel.setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));
        frame.getContentPane().add(infoLabel);

        // --------------------������ ����

        frame.getContentPane().add(RestaurantListBtn);
        RestaurantListBtn.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameBase.getInstance(new Randomfood(new String[] { "�߽�", "�Ͻ�", "�ѽ�", "���" }));
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
        // �̹��� ����
        JLabel imgLabel = new JLabel();
        ImageIcon bgImg = new ImageIcon("./src/foodrandomplay/realfood.jpg");

        // �̹��� ����
        imgLabel.setIcon(bgImg);
        imgLabel.setBounds(0, 0, 400, 800);
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(imgLabel);
        frame.setVisible(true); // ��ư�� �������� ���̱�

    }
}