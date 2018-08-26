package main;

/**
 * @author Tony Liang
 *
 */
public class StackOfIntegers
{
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	/**
	 * Creates a new default StackOfIntegers.
	 */
	public StackOfIntegers()
	{
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * Creates a new StackOfIntegers given the capacity.
	 * <ul>
	 * 	<li>
	 * 		If the capacity is not a nonzero positive integer, the capacity will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param capacity	capacity
	 */
	public StackOfIntegers(int capacity)
	{
		if (capacity > 0)
		{
			elements = new int[capacity];
		}
		else
		{
			elements = new int[0];
		}
	}
	
	public void push(int value)
	{
		if (size >= elements.length)
		{
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++] = value;
	}
	
	public int pop()
	{
		return elements[--size];
	}
	
	public int peek()
	{
		return elements[size - 1];
	}
	
	public boolean empty()
	{
		return size == 0;
	}
	
	public int getSize()
	{
		return size;
	}
}