/**
 * This class represents a Regular (student) and contains information about the Regular students
 * This is a subclass of the super class Student.
 * 
 * Author:Sahil Bista
 * Version 1.0
 */
public class Regular extends Student {
    // instance variables:
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    
    //constructor creation with suitable parameters
    /**
     * Constructs a new Regular student object with the specified parameters.
     * 
     * The constructot initializes the Regular student object by calling the corresponding methods in the parent class,
     * setting the enrollmentID,course name and date Of Enrollment. It also initializes the specific attributes 
     * for Regular students,such as the number of modules,number of credit Hours,days Present and scholarship status.
     *
     * @param enrollmentID The enrollment ID of the student.
     * @param dateOfBirth The date of Birth of the student.
     * @param courseName The name of the course.
     * @param studentName The name of the student.
     * @param dateOfEnrollment The date of Enrollment of the students.
     * @param courseDuration The duration of the course in months.
     * @param tuitionFee The tuition fee for the course.
     * @param numOfModules The number of modules in the course.
     * @param numOfCreditHours The number of credit hours for the course.
     * @param daysPresent The number of days the student has been present.
    
     * 
     * @version1.0
     */
    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment,
                   int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent){
        super(dateOfBirth, studentName,courseDuration,tuitionFee);
        super.setEnrollmentID(enrollmentID);//parent class muttator methods call
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }
    
    //getter methods for Regular class fields
    /**
     * Returns the number of modules for the Regular student.
     * 
     * @return The number of modules.
     * 
     * @version 1.0
     */
    public int getNumOfModules() {
        return numOfModules;  
    }
    
    /**
     * Returns the number of Credit Hours for the Regular student.
     * 
     * @return The number of Credit Hours.
     * 
     * @version 1.0
     */
    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }
    
    /**
     * Returns the number of days presnet for the Regular student.
     * 
     * @return The number of days present.
     * 
     * @version 1.0
     */
    public double getDaysPresent() {
        return daysPresent;
    }
    
    /**
     * Returns the grating of scholarship for the Regular student.
     * 
     * @return The is Granted Scholarship.
     * 
     * @version 1.0
     */
    public boolean isIsGrantedscholarship() {
        return isGrantedScholarship;
    }
    
    /**
     * Calculates the present percentage of the Regular student.
     * Determines the grade and scholarship eligibility based on the presentPercentage
     * 
     * @param daysPresent The number of days the student has been present.
     * @return The grade of the student('A','B','C','D','E').
     * 
     * @version 1.0
     */
    public char presentPercentage(double daysPresent) {
        this.daysPresent=daysPresent;
    
        if(getCourseDuration()*30<daysPresent) {
            System.out.println("System error is causing the days present to be greater than the course Duration");
        }
        
        double presentPercentage = daysPresent/(super.getCourseDuration()*30)*100.0;
        System.out.println("Your total present days in percentage is " +presentPercentage);
        
        //return the grade based on presentPercentage
        if(presentPercentage >= 80 && presentPercentage <= 100) {
            isGrantedScholarship = true;
            return 'A';
        }else if(presentPercentage >= 60 && presentPercentage < 80) {
            return 'B';
        }else if(presentPercentage >= 40 && presentPercentage < 60) {
            return'C';
        }else if(presentPercentage >= 20 && presentPercentage < 40) {
            return'D';
        }else {
            return 'E';
        } 
    }
    
    /**
     * Grants the certificate to the student for the specified course, enrollmentID  and date of Enrollment
     * Displays a congratulations message for the graduation and indicates if the scholarship is granted.
     * 
     * @param courseName The name of the course.
     * @param enrollmentID The enrollment ID of the student
     * @param dateOfEnrollment The date of enrollment.
     * 
     * @version 1.0
     */
    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment){
        if(this.isGrantedScholarship == true) {
            //message for scholarship granted
            System.out.println("Heartfelt congratulations on your graduation: " + courseName + ", enrollmentID: " + enrollmentID + 
             ", dateOfEnrollment: " +dateOfEnrollment);
            System.out.println("The scholarship has been granted");
        }else {
            //message for graduation
            System.out.println("Heartfelt congratulations on your graduation: " + courseName + ", enrollmentID: " +enrollmentID+ 
            ", dateOfEnrollment:" +dateOfEnrollment);
        }
    }
    
    @Override// same signature 
    // to display information
    /**
     * Displays the information of the Regular student, including general student details,
     * number of modules, number of cerdit hours and the number of days present.
     * 
     * The method calls the display method in the parent class to display the genral student details,
     * prints the additional details specific to regular class students.
     * 
     * @version 1.0
     */
    public void display() {
        super.display();
        System.out.println("Number of modules:"+this.numOfModules);
        System.out.println("Number of Credit Hours:" +this.numOfCreditHours);
        System.out.println("Days present:"+this.daysPresent);
    }
}


    
    
    
         


