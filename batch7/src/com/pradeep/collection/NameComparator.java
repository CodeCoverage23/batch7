package com.pradeep.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
//	 Ascending order
//		return o1.studentName.compareTo(o2.studentName);
//		descending order
		return -o1.studentName.compareTo(o2.studentName);
	}

}
