class Teacher extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            numCourses++;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            numCourses--;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
}