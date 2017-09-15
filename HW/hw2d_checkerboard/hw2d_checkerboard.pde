void setup() {
  size(800,800);
  background(255,255,255);
  noStroke();
  fill(0,0,0);
  for ( int i = 0; i <= 8; i ++ ){
    for ( int j = 0; j <= 8; j ++ ) {
      if ( (i + j) % 2 == 0 ) {
        rect((i-1) * 100, (j-1) * 100, 100, 100);
      }
    }
  }
}

void draw() {
  if(mousePressed){
    int posX = mouseX / 100;
    int posY = mouseY / 100;

    fill(255,0,0);
    ellipse(posX * 100 + 50, posY * 100 + 50, 100, 100);
  }
  
  
}