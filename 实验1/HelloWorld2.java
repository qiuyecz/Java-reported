public class HelloWorld2{
      public static void main (String[] args){
         Student s1 = new Student();
         s1.speak("HelloWorld");
    }
}
class Student{
    public void speak(String sentence){
         System.out.println(sentence);
    }
}
