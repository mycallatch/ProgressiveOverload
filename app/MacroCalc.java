package app;

public class MacroCalc {
    double weight;
    private double proteinIntake;

    public MacroCalc() {
        weight = 0.0;
    }
     
    public double proteinIn(double weight) {
        MacroCalc body = new MacroCalc();
        proteinIntake = body.weight * 1.2;
        return proteinIntake;
    }
}
