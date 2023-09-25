package com.ty;

public class Frequency {
	public static void main(String[] args) {
	  String st="malayalam";
	  char ch[]=st.toCharArray();
	  for(int i=0;i<ch.length;i++)
	  {
		  int count=0;
		  for(int j=0;j<ch.length;j++)
		  {
			  
			  if(ch[i]==ch[j] && j<i)
			  {
				      break;
			  }
			  if(ch[i]==ch[j])
			  {
				  count++;
				  
			  }
			 
		  }
		  if(count!=0)
			  System.out.println(count);
	  }
	}

}
