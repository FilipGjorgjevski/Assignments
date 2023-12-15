package ass1;

public class Student {
  String name;
  int indexNo;
  int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIndexNo() {
	return indexNo;
}
public void setIndexNo(int indexNo) {
	this.indexNo = indexNo;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student(String name, int indexNo, int age) {
	super();
	this.name = name;
	this.indexNo = indexNo;
	this.age = age;
}

}
