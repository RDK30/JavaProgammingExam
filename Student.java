class Student extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
        numCourses++;
    }

    public void printGrades() {
        System.out.println("Grades for " + getName() + ":");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return numCourses > 0 ? (double) sum / numCourses : 0;
    }

    public String toString() {
        return "Student: " + super.toString();
    }
}