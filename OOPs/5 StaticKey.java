package OOPs;

 class StaticKey {


    public static class Student{
        String name;
        int rno;
        double percentage;
        static int noOfStudents;

    // default constructor
        public Student(){

        }

    // parameterized constructor
    public Student(String name, int rno, double percentage) {
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
        noOfStudents++;
       }

    }

    public static void main(String[] args){
        Student s1 = new Student("ramesh",28,76);
        System.out.println(Student.noOfStudents);
        Student s2 = new Student("sakshi",1, 90);
        System.out.println(Student.noOfStudents);
        Student s3 = new Student("priya",2, 78);
        System.out.println(Student.noOfStudents);

    }
}
