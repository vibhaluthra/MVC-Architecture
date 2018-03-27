package sample.view;

import javax.swing.JFrame;

import sample.controller.SampleController;

public class SampleFrame extends JFrame {

	/*
	 * Reference to the Sample Panel
	 */
	private SamplePanel basePanel;
	/*
	 * Sets the base frame and passes the AppController object to the SamplePanel 
	 */
	public SampleFrame(SampleController baseController){
		basePanel = new SamplePanel(baseController);
		setupFrame();
	}
	
	/*
	 * Sets the content Pane, size and visibility
	 */
	private void setupFrame(){
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
