import java.util.Scanner;

class Employee {
    int empid;
    long mobile;
    String name, address, mailid;
    Scanner get = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter Mail ID:");
        mailid = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();
        System.out.println("Enter Employee ID:");
        empid = get.nextInt();
        System.out.println("Enter Mobile Number:");
        mobile = get.nextLong();
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Mail ID: " + mailid);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobile);
    }
}

class Programmer extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getprogrammer() {
        System.out.println("Enter Basic Pay:");
        bp = get.nextDouble();
    }

    void calculateprog() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("********************************************");
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("********************************************");
        System.out.println("Basic Pay: Rs. " + bp);
        System.out.println("DA: Rs. " + da);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("PF: Rs. " + pf);
        System.out.println("CLUB: Rs. " + club);
        System.out.println("GROSS PAY: Rs. " + gross);
        System.out.println("NET PAY: Rs. " + net);
    }
}

class Asstprofessor extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getasst() {
        System.out.println("Enter Basic Pay:");
        bp = get.nextDouble();
    }

    void calculateasst() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("***********************************");
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("***********************************");
        System.out.println("Basic Pay: Rs. " + bp);
        System.out.println("DA: Rs. " + da);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("PF: Rs. " + pf);
        System.out.println("CLUB: Rs. " + club);
        System.out.println("GROSS PAY: Rs. " + gross);
        System.out.println("NET PAY: Rs. " + net);
    }
}

class Associateprofessor extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getassociate() {
        System.out.println("Enter Basic Pay:");
        bp = get.nextDouble();
    }

    void calculateassociate() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("***********************************");
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("***********************************");
        System.out.println("Basic Pay: Rs. " + bp);
        System.out.println("DA: Rs. " + da);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("PF: Rs. " + pf);
        System.out.println("CLUB: Rs. " + club);
        System.out.println("GROSS PAY: Rs. " + gross);
        System.out.println("NET PAY: Rs. " + net);
    }
}

class Professor extends Employee {
    double bp, da, hra, pf, club, net, gross;

    void getprofessor() {
        System.out.println("Enter Basic Pay:");
        bp = get.nextDouble();
    }

    void calculateprofessor() {
        da = 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.1 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("************************");
        System.out.println("PAY SLIP FOR PROFESSOR");
        System.out.println("************************");
        System.out.println("Basic Pay: Rs. " + bp);
        System.out.println("DA: Rs. " + da);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("PF: Rs. " + pf);
        System.out.println("CLUB: Rs. " + club);
        System.out.println("GROSS PAY: Rs. " + gross);
        System.out.println("NET PAY: Rs. " + net);
    }
}

class Salary {
    public static void main(String[] args) {
        int choice, cont;
        Scanner c = new Scanner(System.in);

        do {
            System.out.println("PAYROLL");
            System.out.println("1. PROGRAMMER\t2. ASSISTANT PROFESSOR\t3. ASSOCIATE PROFESSOR\t4. PROFESSOR");
            System.out.print("Enter Your Choice: ");
            choice = c.nextInt();

            switch (choice) {
                case 1 -> {
                    Programmer p = new Programmer();
                    p.getdata();
                    p.getprogrammer();
                    p.display();
                    p.calculateprog();
                }
                case 2 -> {
                    Asstprofessor asst = new Asstprofessor();
                    asst.getdata();
                    asst.getasst();
                    asst.display();
                    asst.calculateasst();
                }
                case 3 -> {
                    Associateprofessor asso = new Associateprofessor();
                    asso.getdata();
                    asso.getassociate();
                    asso.display();
                    asso.calculateassociate();
                }
                case 4 -> {
                    Professor prof = new Professor();
                    prof.getdata();
                    prof.getprofessor();
                    prof.display();
                    prof.calculateprofessor();
                }
                default -> System.out.println("Invalid choice! Please select a valid option.");
            }
            System.out.print("Enter 0 to quit and 1 to continue: ");
            cont = c.nextInt();
        } while (cont == 1);

        c.close();
    }
}
