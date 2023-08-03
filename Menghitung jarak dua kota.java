// Menghitung jarak dua kota

import java.util.Scanner;
class jarakkota {
    private double x;
    private double y;


    public jarakkota(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Enkapsulasi getter digunakan untuk mengembalikan nilai x dan y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
class Tugas2_PBOTEORI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Koordinat X kota A: ");
        double x1 = input.nextDouble();
        System.out.print("Koordinat Y kota A: ");
        double y1 = input.nextDouble();
        System.out.print("Koordinat X kota B: ");
        double x2 = input.nextDouble();
        System.out.print("Koordinat Y kota B: ");
        double y2 = input.nextDouble();

        // objek jarakkota dibuat untuk kota A dan kota B
        jarakkota kotaA = new jarakkota(x1, y1);
        jarakkota kotaB = new jarakkota(x2, y2);

        // jarak antara kota A dan kota B dihitung menggunakan fungsi menghitungjarak
        double jaraknya = menghitungjarak(kotaA, kotaB);
        System.out.println("Jarak kota A dengan kota B adalah "+jaraknya);

    }
    public static double menghitungjarak(jarakkota kotaA, jarakkota kotaB) {
        // membuat perhitungan selisih jarak x dan y antara kota A dan kota B
        double jarak1 = kotaA.getX() - kotaB.getX();
        double jarak2 = kotaA.getY() - kotaB.getY();

        // jarak dihitung menggunakan rumus
        double jarak = Math.sqrt(Math.pow(jarak1, 2)+Math.pow(jarak2, 2));
        return jarak;
    }

}