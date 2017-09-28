public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            Fraction f1 = new Fraction(i,2);
            Fraction f2 = new Fraction(i,3);
            System.out.println(f1.add(f2));  // f1+f2
            System.out.println(f1.sub(f2));  // f1-f2
            System.out.println(f1.mult(f2)); // f1*f2
            System.out.println(f1.neg());    // -f1
        }
        // Simplification Test
        // 1/2 + 1/2 should print 1/1, not 4/4.
        // from class
        System.out.println(new Fraction(1,2).add(new Fraction(1,2)));

        // should print 1/1
        System.out.println(new Fraction(1,2).mult(new Fraction(2,1)));

    }
}

class Fraction {
    int up;
    int down;

    int[] abbr(int up, int down) {
        int gcd = 1;
        for (int i = Math.min(up, down); i >= 1; i--) {
            if (up % i == 0 && down % i == 0) {
                gcd = i;
                break;
            }
        }
        int newUp = up / gcd;
        int newDown = down / gcd;
        int[] newFrac = {newUp, newDown};
        return newFrac;
    }

    Fraction(int up, int down) {
        int[] newFrac = abbr(up, down);
        this.up = newFrac[0];
        this.down = newFrac[1];
    }

    String add(Fraction f2) {
        int newUp = up * f2.down + f2.up * down;
        int newDown = down * f2.down;
        int[] newFrac = abbr(newUp, newDown);
        return String.format("%d/%d", newFrac[0], newFrac[1]);
    }

    String sub(Fraction f2) {
        int newUp = up * f2.down - f2.up * down;
        int newDown = down * f2.down;
        int[] newFrac = abbr(newUp, newDown);
        return String.format("%d/%d", newFrac[0], newFrac[1]);
    }

    String mult(Fraction f2) {
        int newUp = up * f2.up;
        int newDown = down * f2.down;
        int[] newFrac = abbr(newUp, newDown);
        return String.format("%d/%d", newFrac[0], newFrac[1]);
    }

    String neg() {
        return String.format("%d/%d", -up, down);
    }


}