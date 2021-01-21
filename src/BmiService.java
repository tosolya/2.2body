public class BmiService {
    public int calculate(double bodymass, double height){

        double bmi = bodymass / (height * height);

        return (int) bmi;

    }
}
