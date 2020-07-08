import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String data = in.nextLine();

        Symbols symbols = new Symbols(data);
        RimOrArab rimOrArab = new RimOrArab();
        String  result = " ";
        String dataType = " ";

        try {
            String[] dataSymbols = symbols.getData();
            symbols.setA1(dataSymbols[0]);
            symbols.setB1(dataSymbols[2]);
            symbols.setOperation(dataSymbols[1]);

            RimOrArab rimOrArabA1 = rimOrArab.idNumber(symbols.getA1());
            RimOrArab rimOrArabB1 = rimOrArab.idNumber(symbols.getB1());

            if (rimOrArabA1.getType().equals(rimOrArabB1.getType())) {
                dataType = rimOrArabA1.getType();
                Arithmetic arithmetic = new Arithmetic(rimOrArabA1.getA(), rimOrArabB1.getA(), symbols.getOperation());
                rimOrArab.showResult(dataType,arithmetic.result());
            } else {
                symbols.printErMessage();
                System.exit(0);
            }
        } catch (Exception e) {
            symbols.printErMessage();
            System.exit(0);
        }
    }
}
