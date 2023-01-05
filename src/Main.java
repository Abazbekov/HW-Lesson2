import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(generateRandomAge(),-30));
        System.out.println(ageAndTemperature(generateRandomAge(),45));
        System.out.println(ageAndTemperature(generateRandomAge(),34));
        System.out.println(ageAndTemperature(generateRandomAge(),48));
        System.out.println(ageAndTemperature(generateRandomAge(),-34));

    }

    public static String ageAndTemperature(int age, int temperature) {

        if (age > 19 && age < 46 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return ("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return ("Можно идти гулять");

        } else {
            return "Оставайтесь дома";

        }
    }
        public static int generateRandomAge(){
            Random random = new Random();
            int a = random.nextInt(100);
            return a;
        }
}