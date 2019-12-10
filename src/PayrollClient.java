/********************************************************************
 * Programmer:      Kalia
 * Class:           CS30S
 *
 * Assignment:      Intro to OOP Example
 *
 * Description:     December exam on employee payrolls
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class PayrollClient {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
    	
    // ***** create objects *******
    
        Payroll Employee1 = new Payroll(45);
        Payroll Employee2 = new Payroll(40.5);
        Payroll Employee3 = new Payroll(39);
        Payroll Employee4 = new Payroll(52);
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
	    	
    // ************************ get input **********************
/* input will now come from an external file so there
        will not normally be a need for a prompt
    
        prompt = "Enter your prompt text here. \n";	
        prompt += "you may need to add additional lines\n";
        prompt += "or delete some of these prompt lines.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
*/
        // read a line of data from the external text file

    // ************************ processing ***************************
        


    // ************************ print output ****************************
    
        /*System.out.println(circle2.getRadius());
        System.out.format("Circle 1 area = %10.5f %s", circle1.getArea(), nl);
        System.out.format("Circle 2 area = %10.5f %s", circle2.getArea(), nl);
        */
        System.out.println(Employee2.toString() + nl + nl);
        
        Employee3.setHours(39.0);
        System.out.println(Employee3.toString() + nl + nl);
        System.out.println(Employee1.toString() + nl + nl);
        System.out.println(Employee4.toString() + nl + nl);
    
    // ******** closing message *********
        
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
