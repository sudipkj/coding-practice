package practice.code.designpatterns.singleton;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public enum SingletonExample {
    INSTANCE;

    @Setter
    @Getter
    private int value;
    private final Map<String, String> configs;

    SingletonExample() {
        configs = new HashMap<>();
        configs.put("Log", "my logs");
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
