/**
 * This class represents a Student and contains information about the student.
 * 
 * Author:Sahil Bista
 * Version 1.0
 */
public class Student{
    // instance variables creation
    private int enrollmentID;
    private int courseDuration;
    private String dateOfBirth;
    private String studentName;
    private String courseName;
    private String dateOfEnrollment;
    private double tuitionFee;
    
    // constructor initialization with respective parameters.
    /**
     * Constructs a new Student object with the specified parameters
     * 
     * @param dateOfBirth The date of birth of the student.
     * @param studentName The name of the student
     * @param courseDuration The duration of the course.
     * @param tuitionFee The tuition fee fot the course.
     * 
     * @throws IllegalArgumentException If the course duration or tuition fee is negative
       or if the date if birth is not in the correct format.
     * 
     * @version 1.0
     */
    public Student(String dateOfBirth, String studentName, int
                  courseDuration, double tuitionFee){//arguments
        this.enrollmentID = 0;
        this.courseDuration = courseDuration;
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.tuitionFee = tuitionFee;
        this.courseName = "";
        this.dateOfEnrollment = "";
    }
    
    //Accessor Method to access the instance varibales.
    /**
     * Returns the enrollment ID of the student
     * 
     * @return The enrollment ID.
     * 
     * @version 1.0
     */
    public int getEnrollmentID(){
        return enrollmentID;
    }
    
    /**
     * Returns the courseDuration for the student
     * 
     * @return The course Duration.
     * 
     * @version 1.0
     */
    public int getCourseDuration(){
        return courseDuration;
    }
    
    /**
     * Returns the Date Of Birth of the student.
     * 
     * @return The Date Of Birth.
     * 
     * @version 1.0
     */
    public String getDateofBirth(){
        return dateOfBirth;
    }
    
    /**
     * Returns the name of the student.
     * 
     * @return The Student Name.
     * 
     * @version 1.0
     */
    public String getStudentName(){
        return studentName;
    }
    
    /**
     * Returns the tuition fee of the course for the student
     * 
     * @return The tuition fee.
     * 
     * @version 1.0
     */
    public double getTuitionFee(){
        return tuitionFee;
    }
    
    /**
     * Returns the course Name of the course for the student
     * 
     * @return The Course Name.
     * 
     * @version 1.0
     */
    public String getCourseName(){
        return courseName;
    }
    
    /**
     * Returns the date of enrollment of the student
     * 
     * @return The date of enrollment.
     * 
     * @version 1.0
     */
    public String getDateofEnrollment(){
        return dateOfEnrollment;
    }
        
    //Mutator methods for instance variables
    /**
     * Sets the course name for the student.
     * 
     * @param newCourseName The new course name to be set.
     * 
     * @version 1.0
     */
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
     /**
     * Sets the course name for the student.
     * 
     * @param newCourseName The new course name to be set.
     * 
     * @version 1.0
     */
    public void setEnrollmentID(int enrollmentID){
        this.enrollmentID = enrollmentID;
    }
    
     /**
     * Sets the date of enrollment of the student.
     * 
     * @param dateOfEnrollment The date of Enrollment to be set.
     * 
     * @version 1.0
     */
    public void setDateOfEnrollment(String dateOfEnrollment){
        this.dateOfEnrollment = dateOfEnrollment;
    }
    
     /**
     * Sets the Date Of Birth for the student.
     * 
     * @param dateOfBirth The new Date Of Birth to be set.
     * 
     * @version 1.0
     */
    public void setDateofBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;// yo garepaci balla empty string create garna milxa in dropout class
    }
    
     /**
     * Sets the student name for the student.
     * 
     * @param studentName The new name to be set for the student.
     * 
     * @version 1.0
     */
    public void  setStudentName(String studentName){
        this.studentName = studentName;
    }
    
     /**
     * Sets the course Duration for the student.
     * 
     * @param courseDuration The course Duration to be set.
     * 
     * @version 1.0
     */
    public void setCourseDuration(int courseDuration){
        this.courseDuration = courseDuration;
    }
    
     /**
     * Sets the tution Fee for the student.
     * 
     * @param tuitionFee The new Tuition fee to be set for the student.
     * 
     * @version 1.0
     */
    public void   setTuitionFee(int tuitionFee){
        this.tuitionFee = tuitionFee;
    }
        
    //display method which helps to display all the details presented below.
    /**
     * Displays the information of the student.
     * 
     * If any of the required parameters is not set, it displays a message indicating that all parametrs have not beeen set
     * version 1.0 
     */
    public void display(){
        if(enrollmentID == 0|| courseName == ("")|| dateOfEnrollment == ("")){
            System.out.println("Not all parameters have been set");
        }else{
            System.out.println("Enrollment ID:"+enrollmentID);
            System.out.println("CourseDuration:"+courseDuration);
            System.out.println("Date of Birth:"+dateOfBirth);
            System.out.println("Course Name:"+ courseName);
            System.out.println("Student Name:"+studentName);
            System.out.println("Year enrolled:" +dateOfEnrollment);
            System.out.println("Tuition Fee:" +tuitionFee);
        }
    }
}
        

    
    
    
    
    
    
    
    
    
    
    
    
    
            
             

        
    
    


