package com.example.bank;

import com.example.akun.User;

import java.util.Scanner;

public class Menu extends AkunBank {
    // Method main untuk menampilkan menu utama aplikasi
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        boolean loop = false;
        User user = new User();

        user.setUsername("rifky"); //set username
        user.setPassword("1234"); //set password

        System.out.println("      BRI MOBILE      ");
        System.out.println("+====================+");

        do {
            loop = false;
            System.out.print("Username: ");
            String username = baca.nextLine();
            System.out.print("Password: ");
            String password = baca.nextLine();


            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal!");
                loop = true; // set loop ke true jika login gagal agar kembali ke awal do-while
            }

        // melakukan perulangan jika loop bernilai true
        }while(loop);
        Bank Menu = new Bank();
            System.out.println("+====================+");
            System.out.println("      BRI Mobile      ");
        int pilih;
        do{
            System.out.println("+====================+");
            System.out.println("|  -Daftar Layanan-  |");
            System.out.println("| 1. Cek Saldo       |");
            System.out.println("| 2. Transfer        |");
            System.out.println("| 3. Tarik Tunai     |");
            System.out.println("| 4. Tambah Saldo    |");
            System.out.println("| 5. Menu Lainnya    |");
            System.out.println("| 6. Exit            |");
            System.out.println("+====================+");
            System.out.println(" ");
            System.out.print(  " Masukan Pilihan : ");
            pilih = baca.nextInt();

            switch (pilih){
                case 1:
                    Menu.cekSaldo();
                    break;
                case 2:
                    Menu.transfer();
                    break;
                case 3:
                    System.out.print("Masukan Uang Yang Anda Ambil: Rp. ");
                    double am = baca.nextDouble();
                    Menu.ambilUang(am);
                    break;
                case 4:
                    System.out.print("Masukan Uang Yang Anda Tambah: Rp. ");
                    double tb = baca.nextDouble();
                    Menu.tambahUang(tb);
                    break;
                case 5:
                    Menu.menuLain();
                    break;
                case 6:
                    System.out.println("Terimakasih Sudah Menggunakan Layanan Kami");
                    break;
                default:
                    System.out.println("Layanan tidak tersedia");
            }
        } while (pilih != 6);
    }

    // Method untuk mengecek saldo dalam rekening
    @Override
    void cekSaldo() {
    }

    // Method untuk melakukan penarikan uang dari rekening
    @Override
    void ambilUang(double am) {
    }

    // Method untuk menambahkan uang ke dalam rekening
    @Override
    void tambahUang(double tb) {
    }

    // Method untuk melakukan transfer uang ke rekening lain
    @Override
    void transfer() {
    }

    // Method untuk menampilkan menu layanan lain yang tersedia
    @Override
    void menuLain() {
    }
}
