package global.goit;

import global.goit.gto.User;

public class Launcher {

    public static void main(String[] args) {
        String gson = "{\"name\": \"Yan\", \"lastName\": \"Kurhuzov\"}";
        System.out.println(new User().parser(gson));
    }
}
