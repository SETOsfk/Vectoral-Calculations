package vektörHesabý;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
Scanner k=new Scanner(System.in);
int[] vekt1=new int[3];
int[] vekt2=new int[3];
int devam=1;
while(devam==1) {
	System.out.println("Vektör girmek için 1'e basýnýz");
	System.out.println("Çýkýþ yapmak için 0'a basýnýz.");
	int devammý=k.nextInt();
	if(devammý==0) {
		System.out.println("Kullandýðýnýz için teþekkürler.");
		k.close();
		break;}
	if(devammý==1) {
for(int i=0;i<vekt1.length;i++) {
	System.out.println("1. vektörün X,Y,Z deðerlerini sýrasýyla giriniz.");
	vekt1[i]=k.nextInt();
	
}
for(int i=0;i<vekt2.length;i++) {
	System.out.println("2. vektörün X,Y,Z deðerlerini sýrasýyla giriniz.");
	vekt2[i]=k.nextInt();}
System.out.println("Ýki vektör arasý uzaklýk hesabý için 1");
System.out.println("Vektörel çarpým için 2");
System.out.println("Büyüklüklerini hesaplamak için 3");
System.out.println("Skaler çarpým için 4");
System.out.println("Üçgenin alaný için 5");
int tercih=k.nextInt();

//VEKTÖREL UZUNLUK

int[] vektU=new int[3];
int[] vektU2=new int[3];
if(tercih==1) {
	for(int i=0;i<vekt1.length;i++) {
vektU[i]= (vekt2[i]-vekt1[i]);}
System.out.println("Vektörün uzunluk deðeri <"+vektU[0]+","+vektU[1]+","+vektU[2]+"> olur.");}

//VEKTÖREL ÇARPIM


int[] vc=new int[3];
if(tercih==2) {	
vc[0]=(vekt1[1]*vekt2[2])-(vekt2[1]*vekt1[2]);	
vc[1]=(vekt1[0]*vekt2[2])-(vekt2[0]*vekt1[2]);
vc[2]=(vekt1[0]*vekt2[1])-(vekt2[0]*vekt1[1]);
System.out.println("Vektörün çarpým deðeri <"+vc[0]+","+vc[1]+","+vc[2]+"> olur.");}

//VEKTÖREL BÜYÜKLÜK

double vc1b;
double vc2b;
if(tercih==3) {
for(int i=0;i<vekt1.length;i++) {

vc1b=Math.sqrt(Math.pow(vekt1[0],2)+Math.pow(vekt1[1],2)+Math.pow(vekt1[2],2));	
vc2b=Math.sqrt(Math.pow(vekt2[0],2)+Math.pow(vekt2[1],2)+Math.pow(vekt2[2],2));	
System.out.println("1. vektörün büyüklüðü ="+vc1b);
System.out.println("2. vektörün büyüklüðü ="+vc2b);}}

// SKALER ÇARPIM

int[] skaler=new int[3];
if(tercih==4) {
	for(int i=0;i<vekt1.length;i++) {
	skaler[i]=vekt1[i]*vekt2[i];}
	System.out.println("Skaler çarpým <"+skaler[0]+","+skaler[1]+","+skaler[2]+">");
}
if(tercih==5) {
	System.out.println("Üçgen alan hesabý için 3. vektörü giriniz.");
	int[] vekt3=new int[3];
	for(int i=0;i<vekt3.length;i++) {
	vekt3[i]=k.nextInt();	
	}
	for(int i=0;i<vekt1.length;i++) {
vektU[i]= (vekt2[i]-vekt1[i]);
vektU2[i]= (vekt3[i]-vekt1[i]);
	}
	vc[0]=(vektU[1]*vektU2[2])-(vektU2[1]*vektU[2]);	
	vc[1]=(vektU[0]*vektU2[2])-(vektU2[0]*vektU[2]);
	vc[2]=(vektU[0]*vektU2[1])-(vektU2[0]*vektU[1]);	
	
	for(int i=0;i<vc.length;i++) {
		 double vcb=Math.sqrt(Math.pow(vc[0],2)+Math.pow(vc[1],2)+Math.pow(vc[2],2));	
		double  ua=vcb/2;
		double  uap=vcb;
		 System.out.println("Üçgenin alaný ="+ua);
		 System.out.println("Paralel kenarýn alaný ="+uap);
		}
}
	
	
	
}


// Vektör sistemini de yeni vektör eklemek için 1'e basýn devam etmek için 0'a basýn gibi yap
	}
	}
}

	
