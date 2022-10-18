package vektörHesabý;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
Scanner k=new Scanner(System.in);
int[] vekt1=new int[3];
int[] vekt2=new int[3];
int devam=1;
while(devam==1) {
	System.out.println("Please press 1 for input a new vector");
	System.out.println("Please press 0 for quit.");
	int devammý=k.nextInt();
	if(devammý==0) {
		System.out.println("Thank you very much.");
		k.close();
		break;}
	if(devammý==1) {
for(int i=0;i<vekt1.length;i++) {
	System.out.println("Please add  X,Y,Z variables of first vector");
	vekt1[i]=k.nextInt();
	
}
for(int i=0;i<vekt2.length;i++) {
	System.out.println("Please add  X,Y,Z variables of second vector");
	vekt2[i]=k.nextInt();}
System.out.println("Please press 1 for Vectoral Distance. ");
System.out.println("Please press 2 for Cross Product");
System.out.println("Please press 3 for Vector Quantity");
System.out.println("Please press 4 for Scalar Multiplication");
System.out.println("Please press 5 for Area of a Triangle and Area of a parallelogram");
int  option=k.nextInt();

//VEKTÖREL UZUNLUK

int[] vektU=new int[3];
int[] vektU2=new int[3];
if(option==1) {
	for(int i=0;i<vekt1.length;i++) {
vektU[i]= (vekt2[i]-vekt1[i]);}
System.out.println("Vectoral Distance is <"+vektU[0]+","+vektU[1]+","+vektU[2]+">");}

//VEKTÖREL ÇARPIM


int[] vc=new int[3];
if(option==2) {	
vc[0]=(vekt1[1]*vekt2[2])-(vekt2[1]*vekt1[2]);	
vc[1]=(vekt1[0]*vekt2[2])-(vekt2[0]*vekt1[2]);
vc[2]=(vekt1[0]*vekt2[1])-(vekt2[0]*vekt1[1]);
System.out.println("Cross Product is <"+vc[0]+","+vc[1]+","+vc[2]+">");}

//VEKTÖREL BÜYÜKLÜK

double vc1b;
double vc2b;
if(option==3) {
for(int i=0;i<vekt1.length;i++) {

vc1b=Math.sqrt(Math.pow(vekt1[0],2)+Math.pow(vekt1[1],2)+Math.pow(vekt1[2],2));	
vc2b=Math.sqrt(Math.pow(vekt2[0],2)+Math.pow(vekt2[1],2)+Math.pow(vekt2[2],2));	
System.out.println("Vector Quantity of first vector ="+vc1b);
System.out.println("Vector Quantity of second vector ="+vc2b);}}

// SKALER ÇARPIM

int[] skaler=new int[3];
if(option==4) {
	for(int i=0;i<vekt1.length;i++) {
	skaler[i]=vekt1[i]*vekt2[i];}
	System.out.println("Scalar Multiplication <"+skaler[0]+","+skaler[1]+","+skaler[2]+">");
}
if(option==5) {
	System.out.println("Please add third vector...");
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
		 System.out.println("Area of Triangle ="+ua);
		 System.out.println("Area of a parallelogram ="+uap);
		}
}
	
	
	
}



	}
	}
}

	
