import processing.core.PApplet;
/**
 * A program that draws two houses and two flowers, with methods allowing the user to modify the drawing. 
 * 
 * @author: Noah Lin
 * 
 */



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
    drawHouse(300, 400, 123);

    //drawing a second house at a different location with different colors
    drawHouse(20, 200, 23);


    //inputting 5 values, first 2 are coordinate pair of the center of the flower, third is the distance between petals, fourth is overall petal size, final value is the amount of blue
    drawFlower(100, 100, 20, 30, 200);
    
    drawFlower(300, 100, 30, 40, 100);
    
    
  }

  /**
   * This method draws a composite house consisting of a roof, main house, and a door.
   * All object positions are created relative to the coordinate pair for the top left corner of the main house.
   * 
   * @param positionx The x coordinate of the reference position for the main portion of the house
   * @param positiony The y coordinate of the reference position for the main portion of the house
   * @param redvalue  The value that indicates how much red should be used for the color of the house
   */
  
  public void drawHouse(float positionx, float positiony, float redvalue) {

    //base of the house
     fill(redvalue, 0, 0);
     rect(positionx, positiony, 200, 200);
 
     //draws the roof

     float intTopCordXValue = floatTriangleTopXCord(positionx);
     fill(redvalue, 175, 55);
     triangle(positionx, positiony, intTopCordXValue, positiony - 100, positionx+200, positiony);
 
     //draws a door on "top" of the house
     fill(redvalue, 139, 34);
     rect(positionx+100, positiony+100, 50, 100);

  }


  /**
   * This method draws a flower with 5 petals, and a square on top of the center petal for decoration
   * 
   * 
   * @param floatFlowerX  X coordinate of the center petal
   * @param floatFlowerY  Y coordinate of the center petal
   * @param floatDistance Value for the distance between each exterior petal and the center petal
   * @param floatSize Size of each petal
   * @param bluevalue Value indicating how blue the flower should be 
   */
  public void drawFlower(float floatFlowerX, float floatFlowerY, float floatDistance, float floatSize, int bluevalue) {

    fill(0, 0, bluevalue);

    //the following lines draw the 4 petals
    ellipse(floatFlowerX - floatDistance, floatFlowerY - floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX+floatDistance, floatFlowerY-floatDistance, floatSize, floatSize);

    ellipse(floatFlowerX-floatDistance, floatFlowerY+floatDistance, floatSize, floatSize);
    
    //center of the flower
    ellipse(floatFlowerX, floatFlowerY, floatSize, floatSize);

    //adds a square in the center for decoration
    rect(floatFlowerX-10, floatFlowerY-10, floatDistance-floatDistance/10, floatDistance-floatDistance/10);


  }

  /**
   * This functino computes the x coordinate of the second coordinate pair for the roof triangle
   * 
   * @param floatXCord  The original reference x coordinate
   * @return  Returns the x coordinate of the second coordinate pair for the roof triangle by adding 100 to the reference value 
   */
  public float floatTriangleTopXCord(float floatXCord) {

    return floatXCord+100;
  }


}