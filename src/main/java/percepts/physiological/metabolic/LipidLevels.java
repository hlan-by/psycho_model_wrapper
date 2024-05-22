package percepts.physiological.metabolic;

public class LipidLevels {
    // Parameters for lipid levels
    private double hdlCholesterol; // High-Density Lipoprotein
    private double ldlCholesterol; // Low-Density Lipoprotein
    private double triglycerides;

    // Constructor
    public LipidLevels(double hdlCholesterol, double ldlCholesterol, double triglycerides) {
        this.hdlCholesterol = hdlCholesterol;
        this.ldlCholesterol = ldlCholesterol;
        this.triglycerides = triglycerides;
    }

    // Getters
    public double getHdlCholesterol() {
        return hdlCholesterol;
    }

    public double getLdlCholesterol() {
        return ldlCholesterol;
    }

    public double getTriglycerides() {
        return triglycerides;
    }

    // Setters
    public void setHdlCholesterol(double hdlCholesterol) {
        this.hdlCholesterol = hdlCholesterol;
    }

    public void setLdlCholesterol(double ldlCholesterol) {
        this.ldlCholesterol = ldlCholesterol;
    }

    public void setTriglycerides(double triglycerides) {
        this.triglycerides = triglycerides;
    }

}

