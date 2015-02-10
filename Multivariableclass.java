import java.util.Scanner;


public class Multivariableclass {
	
	
	public static void main(String[] args){
		 
		System.out.println(Integrater());
		System.out.println(ExtraIntegration());
	}
	
	
	public  static float Mathfunction(float x,float y ){
	
		return (float) (1/Math.log(x*y)) ;
	}
	
	
	//I think I'll have some kind of fencepost error
	public static   float Integrater(float y_1){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter in integral begining");
		 float start= sc.nextInt();
		System.out.println("enter in integral end");
		 float end = sc.nextInt();
		
		float dx = (end- start)/200;
		
		
		float sum1 = 0;
		float x_1 = start;
		
		//This is a RRam 
		for(int i=0;i<200;i++){
			x_1 = x_1+ spacing;
			sum1 = sum1 + Mathfunction(x_1,y_1)*dx;
		}
		return sum1;
	}

	
///////////////////////////////////////////////////////////////////////////	
	///Multivariable Integration///
	
	/*public static void MultiIntegration*/
	/*
	 *Consider the object formed by  over a region D in the xy plane.  
	This volume will seldom be computable analytically.   
	In this problem, use the partitioning methods illustrated in section 5.2 to approximate the volume of the object over a.  D =  and b.  D = such that  ,  .
 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	Build your approximation in Excel (preferably) or a programming language of your choice.   
	Use 100 subintervals of x and 200 subintervals in y.   
	You’ll need to decide which analogies of LRMram or Traps make sense
	*/
	public static float ExtraIntegration(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter in integral begining2");
		 float start2= sc.nextInt();
		System.out.println("enter in integral end2");
		 float end2 = sc.nextInt();
		
		float spacing = (end2-start2)/200;
		
		
		float sum1 = 0;
		float x_1 = start2;
		float y_1 = 1;
		//This is a RRam 
		for(int i=0;i<200;i++){
			x_1 = x_1+ spacing;
			sum1 = sum1 + Integrater(x_1)*spacing;
		}
		return sum1;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
