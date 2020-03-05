package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nettoPreis = 200;
        double bruttoPreis;
        double steuerklasse1 = 0.2;
        double steuerklasse2 = 0.16;
        double steuerklasse3 = 0.08;
        double steuersatz = 0.16;

        if (steuersatz == steuerklasse1) {
            System.out.println("Steuersatz ist in Steuerklasse 1!");
            bruttoPreis = nettoPreis * (1 + steuerklasse1);
        } else if (steuersatz == steuerklasse2) {
            System.out.println("Steuersatz ist in Steuerklasse 2!");
            bruttoPreis = nettoPreis *(1 + steuerklasse2);
        } else {
            System.out.println("Steuersatz ist in Steuerklasse 3!");
            bruttoPreis = nettoPreis *(1 + steuerklasse3);
        }
        System.out.println("Der Bruttopreis ist: " + bruttoPreis);
    }
}
