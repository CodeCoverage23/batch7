package com.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMethodsDemo {

	public static void main(String[] args) 
	{
		Stream<Integer> s=Stream.of(2,5,7,4,3,1);
		System.out.println("no of values:"+s.count());
		//by lambda expresion
		 Integer minasc = Stream.of(2,5,7,4,3,1).min((i1,i2)->i1.compareTo(i2)).get();
		 System.out.println("min : "+minasc);
		 Integer maxasc = Stream.of(2,5,7,4,3,1).max((i1,i2)->i1.compareTo(i2)).get();
		 System.out.println("max : "+maxasc);
       //by method reference
		 Integer min= Stream.of(2,5,7,4,3,1).min(Comparator.comparing(Integer::valueOf)).get();
		 System.out.println("min : "+min);
		 Integer max= Stream.of(2,5,7,4,3,1).max(Comparator.comparing(Integer::valueOf)).get();
		 System.out.println("min : "+max);
		
	}

}
