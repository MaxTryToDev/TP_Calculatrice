public class Main {
    public static void main(String[] args) {

        // Calculatrice
        Calculatrice calc = new Calculatrice();
        System.out.println("Addition : " + calc.addition(10, 5));
        System.out.println("Soustraction : " + calc.soustraction(10, 5));
        System.out.println("Multiplication : " + calc.multiplication(10, 5));
        System.out.println("Division : " + calc.division(10, 5));
    }
}