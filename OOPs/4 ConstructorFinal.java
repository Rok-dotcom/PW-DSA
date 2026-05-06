package OOPs;
/// Constructor:
/// default constructor
/// parameterized constructor

class Constructor {
    public static void main(String[] args){
        BluePrint.Student st1 = new BluePrint.Student("Shradhha", 1, 90.00);
        System.out.println(st1.name);
        System.out.println(st1.rNo);
        System.out.println(st1.percentage);

    }
}
