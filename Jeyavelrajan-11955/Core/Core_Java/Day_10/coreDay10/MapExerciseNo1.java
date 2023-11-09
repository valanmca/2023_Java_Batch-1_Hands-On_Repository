
package com.jeyavel.coreDay10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Teacher {
    int id;
    String name;
    String subject;

    Teacher(int id, String name, String subject)

    {
        this.id = id;
        this.name = name;
        this.subject = subject;

    }

    void display() {
        System.out.println("TeacherId = " + id);
        System.out.println("Teacher Name = " + name);
        System.out.println("Subject Incharge = " + subject);

    }

}

public class MapExerciseNo1 {

    public static void main(String[] args) throws IOException {

        int id = 0;
        String name = " ";
        String subject = " ";
        String msg = "";

        Scanner sc = new Scanner(System.in);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, Teacher> map = new TreeMap<Integer, Teacher>();

        do {

            System.out.println(
                    "1.Add Teacher   2.Find Teacher   3.Update Teacher 4.Delete Teacher  5.view All Teachers  6.exit");

            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Enter Teacher Id = ");
                id = sc.nextInt();
                System.out.println("Enter Teacher Name = ");
                name = input.readLine();
                System.out.println("Enter Subject taken by teacher = ");
                subject = input.readLine();
                Teacher obj = new Teacher(id, name, subject);

                map.put(id, obj);
                System.out.println("teacher details added ");

                break;

            case 2:
                
                System.out.println("Enter teacher id ");
                id = sc.nextInt();
                Set<Integer> set = map.keySet();
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int key = it.next();
                    if (key == id) {
                        
                        Teacher dr = map.get(key);

                        System.out.println("key = " + key);
                        dr.display();

                        System.out.println("-----------");
                    }
                    else
                    {
                        System.out.println("Teacher Id not found");
                    }

                }

                break;

            case 3:
                System.out.println("Enter Teacher Id = ");
                id = sc.nextInt();


System.out.println("Enter Teacher Name = ");
                name = input.readLine();
                System.out.println("Enter Subject taken by teacher = ");
                subject = input.readLine();
                
                Teacher temp=new Teacher(id,name,subject);
                map.put(id, temp);
                
                System.out.println("Details updated");
                
                
                
                break;

            case 4:
                
                System.out.println("Enter teacher id ");
                id = sc.nextInt();
                Set<Integer> set2 = map.keySet();
                Iterator<Integer> it2 = set2.iterator();
                
                while (it2.hasNext()) {
                    int key = it2.next();
                    if (key == id) {
                        
                        map.remove(key);
                        System.out.println(" Details deleted");

                        
                    }
                    else
                    {
                        System.out.println("Teacher details deleted");
                    }

                }
                
                break;

            case 5:

//                for(Map.Entry<Integer,Teacher> entry:map.entrySet())
//                {
//                    int key=entry.getKey();
//                    Teacher obj1=entry.getValue();
//                    System.out.println("key = "+key);
//                    obj1.display();
//                    
//                    System.out.println("-----------");
//                }
                
                
                Set<Integer> set1 = map.keySet();
                Iterator<Integer> it1 = set1.iterator();
                while (it1.hasNext()) {
                    int key = it1.next();
                    Teacher dr = map.get(key);

                    System.out.println("key = " + key);
                    dr.display();

                    System.out.println("-----------");
                }

                break;

            case 6:
                
                System.exit(0);
                break;
            }
            System.out.println("do you want to continue [yes]||[No]");
            msg = input.readLine();
        } while (msg.equalsIgnoreCase("yes"));

    }

}
