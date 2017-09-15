void setup() {
  size(500,500);
  fill(255,0,0);
  stroke(255,0,0);
}

int x = 30;
int y = 30;
void draw() {
  background(255,255,255);
  ellipse(x,y,60,60);
  if ( x < 470 && y == 30) {
    x += 2;
  } else if (x == 470 && y < 470){
    y += 2;
  } else if ( y == 470 && x > 30) {
    x -= 2;
  } else if ( x == 30 && y > 30 ) {
    y -= 2;
  }
}