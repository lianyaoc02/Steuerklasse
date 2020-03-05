package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nettoPreis = 200;
        int steuerklasse = 1;
        double bruttoPreis;
        double steuer1 = 0.2;
        double steuer2 = 0.16;
        double steuer3 = 0.08;
        double steuer = 0;


        // if (steuer1 > 0.1999 && steuer1 < 0.20001)
       /* if (steuerklasse == 1) {
            steuer =nettoPreis * steuer1;
            System.out.println("Steuersatz ist in Steuerklasse 1!");
        } else if (steuerklasse == 2) {
            steuer =nettoPreis * steuer2;
            System.out.println("Steuersatz ist in Steuerklasse 2!");
        } else if (steuerklasse == 3){
            steuer =nettoPreis * steuer3;
            System.out.println("Steuersatz ist in Steuerklasse 3!");
        }
        bruttoPreis = nettoPreis + steuer;
        System.out.println("Der Bruttopreis ist: " + bruttoPreis);*/

       switch (steuerklasse) {
           case 1:
               steuer =nettoPreis * steuer1;
               System.out.println("Steuersatz ist in Steuerklasse 1!");
               break;
           case 2:
               steuer =nettoPreis * steuer2;
               System.out.println("Steuersatz ist in Steuerklasse 2!");
               break;
           case 3:
               steuer =nettoPreis * steuer3;
               System.out.println("Steuersatz ist in Steuerklasse 3!");
               break;
           default:
               System.out.println("Achtung, keine Steuerklasse");
               break;
       }
        bruttoPreis = nettoPreis + steuer;
        System.out.println("Der Bruttopreis ist: " + bruttoPreis);
    }
}
