PShape earth;
PShape moon;

void setup() {
  size(1600,800, P3D);
  noStroke();
  earth = createShape(SPHERE, 400);
  moon = createShape(SPHERE, 100);
  PImage img = loadImage("earthmap1k.jpg");  
  PImage img_ = loadImage("moonmap1k.jpg");
  earth.setTexture(img);
  moon.setTexture(img_);
}

float ang = 0;
float ang_ = 0;
void draw() {
  background(0);
  translate(width/2, height/2, -2000);
  
  pushMatrix();
  rotateZ(23.5 * PI / 180);
  rotateY(ang);
  shape(earth,0,0);
  ang += 0.1;
  popMatrix();
  
  pushMatrix();
  rotateZ(23.5 * PI / 180);
  rotateY(ang_);
  shape(moon,-1600,0);
  ang_ += 0.1 / 28.5;
  popMatrix();
  

  
}