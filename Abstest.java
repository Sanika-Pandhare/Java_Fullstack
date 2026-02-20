/*

abstract class:
1.its an incomplete class

why so:

we cant create object- but we can use  it as a ref
we need another class extend and implement the abstract methods 
not nessarily it must have a abstract method
but if a class has an  an abstract method it must be decleard as abstract
the extending must override the abstract methods to follow access madefier
rules --equal access or more access
abstract class may have complete method also method with body
an abstract method cant have boday : only declartion

*/

 abstract class Abs{

void add(int a)
{

a++;
System.out.println(a);
}
abstract void add1(int a, int b);

}

class Abstest extends Abs{

 public  void add1(int a,int b)
{
System.out.println(a+b);
}


void sub(int a,int b)
{
System.out.println(a-b);


}

public static void main(String args[])
{

Abs a=new Abstest();
Abstest aa=new Abstest();
/*a is athin client : it can access he methods in 
 Abs and the same methods only in the extends class Testabs
*/

a.add(1);

a.add1(12,23);
aa.sub(12,3);
}

}