float sum (int n) {
  float sum = 0;
  for (float i = 1; i < n + 1; i++ ) {
    sum += 1 / (i * i);
  }
  return sum;
}

float sumBackward( int n ){
  float sum = 0;
  for (float i = n; i > 0; i-- ) {
    sum += 1 / (i * i);
  }
  return sum;
}

void setup() {
  // q1
  int range = 100000000;
  float precision = 0.0000001f;
  int smallestN = 0;
  for (float i = 1; i< range; i++){
    if (1 / i / i < precision) break;
    smallestN = (int)i;
  }
  println("Smallest term have to compute is:  1/" + (smallestN - 1) + "^2");
  println("=========================");
  
  // q2
  int[] nArr = {1, 10, 100, 1000, 10000};
  for ( int n : nArr) {
    println( sqrt(6 * sum(n)));
  }
  println("It converges to PI" );
  println("=========================");


  // q3
  println("Doing forward: " + sum(3161) + " Doing backward: " + sumBackward(3161));
  println("=========================");

  
  
  
  exit();
}