package a3;

import java.util.Arrays;

public class Ex1 {
	public void disavg() {
		int[] num= {5,7,3,9,7};	
		int avg;
		avg=Average(num);
		System.out.println("Average for "+Arrays.toString(num)+" is "+avg);
		
		}
		
		public static int Average(int[] x){
			int sum=0;
			
			for(int i=0;i<x.length;i++) {
				sum+=x[i];
				
				
			}
			sum=sum/x.length;
			
		return(sum);
		
			
		
			
		}
}
