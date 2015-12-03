package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<T> implements Stack<T>
{
	private List<T> list;

	public ListAdapter(List<T> list)
	{
		this.list = list;
	}
	
	public void push(T objet)
	{
		list.add(list.size(), objet);
	}
	
	public T pop()
	{
		return list.remove(list.size()-1);
	}
	
	public T peek()
	{
		return list.get(list.size()-1);
	}
	
	public int size()
	{
		return list.size();
	}
	
}
