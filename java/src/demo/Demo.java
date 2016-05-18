package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String args[]) throws IOException{
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		int num =0;
		for(int i =0;i<100;i++){
			int week = c.get(Calendar.DAY_OF_WEEK);
			int month=c.get(Calendar.DAY_OF_MONTH);
			int day=c.get(Calendar.MONTH);
			if(!(week ==1||week==7)){
				i--;
			}else if((month==9||month==4)&&(day==1)){
				i--;	
			}
			c.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		 
	}
}
