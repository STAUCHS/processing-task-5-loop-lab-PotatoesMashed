import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // Draw bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * Draws the bottom left section
   */
  public void draw_section1() {
    for (int intX = 3; intX < 300; intX+=10) {
      for (int intY = 303; intY < 600; intY+=10) {
        
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2() {
    for (int intX = 3; intX < 300; intX+=10) {
      for (int intY = 303; intY < 600; intY+=10) {
        if ((intX / 10) % 2 == 1){
          fill(0);
        } else {
          fill(255);
        }
        noStroke();
        rect(intX + 300, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3() {
    for (int intX = 3; intX < 300; intX+=10) {
      for (int intY = 303; intY < 600; intY+=10) {
        if ((intY / 10) % 2 == 1){
          fill(255);
        } else {
          fill(0);
        }
        noStroke();
        rect(intX + 600, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4() {
    for (int intX = 3; intX < 300; intX+=10) {
      for (int intY = 303; intY < 600; intY+=10) {
        if (((intX / 10) % 2 == 1) || ((intY / 10) % 2 == 0)){
          fill(0);
        } else {
          fill(255);
        }
        noStroke();
        rect(intX + 900, intY, 5, 5);
      }
    }
  }

  public void draw_section5() {
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < intRow; intColumn++) {
        
        fill(255);
        noStroke();
        rect(10 * intRow + 3, 293 - 10 * intColumn, 5, 5);
      }
    }
  }

  public void draw_section6() {
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn <= intRow; intColumn++) {
        fill(255);
        noStroke();
        rect(593 - 10 * intRow, 293 - 10 * intColumn, 5, 5);
      }
    }
  }

  public void draw_section7() {
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn <= intRow; intColumn++) {
        fill(255);
        noStroke();
        rect(893 - 10 * intRow, 3 + 10 * intColumn, 5, 5);
      }
    }
  }
  
  public void draw_section8() {
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn <= intRow; intColumn++) {
        fill(255);
        noStroke();
        rect(10 * intRow + 903, 3 + 10 * intColumn, 5, 5);
      }
    }
  }

}