package com.problem.solution;

import java.io.IOException;

/*You can use thus obtained Runtime object to interact with runtime environment of that application.

There is one method in java.lang.Runtime class called exec() method.This method executes
the specified system command in a separate process. You can use this method to launch external 
applications like notepad, browser or any media player through your java program. 
For example if you pass “notepad.exe” to this method, it opens new instance of notepad application.*/

public class Problem6 {
	    public static void main(String[] args)
	    {
	        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
	 
	        
	        String[] s = new String[] {"C:/Program Files (x86)/Google/Chrome/Application/chrome.exe", "https://www.google.co.in/"};
	              
	       
	        try
	        {
	        	 
	        	runtime.exec("notepad.exe");     
	        	// Process process = runtime.exec(s);
	               //opens new notepad instance
	 
	            //OR runtime.exec("notepad");
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        
	       /* 
	        try
	        {
	            runtime.exec("notepad D:\\wbservice.txt");        //opens "sample.txt" in notepad
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }*/
	    }
}
	    