package app;

public class MacroCalc {
    float weight;
    private double proteinIntake;

    public MacroCalc() {
        weight = 0;
        proteinIntake = 0;
    }
     
    public double proteinIn(float weight) {
        MacroCalc body = new MacroCalc();
        body.proteinIntake = weight * 1.2;
        return body.proteinIntake;
    }
}
