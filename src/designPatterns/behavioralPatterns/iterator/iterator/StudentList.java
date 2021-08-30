package designPatterns.behavioralPatterns.iterator.iterator;

public class StudentList implements Iterable<String> {
	
	private String[] students = new String[] {"Alex", "Alice", "Bob", "John"};

	@Override
	public Iterator<String> getIterator() {
		return new Iterator<String>() {

			private int index = 0;
			
			@Override
			public boolean hasNext() {
				return this.index < students.length;
			}

			@Override
			public String next() {
				return students[index++];
			}
			
		};
	}

}
