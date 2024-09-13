package n_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Student> result = method();
		
		for(Student temp : result) {
			System.out.println(temp);		// 자동으로 toString 호출
		}
		
		System.out.println("\n--------------------[참고]--------------------\n");

		// 전체요소를 순서대로 검색할 때 : Enumeration -> Iterator		# for 보다 속도가 빠르다
		Iterator i = result.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	static ArrayList<Student> method() {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길자",23));
		list.add(new Student("홍길숙",33));
		list.add(new Student("홍길동",43));
		
		return list;
	}
}

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name+"님 학생은 "+age+"살입니다.";
	}
}