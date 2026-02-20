Inerface Inter1{
/*public abstract is assumed here so while overriding the class must use public access modifier and remove abstract*/

void add(int a);


}

class UseInter implements Inter1{

 public void add(int a)
{
a++;
System.out.println(a);

}

public static void main(String args[])
{

Inter1 i=new UseInter();
i.add(100);
}


}