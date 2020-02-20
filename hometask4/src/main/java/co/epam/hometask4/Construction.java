package co.epam.hometask4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {
	
	public static void costEvaluator() {
		Scanner sc= new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.println("Construction Cost Estimation");
		p.println("Available materials");
		p.println("1. construction with standard materials");
		p.println("2. construction with above standard materials");
		p.println("3. construction with high standard materials");
		p.println("4. construction with high standard materials and fully automated");
		p.println("Enter any choice (1-4): ");
		try {
			int ch=sc.nextInt();
			p.println("Enter the area of house: ");
			switch(ch){
			case 1:
				p.println("Cost ="+sc.nextDouble()*1200 +" INR");
			   break;
			case 2:
				p.println("Cost ="+sc.nextDouble()*1500 +" INR");
				break;
			case 3:
				p.println("Cost ="+sc.nextDouble()*1800 +" INR");
			   break;
			case 4:
				p.println("Cost ="+sc.nextDouble()*2500 +" INR");
			   break;
			default:
				p.println("invalid input ... ");
				}
			}
		catch (Exception e) {
			p.println("Enter a valid input ... ");
		}
	}
}