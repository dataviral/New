/*

1. Create a class called Father with a data member home1 with some value and a behaviour Called goodBehaviour() then create a class called Son which extends Father. Create the object of Son and call home1 and goodBehaviour().

2. Override goodBehaviour() in Son class.

3. Call super.goodBehaviour() in the overridden method in Son class and add extra statements.

4. Override home1 data member and provide a different value. Then create a method called getFathersHome() which returns super.home1;

5. Implementing and interface is also an Inheritance or not ?  Ans: Yes.

*/

class Father {

String home1 ="Father's Home";

public void goodBehaviour() {
System.out.println("F.Good_Behaviour");
}
}

class Son extends Father {
}

class Test {
public static void main(String[] args){
 
Son x = new Son();

x.goodBehaviour();

}

}

