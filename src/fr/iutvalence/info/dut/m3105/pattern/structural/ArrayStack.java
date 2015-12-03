package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<T> implements Stack<T>
{
	private T[] stack;
	
	private int size;
	
	public ArrayStack()
	{
		stack = (T[]) new Object[10];	
		this.size=0;
	}
	 
	public void push(T objet)
	{
		stack[this.size()]=objet;
		this.size+=1;
	}
	
	public T pop()
	{
		T objet = stack[this.size()-1];
		stack[this.size()-1]=null;
		this.size-=1;
		return objet;
	}
	
	public T peek()
	{
		return stack[this.size()-1];
	}
	
	public int size()
	{
		return this.size;
	}
}
