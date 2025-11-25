package practice.nov.java8;

public class ImplementingClass implements A,B{
    @Override
    public String getText() {
        return "";
    }

    @Override
    public String getCommonFunction() {
        return A.super.getCommonFunction();
    }

    public static void main(String[] args) {
        ImplementingClass i = new ImplementingClass();
        i.getText();
        i.getCommonFunction();
    }
}
