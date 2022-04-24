package rsa;
import java.io.*; 
import java.math.*; 

public class Sample { 

	public static long p,q,n,phi,m,d,e,enc,dec; 
	public static long GCD(long phi) { 
	
		long a,c,b; 
		for(long i=4;i<phi;i++){ 
			a=i;
			b=phi;
			c=b; 
			while(b!=0) { 
				c=b; 
				b=a%b; 
				a=c; } 
			if(a==1) { 
				e=i; 
				i=phi; } } 
		return e; 
		}
	
	public static long Encryption(long n,long phi,long m) 
	{ 
		long x=m,y=m; 
		e=GCD(phi); 
		for(long a=0;a<e-1;a++) { 
			x=x*y; } 
		enc=x%n; 
		return enc; 
		}
	
	public static BigInteger Decryption(long e,long enc,long n,long phi) 
	{ 
		long y,temp=phi+1,x; 
		BigInteger object2=null; 
		try 
		{
			for(long i=1;i<phi;i++) 
		{ 
				if(((i*e)%phi)==1) { 
					d=i; 
					i=phi; }}
			BigInteger object1=new BigInteger(Long.toString(enc)); 
			BigInteger object3=new BigInteger(Long.toString(n)); 						object1=object1.pow((int)d); object2=object1.mod(object3); }
	
		catch(Exception exception) 
		{ 
			System.out.print("\n Exception In DEC : " + exception); 
			} 
		return object2;
		}
	
	public static void main(String args[]) 
	{ 
		try { 
			DataInputStream in=new DataInputStream(System.in); 
			System.out.print("\n Enter First Prime No : "); 							p=Integer.parseInt(in.readLine()); 
			System.out.print("\n Enter Second Prime No : "); 						q=Integer.parseInt(in.readLine());
			System.out.print("\n Please Enter Message Between ( 0 to 32):"); 
			m=Integer.parseInt(in.readLine()); n=p*q; phi=(p-1)*(q-1); 
			enc=Encryption(n,phi,m); 
			System.out.print("\n Encrypt. KEY : " + e);
			 System.out.print("\n Encrypted DATA : " + enc); 
			BigInteger Result=new BigInteger("123"); 
			Result=Decryption(e,enc,n,phi); 
			System.out.print("\n Decrypt. KEY : " + d); 
			System.out.print("\n Decrypted DATA : " + Result.toString()); 
		}
		catch(Exception exception) 
		{ 
			System.out.print("\n Exception In Main: " + exception); } 
     	} 
	}
