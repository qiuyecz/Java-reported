import java.util.Scanner;//导包

public class TestTriplet{
    public static void main(String[] args){
        Triplet trip = new Triplet();
        trip.init();
        trip.print();
        trip.getMax();
        trip.getMin();
        trip.get();
        trip.change();
        trip.print();
    }
}

class Triplet{
    float e1,e2,e3;

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三元组数据：");
        e1 = sc.nextFlsoat();
        e2 = sc.nextFloat();
        e3 = sc.nextFloat();
        System.out.println("数据录入完毕！！！");
    }
    
    public void get(){
        System.out.println("选择要获取的一个分量：");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); 
        switch(a){
            case 1:System.out.println("e1:"+e1);break;
            case 2:System.out.println("e2:"+e2);break;
            case 3:System.out.println("e3:"+e3);break;
            default:System.out.println("未获取");
        }
    }

    public void getMax(){
        float max = e1;
        if(e2>max)
          max = e2;
        if(e3>max)
          max = e3;
        System.out.println("三元组最大分量为："+max);
    }

    public void getMin(){
        float min = e1;
        if(e2<min)
          min = e2;
        if(e3<min)
          min = e3;
        System.out.println("三元组最小分量为："+min);
    }

    public void change(){
        System.out.println("请输入要更改的数字：");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("请输入更改后的数字");
        float num = sc.nextFloat();
        if(index==1){
            e1=num;
            return;          
        }if(index==2){
            e2=num;
            return; 
        }if(index==3){
            e3=num;
            return;
        }
    }

    public void print(){
        System.out.println("三元组为：["+e1+","+e2+","+e3+"]");
    }
}
