package adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class ListEnumation<E> implements Enumeration<E> {

	private Iterator<E> iterator;

	public ListEnumation(Iterator<E> iterator) {
		super();
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public E nextElement() {
		return iterator.next();
	}

}
