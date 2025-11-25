package practice.nov.java8;

public interface B {
    public abstract String getText();

    public default String getCommonFunction(){
        return "default function B";
    }
}
