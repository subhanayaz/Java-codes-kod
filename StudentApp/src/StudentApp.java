class StudentApp {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.eat();
		s2.sleep();
		s3.study();
		
		s1.name = "Raju";
		s1.age = 21;
		s1.gender = "Male";
		s1.usn = 123;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		System.out.println(s1.usn);
		
		s2.name = "Rajesh";
		s2.age = 21;
		s2.gender = "Male";
		s2.usn = 231;
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.gender);
		System.out.println(s2.usn);
		
		s3.name = "Rani";
		s3.age = 19;
		s3.gender = "Female";
		s3.usn = 143;
		
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.gender);
		System.out.println(s3.usn);
		
	}
}
