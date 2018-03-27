package sample.view;

import javax.swing.JPanel;

import sample.controller.SampleController;

public class SamplePanel extends JPanel {

	SampleController baseController;
	public SamplePanel(SampleController baseController) {
		this.baseController = baseController;
	}


}
