//overloading

class TestOverload{

void add(int a)
{
a++;
System.out.println(a);
}

void add(int a,int b)
{
System.out.println(a+b);

}

public static void main(String args[])
{
TestOverload t=new TestOverload();

TestOverload t1=new TestOverload();
t.add(1);
t.add(1,2);
System.out.println(t);
System.out.println(t1);

}

public String toString()
{
return "This is an instance of overlading class";
}

}

/*
t-ndew object in heap memory
t will be stored in main method call stack
if we try bto print a ref variable -toString() method object will  be called 


*/
