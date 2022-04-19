package com.sumofDigit;

public class GetSum {

	
		public int getSum(int a, int b) {
			while(b!=0) {
				int tmp=(a&b)<<1;
				a=a^b;
				b=tmp;
			}
			return a;
		}
		public static void main(String[] args) {
			GetSum obj =new GetSum();
			obj.getSum(4, 5);
			//System.out.println(obj.getSum(4, 5));
			//int tmp=obj.getSum(4, 5);
			//System.out.println(tmp);
		}

	}


