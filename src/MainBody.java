public class MainBody {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bodymass = 120.0;
        double height = 1.95;

        double bmi = service.calculate(120.0, 1.95);

        System.out.println(bmi);

    }
}
