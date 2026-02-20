//inheritance


class Father{

int age=50;

void job()
{
System.out.println("tech trainer");
}

void property()
{
System.out.println(" a house in native");
}

void hobby()
{
System.out.println("travel blogging football table tennis");
}
}


class Son extends Father{

int age=17;

public static void main(String args[])
{

Father f=new Father();
f.job();
f.property();
f.hobby();

Son s=new Son();
s.job();
s.property();
s.hobby();


}
}