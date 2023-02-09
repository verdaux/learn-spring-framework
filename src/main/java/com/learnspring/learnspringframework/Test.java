package com.learnspring.learnspringframework;

public class Test {

	public static void main(String[] args) {
		//printNumber(0);
		byte count = infLoop((byte) 0);
		System.out.println(count);
	}

	public static int printNumber(int i)
	{
	
	    i = i + 2;
	    System.out.println(i);
	    return i + printNumber(i + 2);
	}
	
	public static byte infLoop(byte i) 
	{
		byte count = i;
		
		return (byte) (count+infLoop(i));
	}

}
