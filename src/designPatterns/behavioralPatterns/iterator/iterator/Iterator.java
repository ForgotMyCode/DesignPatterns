package designPatterns.behavioralPatterns.iterator.iterator;

public interface Iterator<T> {
	
	public boolean hasNext();
	
	public T next();
}
