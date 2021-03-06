package pl.zzjp.app;

import pl.zzpj.lib.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Szymon");
        person.welcome();
        System.out.println();
    }
}
