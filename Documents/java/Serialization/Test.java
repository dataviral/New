class Test {

public static void main(String[] args) {

Methods m = new Methods();
String Name = m.serialize(m.getEmployeeDetails(3));
m.deSerialize(Name);

}
}



