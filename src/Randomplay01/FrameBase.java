package Randomplay01;

import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FrameBase extends JFrame {

	private static FrameBase instance;

	private FrameBase(JPanel e) {
		// �⺻ JFrame ����
		setTitle("������");
		setLayout(new BorderLayout());
		setSize(408, 800);

		JScrollPane pane = new JScrollPane();
		JPanel panel = new JPanel();

		pane.setSize(400, 800);

		pane.setViewportView(panel.add(e));

		add(pane, BorderLayout.CENTER);

		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x��ư
		setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));

	}// ������

	// �̱��� ����� ����Ϸ��� �Ѵ�
	public static void getInstance(JPanel e) {
		// static���� ���������Ƿ� �ش� �޼��尡 �����ں��ٵ� ���� ȣ��ȴ�
		instance = new FrameBase(e);// �����ڸ� ���� �⺻ ������ ����
		instance.getContentPane().removeAll();

		JScrollPane pane = new JScrollPane();
		JPanel panel = new JPanel();

		pane.setSize(400, 800);
		pane.setViewportView(panel.add(e));

		instance.getContentPane().add(pane, BorderLayout.CENTER);

		instance.revalidate(); // ���̾ƿ� �����ڿ��� ���̾ƿ������� �ٽ� ����ϵ��� ����
		instance.repaint(); // ���̾ƿ��� ���� �׸���
	}// getInstance()
}
