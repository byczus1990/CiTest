package testTravis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FunKwadratowa {
	
	public void liczDelte() throws FileNotFoundException {
		int a = 0, b = 0,c = 0;
		double delta = 0, x1 = 0, x2 = 0, x3 = 0 ;
		String nazwaPliku = "" ;
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		System.out.println("Podaj nazwe dla pliku do zapisu");
		nazwaPliku = read.nextLine();

		File plik = new File(nazwaPliku);
        
		if( plik.isFile() == true){
            System.out.println("plik istnieje");
            System.exit(0);
        }
        
		
		System.out.println("Podaj wspolczynik a");
		try {
		a = read.nextInt();
		}
		catch (InputMismatchException n){ System.out.println("Niepoprawne dane! ");
		}
		
		System.out.println("Podaj wspolczynik b");
		try {
		b = read.nextInt();
		}
		catch (InputMismatchException m){ System.out.println("Niepoprawne dane! ");
		} 
		
		System.out.println("Podaj wspolczynik c");
		try {
		c = read.nextInt();
		}
		catch (InputMismatchException l){ System.out.println("Niepoprawne dane! ");
		} 
		if (a == 0){
            System.out.println("To nie jest funkcja kwadratowa");
        }
		
		else{
            delta = b*b-4*a*c;
		
            
         if (delta<0){
                System.out.println("Brak rozwiazan");
            }
         if(delta==0){
        	 	
        	 	x3 = (-b/(2*a));
                
        	 	System.out.println("Rownanie ma 1 pierwiastek, x1 = " + x3 );
            
                       
                PrintWriter pw = new PrintWriter(nazwaPliku);
                 
            
                pw.println("Miejsce zerowe to " + x3);
                 
                pw.close();
         }
         if(delta>0){
 
        	 	x1 = (-b-Math.sqrt(delta))/(2*a) ;
    		 	x2 = (-b+Math.sqrt(delta))/(2*a) ;
        	 
                System.out.println("x1 = " + x1 );
                System.out.println("x2 = " + x2 );
                PrintWriter pw = new PrintWriter(nazwaPliku);
                 
            
                pw.println("Miejsce zerowe x1 to " + x1 + ",miejsce zerowe x2 to "+ x2 );
                 
                pw.close();
         }
         
}
}
	public static int multiple(int firstSlc, int secondSlc) {
        return firstSlc * secondSlc;
    }
	public static int division(int firstSlc, int secondSlc) {
		if (secondSlc == 0) {
			System.out.println("nie dzielimy przez 0");
            System.exit(0);
			
		}
        return firstSlc / secondSlc;
    }
	public static int subtraction(int firstSlc, int secondSlc) {
        return firstSlc - secondSlc;
	}
}
