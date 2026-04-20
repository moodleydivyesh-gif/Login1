Final POE part1 ReadMe by Divyesh Moodley ST10512534 Login1 java application is base on object orientated programming principals that involve validations for username ,password and South African cellphone numbers. The project also includes unit testing through Junit to ensure that all methods work correctly . the project structure com.mycompany.login1 • Login1.java //main logic • Mai.java // user inter • TestLogin1.java //Junit Testing

Username validation: • Must contain an underscore(_) • Must not be more than 5 characters long

Password Validation: Password must : • Be at least 8 characters long • Contain a capital letter • Contain a number • Contain a special character

Cell phone validation • Must follow South African format • “+27” and 9 digits after User registration: Returns : • Successful message if all inputs are valid • Error messages if any validation fails

Login system • Verifies the username and the password • Returns appropriate login message

Unit Testing (Junit) Involves the test classes TestLogin1.java Tests covered • Successful registration • Successful login • Failed login • Login message validation

To run the program open NetBeans ,ensure that the correct main class is set Com.mycompany.login1.Main Run the project and enter the username the password and the cell phone number to run the test right click project then right click Test and finally view the results in the test results window
