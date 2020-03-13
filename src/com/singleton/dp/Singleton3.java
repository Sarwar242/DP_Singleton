package com.singleton.dp;

//Static initializer based Java implementation of 
//singleton design pattern 
class Singleton 
{ 
	private static Singleton obj = new Singleton(); 

	private Singleton() {} 

	public static Singleton getInstance() 
	{ 
		return obj; 
	} 
} 
