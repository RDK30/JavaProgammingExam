import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mohon masukkan nama siswa dan alamat:");
        String studentName = scanner.nextLine();
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        System.out.println("Silakan masukkan jumlah kursus (harus bilangan bulat):");
        int numCoursesStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCoursesStudent; i++) {
            System.out.println("Tulis nama kursus dan nilai:");
            String course = scanner.nextLine();
            int grade = Integer.parseInt(scanner.nextLine());
            student.addCourseGrade(course, grade);
        }
        
        student.printGrades();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());

        System.out.println("\nMohon masukkan nama guru dan alamat:");
        String teacherName = scanner.nextLine();
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        System.out.println("Mohon masukkan jumlah kursus yang ingin ditambahkan untuk guru:");
        int numCoursesTeacher = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCoursesTeacher; i++) {
            System.out.println("Silakan tulis nama kursus yang ingin ditambahkan:");
            String course = scanner.nextLine();
            boolean added = teacher.addCourse(course);
            if (!added) {
                System.out.println("Kursus sudah ada sebelumnya.");
            }
        }

        System.out.println("Mohon masukkan jumlah kursus yang akan dihapus dari daftar guru:");
        int numCoursesToRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCoursesToRemove; i++) {
            System.out.println("Tulis nama kursus yang akan dihapus:");
            String course = scanner.nextLine();
            boolean removed = teacher.removeCourse(course);
            if (!removed) {
                System.out.println("Kursus tidak ditemukan dalam daftar.");
            }
        }

        System.out.println(student);
        System.out.println(teacher);

        scanner.close();
    }
}
