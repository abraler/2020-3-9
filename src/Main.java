import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            in.nextLine();
            String []str=new String[a];
            for (int i = 0; i <a ; i++) {
                str[i]=in.nextLine();
            }
            for(int i=1;i<a;i++){
                int j=i-1;
                String s=str[i];

                for(;j>=0&&Dig(str[j],s);j--){
                    str[j+1]=str[j];

                }
                str[j+1]=s;
            }
            for (int i = 0; i <a ; i++) {
                System.out.println(str[i]);
            }
        }
    }
    private static boolean Dig(String str, String s) {
        if(str.length()>s.length()){
            return true;
        }
        if(s.length()>str.length()){
            return false;
        }
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)==s.charAt(i)&&i<str.length()){
                i++;
            }
            if(str.charAt(i)>s.charAt(i)){
                return true;
            }
            if(str.charAt(i)<s.charAt(i)){
                return false;
            }
        }
        return false;
    }
}