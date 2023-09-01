import java.io.*;

class Student {
    private String name;
    private int hindiMarks;
    private int englishMarks;
    private int mathsMarks;
    private int chemistryMarks;

    public Student(String name, int hindiMarks, int englishMarks, int mathsMarks, int chemistryMarks) {
        this.name = name;
        this.hindiMarks = hindiMarks;
        this.englishMarks = englishMarks;
        this.mathsMarks = mathsMarks;
        this.chemistryMarks = chemistryMarks;
    }

    public String getName() {
        return name;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }
}

class Test {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Student1", 90, 85, 95, 88);
        students[1] = new Student("Student2", 78, 92, 89, 75);
        students[2] = new Student("Student3", 85, 88, 70, 92);
        students[3] = new Student("Student4", 92, 78, 85, 80);
        students[4] = new Student("Student5", 70, 82, 95, 88);

        try {
            FileWriter writer = new FileWriter("marksheet.txt");

            for (Student student : students) 
			{
                writer.write("Name: " + student.getName() + "\n");
                writer.write("Hindi: " + student.getHindiMarks() + "\n");
                writer.write("English: " + student.getEnglishMarks() + "\n");
                writer.write("Maths: " + student.getMathsMarks() + "\n");
                writer.write("Chemistry: " + student.getChemistryMarks() + "\n");
                
				// writer.write(student.getName());
				// writer.write(student.getHindiMarks());
				// writer.write(student.getEnglishMarks());
				// writer.write(student.getMathsMarks());
				// writer.write(student.getChemistryMarks());
				writer.write("\n");
            }

            writer.close();
            System.out.println("Marksheet written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}