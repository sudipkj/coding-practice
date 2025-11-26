package practice.code.designpatterns.singleton;

class BillPughSingletonInstance {

    private BillPughSingletonInstance() {
    }

    static class Inner {
        private static BillPughSingletonInstance instance = new BillPughSingletonInstance();

        public static BillPughSingletonInstance getInstance() {
            return Inner.instance;
        }
    }
}

public class BillPughSingleton{
    public static void main(String[] args) {
        BillPughSingletonInstance in= BillPughSingletonInstance.Inner.getInstance();
    }
}
