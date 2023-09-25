import java.util.Scanner;

public class runnian{
    public static void main(String[] args)
    {
         int year;
         System.out.println("请输入想要查阅是否为闰年的年份：");
         Scanner sc = new Scanner(System.in); 
         year = sc.nextInt();
         boolean flag1 = (year%4==0);
         boolean flag2 = (year%100==0);
         boolean flag3 = (year%400==0);
         if((flag1&&!flag2)||(flag3)){
             System.out.println(year + "是闰年！");
         }else{
             System.out.println(year + "不是闰年！");
         }
    }
} 