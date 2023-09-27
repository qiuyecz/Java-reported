import java.util.Scanner;//注意导包

enum Sex{//定义枚举类型
     男,女
}

public class test{
    public static void main(String[] args){

/*        float[] score = {99,66,77,100,88};//声明一个数组，并静态赋值
        for(int i = 0; i < score.length  ; i+=2){
            System.out.println(score[i]);
        }
      
        //增强for循环,顺序读取元素值
              for(float s : score){
            System.out.println("增强循环输出"+s);
        }
*/    

          Student stu = new Student();
          stu.init();
          stu.print();
          stu.average();
     }
}
class Student{
      String name;
      Sex sex;
      String[] course = {"高数","C语言","数据结构","数据库"};
      float[] score;
      public void init(){
          score = new float[course.length];
          Scanner sc = new Scanner(System.in);//注意导包
                 System.out.println("请输入学生姓名");
                 name = sc.next();
          System.out.println("请输入性别(0男，1女)");
          int flag = sc.nextInt();
          if(flag==0){
              sex = Sex.男; 
          }else{
              sex = Sex.女;
          }
          System.out.println("请输入各科成绩！");
          for(int i = 0 ; i < score.length ; i++){
              System.out.print(course[i] + ":");
              score[i] = sc.nextFloat();
          }
      }
      public void print(){
          System.out.println("我的名字叫："+ name + ",性别" + sex +",上学期各科成绩如下:");
          for(int i = 0; i < score.length  ; i++){
            System.out.println(course[i] + "成绩是：" + score[i]);
        }
      }
      public void average(){
          float ave;
          ave = (score[0]+score[1]+score[2]+score[3])/4;
          System.out.println("平均成绩为："+ave);
      }
}