package com.example.bank;
import java.util.Scanner;

abstract class AkunBank {

    double saldo = 0;
    Scanner baca = new Scanner(System.in);

    abstract void cekSaldo();

    abstract void ambilUang(double am);

    abstract void tambahUang(double tb);

    abstract void transfer();

    abstract void menuLain();

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
