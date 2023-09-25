import java.util.Scanner;

public class Narcissistic_number{
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in); 
        System.out.println("请输入一个三位数：");
        number = sc.nextInt();
        int a,b,c;
        a=number/100;
        b=number/10%10;
        c=number%10;
        if(a*a*a+b*b*b+c*c*c==number){
            System.out.println(number+"是水仙数！");
        }else{
            System.out.println(number+"不是水仙数！");
        }
    }
}