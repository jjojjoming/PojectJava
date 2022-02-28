package Randomplay01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Randomfood extends JPanel {

	public Randomfood(String[] categoryArray) {
		setLayout(null);
		setBackground(new Color(255, 192, 203));
		setFont(new Font("�����ձ۾� ����ü", Font.BOLD, 20));
		setSize(408, 800);

		List<RestaurantDto> allRestaurants = new RestaurantDB().makeList(); // DTO������

		ArrayList<RestaurantDto> selectedList = new ArrayList<RestaurantDto>(); // �迭

		for (RestaurantDto restaurant : allRestaurants) {
			for (String category : categoryArray) {
				if (restaurant.getCategoryName().equals(category)) {
					selectedList.add(restaurant);
				}
			}
		}

		int idx = new Random().nextInt(selectedList.size());

		JList<String> jList = selectedList.get(idx).getInfo();
		JScrollPane pane = new JScrollPane(jList);

		pane.setSize(400, 200);
		pane.setLocation(0, 0);

		add(pane, BorderLayout.NORTH);

		try {

			URL url = new URL(selectedList.get(idx).getImageAddress()); // URL����

			ImageIcon img = new ImageIcon(ImageIO.read(url)); // �̹��� �޾ƿ���

			// �̹��� ������
			double width = img.getIconWidth();
			double height = img.getIconHeight();

			while (width > 400 && height > 600) {
				width -= width * 0.01;
				height -= height * 0.01;
			}

			while (width < 400 || height < 600) {
				width += width * 0.01;
				height += height * 0.01;
			}

			JLabel imgLabel = new JLabel(img);

			img = new ImageIcon(img.getImage().getScaledInstance((int) width, (int) height, Image.SCALE_SMOOTH));

			// �����ŭ�� ũ�⸦ ���� bufferedImage�� ����
			BufferedImage bufferedImage = new BufferedImage(
					img.getIconWidth(),
					img.getIconHeight(),
					BufferedImage.TYPE_INT_RGB);

			// ������ �ȼ��� �� �� 8 ��Ʈ RGB �����п� �� �̹��� �̹��� ǰ������

			// g�� CurrentImage�� �׸���.
			Graphics A = bufferedImage.createGraphics();
			img.paintIcon(null, A, 0, 0);
			A.dispose();

			bufferedImage = bufferedImage.getSubimage((int) ((width - 400) / 2), (int) ((height - 600) / 2), 400, 600);

			bufferedImage.createGraphics().drawImage(img.getImage(), 0, 0, this);

			imgLabel = new JLabel(img);

			imgLabel.setSize(400, 600);
			imgLabel.setLocation(0, 200);
			add(imgLabel,
					BorderLayout.CENTER);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}