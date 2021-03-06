package it.polimi.ingsw.ps19.view.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * The panel containing the image of the personal board of the player, it has the layout manager
 * set to null so that components (Development Cards) can be scaled and positioned in the
 * correct position based on the screen dimension
 *
 * @author Mirko
 */
public class PersonalBoardPanel extends JPanel {

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The img. */
	private Image img;
	
	/** The dimension. */
	private Dimension dimension;
	
	/** The toolkit. */
	private transient Toolkit toolkit = Toolkit.getDefaultToolkit();

	/**
	 * Instantiates a new personal board panel.
	 */
	public PersonalBoardPanel() {
		super(null);
		
dimension = toolkit.getScreenSize();
		
		try {
			img = ImageIO.read(this.getClass().getResource(
					"/completepersonalboardmirkosmall.jpg"));
		} catch (IOException e) {
		}
		int imgHeight=img.getHeight(null);
		int imgWidth=img.getWidth(null);
//		float ratio=imgWidth/imgHeight;
//		System.out.println(imgHeight+" e "+ imgWidth);
		img = img.getScaledInstance(dimension.width, dimension.width*imgHeight/imgWidth,
				Image.SCALE_SMOOTH);
//		dimension.setSize(1000, 600);
		setPreferredSize(new Dimension(dimension.width,dimension.width*imgHeight/imgWidth));
		
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(img, 0, 0, this);
	}

}
