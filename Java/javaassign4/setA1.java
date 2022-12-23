import java.util.*;
class Myexception extends Exception {
    String msg = "Patient is Covid Positive(+) and Need to Hospitalized";
    public String toString() {
        return msg;
    }
}
class patient {
    String name;
    int age;
    int oxy_level;
    int HRTC_report;

    patient(String nm, int ag, int oxl, int hrct) {
        name = nm;
        age = ag;
        oxy_level = oxl;
        HRTC_report = hrct;
    }

    public void display() {
        System.out.println("-----Patient Details:-----");
        System.out.println("Patient Name:"+name);
        System.out.println("Patient Age:"+age);
        System.out.println("Patient Oxygen Level:"+oxy_level);
        System.out.println("Patient HRCT Report:"+HRTC_report);
        System.out.println("---------------------------");
    }
}

public class setA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Patient Name: ");
            String nm = sc.nextLine();

            System.out.println("Enter Patient Age: ");
            Byte ag = sc.nextByte();

            System.out.println("Enter Oxygen Level: ");
            int oxl = sc.nextInt();

            System.out.println("Enter HRTC Report: ");
            int hrct = sc.nextInt();
            patient p = new patient(nm, ag, oxl, hrct);

            if (p.oxy_level < 95 && p.HRTC_report > 10) {
                throw new Myexception();
            }
            p.display();

        } 
        catch (Exception e) {
            System.out.println(e);
        }

        // sc.close();

    }
}
