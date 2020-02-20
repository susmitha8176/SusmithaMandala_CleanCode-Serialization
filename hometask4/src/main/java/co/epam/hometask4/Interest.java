package co.epam.hometask4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Interest {
	public static void interestCalculator(){
		Scanner sc=new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.println("Enter principle");
		try {
			double principal = sc.nextDouble();
			p.println("Enter the time ");
			double time = sc.nextDouble();
			p.println("Enter the rate of interest");
			double rateOfInterest=sc.nextDouble();
			p.println("Simple Interest :"+(principal*time*rateOfInterest)/100);
			p.println("Compound Interest :"+((principal*Math.pow(1+(rateOfInterest/100),time)-principal)));
			}
		catch (Exception e) {
			p.println("Enter a valid input ... ");
		}
	}
}
