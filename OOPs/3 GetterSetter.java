package OOPs;
/// Getter for getting value
/// setter for setting value

import OOPs.BluePrint.Student;
 class example2 {

    public static void main(String[] args){

        Student s1 = new Student("Shravani",27, 91.00);
        System.out.println(s1.name);
        System.out.println(s1.rNo);
        System.out.println(s1.percentage);

//        s1.collegeName = "JSPM";
        System.out.println(s1.collegeName);

    }
}
