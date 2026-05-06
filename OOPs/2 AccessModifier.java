package OOPs;
///  public : for using in different packages
///  private : only in that class.
///  default : only in that package classes

import OOPs.BluePrint.Student;
 class example {

    public static void main(String[] args){

     Student s1 = new Student();
     s1.name = "ramesh";
     System.out.print(s1.name);

     Student s2 = new Student();
     s2.name = "Sanu";
     System.out.println(s2.name);

     s2.setrNo(05);

     System.out.println(s2.getrNo());
    }
}
