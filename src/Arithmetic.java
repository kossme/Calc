public class Arithmetic implements ErrorMessage {
    private int a;
    private int b;
    private String operation;

    public Arithmetic(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double result() {
        double result = 0;
        if (getOperation().equals("+") || getOperation().equals("-") || getOperation().equals("*") || getOperation().equals("/")) {
            switch (getOperation()) {
                case ("+") -> result = getA() + getB();
                case ("-") -> result = getA() - getB();
                case ("*") -> result = getA() * getB();
                case ("/") -> result = (double) getA() / (double) getB();
            }
        } else {
            printErMessage();
            System.exit(0);
        }
        return result;
    }

    @Override
    public void printErMessage() {
        System.out.println(erMessage);
    }
}
