package com.javaDemo;

import com.javaDemo.test.Student;

public class Engineer extends Student {

	public void show()
	{
		marks=88; //protected members in the subclass of another package(from Student.java)
		//age=21; //visibility issues of access modifiers
	
	}

}
