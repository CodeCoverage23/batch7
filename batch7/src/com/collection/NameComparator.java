package com.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentDemo> {

	@Override
	public int compare(StudentDemo o1, StudentDemo o2)
	{
		
		return o1.name.compareTo(o2.name);
	}

}
