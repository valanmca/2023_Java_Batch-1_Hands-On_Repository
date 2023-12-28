package Calculator;

public class TitleMaker {
public String makeTitle(String Input)
{
	if (Input == null || Input.length() == 0) return Input;  
	return Input.substring(0, 1).toUpperCase() + Input.substring(1).toLowerCase(); 
	 /*String firstLetter = data.substring(0,1).toUpperCase();
     String restLetters = data.substring(1).toLowerCase();
     return firstLetter + restLetters;*/
}
}
