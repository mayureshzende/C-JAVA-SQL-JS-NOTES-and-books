package com.pga.stats;
import com.pga.maths.Addition;

public class Average {
	public int avg(int a,int b) { 
		Addition obj = new Addition();
		return obj.add(a, b)/2;
	}
}
