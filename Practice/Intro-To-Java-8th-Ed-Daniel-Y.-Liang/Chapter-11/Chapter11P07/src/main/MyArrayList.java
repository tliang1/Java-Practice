package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class MyArrayList
{
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] objects;
	private int numberOfObjects;
	
	/**
	 * Creates a new default MyArrayList with an initial capacity of ten.
	 */
	public MyArrayList()
	{
		objects = new Object[DEFAULT_CAPACITY];
	}
	
	/**
	 * Appends the given object at the end of this list.
	 * 
	 * @param o		object
	 */
	public void add(Object o)
	{
		if (numberOfObjects >= objects.length)
		{
			Object[] temp = new Object[objects.length * 2];
			System.arraycopy(objects, 0, temp, 0, objects.length);
			objects = temp;
		}
		
		objects[numberOfObjects++] = o;
	}
	
	/**
	 * Adds the given object to the given index in this list. The object currently at the given index (if any) and any subsequent objects are 
	 * shifted to the right.
	 * <ul>
	 * 	<li>
	 * 		If the index is not between 0 (inclusive) and the number of objects (exclusive) in this list, then the object will not be added.
	 * 	</li>
	 * </ul>
	 * 
	 * @param index		index
	 * @param o			object
	 */
	public void add(int index, Object o)
	{
		if (index >= 0)
		{
			if ((index == 0) && (numberOfObjects == 0))
			{
				objects[numberOfObjects++] = o;
			}
			else if (index < numberOfObjects)
			{
				if ((numberOfObjects + 1) >= objects.length)
				{
					Object[] temp = new Object[objects.length * 2];
					System.arraycopy(objects, 0, temp, 0, objects.length);
					objects = temp;
				}
				
				System.arraycopy(objects, index, objects, index + 1, numberOfObjects - index);
				objects[index] = o;
				numberOfObjects++;
			}
		}
	}
	
	/**
	 * Removes all the objects from this list.
	 */
	public void clear()
	{
		numberOfObjects = 0;
		Arrays.fill(objects, null);
	}
	
	/**
	 * Returns true if this list contains the given object.
	 * 
	 * @param o		object
	 * @return		true if this list contains the given object. Otherwise, false.
	 */
	public boolean contains(Object o)
	{
		for (int index = 0; index < numberOfObjects; index++)
		{
			if ((o != null) && (objects[index].equals(o)))
			{
				return true;
			}
			else if ((o == null) && (o == objects[index]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Returns the object at the given index in this list.
	 * <ul>
	 * 	<li>
	 * 		If the index is not between 0 (inclusive) and the number of objects (exclusive) in this list, then the null value is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param index		index
	 * @return			the object at the given index in this list
	 */
	public Object get(int index)
	{
		return ((index >= 0) && (index < numberOfObjects)) ? objects[index] : null;
	}
	
	/**
	 * Returns the index of the first occurrence of the given object in this list.
	 * <ul>
	 * 	<li>
	 * 		If the object is not in this list, then -1 is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param o		object
	 * @return		the index of the first occurrence of the given object in this list
	 */
	public int indexOf(Object o)
	{
		int index = 0;
		
		while (index < numberOfObjects)
		{
			if ((o == null) && (o == objects[index]))
			{
				break;
			}
			else if ((o != null) && (o.equals(objects[index])))
			{
				break;
			}
			else
			{
				index++;
			}
		}
		
		return (index < numberOfObjects) ? index : -1;
	}
	
	/**
	 * Returns if this list contains no objects.
	 * 
	 * @return	true if this list contains no objects. Otherwise, false.
	 */
	public boolean isEmpty()
	{
		return numberOfObjects == 0;
	}
	
	/**
	 * Returns the index of the last occurrence of the given object in this list.
	 * <ul>
	 * 	<li>
	 * 		If the object is not in this list, then -1 is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param o		object
	 * @return		the index of the last occurrence of the given object in this list
	 */
	public int lastIndexOf(Object o)
	{
		int lastIndex = numberOfObjects - 1;
		
		while (lastIndex >= 0)
		{
			if ((o == null) && (o == objects[lastIndex]))
			{
				break;
			}
			else if ((o != null) && (o.equals(objects[lastIndex])))
			{
				break;
			}
			else
			{
				lastIndex--;
			}
		}
		
		return lastIndex;
	}
	
	/**
	 * Returns if the given object is removed from this list.
	 * 
	 * @param o		object
	 * @return		true if the given object is removed from this list. Otherwise, false.
	 */
	public boolean remove(Object o)
	{
		int objectIndex = 0;
		
		while (objectIndex < numberOfObjects)
		{
			if ((o == null) && (o == objects[objectIndex]))
			{
				break;
			}
			else if ((o != null) && (o.equals(objects[objectIndex])))
			{
				break;
			}
			else
			{
				objectIndex++;
			}
		}
		
		if (objectIndex != numberOfObjects)
		{
			numberOfObjects--;
			objects[objectIndex] = null;
			
			if (objectIndex < (numberOfObjects - 1))
			{
				System.arraycopy(objects, objectIndex + 1, objects, objectIndex, objects.length - (objectIndex + 1));
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns the number of objects in this list.
	 * 
	 * @return	the number of objects in this list
	 */
	public int size()
	{
		return numberOfObjects;
	}
	
	/**
	 * Returns if the object at the given index is removed from this list.
	 * 
	 * @param index		index
	 * @return			true if the object at the given index is removed from this list. Otherwise, false.
	 */
	public boolean remove(int index)
	{
		if ((index >= 0) && (index < numberOfObjects))
		{
			numberOfObjects--;
			objects[index] = null;
			
			if (index < (numberOfObjects - 1))
			{
				System.arraycopy(objects, index + 1, objects, index, objects.length - (index + 1));
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns the original object at the given index and sets the given object at the given index in this list.
	 * <ul>
	 * 	<li>
	 * 		If the index is not between 0 (inclusive) and the number of objects (exclusive) in this list, then the null value is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param index		index
	 * @param o			object
	 * @return			the original object at the given index
	 */
	public Object set(int index, Object o)
	{
		if ((index >= 0) && (index < numberOfObjects))
		{
			Object original = objects[index];
			objects[index] = o;
			
			return original;
		}
		
		return null;
	}
	
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder("[");
		
		for (int index = 0; index < numberOfObjects; index++)
		{
			if (index > 0)
			{
				stringBuilder.append(", ");
			}
			
			stringBuilder.append(objects[index]);
		}
		
		stringBuilder.append("]");
		
		return stringBuilder.toString();
	}
}