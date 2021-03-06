package pl.zzpj.lib;

import lombok.Data;

@Data
public class Person {
    private String name;

    public void welcome() {
        System.out.printf("Hello! %s is my name!", this.name);
    }
}
