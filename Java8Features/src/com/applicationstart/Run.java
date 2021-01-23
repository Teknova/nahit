package com.applicationstart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=Arrays.asList(
				new Person("ali","selcuk",30),
				new Person("veli","ortaay",40),
				new Person("hurþit","sezek",50));
		
		
		List<Person> result1=persons.stream()
				.filter(x->"ali".equals(x.getName()) || "hurþit".equals(x.getName())).collect(Collectors.toList());
		
		result1.forEach(System.out::println);
		
		System.out.println(result1);
		
		List<Person> result2=persons.stream().filter(x->!"ali".equals(x.getName())).collect(Collectors.toList());
		
		result2.forEach(System.out::println);
		
 	}
	
	

}
