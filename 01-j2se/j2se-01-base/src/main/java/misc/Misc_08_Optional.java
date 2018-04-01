package misc;

import java.util.Optional;

public class Misc_08_Optional {
    String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Misc_08_Optional optional = null;
        String name = Optional.ofNullable(optional).map(result -> result.getName()).orElse("empty");
        System.out.println(name);
        optional = new Misc_08_Optional();
        name = Optional.ofNullable(optional).map(result -> result.getName()).orElse("null");
        System.out.println(name);
    }
}
