package app;

public class MacroCalc {
    float weight;
    float calories;
    float height;
    float age;
    String sex;
    private double fatIntake;
    private double carbIntake;
    private double proteinIntake;
    private double caloricIntake;

    public MacroCalc() {
        weight = 0;
        height = 0;
        age = 0;
        sex = "";
        calories = 0;
        caloricIntake = 0;
        proteinIntake = 0;
        caloricIntake = 0;
    }
     
    public double caloriesIn(float weight, float height, float age, String sex) {
        MacroCalc body = new MacroCalc();
        if (sex.equals("m")) {
            body.caloricIntake = 10 * weight + 6.25 * height - 5 * age + 5;
        } else if (sex.equals("f")) {
            body.caloricIntake = 10 * weight + 6.25 * height - 5 * age - 161;
        } else {
            System.out.print("Error: please choose m or f");
        }
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
        return body.carbIntake;
    }

    public double fatIn( double caloricIntake) {
         MacroCalc body = new MacroCalc();
        body.fatIntake = (caloricIntake * 0.3) / 9;
        return body.fatIntake;
    }
}
