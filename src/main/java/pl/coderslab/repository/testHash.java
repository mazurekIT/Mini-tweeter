package pl.coderslab.repository;

import org.mindrot.jbcrypt.BCrypt;

public class testHash {


    public static void main(String[] args) {
//        String haslotestowe = BCrypt.hashpw("haslotestowe",BCrypt.gensalt());
        String haslotestowe = BCrypt.hashpw("1234",BCrypt.gensalt());
        System.out.println(haslotestowe);
    }
}
