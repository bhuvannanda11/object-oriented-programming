class P2_Course {
    // Instance variables
    private String courseName;
    private int duration;  // Duration in days
    private double fee;

    // Class variable (shared among all Course objects)
    private static String instituteName;

    // Constructor to initialize course details
    public P2_Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Setting the institute name initially
        P2_Course.updateInstituteName("Tech Institute");

        // Creating Course objects
        P2_Course course1 = new P2_Course("Java Programming", 30, 500.00);
        P2_Course course2 = new P2_Course("Data Structures", 45, 600.00);

        // Displaying course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        // Updating the institute name
        P2_Course.updateInstituteName("Advanced Tech Institute");

        // Displaying course details after updating the institute name
        System.out.println("Course 1 Details after Institute Name Update:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details after Institute Name Update:");
        course2.displayCourseDetails();
    }
}
