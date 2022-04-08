import processing.core.PApplet;

public class Sketch extends PApplet {
	

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //inputting 3 float values. First 2 define coordinate pair for the house's position, last value changes color
    drawHouse(400, 300, 123);

    //inputting 5 values, first 2 are coordinate pair of the center of the flower, third is the distance between petals, fourth is overall petal size, final value is the amount of blue
    drawFlower(100, 100, 20, 40, 200);
    


    
    
  }

  //function to draw house, returns nothing
  
  public void drawHouse(float positionx, float positiony, float redvalue) {

    //base of the house
     fill(redvalue, 0, 0);
     rect(positionx, positiony, 200, 200);
 
     //draws the roof
     fill(redvalue, 175, 55);
     triangle(positionx, positiony, positionx + 100, positiony - 100, positionx+200, positiony);
 
     //draws a door on "top" of the house
     fill(redvalue, 139, 34);
     rect(positionx+100, positiony+100, 50, 100);

  }


  //function  to draw flower, returns nothing 
  public void drawFlower(float floatFlowerX, float floatFlowerY, float floatDistance, float floatSize, int bluevalue) {

    fill(0, 0, bluevalue);

    ellipse(floatFlowerX - floatDistance, floatFlowerY - floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY-floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX-floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);
    
    ellipse(floatFlowerX, floatFlowerY, floatSize, floatSize);


  }

 // function returns an int  
  public int calculateSomething() {
    return 0;
  }


}