public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(1.41235123, 2.3145432), b = new Complex(3, 4);
        System.out.println("I created two complex numbers: a=" + a + " and b=" + b + ".");
        System.out.println("The absolute values of these numbers are |a|=" + a.abs() + " and |b|=" + b.abs() + ".");
        System.out.println("The sum of these numbers is a+b=" + a.add(b) + ".");
        System.out.println("The difference between these numbers is a-b=" + a.minus(b) + ".");
        System.out.println("The product of these numbers is a*b=" + a.mult(b) + ".");
    }
}


class Complex {
    private double x, y;

    public Complex(double real_part, double imaginary_part) {
        x = real_part;
        y = imaginary_part;
    }

    public Complex(double real_part) {
        x = real_part;
        y = 0;
    }

    public double re() {
        return x;
    }

    public double absSquared() {
        return x * x + y * y;
    }

    public double abs() {
        return Math.sqrt(absSquared());
    }

    public Complex conj() {
        return new Complex(x, -y);
    }

    public Complex add(Complex z) {
        return new Complex(x + z.x, y + z.y);
    }

    public Complex minus(Complex z) {
        return new Complex(x - z.x, y - z.y);
    }

    public Complex mult(Complex z) {
        return new Complex(x * z.x + y * z.y, x * z.y + y * z.x);
    }

    public Complex inv() {
        double abs_squared = absSquared();
        return new Complex(x / abs_squared, -y / abs_squared);
    }

    public String toString() {
        if (y == 0) {
            return "" + x;
        }
        if (y > 0) {
            return "" + x + "+" + y + "*I";
        }
        return "" + x + "-" + (-y) + "*I";
    }
    
}