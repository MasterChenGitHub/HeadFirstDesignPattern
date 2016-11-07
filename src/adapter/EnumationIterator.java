package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumationIterator<E> implements Iterator<E>{

	Enumeration<E> enumation;
	
	
	public EnumationIterator(Enumeration<E> enumation) {
		super();
		this.enumation = enumation;
	}

	@Override
	public boolean hasNext() {
		return enumation.hasMoreElements();
	}

	@Override
	public E next() {
		return enumation.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
