package main;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;

/**
 * @author Tony Liang
 *
 */
public class UsingArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add(new Loan());
		arrayList.add(new Date());
		arrayList.add("Hello");
		arrayList.add(new JFrame());
		arrayList.add(new Circle());
		
		for (Object object: arrayList)
		{
			System.out.println(object.toString());
		}
	}
}