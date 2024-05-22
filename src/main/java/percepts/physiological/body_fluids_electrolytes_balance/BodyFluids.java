package percepts.physiological.body_fluids_electrolytes_balance;

public class BodyFluids {
    // Parameters for body fluids
    private double urineOutput;
    private SweatComposition sweatComposition;

    // Constructor
    public BodyFluids(double urineOutput, SweatComposition sweatComposition) {
        this.urineOutput = urineOutput;
        this.sweatComposition = sweatComposition;
    }

    // Getter and setter methods for urine output
    public double getUrineOutput() {
        return urineOutput;
    }

    public void setUrineOutput(double urineOutput) {
        this.urineOutput = urineOutput;
    }

    // Getter and setter methods for sweat composition
    public SweatComposition getSweatComposition() {
        return sweatComposition;
    }

    public void setSweatComposition(SweatComposition sweatComposition) {
        this.sweatComposition = sweatComposition;
    }
}

