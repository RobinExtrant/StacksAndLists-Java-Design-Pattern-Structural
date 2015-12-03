package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<T>
{
	public void add(int num, T object);
	
	public T remove(int num);
	
	public T get(int num);
	
	public int size();
}
