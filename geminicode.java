import java.util.Scanner.*;
import java.io.*;

class seperate{
	 void fun(int A[], int len){
		int count=0;
		for(int i = 0; i<len;i++)
		{
			if(A[i]==0)
			{
				count++;
			}
		}
		for (int i=0;i<count;i++)
		{
			A[i]=0;
		}
		for (int i=count;i<len;i++)
		{
			A[i]=1;
		}
		//return ;
	}
}
public class geminicode{
	public static void main(String args[]){
		int A[] = {1,0,1,1,1,1,1,0,1,0,0,0,0,1,0,1,0};
		int len = A.length;
		seperate s = new seperate();
		s.fun(A,len);
		for (int i=0;i<len;i++){
			System.out.println(A[i]);
		}
	}
}
