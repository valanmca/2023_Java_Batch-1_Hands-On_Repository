package com.core.sealed;

public class Switch {

	public static void main(String[] args) {
  String day ="Monday";
  
  String result="";
  
  result=switch(day) {
  case"Saturday","Sunday"->"Weekend";
  case"Monday","Tuesday"->"Weekday";

default ->"invaild";
  
  
  };
  System.out.println(result);
  
	}
}

