package fr.umlv.data;

public class LinkedLink<E>  {
	private Link<E> first;
	private int size;
	/**
	 * @param first
	 * @param size
	 */
	public LinkedLink() {
	}

	/**
	 * 
	 * @param value
	 */
	public void add(E value) {
		this.first = new Link<E>(value, first);
		this.size++;
	}
	
	public E get(int index) {
		if(index < 0) {
			throw new IllegalArgumentException("Index must be positive");
		}
		Link<E> lst = this.first;
		for(int i = 0; i <index; i++) {
			lst = lst.getNext();
		}
		return lst.getValue();
		
	}
	

	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append(this.first.getValue());
		st.append(" ");
		if(this.first.getNext() != null) {
			st.append(this.first.getNext());
		}
		return st.toString();
	}
	
	/**
	 * Return index of object into linkedList
	 * @param o
	 * @return
	 */
	public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Link<E> x = first; x != null; x = x.getNext()) {
                if (x.getValue() == null)
                    return index;
                index++;
            }
        } else {
            for (Link<E> x = first; x != null; x = x.getNext()) {
                if (o.equals(x.getValue()))
                    return index;
                index++;
            }
        }
        return -1;
    }
	
	boolean contains(Object o) {
		if(indexOf(o) >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
}
