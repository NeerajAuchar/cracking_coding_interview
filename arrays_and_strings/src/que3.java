import java.util.Arrays;

public class que3 {
    public static void main(String[] args) {
        String s =" Neeraj Auchar ";

        System.out.println(Integer.MAX_VALUE);
    }

    static void q3(String s){
       String news = s.replace(" ", "%20");
        System.out.println(news);
    }
    static void replaceSpaces(String str , int trueLength){
        char[] arr = str.toCharArray();
        int spaceCount =0 , index ;
        for (int i = 0 ; i <trueLength ;i++ ){
          if (arr[i] == ' '){
              spaceCount++;
          }
        }
        index = trueLength +spaceCount *2;
        if (trueLength < arr.length) arr[trueLength] ='\0';
        for ( int i = trueLength-1 ; i <= 0 ; i-- ){
            if (arr[i] == ' '){
                arr[index -1] = '0';
                arr[index -2] = '2';
                arr[index -3] = '%';
                index = index -3;
            }else {
                arr[index -1] = arr[i];
                index--;
            }
        }
        String newarr = arr.toString();
        System.out.println(newarr);
    }

}
