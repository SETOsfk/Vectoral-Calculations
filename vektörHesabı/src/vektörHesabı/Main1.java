package vekt�rHesab�;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
Scanner k=new Scanner(System.in);
int[] vekt1=new int[3];
int[] vekt2=new int[3];
int devam=1;
while(devam==1) {
	System.out.println("Vekt�r girmek i�in 1'e bas�n�z");
	System.out.println("��k�� yapmak i�in 0'a bas�n�z.");
	int devamm�=k.nextInt();
	if(devamm�==0) {
		System.out.println("Kulland���n�z i�in te�ekk�rler.");
		k.close();
		break;}
	if(devamm�==1) {
for(int i=0;i<vekt1.length;i++) {
	System.out.println("1. vekt�r�n X,Y,Z de�erlerini s�ras�yla giriniz.");
	vekt1[i]=k.nextInt();
	
}
for(int i=0;i<vekt2.length;i++) {
	System.out.println("2. vekt�r�n X,Y,Z de�erlerini s�ras�yla giriniz.");
	vekt2[i]=k.nextInt();}
System.out.println("�ki vekt�r aras� uzakl�k hesab� i�in 1");
System.out.println("Vekt�rel �arp�m i�in 2");
System.out.println("B�y�kl�klerini hesaplamak i�in 3");
System.out.println("Skaler �arp�m i�in 4");
System.out.println("��genin alan� i�in 5");
int tercih=k.nextInt();

//VEKT�REL UZUNLUK

int[] vektU=new int[3];
int[] vektU2=new int[3];
if(tercih==1) {
	for(int i=0;i<vekt1.length;i++) {
vektU[i]= (vekt2[i]-vekt1[i]);}
System.out.println("Vekt�r�n uzunluk de�eri <"+vektU[0]+","+vektU[1]+","+vektU[2]+"> olur.");}

//VEKT�REL �ARPIM


int[] vc=new int[3];
if(tercih==2) {	
vc[0]=(vekt1[1]*vekt2[2])-(vekt2[1]*vekt1[2]);	
vc[1]=(vekt1[0]*vekt2[2])-(vekt2[0]*vekt1[2]);
vc[2]=(vekt1[0]*vekt2[1])-(vekt2[0]*vekt1[1]);
System.out.println("Vekt�r�n �arp�m de�eri <"+vc[0]+","+vc[1]+","+vc[2]+"> olur.");}

//VEKT�REL B�Y�KL�K

double vc1b;
double vc2b;
if(tercih==3) {
for(int i=0;i<vekt1.length;i++) {

vc1b=Math.sqrt(Math.pow(vekt1[0],2)+Math.pow(vekt1[1],2)+Math.pow(vekt1[2],2));	
vc2b=Math.sqrt(Math.pow(vekt2[0],2)+Math.pow(vekt2[1],2)+Math.pow(vekt2[2],2));	
System.out.println("1. vekt�r�n b�y�kl��� ="+vc1b);
System.out.println("2. vekt�r�n b�y�kl��� ="+vc2b);}}

// SKALER �ARPIM

int[] skaler=new int[3];
if(tercih==4) {
	for(int i=0;i<vekt1.length;i++) {
	skaler[i]=vekt1[i]*vekt2[i];}
	System.out.println("Skaler �arp�m <"+skaler[0]+","+skaler[1]+","+skaler[2]+">");
}
if(tercih==5) {
	System.out.println("��gen alan hesab� i�in 3. vekt�r� giriniz.");
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
		 System.out.println("��genin alan� ="+ua);
		 System.out.println("Paralel kenar�n alan� ="+uap);
		}
}
	
	
	
}


// Vekt�r sistemini de yeni vekt�r eklemek i�in 1'e bas�n devam etmek i�in 0'a bas�n gibi yap
	}
	}
}

	
