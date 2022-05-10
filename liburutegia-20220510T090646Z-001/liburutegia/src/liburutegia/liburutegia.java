package liburutegia;

import java.lang.reflect.Array;
import java.util.Scanner;

public class liburutegia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teklatua=new Scanner(System.in);
		
		
		String [] a= new String [20];
		String irtenaukera;
		int [] b=new int[20];
		int menuaukera;
		
		
		a[0]="Ezer ez";
		a[1]="Lotsati ilunpenik argia";
		a[2]="txoriak kolpeka";
		a[3]="txanogorritxu";
		a[4]="12 ipuin klasiko";
		a[5]="Pepe eta mila";
		a[6]="haserretu zaitezte";
		a[7]="etxe hutzean";
		a[8]="123";
		a[9]="Egun Beltza";
		a[10]="Hobbita";
		a[11]="Judu kale";
		
		b[0]=20;
		b[1]=12;
		b[2]=15;
		b[3]=25;
		b[4]=19;
		b[5]=17;
		b[6]=25;
		b[7]=13;
		b[8]=11;
		b[9]=18;
		b[10]=25;
		b[11]=35;
		
		do {
		
		
		System.out.println("1.- Liburu guztien izena ikusi.");
		System.out.println("2.- Liburu guztien izena eta salneurria ikusi.");
		System.out.println("3.- Liburu baten salneurria ikusi.");
		System.out.println("4- Liburu berri bat sartu.");
		System.out.println("5.- Liburu bat ezabatu");
		System.out.println("6.- Liburu baten salneurria aldatu");
		System.out.println("7.- Liburu baten izena aldatu.");
		System.out.println("8.- Programatik irten");
		
		menuaukera=teklatua.nextInt();
		
		
		switch (menuaukera) {
		
		case 1:
			
			String IrtenAukera;
			
			for (int i=0;i<a.length;i++) {
				
				if(!(a[i]== null)) {
					System.out.println(a[i] + " ");
				}
				
				
			}
			
			
			System.out.println("Programan jarraitu nahi duzu? BAI / EZ");
			IrtenAukera=teklatua.next();
			

		break;
		
		case 2:
			
			for (int i=0;i<a.length;i++) {
				
				if(!(a[i]== null)) {
					System.out.print(a[i] + ", ");
					System.out.println(b[i] + "€");
				}
				
			}
				
		break;
		
		case 3:
			
			String liburuizena;
			
			teklatua.reset();
			teklatua.nextLine();
			
			System.out.println("Zein da liburuaren izena?");
			liburuizena=teklatua.nextLine();
			
			
				for (int i=0;i<a.length;i++) {
				
				if(liburuizena.equals(a[i]) ) {
					System.out.println(liburuizena + " liburuaren salneurria " + b[i] + "€ da.");
				}
				
			}
			
			break;
			
		}
		
		
		System.out.println("Programan jarraitu nahi duzu? BAI / EZ");
		irtenaukera=teklatua.next();
		irtenaukera.toUpperCase();
		
		}while(irtenaukera.equals("BAI")); 
		
		

	}

}
