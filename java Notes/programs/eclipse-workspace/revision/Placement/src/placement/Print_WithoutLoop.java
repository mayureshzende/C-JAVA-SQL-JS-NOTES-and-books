package placement;

import java.util.*;

public class Print_WithoutLoop {
public static void main(String[] args) {
	PrintNO(100);
}
static void PrintNO(int n)
{
	if(n>0)
	{
		PrintNO(n-1);
		System.out.println(n + " ");
	}
}
}
