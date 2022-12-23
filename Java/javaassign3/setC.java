import java.util.*;

interface dept {
    String dname = "Computer";
    String dhead = "Varient";

    void printData();

}

class hostel {
    String hname;
    String loc;
    int noOfRooms;

    hostel(String h, int no, String l) {
        hname = h;
        noOfRooms = no;
        loc = l;
    }

    void printData() {
        System.out.print(hname + "\t\t" + loc + "\t\t\t" + noOfRooms + "\n");
    }
}

class student extends hostel implements dept {
    String sname;
    int regNo;
    String sub;
    double avg;

    student(String n, int r, String s, double a, String h, int no, String l) {
        super(h, no, l);
        sname = n;
        regNo = r;
        sub = s;
        avg = a;
    }

    public void printData() {
        System.out.println(
                "\n----------------------------------------------------------------------------------------------------------");
        System.out.print("RegNo\tStud Name\tElected Sub\tAvgMarks\tHostelName\tHostelLocation\t\tRoomNumber");
        System.out.println(
                "\n----------------------------------------------------------------------------------------------------------");
        System.out.print(regNo + "\t" + sname + "\t\t" + sub + "\t\t" + avg + "\t\t");
        super.printData();
    }
}

public class setC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student s[] = new student[20];

        int ch, n = 0;
        do {

            System.out.println("\n*...Menu For Student Details...*\n");
            System.out.println("1.Admit Student\n2.Migrate Student\n3.Display Details Of Student\n4.Exit");
            System.out.print("Enter Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Student Name:");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter Reg No:");
                    int rn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Sub Name:");
                    String sub = sc.nextLine();

                    System.out.print("Enter Avg Marks: ");
                    double avg = sc.nextDouble();

                    System.out.println("\nEnter Hostel Details\n");

                    sc.nextLine();
                    System.out.print("Enter Hostel Name:");
                    String h = sc.nextLine();

                    System.out.print("Enter No Of Rooms :");
                    int r = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Hostel Loc:");
                    String loc = sc.nextLine();

                    s[n] = new student(name, rn, sub, avg, h, r, loc);
                    n++;
                    System.out.println("\n Record Added Successfully\n");
                    break;
                case 2:
                    if (n > 0) {
                        System.out.println("Migrate Student By Register No: ");
                        System.out.print("Enter Reg Number : ");
                        int rno = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            if (s[i].regNo == rno) {

                                sc.nextLine();
                                System.out.print("Enter New Hostel Name : ");
                                String h1 = sc.nextLine();

                                System.out.print("Enter New Hostel Location : ");
                                String lname = sc.nextLine();

                                System.out.print("Enter New Room Number : ");
                                int r1 = sc.nextInt();

                                s[i].hname = h1;
                                s[i].loc = lname;
                                s[i].noOfRooms = r1;

                            } 
                            else {
                                System.out.println("Invalid Register No.");
                            }

                        } 

                    }
                    else {
                        System.out.println("No Student Records");
                    }
                    break;
                case 3:
                    if (n > 0) {
                        System.out.println("Display Student By Register No: ");
                        System.out.print("Enter Reg Number : ");
                        int rno = sc.nextInt();
                        for (int i = 0; i < n; i++) {

                            if (s[i].regNo == rno) {
                                s[i].printData();

                            } else {
                                System.out.println("Invalid Register No.");
                            }

                        } 

                    } 
                    else {
                        System.out.println("No Student Records");
                    }

                    break;
                case 4:
                    System.out.println("Thank You !!");
                    break;
                default:
                    System.out.println("Invalid choice");

            }

        } while (ch != 4); 
        sc.close();

    }

}