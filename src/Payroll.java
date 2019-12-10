/********************************************************************
 * Programmer:      Kalia
 * Class:           CS30S
 *
 * Assignment:      Circle OOP example
 *
 * Description:     Circle class, will hold the radius as a property
 *                  will calculate circle dimensions
 ***********************************************************************/

// import libraries as needed here

public class Payroll {
    //*** Class Variables ***
    
    public static int nextID = 126597380;        // unique id for each circle
    
    //*** Instance Variables ***
    
    private final double Pay = 11.65;  
    private double Hours = 0;        // radius of circle object
    private int id = 0;
    private double Overtimehours = 0;
    private double Overtimepay = 0;
    
    //*** Constructors ***
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
      
    /*****************************************
    * Description: create a new circle object with radius = 0
    * 
    * ****************************************/
      public Payroll(){
          Hours = 0.0;
          
          // use the class variable nextID to assign a unique id
          // to this object
          // after the id has been assigned increment nextID so that
          // the next object created gets a unique id as well
          id = nextID++;
      } // end default constructor
      
    /*****************************************
    * Description: create a new circle object with radius = r
    * 
    * Interface:
    * 
    * @param        H: double, it the radius of the circle
    * ****************************************/
      public Payroll(double H){
          Hours = H;
          id = nextID++;        // set id and increment nextID
      } // end initialized constructor
     
    //*** Getters ***

    /*****************************************
    * Description:  will return the id of the circle
    * 
    * Interface:
    * 
    * @return       id: int, the unique id of the Employee
    * ****************************************/
      public int getId(){
          return this.id;
      } // end getID
      
    /*****************************************
    * Description:  will return the radius of the circle
    * 
    * Interface:
    * 
    * @return       radius: double, the radius of the circle
    * ****************************************/
      public double getHours(){
          return this.Hours;
      } // end getRadius
           
      /*****************************************
    * Description:  get the overtimehours of the employee
    * 
    * Interface:
    * 
    * @return       diameter: double, the overtimehours of the employee
    * ****************************************/
      public double getOvertimehours(){
          if (Hours>40)
          return Math.pow(Hours, 1) - 40;
        return this.Overtimehours;
      } // end getOvertimehours
  
    /*****************************************
    * Description:  Overtime pay of the employee
    * 
    * Interface:
    * 
    * @return       Overtimepaye; Overtimepay of the employee
    * ****************************************/
      public double getOvertimepay(){
          if (Hours > 40)
          return this.Pay * 1.5 * getOvertimehours();
        return this.Overtimepay;
      } // end getOvertime 
                  
      /*****************************************
    * Description:  get the overtimehours of the employee
    * 
    * Interface:
    * 
    * @return       Overtimehours: overtime hours of the employee
    * ****************************************/
            public double getRegularPay(){
          return Math.pow(Hours, 1) * Pay;
      } // end getSalary
    /*****************************************
    * Description:  get the salary of the circle employee
    * 
    * Interface:
    * @return       salary: salary of the employee
    * ****************************************/
      public double getSalary(){
          return Math.pow(Hours, 1) * Pay + getOvertimepay();
      } // end getSalary
         

      
    /*****************************************
    * Description: print employee details
    * 
    * Interface:
    * 
    * @return       String: employee information
    * ****************************************/
      public String toString(){
          String s = "";
          
          s = String.format("%-10s %10d %s", "ID:", this.id, "\n");
          s += String.format("%-10s %10.2f %s", "Hours worked:", this.Hours, "\n");
          s+=  String.format("%-10s %10.2f %s", "Pay/hour:", this.Pay, "\n");
          s += String.format("%-10s %10.2f %s", "Overtime pay:", this.getOvertimepay(), "\n");
          s += String.format("%-10s %10.2f %s", "Regular Pay:", this.getRegularPay(), "\n");
          s += String.format("%-10s %10.2f %s", "Gross pay:", this.getSalary(), "\n");
          
          
          return s;
      } // end toString
    
    //*** Setters ***
      
    /*****************************************
    * Description:  set a new value for radius
    * 
    * Interface:
    * 
    * @param        H  double, new radius of circle
    * ****************************************/
      public void setHours(double H){
          this.Hours = H;
      } //end setHours
    
} // end of public class
