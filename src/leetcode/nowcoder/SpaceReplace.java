package leetcode.nowcoder;

/**
 * Created by Chen on 2017/4/2.
 */
public class SpaceReplace {
    public static String replaceSpace(StringBuffer str) {
        while (str.indexOf(" ")!=-1) {
            int loc = str.indexOf(" ");
            str.replace(loc, loc+1, "%20");
        }
//        str.replace(" ", "%20");
        return str.toString();
    }

    public static void main(String[] args) {
        String str = replaceSpace(new StringBuffer("Beijing is a good city."));
        System.out.println(str);
    }
}
