package practice.code.designpatterns;

import java.util.HashMap;
import java.util.Map;

public enum SingletonExample {
    INSTANCE;

    private int value;
    private Map<String, String> configs;

    SingletonExample() {
        configs = new HashMap<>();
        configs.put("Log", "my logs");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getConfigs(String key) {
        return configs.get(key);
    }

    public void setConfigs(String key, String value) {
        configs.put(key, value);
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.INSTANCE;
        singleton.setConfigs("Test", "Value of test");

        System.out.println(singleton.getConfigs("Test"));


    }
}
