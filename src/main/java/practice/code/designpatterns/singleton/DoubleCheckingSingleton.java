package practice.code.designpatterns.singleton;

public final class DoubleCheckingSingleton {

    private DoubleCheckingSingleton(){}

    private static DoubleCheckingSingleton INSTANCE = null;

    public static DoubleCheckingSingleton getInstnace(){

        if(INSTANCE == null){
            synchronized (DoubleCheckingSingleton.class){
                if(INSTANCE == null){
                    return new DoubleCheckingSingleton();
                }else{
                    return INSTANCE;
                }
            }
        }
        return null;
    }



}
