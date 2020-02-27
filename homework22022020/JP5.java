package homework22022020;
/*   WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
     HRA = basic salary 10%,  DA = Basic salary 8%,  TA = Basic salary 9%,  PF= Basic salary 20%
     Gross salary = basic salary + HRA + TA + DA –PF
     Print in following format*/

import java.util.Scanner;

public class JP5 {

    //main method
    public static void main(String[] args) {
        //object creation to call instance method to static area
        JP5 ins = new JP5();
        ins.salaryslip();
    }

    /*instance method to enter details and
     calculate HRA,TA,DA,PF & Gross salary and print wage slip*/
    public void salaryslip() {
        int eid;
        String nm;
        double sal, hra, da, ta, pf, gs;
        //scanner object creation
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Id: ");
        eid = sc.nextInt();
        System.out.println("Name: ");
        nm = sc.next();
        System.out.println("Basic salary: ");
        sal = sc.nextDouble();
        hra = (sal * 10 / 100);
        System.out.println("HRA 10%: " + hra);
        da = (sal * 8 / 100);
        System.out.println("DA 8%: " + da);
        ta = (sal * 9 / 100);
        System.out.println("TA 9%: " + ta);
        pf = (sal * 20 / 100);
        System.out.println("PF 20%: " + pf);
        gs = (sal+ hra + da + ta - pf);
        System.out.println("Gross Salary: " + gs);

        //printing salary slip
        System.out.println(" _____________________________ ");
        System.out.println("|                             |");
        System.out.println("|         Salary Slip         |");
        System.out.println("|_____________________________|");
        System.out.println("|Employee ID     :"+eid+"        |");
        System.out.println("|Employee Name   :"+nm+"         |");
        System.out.println("|_____________________________|");
        System.out.println("|Basic Salary    :"+sal+"     |");
        System.out.println("|HRA 10%         :"+hra+"      |");
        System.out.println("|TA  8%          :"+ta+"      |");
        System.out.println("|DA  9%          :"+da+"      |");
        System.out.println("|PF -20%         :"+pf+"      |");
        System.out.println("|_____________________________|");
        System.out.println("|Gross Salary    :"+gs+"     |");
        System.out.println("|=============================|");

    }
    //Employee Id : 2564        //Employee Name : Jay |
    //Basic Salary : 25000.0    //HRA 10% : 2500.0 |
    // TA 8% : 2250.0           //DA 9% : 2000.0 |
    //PF - 20& : 5000.0         //Gross Salary : 26750.0 |
}