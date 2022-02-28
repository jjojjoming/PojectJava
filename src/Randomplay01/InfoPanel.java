package Randomplay01;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class InfoPanel extends JPanel {

	public InfoPanel() {
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setBackground(new Color(255, 192, 203));
		setFont(new Font("나눔손글씨 성실체", Font.BOLD, 20));

		int height = 0;

		List<RestaurantDto> allRestaurants = new RestaurantDB().makeList();

		ArrayList<RestaurantDto> selectedList = new ArrayList<RestaurantDto>();

		for (RestaurantDto restaurant : allRestaurants) {
			selectedList.add(restaurant);
			JButton restaurantChioce = new JButton();
			restaurantChioce.setBackground(new Color(255, 241, 202));
			restaurantChioce.setSize(360, 60);
			restaurantChioce.setFocusPainted(false);
			restaurantChioce.setLocation(
					((int) getSize().getWidth() / 2 - 180),
					(int) getLocation().getY() / 2 + height);
			restaurantChioce.setHorizontalAlignment(SwingConstants.LEFT);

			String text = "<html><body>";

			text += "<b>★매장이름★:" + restaurant.getPlaceName() + "</b><br>";
			text += "<b>☆Category☆:" + restaurant.getCategoryName() + "</b><br>";
			text += "<b>★주소★:" + restaurant.getRoadAddressName() + "</b><br>";
			text += "</body></html>";
			restaurantChioce.setText(text);

			add(restaurantChioce);
			height += 60;

			restaurantChioce.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
	}
}
