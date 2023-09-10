package app;

public class MacroCalc {
    float weight;
    float calories;
    float height;
    float age;
    private double fatIntake;
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
     
    public double caloriesIn(float weight, float height, float age) {
        MacroCalc body = new MacroCalc();
        body.caloricIntake = 10 * weight + 6.25 * height - 5 * age + 5;
        //body.caloricIntake =  88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
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

    public double fatIn( double caloricIntake) {
         MacroCalc body = new MacroCalc();
        body.fatIntake = (caloricIntake * 0.3) / 9;
        return fatIntake;
    }
}
