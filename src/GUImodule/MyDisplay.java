package GUImodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {

	public void setup(){
		size(400,400);
		background(255, 204, 0);
	}
	public void draw(){
		fill(255,204,0);
		ellipse(200, 200, 390, 390);
		fill(0,0,0);
	}
}
