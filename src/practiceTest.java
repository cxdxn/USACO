import java.util.Arrays;

public class practiceTest {

		public static void main (String[] args) {
			
			Student[] list = new Student[4];
			
			list[0] = new Student("Bob", 2);
			list[1] = new Student("John", 3);
			list[2] = new Student("Roy", 1);
			list[3] = new Student("Lee", 4);
			
			
			Arrays.sort(list);
			
			for (Student n: list) {
				System.out.print(n.name + " ");
			}
			
		}
		
		static class Student implements Comparable<Student>{
			
			String name;
			int gpa;
			
			public Student(String n, int g) {
				name = n;
				gpa = g;
			}
			
			@Override
			public int compareTo(Student that) {
				return (int)(this.gpa - that.gpa);
			}
			
			
		}
}
