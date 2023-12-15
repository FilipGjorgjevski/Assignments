package ass1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Demo {
	  public static Student createStudent (String name, int indexNo, int age)
	  {
		  return new Student (name, indexNo, age);
	  }
	  
	  public static void printValues (Student s)
	  {
		  System.out.println("Name: "+ s.name);
		  System.out.println("indexNo: "+ s.indexNo);
		  System.out.println("Age: "+ s.age);

	  }
	  public static void main (String[] args)
	  {
		  List<String> listofNames = Arrays.asList("test","test2","test3","test4","test5");
		  List<Student> all = new ArrayList<>();
		  List<Boolean> result = listofNames.stream().map(s -> all.add(createStudent(s, 1, 2))).collect(Collectors.toList());
          for(Student student : all)
          {
        	  printValues(student);
          }
	  }
}

