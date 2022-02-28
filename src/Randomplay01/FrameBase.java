package Randomplay01;

import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FrameBase extends JFrame {

	private static FrameBase instance;

	private FrameBase(JPanel e) {
		// 기본 JFrame 구조
		setTitle("맛집이");
		setLayout(new BorderLayout());
		setSize(408, 800);

		JScrollPane pane = new JScrollPane();
		JPanel panel = new JPanel();

		pane.setSize(400, 800);

		pane.setViewportView(panel.add(e));

		add(pane, BorderLayout.CENTER);

		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x버튼
		setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));

	}// 생성자

	// 싱글톤 기법을 사용하려고 한다
	public static void getInstance(JPanel e) {
		// static으로 선언했으므로 해당 메서드가 생성자보다도 먼저 호출된다
		instance = new FrameBase(e);// 생성자를 통해 기본 프레임 정의
		instance.getContentPane().removeAll();

		JScrollPane pane = new JScrollPane();
		JPanel panel = new JPanel();

		pane.setSize(400, 800);
		pane.setViewportView(panel.add(e));

		instance.getContentPane().add(pane, BorderLayout.CENTER);

		instance.revalidate(); // 레이아웃 관리자에게 레이아웃정보를 다시 계산하도록 지시
		instance.repaint(); // 레이아웃을 새로 그린다
	}// getInstance()
}
