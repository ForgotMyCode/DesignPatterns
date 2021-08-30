package designPatterns.behavioralPatterns.iterator;

import designPatterns.behavioralPatterns.iterator.iterator.Iterator;
import designPatterns.behavioralPatterns.iterator.iterator.StudentList;

/**
 * 
 * @author ForgotMyCode
 * @implSpec There is Iterator interface with functions {@code hasNext()} and {@code next()}.
 * Also, an interface of some kind of {@code IterableCollection}, that provides an iterator.
 * Iterator iterates over some kind of a collection.
 *
 */
public class Main {

	public static void main(String[] args) {
		final StudentList studentList = new StudentList();
		
		final Iterator<String> studentListIterator = studentList.getIterator();
		
		while(studentListIterator.hasNext()) {
			System.out.println(studentListIterator.next());
		}
	}

}
