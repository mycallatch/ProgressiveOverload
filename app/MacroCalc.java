package app;

public class MacroCalc {
    float weight;
    float calories;
    float height;
    float age;
    private double carbIntake;
    private double proteinIntake;
    private double caloricIntake;

    public MacroCalc() {
        weight = 0;
        height = 0;
        age = 0;
        calories = 0;
        caloricIntake = 0;
        proteinIntake = 0;
        caloricIntake = 0;
    }
     
    public double caloriesIn(float calories) {
        MacroCalc body = new MacroCalc();
        body.caloricIntake =  88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        return body.caloricIntake;
    }

    public double proteinIn(float weight) {
        MacroCalc body = new MacroCalc();
        body.proteinIntake = weight * 1.2;
        return body.proteinIntake;
    }

    public double carbsIn(double caloricIntake) {
        MacroCalc body = new MacroCalc();
        body.carbIntake = (caloricIntake * 0.5) / 4;
        return carbIntake;
    }
}
