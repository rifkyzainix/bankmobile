package com.example.bank;
import java.util.Scanner;

public class Bank extends AkunBank {
    Scanner baca = new Scanner(System.in);
    double saldo = 0;

    // Method untuk mengecek saldo dalam rekening
    @Override
    void cekSaldo(){
        System.out.println("Saldo anda saat ini adalah sebesar : Rp."+ saldo + "-,");
    }

    // Method untuk melakukan penarikan uang dari rekening
    void ambilUang(double am){
        System.out.println("Anda akan mengambil sejumlah : Rp."+ am + "-,");
        transaksi(am);
    }

    // Method untuk menambahkan uang ke dalam rekening
    void tambahUang(double tb){
        System.out.println("Anda menambah uang sejumlah :Rp."+ tb + "-,");
        this.saldo += tb;
    }

    // Method untuk melakukan transfer uang ke rekening lain
    void transfer(){
        System.out.print("Masukan Rekening Tujuan : "); String no=baca.next();
        System.out.print("Masukan Jumlah Kiriman : "); int nominal=baca.nextInt();
        System.out.println("Anda Akan Mentransfer Sejumlah "+nominal+ " ke rekening "+no);
        System.out.print("Masukan Pin : (y/n) "); char l=baca.next().charAt(0);
        if (l=='y'){
            System.out.println("Transaksi sedang diproses");
            transaksi(nominal);
        }else {
            System.out.println("Tranasaksi Dibatalkan com.example.akun.User");
        }
    }

    // Method untuk menampilkan menu layanan lain yang tersedia
    void menuLain(){
        System.out.println("com.example.bank.Menu Tambahan :");
        System.out.println("1. Pulsa");
        System.out.println("2. Listrik");
        System.out.println("3. Pembelian");
        System.out.print("Pilihan Anda : ");
        int masuk = baca.nextInt();
        switch (masuk){
            case 1:
                System.out.println("Masukan No Hp : ");
                String no = baca.nextLine();
                System.out.println("Masukan Nominal : ");
                double nominal = baca.nextInt();
                String tipe;
                switch (no.substring(0, 3)){
                    case "081":
                        tipe = "Telkomsel";
                        break;
                    case "083":
                        tipe="Axis";
                        break;
                    case "089":
                        tipe="Three";
                        break;
                    case "085":
                        tipe="Indosat";
                        break;
                    case "087":
                        tipe="XL";
                        break;
                    default: tipe="tidak terdeteksi";
                }
                System.out.println("Pengisian untuk no : " + no + "(" + tipe + ")" + "Sejumlah " + nominal + " Telah Berhasil");
                transaksi(nominal);
                break;
            case 2:
                System.out.println("Masukan No Pelanggan : ");
                no = baca.next();
                System.out.println("Masukan Nominal : ");
                nominal = baca.nextInt();
                System.out.println("Pengisian untuk No " + no + " Sejumlah " + nominal + " Telah Berhasil");
                transaksi(nominal);
            case 3:
                System.out.println("Masukan Kode Pembelian : ");
                no = baca.next();
                if (no.length() > 9){
                    String tr = no.substring(0, 8);
                    System.out.println("Pembelian Untuk Kode " + no + " Telah Berhasil sejumlah Rp." + tr);
                    transaksi(Double.parseDouble(tr));
                }else{
                    System.out.println("Pembelian Untuk Kode " + no + " Tidak tersedia\n Transaksi Dibatalkan");
                }
                break;
            default :
                System.out.println("Fitur Tidak Tersedia");
        }
    }

    // Method untuk melakukan transaksi
    public double transaksi(double tr){
        if (this.saldo < tr){
            System.out.println("Transaksi Tidak Dapat Dilanjutkan \nUang anda Tidak Mencukupi Untuk Transakasi Ini\n Sisa Saldo anda sebesar Rp. " + this.saldo);
        }else{
            System.out.println("Transaksi Berhasil");
            return this.saldo -= tr;
        }
        return this.saldo;
    }
}
