package test;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Person {
    protected String name;
    protected int birthYear;
    protected String placeOfBirth;
    protected String address;

    // Constructors
    public Person() {}

    public Person(String name, int birthYear, String placeOfBirth, String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.placeOfBirth = placeOfBirth;
        this.address = address;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public String getPlaceOfBirth() { return placeOfBirth; }
    public void setPlaceOfBirth(String placeOfBirth) { this.placeOfBirth = placeOfBirth; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Input and Output Methods
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter place of birth: ");
        this.placeOfBirth = scanner.nextLine();
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Place of Birth: " + placeOfBirth);
        System.out.println("Address: " + address);
    }
}

class Teacher extends Person {
    private int startYear;
    private String specialty;

    // Constructors
    public Teacher() {}

    public Teacher(String name, int birthYear, String placeOfBirth, String address, int startYear, String specialty) {
        super(name, birthYear, placeOfBirth, address);
        this.startYear = startYear;
        this.specialty = specialty;
    }

    // Getters and Setters
    public int getStartYear() { return startYear; }
    public void setStartYear(int startYear) { this.startYear = startYear; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    // Calculate teaching experience
    public int getYearsOfTeaching() {
        return Calendar.getInstance().get(Calendar.YEAR) - startYear;
    }

    // Input and Output Methods
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start year: ");
        this.startYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter specialty: ");
        this.specialty = scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Start Year: " + startYear);
        System.out.println("Specialty: " + specialty);
    }
}

class Student extends Person {
    private float mathScore;
    private float literatureScore;
    private float foreignLanguageScore;

    // Constructors
    public Student() {}

    public Student(String name, int birthYear, String placeOfBirth, String address, float mathScore, float literatureScore, float foreignLanguageScore) {
        super(name, birthYear, placeOfBirth, address);
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.foreignLanguageScore = foreignLanguageScore;
    }

    // Getters and Setters
    public float getMathScore() { return mathScore; }
    public void setMathScore(float mathScore) { this.mathScore = mathScore; }

    public float getLiteratureScore() { return literatureScore; }
    public void setLiteratureScore(float literatureScore) { this.literatureScore = literatureScore; }

    public float getForeignLanguageScore() { return foreignLanguageScore; }
    public void setForeignLanguageScore(float foreignLanguageScore) { this.foreignLanguageScore = foreignLanguageScore; }

    // Calculate average score
    public float getAverageScore() {
        return (mathScore + literatureScore + foreignLanguageScore) / 3;
    }

    // Input and Output Methods
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Math score: ");
        this.mathScore = scanner.nextFloat();
        System.out.print("Enter Literature score: ");
        this.literatureScore = scanner.nextFloat();
        System.out.print("Enter Foreign Language score: ");
        this.foreignLanguageScore = scanner.nextFloat();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Math Score: " + mathScore);
        System.out.println("Literature Score: " + literatureScore);
        System.out.println("Foreign Language Score: " + foreignLanguageScore);
    }

    // Determine the student's grade based on the average score
    public String getGrade() {
        float average = getAverageScore();
        if (average < 5) return "Weak";
        if (average < 7) return "Average";
        if (average < 8) return "Good";
        if (average < 9) return "Excellent";
        return "Outstanding";
    }
}

public class BT {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        // Example input - In real applications, you would read this from a file or other sources
        teachers.add(new Teacher("John Doe", 1980, "Hanoi", "123 Street", 2010, "Natural Sciences"));
        teachers.add(new Teacher("Jane Smith", 1975, "Ho Chi Minh City", "456 Avenue", 2005, "Social Sciences"));
        students.add(new Student("Alice", 2005, "Da Nang", "789 Road", 8.0f, 7.5f, 9.0f));
        students.add(new Student("Bob", 2006, "Hue", "321 Lane", 6.0f, 5.5f, 7.0f));

        // Calculate years of teaching for each teacher
        for (Teacher teacher : teachers) {
            System.out.println("Teacher: " + teacher.getName() + " has " + teacher.getYearsOfTeaching() + " years of teaching experience.");
        }

        // Find teacher with the highest seniority
        Teacher maxSeniorityTeacher = findTeacherWithMaxSeniority(teachers);
        System.out.println("Teacher with the highest seniority: " + (maxSeniorityTeacher != null ? maxSeniorityTeacher.getName() : "None"));

        // Find teachers with more than 5 years of experience in natural sciences
        List<Teacher> experiencedNaturalScienceTeachers = findExperiencedNaturalScienceTeachers(teachers);
        System.out.println("Teachers with more than 5 years of experience in Natural Sciences:");
        for (Teacher teacher : experiencedNaturalScienceTeachers) {
            System.out.println(teacher.getName());
        }

        // Calculate average score for each student
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + " has an average score of " + student.getAverageScore() + " and is classified as " + student.getGrade());
        }

        // Find student with the highest average score
        Student topStudent = findStudentWithHighestAverage(students);
        System.out.println("Student with the highest average score: " + (topStudent != null ? topStudent.getName() : "None"));

        // Sort students by average score in descending order using QuickSort
        quickSortStudentsByAverageScore(students, 0, students.size() - 1);
        System.out.println("Students sorted by average score (descending):");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getAverageScore());
        }

        // Sort students by name in alphabetical order using Bubble Sort
        bubbleSortStudentsByName(students);
        System.out.println("Students sorted by name (alphabetical):");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    // Method to find the teacher with the highest seniority
    public static Teacher findTeacherWithMaxSeniority(List<Teacher> teachers) {
        return teachers.stream()
                       .max(Comparator.comparingInt(Teacher::getYearsOfTeaching))
                       .orElse(null);
    }

    // Method to find teachers with more than 5 years of experience in natural sciences
    public static List<Teacher> findExperiencedNaturalScienceTeachers(List<Teacher> teachers) {
        return teachers.stream()
                       .filter(t -> t.getYearsOfTeaching() > 5 && t.getSpecialty().equals("Natural Sciences"))
                       .collect(Collectors.toList());
    }

    // Method to find the student with the highest average score
    public static Student findStudentWithHighestAverage(List<Student> students) {
        return students.stream()
                       .max(Comparator.comparingDouble(Student::getAverageScore))
                       .orElse(null);
    }

    // QuickSort to sort students by average score in descending order
    public static void quickSortStudentsByAverageScore(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSortStudentsByAverageScore(students, low, pi - 1);
            quickSortStudentsByAverageScore(students, pi + 1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        float pivot = students.get(high).getAverageScore();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (students.get(j).getAverageScore() > pivot) {
                i++;
                Collections.swap(students, i, j);
            }
        }
        Collections.swap(students, i + 1, high);
        return i + 1;
    }

    // Bubble Sort to sort students by name in alphabetical order
    public static void bubbleSortStudentsByName(List<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    Collections.swap(students, j, j + 1);
                }
            }
        }
    }
}
