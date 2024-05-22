package percepts.physiological.renal;

public class GlomerularFiltrationRate {
    // Parameter for GFR (mL/min)
    private double gfr;

    // Constructor
    public GlomerularFiltrationRate(double gfr) {
        this.gfr = gfr;
    }

    // Getter for GFR
    public double getGfr() {
        return gfr;
    }

    // Setter for GFR
    public void setGfr(double gfr) {
        this.gfr = gfr;
    }
}
