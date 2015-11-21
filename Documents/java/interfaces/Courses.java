/*


4. Create a class called CourseMaterials which contains a method for every course offered at Felight

For example :

public void accessJavaBasicsMaterias(){
                                             System.out.println(“You have access to JavaBasics Materials”);
}

then create an Interface called 11KPackage which contains the declaration to access java basics and Core Java Materials. Implement this interface in  CourseMaterials  class. Create the object of type 11KPackage and instantiate it from CourseMaterials, then access the possible methods.

Do the same to give access to Java Basics, Core Java, Advanced Java and Android.


*/
interface Felight11kPackages {

void accessJavaBasics();
void accessCoreBasics();
void accessAdvancedJava();
void accessAndroid();

}

class CourseMaterials implements Felight11kPackages{

public void accessJavaBasics() {
System.out.println("You have access to JavaBasics Materials");
}

public void accessCoreBasics() {
System.out.println("You have access to CoreBasics Materials");
}

public void accessAdvancedJava() {
System.out.println("You have access to AdvancedJava Materials");
}

public void accessAndroid() {
System.out.println("You have access to Android Materials");
}
}

class Test {

public static void main(String[] args) {

Felight11kPackages pac = new CourseMaterials();

pac.accessAndroid();

}
}