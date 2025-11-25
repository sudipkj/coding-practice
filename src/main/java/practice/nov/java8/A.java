package practice.nov.java8;

public interface A {

    public abstract String getText();

    public default String getCommonFunction(){
        return "default function A";
    }
}
