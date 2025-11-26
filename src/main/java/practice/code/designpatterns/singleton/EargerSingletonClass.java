package practice.code.designpatterns.singleton;

public class EargerSingletonClass {

    private EargerSingletonClass(){}

    private static EargerSingletonClass INSTANCE = new EargerSingletonClass();

    public static EargerSingletonClass getInstance(){
            return INSTANCE;
    }
}
