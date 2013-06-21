package lib;

public class Library {
    public static String random() {
        return org.apache.commons.lang3.RandomStringUtils.random(20);
    }
}