package sample.controller;

import sample.view.SampleFrame;

public class SampleController {

	private SampleFrame appFrame;
	public void start(){
		appFrame = new SampleFrame(this);
	}
}
