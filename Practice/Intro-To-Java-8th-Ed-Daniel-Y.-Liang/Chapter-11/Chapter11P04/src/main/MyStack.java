package main;

import java.util.ArrayList;

/**
 * @author Tony Liang
 *
 */
public class MyStack extends ArrayList
{
	public Object peek()
	{
		return get(size() - 1);
	}
	
	public Object pop()
	{
		Object o = get(size() - 1);
		remove(size() - 1);
		return o;
	}
	
	public void push(Object o)
	{
		add(o);
	}
	
	public String toString()
	{
		return "stack: " + super.toString();
	}
}