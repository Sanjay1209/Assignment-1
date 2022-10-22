package com.pmsp;

public class Q1 {

	public static void main(String[] args) {
		int n=12;
		System.out.println();

		for(int i=0;i<n;i++) {

			for(int j=0; j<n;j++) {      //space
			
				System.out.print(" ");
				
			}
			
			for(int j=0 ; j<n; j++) {     //  |
				if((j==n-3 && i>3) ||
						(j==n-3 && i==2)
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++) {     // N
				if( (j==0 && i>0) ||
						(j==n-1 && i>=0 && i<n-1) ||
					    (i==j)
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++) {     //E
				if( (j==1 && i>0 && i<n-1) ||
						 (i==0 && j>1) ||
						 (i==n-1 && j>1 && j<=n-1) ||
						 (i==(n-1)/2 && j>=1 &&j<n-2)
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++) {     //U
				if( (j==1 && i<n-1) ||
						(i==n-1 &&j>1 && j<n-1) ||
						(j==n-1 && i<n-1)
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++) {     // R
				if( (j==1 && i>0 ) ||
						(i==0 && j>1 && j<n-1) ||
						(j==n-1 && i>0 && i<=(n-3)/2) ||
						(i==(n-1)/2 && j>2 && j<(n-2) ) ||
						(i==j && j>(n-1)/2) 
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++) {     // O
				if( (j==1 && i>0 && i<n-1) ||
						(i==0 &&j>1 && j<n-2) ||
						(i==n-1 &&j>1 && j<n-2) ||
						(j==n-2 && i>0 && i<n-1)
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0 ; j<n; j++) {     //N
				if( (j==0 && i>0) ||
						(j==n-1 && i>=0 && i<n-1) ||
						    (i==j)
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
