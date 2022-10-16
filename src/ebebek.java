import java.util.Scanner;

public class ebebek {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Adınızı Yazınız : ");
            String name = input.nextLine();
            System.out.print("Haftalık Çalışma Saatinizi Yazınız :");
            int workHours = input.nextInt();
            System.out.print("Maaşınızı giriniz :");
            double salary = input.nextDouble();
            System.out.print("İşe başlangıç yılınızı giriniz :");
            int hireYear = input.nextInt();
            while (hireYear > 2021) {
                System.out.println("Yanlış bir yıl girdiniz. Tekrar deneyin.");
                System.out.print("İşe başlangıç yılınızı giriniz :");
                hireYear = input.nextInt();
            }
            double taxSalary = 0;

            if (salary > 1000) {
                taxSalary = (salary * 3 / 100);
            }

            if (hireYear > 2011 && hireYear >= 2021) {
                salary = (salary + (salary / 100 * 5));
            }

            if (hireYear > 2002 && hireYear < 2011 && hireYear >= 2021) {
                salary = (salary + (salary / 100 * 10));
            }

            if (hireYear < 2002 && hireYear >= 2021) {
                salary = (salary + (salary / 100 * 15));
            }
            if (workHours > 40) {
                salary = (((workHours - 40) * 30) + salary);

            }
            salary = (salary - taxSalary);

            System.out.println("Ad Soyad: " + name);
            System.out.println("Haftalık Saat : " + workHours);
            System.out.println("Vergi Kesintisi : " + taxSalary);
            System.out.println("Maaş : " + salary);
            System.out.println("İşe Başlangıç Yılı :" + hireYear);


        }
    }


