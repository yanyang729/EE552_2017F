import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Object sun = new Object("sun", 1.989 * Math.pow(10, 30), 864575.9, 0);
        Object venus = new Object("venus", 4.867 * Math.pow(10, 24), 7520.8, sun, 67.24 * Math.pow(10, 6));
        Object earth = new Object("earth", 5.972 * Math.pow(10, 24), 7917.5, sun, 92.96 * Math.pow(10, 6));
        Object moon = new Object("moon", 7.34767309 * Math.pow(10,22), 2159, earth, 238900);
    }
}


class Object {
    private String nameOfBody;
    private double mass;            // in kg
    private double diameter;        // in mile
    private Object object = this;   // what it orbits
    private double meanDist;        // in mile

    // if not sun
    public Object(String nob, double m, double d, Object o, double md) {
        this.nameOfBody = nob;
        this.mass = m;
        this.diameter = d;
        this.object = o;
        this.meanDist = md;
    }

    // if is sun, assume it obits itself
    public Object(String nob, double m, double d, double md) {
        this.nameOfBody = nob;
        this.mass = m;
        this.diameter = d;
        this.meanDist = md;
    }
}