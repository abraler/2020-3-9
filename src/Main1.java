// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a=in.nextLine();
            String[]str=a.split(" ");
            int length=str.length;
            int j=0;
            String[] str1=new String[length];
            for(int i=length-1;i>=0;i--){
                str1[j]=str[i];
                j++;
            }
            for(int i=0;i<length-1;i++){
                System.out.print(str1[i]);
                System.out.print(" ");
            }
            System.out.println(str1[str1.length-1]);
        }
    }
}