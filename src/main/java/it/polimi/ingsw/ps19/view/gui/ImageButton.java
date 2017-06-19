package it.polimi.ingsw.ps19.view.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImageButton extends JButton {

	private Image img;


	public ImageButton(String img) {
		this.img = new ImageIcon(img).getImage().getScaledInstance(300,500, 700);
		this.setBounds(1, 1, 300, 500);
		this.setVisible(true);
	}

	public ImageButton(Image img) {
		this.img = img;
		Dimension size = new Dimension(20, 20);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}