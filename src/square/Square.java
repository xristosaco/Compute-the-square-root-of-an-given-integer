/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

import java.util.Scanner;

/**
 *
 * @author xristos
 */
public class Square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
     int num;
        Scanner in = new Scanner(System.in);	
        System.out.print("Input a positive integer: ");
        int n = in.nextInt(); 
        System.out.printf("Square root of %d is: ",n);
		System.out.println(sqrt(n)); 
    }
    
private static int sqrt(int num) {
        if (num == 0 || num == 1) {
			return num;
		}
		int a = 0;
		int b = num;
		while (a <= b) {
			int mid = (a + b) >> 1;
			if (num / mid < mid) {
				b = mid - 1;
			} else {
				if (num / (mid + 1) <= mid) {
					return mid;
				}
				a = mid + 1;
			}
		}
		return a;
	}
}