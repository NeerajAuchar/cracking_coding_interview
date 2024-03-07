import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class que6 {
    public static void main(String[] args) {
        char[] arr ={'a','a','b','b','c','c','c'};
        commpression(arr);

    }

    static void commpression(char[] charaa){
        String ss = charaa.toString();
        String s = ss.charAt(0)+"";
        int count = 1;

        for (int i = 1; i <ss.length() ; i++) {
            char prev = ss.charAt(i-1);
            char curr =  ss.charAt(i);
            if(prev == curr){
                count++;
            } else{
                if(count > 1){
                    s += count;
                    count = 1;
            }
                s += curr;

            }
        }
        if( count > 1){
            s += count;
        }
        System.out.println(ss.length());
    }

}
