public class Symbols implements ErrorMessage {
    private String a1;
    private String b1;
    private String operation;
    private String s;

    public Symbols(int a, int b, String a1, String b1, String operation, String s) {
        this.a1 = a1;
        this.b1 = b1;
        this.s = s;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Symbols(String s) {
        this.s = s;
    }

    public String[] getData() {
        String[] data = getS().split(" ", 3);
        return data;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    @Override
    public void printErMessage() {
        System.out.println(erMessage);
    }

}