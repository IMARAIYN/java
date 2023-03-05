import java.util.Scanner;

public class StatusKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenjang;
        double ipk;

        System.out.print("Jenjang Pendidikan (Sarjana/Magister): ");
        jenjang = input.nextLine();

        System.out.print("IPK: ");
        ipk = input.nextDouble();

        if (jenjang.equalsIgnoreCase("sarjana")) {
            if (ipk >= 2.0 && ipk < 2.76) {
                System.out.println("Maaf, anda tidak lulus");
            } else if (ipk >= 2.76 && ipk < 3.52) {
                System.out.println("Selamat, anda lulus dengan predikat memuaskan");
            } else if (ipk >= 3.52) {
                System.out.println("Selamat, anda lulus dengan predikat sangat memuaskan");
            } else {
                System.out.println("Maaf, anda tidak lulus");
            }
        } else if (jenjang.equalsIgnoreCase("magister")) {
            if (ipk >= 3.0 && ipk < 3.76) {
                System.out.println("Selamat, anda lulus dengan predikat memuaskan");
            } else if (ipk >= 3.76) {
                System.out.println("Selamat, anda lulus dengan predikat sangat memuaskan");
            } else {
                System.out.println("Maaf, anda tidak lulus");
            }
        } else {
            System.out.println("Jenjang pendidikan yang dimasukkan salah");
        }
    }
}