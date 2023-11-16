package com.mahesh.core_java_day_16_V8;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
public class OptionalClass{

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		
		Optional<List<Integer>> ListOpt = Optional.of(lst);
		System.out.println(ListOpt.get());
		
		
		String[] str = new String[10];
		str[1] = "java";
		str[2] = " ";
		str[3] ="Program";
		Optional<String> opt = Optional.ofNullable(str[1]);
		if(opt.isPresent())
		{
			String s1= str[1].concat(str[2]+""+str[3]);
		//	s1 =str[3].concat(s1);
			System.out.println(s1);
			System.out.println(opt.get());
			System.out.println(opt.isEmpty());
			System.out.println(opt.hashCode());
		}
		else
		{
			System.out.println("String value is not present");
		}
		

	}

}
