import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//////////////////This was made by Hans Gundlach////////////////////////////////////////////////

public class Multivariableclass2 {
	
	
	private static double end;
	
	private static double end2;
	private static double start2;
	private static Scanner myScanner;

	private static double start;
	private static int intervalsx;
	private static int intervalsy;
	private static String descision;

	public static void main(String[] args) throws FileNotFoundException{
		/*This code parses the user input  into variables we will  use in the rest of the function*/
		System.out.println("enter in x interval then y interval then then number of x rectangles then number of y rectangles");
		System.out.println("if you set the first element to 1 the integration order will be reversed  so you will enter the y interval first");
		myScanner = new Scanner(System.in);
		String line;
        String[] myVariables;

        line = myScanner.nextLine(); //read 1,2,3

        //separate all values by comma
        myVariables = line.split(",");
        
        
       //decides which part of the problem 
         descision =myVariables[0]; 
		
        	
       
        	
        
        start=Double.parseDouble(myVariables[1]);
        end=Double.parseDouble(myVariables[2]);
        start2=Double.parseDouble(myVariables[3]);
        end2=Double.parseDouble(myVariables[4]);
        intervalsx=Integer.parseInt(myVariables[5]);
        intervalsy = Integer.parseInt(myVariables[6]);
        myScanner.close();
		    //if (myScanner.nextDouble())) System.exit(0);
        System.out.println(DoubleIntegration());
	}
		 
		//System.out.println(Integrater());
		
	

	
	public  static double Mathfunction(double x,double y ){
	
		return (double) (1/Math.log(x*y)) ;
	}
	
	
	//both integrals are a RRAM approximation
	public static  double Integrater(double place){
	///this goes along the x axis at each y and makes the integral	
	//this is used in double integrater where the y vareis and the integral with respectto x is calculated
		//this should be switched
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
	
	
	public static double DoubleIntegration(){
		/**
		 *  Double integral has two options one with a 2 to 5-x ddymaic bound and one non dynamic bound option
		 * @return
		 */
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
		
	////this goes along the x axis  and calculates the integral along the y
	double sum1 = 0;
	double x_1 = place;
	double y_1 = 2;
	//This is a RRam 
	for(int i=0;i<intervalsx;i++){
		double  startl = 2;
		double endl= 5-x_1;
		
	double dx = (endl- startl)/intervalsx;
	
		y_1 = y_1+ dx;
		sum1 = sum1 + Mathfunction(x_1,y_1)*dx;
	}
	return sum1;
}
	
	
	
	
	
	
	
	

}
