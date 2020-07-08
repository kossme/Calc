public class RimOrArab implements ErrorMessage {
    private int a;
    private String type;

    public RimOrArab(int a, String type) {
        this.a = a;
        this.type = type;
    }
    public RimOrArab() {};

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RimOrArab idNumber(String symbolNumber) {
        int x = 0;
        switch (symbolNumber) {
            case ("1"):
                x = 1;
                setType("a");
                break;
            case ("I"):
                x = 1;
                setType("r");
                break;
            case ("2"):
                x = 2;
                setType("a");
                break;
            case ("II"):
                x = 2;
                setType("r");
                break;
            case ("3"):
                x = 3;
                setType("a");
                break;
            case ("III"):
                x = 3;
                setType("r");
                break;
            case ("4"):
                x = 4;
                setType("a");
                break;
            case ("IV"):
                x = 4;
                setType("r");
                break;
            case ("5"):
                x = 5;
                setType("a");
                break;
            case ("V"):
                x = 5;
                setType("r");
                break;
            case ("6"):
                x = 6;
                setType("a");
                break;
            case ("VI"):
                x = 6;
                setType("r");
                break;
            case ("7"):
                x = 7;
                setType("a");
                break;
            case ("VII"):
                x = 7;
                setType("r");
                break;
            case ("8"):
                x = 8;
                setType("a");
                break;
            case ("VIII"):
                x = 8;
                setType("r");
                break;
            case ("9"):
                x = 9;
                setType("a");
                break;
            case ("IX"):
                x = 9;
                setType("r");
                break;
            case ("10"):
                x = 10;
                setType("a");
                break;
            case ("X"):
                x = 10;
                setType("r");
                break;
            default:
                printErMessage();
                System.exit(0);
                break;
        }
        return new RimOrArab(x,getType());
    }

    public void showResult(String dataType, double result) {
        int resultInt = (int)Math.round(result);
        String resultString = " ";
        if (dataType.equals("a")) {
            resultString = String.valueOf(resultInt);
        } else if (dataType.equals("r")) {
            resultString = rimToArab(resultInt);
        }
        System.out.println(resultString);
    }

    public String rimToArab(int number) {
        String resultString = " ";
        String numberString = String.valueOf(number);
        if (number == 100) {
            resultString = "C";
        } else if ((number <= 99) && (number >= 10) ) {
            int x1 = Integer.parseInt(numberString.substring(0,1));
            int x2 = Integer.parseInt(numberString.substring(1,2));
            String x1s = rimToArabTentoHundert(x1);
            String x2s = rimToArabOnetoNine(x2);
            resultString = x1s + x2s;
        } else if ((number < 10) && (number > 0) ) {
            int x1 = Integer.parseInt(numberString.substring(0,1));
            resultString = rimToArabOnetoNine(x1);
        } else if (number==0) {
            resultString = "nulla";
        } else if ((number < 0) && (number > -10) ) {
            String o1 = numberString.substring(0,1);
            int x1 = Integer.parseInt(numberString.substring(1,2));
            resultString = o1 + rimToArabOnetoNine(x1);
        }
        return resultString;
    }

    public String rimToArabOnetoNine(int x1) {
        String x1s = "";
        switch (x1) {
            case 0 -> x1s = "";
            case 1 -> x1s = "I";
            case 2 -> x1s = "II";
            case 3 -> x1s = "III";
            case 4 -> x1s = "IV";
            case 5 -> x1s = "V";
            case 6 -> x1s = "VI";
            case 7 -> x1s = "VII";
            case 8 -> x1s = "VIII";
            case 9 -> x1s = "IX";
        }
        return x1s;
    }

    public String rimToArabTentoHundert(int x1) {
        String x1s = "";
        switch (x1) {
            case 1 -> x1s = "X";
            case 2 -> x1s = "XX";
            case 3 -> x1s = "XXX";
            case 4 -> x1s = "XL";
            case 5 -> x1s = "L";
            case 6 -> x1s = "LX";
            case 7 -> x1s = "LXX";
            case 8 -> x1s = "LXXX";
            case 9 -> x1s = "XC";
        }
        return x1s;
    }

    @Override
    public void printErMessage() {
        System.out.println(erMessage);
    }
}
