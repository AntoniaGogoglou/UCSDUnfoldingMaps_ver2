package GUImodule;

import processing.core.PApplet;
import processing.core.PImage;

public class DrawSun extends PApplet{
	PImage img;
	public void setup(){
		size(400,400);
		background(255);
		stroke(0);
		img=loadImage("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTJ3ezyEz8vw-cBRPhIMX0JxVaUWbtzzSGCVZkFkbA20vjAZJH1","jpg");
		img.resize(0, height);
		image(img,0,0);
		
	}
	public void draw(){
		int[] color=sunColorSec(second());  //specify color of sun, second is a method in our system
		fill(color[0],color[1],color[2]);   // set sun color
		ellipse(width/4,height/5,width/4,height/5);  //draw sun color
	}
	public int[] sunColorSec(float seconds){
		int[] rgb=new int[3]; //that is the color
		// scale the brightness of the sun based on the seconds, the further from midday (i.e 30 seconds) the darker 
		// the sun
		float diffFrom30=Math.abs(30-seconds);
		float ratio=diffFrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		
		return rgb;
	}
	
}
