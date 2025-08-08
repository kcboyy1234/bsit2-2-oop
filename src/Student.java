public class Student {
    private String name;
    private int age;
    private String course;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public boolean isPassing() {
        return calculateAverage() >= 75.0;
    }

    public String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.printf("Average Grade: %.2f\n", calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Status: " + (isPassing() ? "Passing" : "Failing"));
        System.out.println();
    }
}
