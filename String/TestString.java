class TestString{

public static void main(String[] args){

String s1="hello";//hello->s1
String s2="hello";//hello->s2 scp string constant pool
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
s1=s1+"hai";//hellohai->s1
s2=s2+"hi";//hellohi->s2
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
}
}