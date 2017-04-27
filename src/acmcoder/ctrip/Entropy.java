package acmcoder.ctrip;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Chen on 11/04/2017.
 */
public class Entropy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (str==null||str.equals("")) {
            System.out.println(0);
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0; i<str.length(); i++) {
            Character key = str.charAt(i);
            if (!map.containsKey(key)) {
                map.put(str.charAt(i), 0);
            }
            map.put(key, map.get(key)+1);  //count++
        }
        double entr = 0.0;
        for (Character key:map.keySet()) {
            double pr = map.get(key)*1.0 / str.length();
            double log = Math.log(pr)/Math.log(2.0);
            double part = -pr*log;
            entr += part;
        }
        BigDecimal res = new BigDecimal(entr).setScale(7, RoundingMode.HALF_EVEN);
        System.out.println(res);
    }
}
