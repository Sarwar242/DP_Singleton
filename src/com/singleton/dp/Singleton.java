package com.singleton.dp;
//“Double Checked Locking” 
class Singleton 
{ 
    private volatile static Singleton obj; 
  
    private Singleton() {} 
  
    public static Singleton getInstance() 
    { 
        if (obj == null) 
        { 
            synchronized (Singleton.class) 
            {  
                if (obj==null) 
                    obj = new Singleton(); 
            } 
        } 
        return obj; 
    } 
    
    public void showMessage(){
        System.out.println("Hello World!");
     }
} 
