package method;

import java.util.ArrayList;

/**
 * Created by rbannikov on 05.03.2018.
 */
public class Main {

    public static ArrayList<Integer> getIndexSubstring(String str, String subStr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lenghtSubStr = subStr.length();
        String temp = null;

        for (int i = 0; i < str.length(); i++) {

            if(i + lenghtSubStr > str.length()) {
                return list;
            } else {

                temp = str.substring(i, i + lenghtSubStr);

                if(subStr.equals(temp)) {
                    list.add(i);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String str = "aababcababab";
        String subStr = "abab";

        System.out.println("String = " + str);
        System.out.println("Substring = " + subStr + "\n");

        ArrayList<Integer> result = getIndexSubstring(str, subStr);

        for (Integer index: result) {
            System.out.println("Start substring = " + index);
        }
    }
}