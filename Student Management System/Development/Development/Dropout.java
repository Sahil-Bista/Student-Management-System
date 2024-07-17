        /**
 * This class represents a Dropout and contains information about the Dropout.
 * This is a subclass of the super class Student.
 * 
 * Author:Sahil Bista
 * Version 1.0
 */
public class Dropout extends Student {
    //class implementation
    // instance variable initializaiton
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    
    /**
     * Constructs a Dropout object with the specified parameters
     * Initialzes the enrollmentID, course name, date of Enrollment, remaining amount and payment status.
     * 
     * @param dateOfBirth The date of birth of the student.
     * @param studentName The name of the student.
     * @param courseDuration The duration o fthe course in months.
     * @param tuitionFee The tuition fee for the course.
     * @param numOfRemainingModules The number of Remaining Modules.
     * @param numOfMonthAttended The number of months attended.
     * @param dateOfDropout The date of dropout .
     * 
     * @version 1.0
     */
    public Dropout(int enrollmentID, String courseName, String dateOfEnrollment,String dateOfBirth, String studentName, int courseDuration,
                   int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended,
                   String dateOfDropout)
    {
        //constructor implementation
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        setEnrollmentID(enrollmentID);
        setCourseName(courseName);
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }
    
    /**
     * Returns the number of remaining modules for the Dropout student
     * 
     * @return The number of remaining modules.
     * 
     * @version 1.0
     * 
     */
    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }
    
     /**
     * Returns the number of months attended for the Dropout student
     * 
     * @return The number of months attended.
     * 
     * @version 1.0
     * 
     */
    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }
    
     /**
     * Returns the date of dropout for the Dropout student
     * 
     * @return The date of dropout.
     * 
     * @version 1.0
     * 
     */
    public String getDateOfDropout() {
        return dateOfDropout;
    }
    
     /**
     * Returns the remaining amount for the Dropout student
     * 
     * @return The remaining amount.
     * 
     * @version 1.0
     * 
     */
    public int getRemainingAmount() {
        return remainingAmount;
    }
    
    public void setRemainingAmount(int remainingAmount){
        this.remainingAmount=remainingAmount;
    }
    
     /**
     * Returns the boolean has paid for the Dropout student
     * 
     * @return The hasPaid value.
     * 
     * @version 1.0
     * 
     */
    public boolean isHasPaid() {
        return hasPaid;
    }
    
    /**
     * Calculates the remaining amount payable for the Dropout students.
     * The remaining amount is calculated by subtracting the number of monthd attended from the courseDuration 
     * and multiplying it by the tuition fee.If the remaining Amount is zero, the payment status is set to true(paid),
     * otherwise it is set to false.
     * 
     * @version 1.0
     */
    public void billsPayable() {
        this.remainingAmount=(int)(getCourseDuration() - numOfMonthsAttended)*(int)getTuitionFee();
        if(this.remainingAmount==0) {
            System.out.println("The bill has been paid");
            hasPaid=true;
        }
        else
        {
            System.out.println("The remaining amount of " +remainingAmount+ " has been cleared hence clearing all the bills");
            hasPaid=false;
        }
    }

    /**
     * Removes the student's information and resets the data fields if all bills have been paid.
     * If the student has paid all bills, the method clears the student's information by resetting
     * the date of birth,course name,student name ,date of enrollment,cpurseDuration, tuition fee,
     * date of dropout, enrollment ID,number of remaining Modules,number of months attended, remaining amount 
     * and payment status.If there are unpaid bills, a message all bills have not been cleared is published.
     * 
     * @version1.0
     */
    public void removeStudent() {
        if(this.hasPaid==true) {
            super.setDateofBirth("");
            super.setCourseName("");
            super.setStudentName("");
            super.setDateOfEnrollment("");
            super.setCourseDuration(0);
            super.setTuitionFee(0);
            dateOfDropout="";
            super.setEnrollmentID(0);
            this.numOfRemainingModules=0;
            this.numOfMonthsAttended=0;
            this.remainingAmount=0;
            System.out.println("Hence,the student has been removed");
        }else {
            this.hasPaid = false;
            System.out.println("All bills not cleared");
            
        }
    }
    
    /**
     * Displays the information of the Dropout student, including the information from the parent class.
     * Also displays the additional details specific to the Dropout class.
     * 
     * @version 1.0
     */
    public void display() {
        super.display();
        System.out.println("Number of remaining modules is" +numOfRemainingModules);
        System.out.println("Number of months attended:" +numOfMonthsAttended);
        System.out.println("Date of dropout:" +this.dateOfDropout);
        System.out.println("Remaining amount:" +remainingAmount);
    }
}


    
 
    
    
