package org.acme.fcsv;

import java.util.Scanner;

public class Apllication {

  public static void main(String[] args) throws Exception {
    FusionCsv fcsv = new FusionCsv(args[0], args[1]);
    int choice;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Entrez une option :\n"
          + "0=Quitter\n"
          + "1=Exporter la fusion\n"
          + "2=Voir les clients rejetés\n"
          + "3=TODO more...");
      System.out.print("Votre choix :");
      choice = sc.nextInt();
      switch (choice) {
      case 1:
        System.out.println("TODO choice 1");
        System.out.print("Nom du fichier de destination :");
        String fileName = sc.next();
        fcsv.exportTo(fileName);
        break;
      case 2:
        System.out.println("TODO choice 2");
        break;

      default:
        break;
      }
    } while (choice != 0);
    System.out.println("Bye !");
    sc.close();
  }

}
