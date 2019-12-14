package project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lazy> b = new ArrayList<>();
        Lazy temp = new Lazy();

        boolean f1 = true;
        boolean f2 = true;

        while (f1) {
            System.out.println("||||||||||||||||Form Estekhdam||||||||||||||||\n");
            Scanner input = new Scanner(System.in);
            System.out.print("\n\nYour national code : ");
            String n = input.nextLine();
            if (Find(b, n) == false) {
                temp.setShomare_meli(n);

                System.out.print("\nYour first name : ");
                n = input.nextLine();
                temp.setName(n);

                System.out.print("\nYour last name : ");
                n = input.nextLine();
                temp.setFamily(n);

                System.out.print("\nYour father name : ");
                n = input.nextLine();
                temp.setFather_name(n);

                System.out.print("\nYour age : ");
                n = input.nextLine();
                temp.setAge(n);

                System.out.print("\nSabeghe kari darid ? (y | n) : ");
                n = input.nextLine();

                if (n.equals("y") == true) {

                    while (f2) {
                        Sabegh temp2 = new Sabegh();
                        System.out.print("\nOnvan shoghl : ");
                        n = input.nextLine();
                        temp2.onvan = n;

                        System.out.print("\nModat hozor dar in shoghl : ");
                        n = input.nextLine();
                        temp2.modat = n;

                        System.out.print("\nHoghogh daryafti dar in shoghl : ");
                        n = input.nextLine();
                        temp2.hoghogh = n;

                        temp.setSabegh_shoghli(temp2);

                        System.out.print("\nAdd other  ? y | n : ");
                        n = input.nextLine();
                        b.add(temp);
                        if (n.equals("y") == false) {
                            f2 = false;
                        }

                    }

                }

                System.out.print("\nHoghogh darkhasti : ");
                n = input.nextLine();
                temp.setHoghogh(n);

            } else {
                System.out.println("\nin code meli sabt shodeh ast...");

            }
            System.out.print("\nAdd other  ? y | n : ");
            n = input.nextLine();
            b.add(temp);
            if (n.equals("y") == false) {
                f1 = false;
            }

        }

    }

    private static boolean Find(ArrayList<Lazy> b, String n) {

        for (Lazy lazy : b) {

            if (lazy.getShomare_meli().equals(n) == true) {
                return true;
            }

        }
        return false;

    }

    static class Sabegh {

        public String onvan;
        public String modat;
        public String hoghogh;
    }

    static class Lazy {

        private String name;
        private String family;
        private String father_name;
        private String shomare_meli;
        private String age;
        private ArrayList<Sabegh> Sabegh_shoghli;
        private String hoghogh;

        public Lazy() {

            Sabegh_shoghli=new ArrayList<>();
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFamily() {
            return family;
        }

        public void setFamily(String family) {
            this.family = family;
        }

        public String getFather_name() {
            return father_name;
        }

        public void setFather_name(String father_name) {
            this.father_name = father_name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getShomare_meli() {
            return shomare_meli;
        }

        public void setShomare_meli(String shomare_meli) {
            this.shomare_meli = shomare_meli;
        }

        public ArrayList<Sabegh> getSabegh_shoghli() {
            return Sabegh_shoghli;
        }

        public void setSabegh_shoghli(Sabegh Sabegh_shoghli) {
            this.Sabegh_shoghli.add(Sabegh_shoghli);
        }

        public String getHoghogh() {
            return hoghogh;
        }

        public void setHoghogh(String hoghogh) {
            this.hoghogh = hoghogh;
        }

    }
}
