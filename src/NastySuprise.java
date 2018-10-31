
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

public class NastySuprise implements ActionListener {
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	public static void main(String[] args) {
		new NastySuprise().createUI();
	
	}

	private void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		leftButton.setText("Trick");
		rightButton.setText("Treat");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		frame.setTitle("Nasty Suprise");
	}
	
	private void showPictureFromTheInternet(String imageUrl)  {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		}  catch (MalformedURLException e)  {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == leftButton) {
			showPictureFromTheInternet("https://vignette.wikia.nocookie.net/llamaswithhats/images/e/e6/Carl-1-.png/revision/latest/scale-to-width-down/180?cb=20110908165945");
		}
		else if (buttonPressed == rightButton) {
			showPictureFromTheInternet("https://vignette.wikia.nocookie.net/llama/images/2/2b/4-settingc.png/revision/latest/scale-to-width-down/388?cb=20150118222720");
		}
	}
}
	

