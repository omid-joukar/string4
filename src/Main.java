import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;

/**
 * Created by KPS on 7/18/2020.
 */
public class Main {
    public static void main(String[] args) {

        String str = "w3rsource.com";
        System.out.println("Original String : " + str);

        // codepoint from index 1 to index 10
        int ctr = str.codePointCount(1, 10);

        // prints character from index 1 to index 10
        System.out.println("Codepoint count = " + ctr);
    }
    }


