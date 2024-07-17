/**
* This class represents a Student and contains information about the student.
* 
* Author:Sahil Bista
* Version 1.0
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class StudentGUI implements ActionListener
{
    private JFrame frame1,frame2,frame3;
    private JLabel sName,enrollmenTID,cName,cDuration,tuitionFee,numberOfModules,numOfCreditHours,numOfDaysPresent/*sName2*/
            ,dateOFBirth,dateOFEnrollment,header,dropEnrollmentID,dropCName,dropSName,dropDOB,dropDOE,dropCourseDuration,
            dropTuitionFee,dropNumOfRemainingModules,dropNumOfMonthsAttended,dropDOD,dropRemAmount,image;
    private JTextField sNametf,enrollmentIDtf,cNametf,cDurationtf,tuitionFeetf,numofModtf,numofCreditHrstf,numofDaysPresenttf,
            enrollmentIDdf,cNamedf,sNamedf,cDurationdf,tuitionFee_df,numOfRemainingModulesdf,numOfMonthsAttendeddf,remAmountdf;
    private JComboBox<String> enrolledYearDrop,enrolledMonthDrop,enrolledDayDrop,birthYearDrop,birthMonthDrop,birthDayDrop,dropoutYearDrop
            ,dropoutMonthDrop,dropoutDayDrop,birthYearReg,birthMonthReg,birthDayReg,enrolledYearReg,enrolledMonthReg,enrolledDayReg;
    private JButton presentPercent,grantCertificates,display1,clear,payBills,removeDropouts,display2,clear2,regularStudents,dropoutStudents,
            homePage,home,addRegular,addDropout;
    private ImageIcon logo;
            
    //Arraylist creation of the student class
    ArrayList<Student> StudentsAL= new ArrayList<Student>();
    
    
    /**
    * Initializes the graphical user interface (GUI) for managing student data.
    * Creates frames, labels, buttons, text fields, and combo boxes for regular and dropout students.
    * Sets up event listeners, layouts, colors, and fonts for the components.
    *
    * @version 1.0
    */
    public StudentGUI()
    {
        frame1 = new JFrame("A GUI for the Student Data");
        frame2 = new JFrame("Regular Students");
        frame3 = new JFrame("Dropout Students");
        
        
        //Islington college logo addition in first frame
        logo = new ImageIcon(getClass().getResource("ingg.png"));
        image = new JLabel(logo);
        image.setBounds(0,0,700,400);
        
        
        //labels for regular students:
        sName = new JLabel("Student Name:");
        enrollmenTID = new JLabel("Enrollment ID:");
        cName = new JLabel("Course Name:");
        cDuration = new JLabel("Course Duration:");
        tuitionFee = new JLabel("Tuition Fee:");
        numberOfModules = new JLabel("Number Of Modules:");
        numOfCreditHours = new JLabel("Number Of Credit Hours:");
        numOfDaysPresent = new JLabel("Number Of Days Present:");
        dateOFBirth = new JLabel("Date Of Birth:");
        dateOFEnrollment = new JLabel("Date Of Enrollment:");
        
        
        //label for the main window
        header = new JLabel("Student Registration Form:");
        // Setting the new Font for the JLabel
        Font Heading = new Font("Montserrat", Font.BOLD, 20); 
        header.setFont(Heading);
        
        
        //labels for dropout students:
        dropEnrollmentID = new JLabel("Enrollment ID:");
        dropCName = new JLabel("Course Name:");
        dropSName = new JLabel("Student Name:");
        dropDOB = new JLabel("Date Of Birth:");
        dropDOE = new JLabel("Date OF Enrollment:");
        dropCourseDuration = new JLabel("Course Duration:");
        dropTuitionFee = new JLabel("Tuition Fee:");
        dropNumOfRemainingModules = new JLabel("Number Of Remaining Modules:");
        dropNumOfMonthsAttended = new JLabel("Number Of Months Attended:");
        dropDOD = new JLabel("Date Of Droupout:");
        dropRemAmount = new JLabel("Remaining Amount:");
        
        
        // Text fields for regular students:
        sNametf = new JTextField();
        enrollmentIDtf = new JTextField();
        cNametf = new JTextField();
        cDurationtf = new JTextField();
        tuitionFeetf = new JTextField();
        numofModtf = new JTextField();
        numofCreditHrstf = new JTextField();
        numofDaysPresenttf = new JTextField();
        
        
        //text fields for dropout students:
        enrollmentIDdf = new JTextField();
        cNamedf = new JTextField();
        sNamedf = new JTextField();
        cDurationdf = new JTextField();
        tuitionFee_df = new JTextField();
        numOfRemainingModulesdf = new JTextField();
        numOfMonthsAttendeddf = new JTextField();
        remAmountdf = new JTextField();
        
        
        //buttons for the first frame
        regularStudents = new JButton("Regular Students");
        dropoutStudents = new JButton("Dropout Students");
        
        
        //buttons for regular students:
        presentPercent = new JButton("Present Percentage");
        grantCertificates = new JButton("Grant Certificate");
        display1 = new JButton("Display");
        clear = new JButton("Clear");
        homePage = new JButton("home page");
        addRegular = new JButton("Add student");
        
        
        //buttons for dropout students
        payBills = new JButton("Pay bills");
        removeDropouts = new JButton("Remove Dropout");
        display2 = new JButton("Display");
        clear2 = new JButton("Clear");
        home = new JButton("home page");
        addDropout = new JButton("Add student");
        
        
        //comboboxes for dropout students interface:
        String[]EnrolledYear = {"2020","2021","2022","2023","2024"};
        enrolledYearDrop = new JComboBox <String> (EnrolledYear);
        
        String[]EnrolledMonth = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        enrolledMonthDrop = new JComboBox <String> (EnrolledMonth);
        
        String[]EnrolledDay = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        enrolledDayDrop = new JComboBox <String> (EnrolledDay);
        
        String[]BirthYear = {"2000","2001","2002","2003","2004","2005"};
        birthYearDrop = new JComboBox <String> (BirthYear);
        
        String[]BirthMonth = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        birthMonthDrop = new JComboBox <String> (BirthMonth);
        
        String[]BirthDay = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        birthDayDrop = new JComboBox <String> (BirthDay);
        
        String[]DropoutYear = {"2020","2021","2022","2023","2024"};
        dropoutYearDrop = new JComboBox <String> (DropoutYear);
        
        String[]DropoutMonth = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        dropoutMonthDrop = new JComboBox <String> (DropoutMonth);
        
        String[]DropoutDay = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        dropoutDayDrop = new JComboBox <String> (DropoutDay);
        
        
        
        
        // Comboboxes for regular students interface
        String[]birthYear = {"2000","2001","2002","2003","2004","2005"};
        birthYearReg = new JComboBox <String>(BirthYear);
        
        String[]birthMonth = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        birthMonthReg = new JComboBox <String> (BirthMonth);
        
        String[]birthDay = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        birthDayReg = new JComboBox <String>(BirthDay);
        
        String[]enrolledYear = {"2020","2021","2022","2023","2024"};
        enrolledYearReg = new JComboBox<String>(EnrolledYear);
        
        String[]enrolledMonth = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        enrolledMonthReg = new JComboBox <String>(EnrolledMonth);
        
        String[]enrolledDay = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        enrolledDayReg = new JComboBox<String> (EnrolledDay);
        
        
        
        
        //Set bounds for the first frame:
        regularStudents.setBounds(166,350,180,32);
        dropoutStudents.setBounds(359,350,180,32);

        
        // set Bounds for regular students:   
        sName.setBounds(13,241,100,28);
        sNametf.setBounds(120,241,164,28);
        enrollmenTID.setBounds(339, 49, 120, 23);
        enrollmentIDtf.setBounds(460, 49, 90, 23);
        cName.setBounds(13,93,153,26);
        cNametf.setBounds(170,93,159,26);
        cDuration.setBounds(13,283,100,29);//
        cDurationtf.setBounds(120,283,164,29);
        tuitionFee.setBounds(566,327,232,32);
        tuitionFeetf.setBounds(746,327,97,32);
        numberOfModules.setBounds(13,326,150,31);
        numofModtf.setBounds(155,327,140,32);
        numOfCreditHours.setBounds(561,282,232,32);
        numofCreditHrstf.setBounds(746,281,170,32);
        numOfDaysPresent.setBounds(561,93,205,26);
        numofDaysPresenttf.setBounds(746,93,136,26);
        dateOFBirth.setBounds(561,241,180,28);
        enrolledYearReg.setBounds(171,130,63,26);
        enrolledMonthReg.setBounds(234,130,52,26);
        enrolledDayReg.setBounds(286,130,52,26);
        dateOFEnrollment.setBounds(13,130,153,26);
        birthYearReg.setBounds(746,241,62,28);
        birthMonthReg.setBounds(808,241,52,28);
        birthDayReg.setBounds(860,241,53,28);
        header.setBounds(225,40,400,30);
        presentPercent.setBounds(700,130,200,32);
        grantCertificates.setBounds(13,167,200,32);
        display1.setBounds(230,394,120,32);
        clear.setBounds(570,394,120,32);
        homePage.setBounds(5,449,150,26);
        addRegular.setBounds(400,394,120,32);
        
        
        //set Bounds for dropouts
        dropEnrollmentID.setBounds(269,51,100,25);
        enrollmentIDdf.setBounds(375,51,90,25);
        dropCName.setBounds(8,202,121,32);
        cNamedf.setBounds(138,202,126,32);
        dropSName.setBounds(8,153,121,32);
        sNamedf.setBounds(138,153,126,32);
        dropDOB.setBounds(520,153,153,32);
        birthYearDrop.setBounds(642,153,63,26);
        birthMonthDrop.setBounds(705,153,52,26);
        birthDayDrop.setBounds(758,153,52,26);
        dropDOE.setBounds(520,202,149,32);
        enrolledYearDrop.setBounds(643,202,63,26);
        enrolledMonthDrop.setBounds(706,202,52,26);
        enrolledDayDrop.setBounds(758,202,52,26);
        dropCourseDuration.setBounds(274,202,130,32);
        cDurationdf.setBounds(400,202,100,32);
        dropTuitionFee.setBounds(8,251,121,32);
        tuitionFee_df.setBounds(138,251,126,32);
        dropNumOfRemainingModules.setBounds(520,251,187,32);
        numOfRemainingModulesdf.setBounds(720,251,100,32);
        dropNumOfMonthsAttended.setBounds(8,300,190,32);
        numOfMonthsAttendeddf.setBounds(200,300,60,32);
        dropDOD.setBounds(520,300,146,32);
        dropoutYearDrop.setBounds(642,300,63,26);
        dropoutMonthDrop.setBounds(705,300,52,26);
        dropoutDayDrop.setBounds(758,300,52,26);
        payBills.setBounds(200,96,200,32);
        removeDropouts.setBounds(427,96,200,32);
        display2.setBounds(200,356,120,32);
        addDropout.setBounds(350,356,120,32);
        clear2.setBounds(500,356,120,32);
        home.setBounds(5,400,150,32);
        dropRemAmount.setBounds(275,153,153,32);
        remAmountdf.setBounds(400,153,100,32);
        
        
        //adding comopinents to frame 1
        frame1.add(regularStudents);
        frame1.add(dropoutStudents);
        frame1.add(header);
        frame1.add(image);
        
        
        //adding components to frame 2
        frame2.add(sName);
        frame2.add(enrollmenTID);
        frame2.add(cName);
        frame2.add(cDuration);
        frame2.add(tuitionFee);
        frame2.add(numberOfModules);
        frame2.add(numOfCreditHours);
        frame2.add(numOfDaysPresent);
        frame2.add(dateOFBirth);
        frame2.add(dateOFEnrollment);
        frame2.add(sNametf);
        frame2.add(enrollmentIDtf);
        frame2.add(cNametf);
        frame2.add(cDurationtf);
        frame2.add(tuitionFeetf);
        frame2.add(numofModtf);
        frame2.add(numofCreditHrstf);
        frame2.add(numofDaysPresenttf);
        frame2.add(birthYearReg);
        frame2.add(birthMonthReg);
        frame2.add(birthDayReg);
        frame2.add(enrolledYearReg);
        frame2.add(enrolledMonthReg);
        frame2.add(enrolledDayReg);
        frame2.add(presentPercent);
        frame2.add(grantCertificates);
        frame2.add(display1);
        frame2.add(clear);
        frame2.add(homePage);
        frame2.add(addRegular);
        
        //adding components to frame3
        frame3.add(dropEnrollmentID);
        frame3.add(dropCName);
        frame3.add(dropSName);
        frame3.add(dropDOB);
        frame3.add(dropDOE);
        frame3.add(dropCourseDuration);
        frame3.add(dropTuitionFee);
        frame3.add(dropNumOfRemainingModules);
        frame3.add(dropNumOfMonthsAttended);
        frame3.add(dropDOD);
        frame3.add(enrollmentIDdf);
        frame3.add(cNamedf);
        frame3.add(sNamedf);
        frame3.add(cDurationdf);
        frame3.add(tuitionFee_df);
        frame3.add(numOfRemainingModulesdf);
        frame3.add(numOfMonthsAttendeddf);
        frame3.add(enrolledYearDrop);
        frame3.add(enrolledMonthDrop);
        frame3.add(enrolledDayDrop);
        frame3.add(birthYearDrop);
        frame3.add(birthMonthDrop);
        frame3.add(birthDayDrop);
        frame3.add(dropoutYearDrop);
        frame3.add(dropoutMonthDrop);
        frame3.add(dropoutDayDrop);
        frame3.add(payBills);
        frame3.add(removeDropouts);
        frame3.add(display2);
        frame3.add(clear2);
        frame3.add(home);
        frame3.add(addDropout);
        frame3.add(remAmountdf);
        frame3.add(dropRemAmount);
        
        //adding action listeners for buttons
        regularStudents.addActionListener(this);
        dropoutStudents.addActionListener(this);
        presentPercent.addActionListener(this);
        grantCertificates.addActionListener(this);
        display1.addActionListener(this);
        clear.addActionListener(this);
        payBills.addActionListener(this);
        removeDropouts.addActionListener(this);
        display2.addActionListener(this);
        clear2.addActionListener(this);
        grantCertificates.addActionListener(this);
        homePage.addActionListener(this);
        home.addActionListener(this);
        addRegular.addActionListener(this);
        addDropout.addActionListener(this);
        
        //Making frame1 visible
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setSize(739,455);
        frame1.setVisible(true);
        
        
        Color ButtonColor = new Color(0, 255, 255); 
         //Using color class to create a new color:cyan using RGB values
        presentPercent.setBackground(ButtonColor);
        grantCertificates.setBackground(ButtonColor);
        display1.setBackground(ButtonColor);
        clear.setBackground(ButtonColor);
        payBills.setBackground(ButtonColor);
        removeDropouts.setBackground(ButtonColor);
        display2.setBackground(ButtonColor);
        clear2.setBackground(ButtonColor);
        addRegular.setBackground(ButtonColor);
        addDropout.setBackground(ButtonColor);
        home.setBackground(ButtonColor);
        homePage.setBackground(ButtonColor);
        regularStudents.setBackground(ButtonColor);
        dropoutStudents.setBackground(ButtonColor);
        

        Color frameBackgroundColor = new Color(255, 192, 203); 
        // Pink color for the frames' background
        frame2.getContentPane().setBackground(frameBackgroundColor);
        frame3.getContentPane().setBackground(frameBackgroundColor);
        frame1.getContentPane().setBackground(frameBackgroundColor);


        Color TextFieldColor = new Color(255, 253, 208); 
        // Creamy  color for textfields
        sNametf.setBackground(TextFieldColor);
        enrollmentIDtf.setBackground(TextFieldColor);
        cNametf.setBackground(TextFieldColor);
        cDurationtf.setBackground(TextFieldColor);
        tuitionFeetf.setBackground(TextFieldColor);
        numofModtf.setBackground(TextFieldColor);
        numofCreditHrstf.setBackground(TextFieldColor);
        numofDaysPresenttf.setBackground(TextFieldColor);
        enrollmentIDdf.setBackground(TextFieldColor);
        cNamedf.setBackground(TextFieldColor);
        sNamedf.setBackground(TextFieldColor); 
        cDurationdf.setBackground(TextFieldColor);
        tuitionFee_df.setBackground(TextFieldColor);
        numOfRemainingModulesdf.setBackground(TextFieldColor);
        numOfMonthsAttendeddf.setBackground(TextFieldColor);
        remAmountdf.setBackground(TextFieldColor);

        
        Font Button_Font = new Font("Arial", Font.BOLD, 14);
        //Increasing the font size by a bit and changing the font using Font class from AWT package for buttons
        presentPercent.setFont(Button_Font);
        grantCertificates.setFont(Button_Font);
        display1.setFont(Button_Font);
        clear.setFont(Button_Font);
        payBills.setFont(Button_Font);
        removeDropouts.setFont(Button_Font);
        display2.setFont(Button_Font);
        clear2.setFont(Button_Font);
        addRegular.setFont(Button_Font);
        addDropout.setFont(Button_Font);
        home.setFont(Button_Font);
        homePage.setFont(Button_Font);
        regularStudents.setFont(Button_Font);
        dropoutStudents.setFont(Button_Font);
  
  
        Font Label_Font = new Font("Montserrat", Font.BOLD, 12);
        //Increasing the font size by a bit and changing the font using Font class from AWT package for JLabels
        sName.setFont(Label_Font );
        enrollmenTID.setFont(Label_Font );
        cName.setFont(Label_Font );
        cDuration.setFont(Label_Font );
        tuitionFee.setFont(Label_Font );
        numberOfModules.setFont(Label_Font );
        numOfCreditHours.setFont(Label_Font );
        numOfDaysPresent.setFont(Label_Font );
        dateOFBirth.setFont(Label_Font );
        dateOFEnrollment.setFont(Label_Font );
        dropEnrollmentID.setFont(Label_Font );
        dropCName.setFont(Label_Font );
        dropSName.setFont(Label_Font );
        dropDOB.setFont(Label_Font );
        dropDOE.setFont(Label_Font );
        dropCourseDuration.setFont(Label_Font );
        dropTuitionFee.setFont(Label_Font );
        dropNumOfRemainingModules.setFont(Label_Font );
        dropNumOfMonthsAttended.setFont(Label_Font );
        dropDOD.setFont(Label_Font );
    }
    
    /**
    * Responds to user actions on various buttons by performing corresponding actions.
    * Handles button clicks for opening frames, clearing fields, calculating percentages,
    * granting certificates, paying bills, removing students, and adding students.
    *
    * @param e The ActionEvent object representing the user's action.
    */
   
    @Override  
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == regularStudents){
            //This button is used to open the frame2 of regular students
            frame2.setLayout(null);
            frame2.setSize(944,550);
            frame2.setVisible(true);
            frame1.dispose();
            
        }
        else if(e.getSource() == dropoutStudents){
            //This button is used to open the frame3 of dropout students
            frame3.setLayout(null);
            frame3.setSize(860,500);
            frame3.setVisible(true);
            frame1.dispose();
            
        }
        else if(e.getSource() == clear){
            //This button is used to clear all text fields of regular students
            sNametf.setText("");
            enrollmentIDtf.setText("");
            cNametf.setText("");
            cDurationtf.setText("");
            tuitionFeetf.setText("");
            numofModtf.setText("");
            numofCreditHrstf.setText("");
            numofDaysPresenttf.setText("");
            
            JOptionPane.showMessageDialog(frame2,"All fields set to empty","INFO",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == clear2){
            //This button is used to clear all text fields of droput students
            enrollmentIDdf.setText("");
            cNamedf.setText("");
            sNamedf.setText("");
            cDurationdf.setText("");
            tuitionFee_df.setText("");
            numOfRemainingModulesdf.setText("");
            numOfMonthsAttendeddf.setText("");
            remAmountdf.setText("");
            
            JOptionPane.showMessageDialog(frame3,"All fields set to empty","Information",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == homePage){
            //This button takes the user back to frame1 from regular students interface
            frame1.setLayout(null);
            frame1.setSize(739,455);
            frame1.setVisible(true);
            frame2.dispose();
            frame3.dispose();
            
        }
        else if(e.getSource() == home){
            //This button takes the user back to frame1 from droput students interface
            frame1.setLayout(null);
            frame1.setSize(739,455);
            frame1.setVisible(true);
            frame2.dispose();
            frame3.dispose();
            
            
        }
        else if(e.getSource() == grantCertificates){
            if(enrollmentIDtf.getText().isEmpty() || cNametf.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame2,"The fields Enrollment ID, Date of Enrollment and Course Name must all be filled to use this button","Empty fields Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                //try catch to catch number format exception 
                try{
                    //extracting the values from text fields to store them in the parent class variables
                    int enrollmentID = Integer.parseInt(enrollmentIDtf.getText());
                    String courseName = cNametf.getText();
                    String REnrolledYear = (String) enrolledYearReg.getSelectedItem();
                    String REnrolledMonth = (String) enrolledMonthReg.getSelectedItem();
                    String REnrolledDay = (String) enrolledDayReg.getSelectedItem();
                    String dateOfEnrollment = REnrolledYear + "/" + REnrolledMonth + "/" + REnrolledDay;
                    
                    boolean Certificate = true;
                    
                    //Iterating throught the studenyt class' ArrayList
                    for(Student j:StudentsAL){
                        //checking if the object belongs to Regular class
                        if(j instanceof Regular){
                            //Typecasting of the regular class
                            Regular certification = (Regular) j;
                            //checking if the student already exists
                            if(enrollmentID == (certification.getEnrollmentID())){
                                Certificate = true;
                                //calling the grantCertificate() method from the Regular class
                                certification. grantCertificate(courseName, enrollmentID,dateOfEnrollment);
                                JOptionPane.showMessageDialog(frame2,"Certificate has been granted to the student","information",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    if(Certificate = false){
                        JOptionPane.showMessageDialog(frame2,"The enrollment ID doesnot match with the Id of a regular student","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException s){
                    JOptionPane.showMessageDialog(frame3,"Invalid input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource() ==  presentPercent){
            //button for calculating the presentPercentage of the regular students
            if(enrollmentIDtf.getText().isEmpty()||numofDaysPresenttf.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame2,"The fields Enrollment ID and Number of Days present must be filled to use this button","Empty Fileds Alert",JOptionPane.WARNING_MESSAGE);
            }else{
                try{
                    int enrollmentID = Integer.parseInt(enrollmentIDtf.getText());
                    int daysPresent = Integer.parseInt(numofDaysPresenttf.getText());
                    
                    boolean pass = true;
                    for(Student c:StudentsAL){
                        if(c instanceof Regular){
                            Regular ppCalculation = (Regular) c;
                            if(enrollmentID == (ppCalculation.getEnrollmentID())){
                                pass = true;
                                //calling of the presentPercentage(double daysPresent) method from the Regular class
                                ppCalculation.presentPercentage(daysPresent);
                                JOptionPane.showMessageDialog(frame2,"Present percentage has been calculated","information",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                    if(pass = false){
                        JOptionPane.showMessageDialog(frame3,"The enrollment ID doesnot match with the Id of a regular student","Error",JOptionPane.ERROR_MESSAGE);
                    } 
                }
                catch(NumberFormatException x){
                    JOptionPane.showMessageDialog(frame3,"Invalid input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource() == payBills){
            //method to pay the vills for the droput students
            if(enrollmentIDdf.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame3,"The field Enrollment ID must be filled to use this button","Empty Fileds Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    int enrollmentID = Integer.parseInt(enrollmentIDdf.getText());
                    boolean money = true;
                    for(Student v:StudentsAL){
                        if(v instanceof Dropout){
                            Dropout bills = (Dropout) v;
                            //calling method billsPayable() from dropout class
                            bills.billsPayable();
                            JOptionPane.showMessageDialog(frame2,"The bill has been paid","Information",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    if(money == false){
                        JOptionPane.showMessageDialog(frame3,"The enrollment ID doesnot match with the Id of a dropout student","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException u){
                    JOptionPane.showMessageDialog(frame3,"Invalid input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }   
        else if(e.getSource() == removeDropouts){
            if (StudentsAL.isEmpty()){
                JOptionPane.showMessageDialog(frame3,"The arraylist is already emptied","info",JOptionPane.INFORMATION_MESSAGE);
                
            }
            else{
                //method to remove The Dropout student
                try{
                    int enrollmentID = Integer.parseInt(enrollmentIDdf.getText());
                    boolean Drop = true;
                    for (Student a:StudentsAL){
                        if(a instanceof Dropout){
                            Dropout remove = (Dropout) a;
                            if(enrollmentID == (remove.getEnrollmentID())){
                                Drop = true;
                                //Calling of the removeStudent() method from parent class
                                remove.removeStudent();
                                StudentsAL.remove(remove);
                                JOptionPane.showMessageDialog(frame3,"The student has been removed","Information",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                Drop = false;
                            }
                        }
                    }
                    if(Drop = false){
                        JOptionPane.showMessageDialog(frame3,"The enrollment ID is not valid for dropout student","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(frame3,"Incorrect input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }else if(e.getSource() == addRegular){
            //method to add a regular student to the arrayList
            if(enrollmentIDtf.getText().isEmpty() || sNametf.getText().isEmpty() || cNametf.getText().isEmpty() || cDurationtf.getText().isEmpty()
               || tuitionFeetf.getText().isEmpty() || numofModtf.getText().isEmpty() || numofCreditHrstf.getText().isEmpty() ||
                numofDaysPresenttf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame2,"All fields must be entered to use this button","Empty fields Alert",JOptionPane.WARNING_MESSAGE);
                }
            else{
                try{
                    int enrollmentID = Integer.parseInt(enrollmentIDtf.getText());
                    String studentName = sNametf.getText();
                    String courseName = cNametf.getText();
                    int courseDuration = Integer.parseInt(cDurationtf.getText());
                    int tuitionFee = Integer.parseInt(tuitionFeetf.getText());
                    int numOfModules = Integer.parseInt(numofModtf.getText());
                    int numOfCreditHours = Integer.parseInt(numofCreditHrstf.getText());
                    double daysPresent = Double.parseDouble(numofDaysPresenttf.getText());
                    String RBirthYear = (String) birthYearReg.getSelectedItem();
                    String RBirthMonth = (String) birthMonthReg.getSelectedItem();
                    String RBirthDay = (String) birthDayReg.getSelectedItem();
                    String REnrolledYear = (String) enrolledYearReg.getSelectedItem();
                    String REnrolledMonth = (String) enrolledMonthReg.getSelectedItem();
                    String REnrolledDay = (String) enrolledDayReg.getSelectedItem();
                 
                    String dateOfBirth = RBirthYear + "/" + RBirthMonth + "/" + RBirthDay;
                    String dateOfEnrollment = REnrolledYear + "/" + REnrolledMonth + "/" + REnrolledDay;
                    
                    boolean regulars=true;
                    if (StudentsAL.isEmpty()){
                        Regular reg=new Regular(enrollmentID , dateOfBirth, courseName, studentName, dateOfEnrollment,
                        courseDuration,tuitionFee, numOfModules, numOfCreditHours, daysPresent);
                        //Adding object of Regular class to the ArrayList
                        StudentsAL.add(reg);
                        JOptionPane.showMessageDialog(frame2,"Student added","Information Message",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        for(Student x: StudentsAL)
                        {
                            if(x instanceof Regular){
                                Regular always = (Regular) x;
                                if (enrollmentID == (always.getEnrollmentID()))
                                {
                                    regulars = false;
                                }
                            }
                        }
                        if(regulars == true)
                        {
                            Regular regs = new Regular(enrollmentID , dateOfBirth, courseName, studentName, dateOfEnrollment,
                            courseDuration,tuitionFee, numOfModules, numOfCreditHours, daysPresent);
                            StudentsAL.add(regs);
                    
                            JOptionPane.showMessageDialog(frame2,"Student added","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(frame2,"Student already exits","Error Message",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(frame2,"Incorrect input","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource() == addDropout){
            //method to add Dropout students to the arraylist
            if(enrollmentIDdf.getText().isEmpty() || sNamedf.getText().isEmpty() || cNamedf.getText().isEmpty() || cDurationdf.getText().isEmpty()
            || tuitionFee_df.getText().isEmpty() || numOfRemainingModulesdf.getText().isEmpty() || numOfMonthsAttendeddf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame2,"All fields must be entered to use this button","Empty Fields Alert",JOptionPane.WARNING_MESSAGE);
            }
            try{
                int enrollmentID = Integer.parseInt(enrollmentIDdf.getText());
                String studentName = sNamedf.getText();
                String courseName = cNamedf.getText();
                int courseDuration = Integer.parseInt(cDurationdf.getText());
                int tuitionFee = Integer.parseInt(tuitionFee_df.getText());
                int numOfRemainingModules = Integer.parseInt(numOfRemainingModulesdf.getText());
                int numOfMonthsAttended = Integer.parseInt(numOfMonthsAttendeddf.getText());
                String DEnrolledYear = (String) enrolledYearDrop.getSelectedItem();
                String DEnrolledMonth = (String) enrolledMonthDrop.getSelectedItem();
                String DEnrolledDay = (String) enrolledDayDrop.getSelectedItem();
                String DBirthYear = (String) birthYearDrop.getSelectedItem();
                String DBirthMonth = (String) birthMonthDrop.getSelectedItem();
                String DBirthDay = (String) birthDayDrop.getSelectedItem();
                String DDropoutYear = (String) dropoutYearDrop.getSelectedItem();
                String DDropoutMonth = (String) dropoutMonthDrop.getSelectedItem();
                String DDropoutDay = (String) dropoutDayDrop.getSelectedItem();
                    
                String dateOfBirth = DBirthYear + "/" + DBirthMonth + "/" + DBirthDay;
                String dateOfDropout = DDropoutYear + "/" + DDropoutMonth + "/" + DDropoutDay;
                String dateOfEnrollment = DEnrolledYear + "/" + DEnrolledMonth + "/" + DEnrolledDay;
                    
                    
                boolean drops = true;
                if (StudentsAL.isEmpty()){
                    if(courseDuration != numOfMonthsAttended){
                        JOptionPane.showMessageDialog(frame3,"Course duration must be equal to the number of months attended in order to pay the bills later","Info_",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        Dropout drop=new Dropout(enrollmentID, courseName,dateOfEnrollment,dateOfBirth, studentName, courseDuration,tuitionFee, numOfRemainingModules, numOfMonthsAttended,dateOfDropout);
                        //Adding object of dropout class to the ArrayList
                    
                        StudentsAL.add(drop);
                        JOptionPane.showMessageDialog(frame3,"Student added","Information Message",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    for (Student b:StudentsAL){
                        if(b instanceof Dropout){
                            Dropout never = (Dropout) b;
                            if(enrollmentID == (never.getEnrollmentID())){
                                drops = false;
                            }
                        }
                    }
                    if(drops == true){
                        Dropout dropz= new Dropout(enrollmentID,courseName, dateOfEnrollment,dateOfBirth, studentName, courseDuration,tuitionFee, numOfRemainingModules, numOfMonthsAttended,dateOfDropout);
                        StudentsAL.add(dropz);
                        
                        JOptionPane.showMessageDialog(frame3,"Student added","Information Message",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(frame3,"Student already exits","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }catch(NumberFormatException v){
                JOptionPane.showMessageDialog(frame3,"Incorrect input","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == display1){
            if(enrollmentIDtf.getText().isEmpty() || sNametf.getText().isEmpty() || cNametf.getText().isEmpty() || cDurationtf.getText().isEmpty()
               || tuitionFeetf.getText().isEmpty() || numofModtf.getText().isEmpty() || numofCreditHrstf.getText().isEmpty() ||
                numofDaysPresenttf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame2,"All fields must be entered to use this button","Empty fields Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                //method to diaplay the informatoin of the regular students
                if(StudentsAL.isEmpty()){
                    JOptionPane.showMessageDialog(frame2,"No items to display");
                }
                else{
                    for(Student z: StudentsAL){
                        if (z instanceof Regular){
                            Regular Rdisplay = (Regular) z;
                            //Calling of the dipslay() method from the Regular class
                            Rdisplay.display();
                            JOptionPane.showMessageDialog(frame2,"The message is being displayed in the terminal/ command prompt","Information_message",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(frame2,"The student belongs to dropout class","Information_message",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }  
            }
        }
        else if(e.getSource() == display2){
            if(enrollmentIDdf.getText().isEmpty() || sNamedf.getText().isEmpty() || cNamedf.getText().isEmpty() || cDurationdf.getText().isEmpty()
            || tuitionFee_df.getText().isEmpty() || numOfRemainingModulesdf.getText().isEmpty() || numOfMonthsAttendeddf.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame3,"All fields must be entered to use this button","Empty Fields Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                //method to display the information of the dropout students
                if(StudentsAL.isEmpty()){
                    JOptionPane.showMessageDialog(frame3,"No items to display");
                }
                else{
                    for(Student d: StudentsAL){
                        if (d instanceof Dropout){
                            Dropout Odisplay = (Dropout) d;
                            //Calling of the dipslay() method from the dropout class
                            Odisplay.display();
                            JOptionPane.showMessageDialog(frame3,"The message is being displayed in the terminal/ command prompt","Information_message",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(frame3,"The student belongs to regular class","Information_message",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        }
    }
    
    /**
    * Entry point of the application.
    * Initializes the graphical user interface (GUI) for managing student information.
    * Creates an instance of the StudentGUI class to display the application interface.
    *
    */
    public static void main(String[]args){
        new StudentGUI();
    }
    }