///  7 jan 2026
///
package OOPs;

class BluePrint {

    public static class Student{

        public String name;    // attributes or properties.
        public int rNo;       // attributes or properties.
        final String collegeName = "Sveri"; // finalize the value it can not change
        double percentage;   // attributes or properties.

        // Default constructor
        public Student(){

        }

        // Constructor - parameterized
        public Student(String name, int rNo, double per){
            this.name = name;
            this.rNo  = rNo;
            this.percentage = per;
        }

        // method to set private attributes
        public void setrNo(int rNo){           // setter
            this.rNo = rNo;
        }

        // method to access private attributes
        public int getrNo(){                    // getter
            return rNo;
        }
  }

  public static void main(String[] args){


     Student student1 = new Student();
     student1.name = "Ramesh Koli";
     student1.rNo = 28;
     student1.percentage = 76.00;
     System.out.println(student1.rNo);

     Student student2 = new Student();
     student2.name = "Shreya Pandey";
     student2.rNo = 29;
     student2.percentage = 80.00;

     System.out.println(student2.rNo);



  }

}
