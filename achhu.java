package archana;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.util.regex.*;
import java.io.FileWriter;
import java.time.*;
public class achhu 
{

	public static void main(String[] args)
	{
		
		try
		{
			File myobj=new File("myfile.txt");
			if(myobj.createNewFile())
			{
				System.out.println("File created: "+myobj.getName());
			}
			else
			{
			Scanner sc = new Scanner(myobj);
            while (sc.hasNextLine()) 
            {
            	String name=sc.next();
                String data = sc.next();
                if(Pattern.matches("[7-9]{1}[0-9]{9}",data))
                		{
                	//System.out.print(data);
                	File myobj1=new File(name+".txt");
        			if(myobj1.createNewFile())
        			{
        				System.out.println("File created: "+myobj1.getName());
        			}
        			else
        			{
        				System.out.println("File already exist");
        				Calendar cal =Calendar.getInstance();
        				Date d=cal.getTime();
        				System.out.print(d);
        				FileWriter f= new FileWriter(name+".txt");
        				f.write(d.toString());
        				f.close();
        				
        			}
                		}
              //  System.out.println(data);
            }
            sc.close();
				//System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
	}

}
