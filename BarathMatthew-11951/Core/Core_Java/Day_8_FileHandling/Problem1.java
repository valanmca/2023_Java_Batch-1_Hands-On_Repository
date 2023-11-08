package Day_8_FileHandling;
//List of all files and folders in a folder
import java.io.File;
public class Problem1 {

	public static void main(String[] args) {
		File coll = new File("D:\\MyGitRepo2");
		File ListColl[] = coll.listFiles();
		String a ="";
		String val ="";
		int temp =0;
		int count =0;
		for(File i:ListColl) {
//			System.out.println(i.getName());
			a =i.getName();
			for(int j=0;j<a.length();j++) {
				char q =a.charAt(j);
				if(q=='.') {
					temp = 1;
					while(temp!=0) {
						q=a.charAt(j+count);
						val+=String.valueOf(q);
						count++;
						System.out.println(val);
						if (count==4) {
							temp=0;
							if(val.equals(".txt")) {
								System.out.println(a);
								val="";
							}
							else {
								val="";
							}
						
						}
					}
				}
				else {
					continue;
				}	
			}
		}
//		System.out.println(a);
	}

}
