public class HelloWorld3{
      public static void main (String[] args){
         Student s1 = new Student();
         Student s2 = new Student();
         Person p1 = new Person();
         s1.speak("HelloWorld");
         s2.speak("大家好，我是张三");
         p1.name="李四";
         p1.speak("大家好！");

    }
}
class Student{
    public void speak(String sentence){
         System.out.println(sentence);
    }
}
class Person{
    public  String name;
    public void speak(String sentence){
         System.out.println(name+"说"+sentence);
    }
}
