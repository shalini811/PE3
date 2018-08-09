package com.stackroute.pe3;

public class Pe3 {

	public String[][] Chess(int a, int b) {
		// TODO Auto-generated method stub
		 String[][] cb=new String[8][8];
			if(a==8 && b==8)
			{
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
				{
					if((i+j)%2==0)
					{
						 cb[i][j]="WW|";
					}
					else
						  cb[i][j]="BB|";
				}
			}
			
			}
			
			else {
				
				return null;
			}
			return cb;
		}
	

	public String Consecutive(String string) {
		// TODO Auto-generated method stub
	  
		if(string!=" ")
		{
	  
		String[] a=string.split(",");
		int l=a.length;
		String s1,s2;
		int[] p=new int[l];
		for(int m=0;m<l;m++)
		{
			p[m]=Integer.parseInt(a[m]);
			
				if(l==7)
				{
				if((p[0]==p[1]+1) && (p[1]==p[2]+1) && (p[2]==p[3]+1) && (p[3]==p[4]+1) && (p[4]==p[5]+1) && (p[5]==p[6]-1))
	{
		//s1=st+"are consecutive";
		return "consecutive numbers";
	}
			}
				//s2=st+"not consecutive";
				return "non consecutive numbers";
			
		}
		}		
		return null;
	}

	public String GenerateEx() {
		String s = null;
		int position1 = 0;
		// TODO Auto-generated method stub
		try {
			if(s.equals("Hi")) {
				return "same";
			}
			
		}
		catch(Exception e)
        {
            return "NullPointerException caught." ;
        }
		return null;
	}
		

	public String ArrayOutofBound(int[] array, int n) {
		// TODO Auto-generated method stub
		try {
		//int ab=array[n];    
			array[3]=5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return "OutOfBounds";
		}
		return "valid";
	}
	    
	
	public String NegativeArrayEx( int position2) {
		// TODO Auto-generated method stub
		try {
		//int ai=array1[position2];
			int array1[]=new int[position2];
		}
		catch(NegativeArraySizeException e)
		{
			return "null";
		}
		
		return null;
	}



}
