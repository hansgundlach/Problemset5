import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//////////////////This was made by Hans Gundlach////////////////////////////////////////////////
/**
 * THIS CLASS DPES STIFF
 * @author setup
 *
 */
public class Multivariableclass {
	
	
	private static double end;
	
	private static double end2;
	private static double start2;
	private static Scanner myScanner;

	private static double start;
	private static int intervalsx;
	private static int intervalsy;
	private static String descision;

	public static void main(String[] args) throws FileNotFoundException{
		//myScanner = new Scanner(new File("C:/Users/HansG17/workspacecalc/Problemset5/happtext.txt"));
		System.out.println("enter in x interval then y interval then then number of x rectangles then number of y rectangles");
		System.out.println("if you set the first element to 1 the integration order will be reversed  so you will enter the y interval first");
		myScanner = new Scanner(System.in);
		String line;
        String[] lineVector;

        line = myScanner.nextLine(); //read 1,2,3

        //separate all values by comma
        lineVector = line.split(",");
        
        //parsing the values to Integer
       
         descision =lineVector[0]; //Float.parseFloat(lineVector[0]);
		
        	
       
        	
        
        start=Double.parseDouble(lineVector[1]);
        end=Double.parseDouble(lineVector[2]);
        start2=Double.parseDouble(lineVector[3]);
        end2=Double.parseDouble(lineVector[4]);
        intervalsx=Integer.parseInt(lineVector[5]);
        intervalsy = Integer.parseInt(lineVector[6]);
        myScanner.close();
		    //if (myScanner.nextDouble())) System.exit(0);
        System.out.println(DoubleIntegration());
	}
		 
		//System.out.println(Integrater());
		
	

	
	public  static double Mathfunction(double x,double y ){
	
		return (double) (1/Math.log(x*y)) ;
	}
	
	
	//I think I'll have some kind of fencepost error
	public static  double Integrater(double place){
	///this goes along the x axis at each y and makes the integral	
		
		double spacing = (end- start)/intervalsx;
		
		
		double sum1 = 0;
		double x_1 = start;
		double y_1 = place;
		//This is a RRam 
		for(int i=0;i<intervalsx;i++){
			x_1 = x_1+ spacing;
			sum1 = sum1 + Mathfunction(x_1,y_1)*spacing;
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
	public static double DoubleIntegration(){
		
		//this goes along the y axis and sums the integral at each point 
		double spacing = (end2-start2)/intervalsy;
		// in second option imagine this is x axis 
		
		double sum1 = 0;
		double yaxe = start2;
		//double y_1 = 1;
		//This is a RRam 
		
		for(int i=0;i<intervalsy;i++){
			yaxe= yaxe+ spacing;
			if(descision .equals("Y")){
			sum1 = sum1 + ExtraIntegration(yaxe)*spacing;}
			else{
			sum1 = sum1 +Integrater(yaxe)*spacing;
		}
		}
		return sum1;
		
	}

	
	/////////////////////////////////////////////////////Different Problem//////////////////////////////////////////
public static double ExtraIntegration(double place){
		
	////this goe salong the x axis  and calculates the integral along the y
	double sum1 = 0;
	double x_1 = place;
	double y_1 = 2;
	//This is a RRam 
	for(int i=0;i<intervalsx;i++){
		double  startl = 2;
		double endl= 5-x_1;
		
	double spacing = (endl- startl)/intervalsx;
	
		y_1 = y_1+ spacing;
		sum1 = sum1 + Mathfunction(x_1,y_1)*spacing;
	}
	return sum1;
}
	
	
	
	
	
	
	
	

}
