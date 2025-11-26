package practice.code.designpatterns.singleton;

public class LazyLoadingSingleton {

    private LazyLoadingSingleton(){}

    private static LazyLoadingSingleton INSTANCE = null;

    public static LazyLoadingSingleton getInstance(){
        if(INSTANCE == null){
            return new LazyLoadingSingleton();
        }else{
            return INSTANCE;
        }
    }
}
