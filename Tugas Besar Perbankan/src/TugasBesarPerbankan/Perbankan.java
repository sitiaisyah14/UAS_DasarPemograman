/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesarPerbankan;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
import java.util.Random;
public class Perbankan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================================================");
        System.out.println("\t\t\t\t PROGRAM PERBANKAN BRI \t\t\t\t");
        System.out.println("===============================================================================================");
        
        System.out.println("\n");
        System.out.println("============================= DATA NASABAH DI BANK BRI ========================================");
        System.out.println("\n");
        String [][] dataNasabah = {
            {"Abd.Shomad","3388-01-028216-53-5","Simpedes","Rp. 11.000.000"},
            {"Sumiati","\t4610-01-010973-53-1","Britama Bisnis","Rp. 25.000.000"},
            {"Aprilia","\t7710-01-010918-53-9","BRI Junior","Rp. 8000.000"},
        };
        
            System.out.println(" Nama \t\t\t No Rekening \t\t\tJenis Tabungan \t\t Saldo");
            System.out.println("_______________________________________________________________________________________________");
        for (int a=0 ; a < 3; a++){
            for (int i=0; i < 4; i++){
                System.out.print(dataNasabah [a][i] + "\t\t");
            } 
            System.out.println();
        }
        
        System.out.println("\n");
        System.out.println("================================= SELAMAT DATANG DI BANK BRI =================================");
        
        System.out.println("================================ SILAHKAN AKSES FITUR BERIKUT ================================");
        System.out.println ("a. Mendaftar => Untuk mendaftar menjadi nasabah baru di Bank BRI");
        System.out.println ("b. Transaksi => Untuk melakukan transaksi bagi nasabah yang sudah terdata di Bank BRI");
        
        System.out.print ("\n     Isi fitur yang ingin anda lakukan : ");
        String fitur = sc.nextLine ();
        
        if (fitur.equalsIgnoreCase("Mendaftar")){
            System.out.println();
            System.out.println("================================= SILAHKAN ISI BIODATA ANDA ==================================");
            System.out.println("======================== UNTUK PERSYARATAN SEBAGAI NASABAH BANK BRI ==========================");
            System.out.print(" Nama Lengkap \t\t: ");
            String nama= sc.nextLine();
            System.out.print(" Tempat, Tanggal Lahir \t: ");
            String ttl = sc.nextLine();
            System.out.print(" Jenis Kelamin \t\t: ");
            String jenisklmn = sc.nextLine();
            System.out.print(" Alamat \t\t: ");
            String alamat = sc.nextLine();
            System.out.print(" Status \t\t: ");
            String pekerjaan = sc.nextLine();
            System.out.print(" Tanggal \t\t: ");
            String tanggal = sc.nextLine();
        
            System.out.println("=========================== Pilih jenis tabungan yang Anda inginkan !! ======================");
            String ketentuan [][] ={
                        {"Simpedas ", "  Pekerja", "Rp.   100.000"},
                        {"BRI Junior ", "  Pelajar", "Rp.   200.000"},
                        {"Britama Bisnis ", "  Pekerja", "Rp. 1.000.000"},
                        {"BritAma ", "  Pekerja", "Rp.   250.000"},
            };
        
            System.out.println("  Jenis Tabungan \t  Status \t\tMinimal Tabungan " );
            System.out.println("_________________________________________________________________");
            for (int a =0; a<4; a++){
                for (int i =0; i<3; i++){
                    System.out.print(ketentuan[a][i] + "\t\t");
                }
                System.out.println();
            }
            
            System.out.println();
            System.out.print(" Jenis Tabungan \t : " );
            String jenis = sc.nextLine();
            jenisTabungan(jenis);
        
            System.out.println();
            Random random= new Random();
            int norek1 = random.nextInt(9999);
            int norek2 = random.nextInt(9999);
            int norek3 = random.nextInt(99);
            int norek4 = random.nextInt(10);
            System.out.println("No Rekening Anda sekarang : " + norek1 + "-01" + "-01" + norek2 + "-" + norek3 + "-" + norek4);
        
            System.out.println("   ========= Isi PIN (6 digit angka) dan simpan privasi PIN Anda ===========");
        
            System.out.print(" Masukkan PIN \t : ");
            int pin = sc.nextInt();
            jumlahPin(pin);
        
            System.out.println();
            System.out.println("\t\t========= Isi tabungan pertama Anda  ===========");
            System.out.println("========= Isi sesuai Minimal saldo dari jenis tabungan yang anda pilih ===========");
        
            System.out.print(" Isi nominal saldo awal : Rp. ");
            int saldoAwal = sc.nextInt();
            System.out.print(" Biaya jasa Rp. 50.000 ");
            int biaya = 50000;
                
            System.out.println();
            System.out.println("\t========= Selamat Anda menjadi Nasabah di Bank BRI  ===========");
            System.out.println("===== Lakukan transaksi dengan cara isi sesuai transaksi yang anda inginkan =====");
        
            String [][] transaksi = {
                    {"1. Cek Saldo"},
                    {"2. Setor Tabungan"},
                    {"3. Ambil Tabungan"},
                    {"4. Transfer"},
                    {"5. Keluar"},
            };
        
            for (int a =0; a<5; a++){
                for (int i =0; i<1; i++){
                    System.out.println(transaksi[a][i]);
                }
            }
        
            System.out.print("   Pilih no transaksi yang ingin anda akses : ");
            int trans = sc.nextInt();
        
            if (trans == 1){
                int hasilAkhir = cekSaldo (saldoAwal, biaya);
                System.out.println();
                System.out.println("     =============== BANK BRI ===============");
                System.out.println("   ========== Hasil Transaksi Anda=============");
                System.out.println();
                System.out.println(     "Tanggal : " + tanggal);
                System.out.println("    Nama \t\t: " + nama);
                System.out.println("    No Rekening \t: " + + norek1 + "-01" + "-01" + norek2 + "-" + norek3 + "-" + norek4);
                System.out.println("    Jenis Tabungan \t: " + jenis);
                System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
            }
            else if(trans==2){
                System.out.print("  Masukkan nominal uang \t: Rp. ");
                int uang = sc.nextInt();
            
                int hasilAkhir = setorTabungan (saldoAwal, uang);
            
                System.out.println();
                System.out.println("     =============== BANK BRI ===============");
                System.out.println("   ========== Hasil Transaksi Anda=============");
                System.out.println();
                System.out.println(     "Tanggal : " + tanggal);
                System.out.println("    Nama \t\t: " + nama);
                System.out.println("    No Rekening \t: " + + norek1 + "-01" + "-01" + norek2 + "-" + norek3 + "-" + norek4);
                System.out.println("    Jenis Tabungan \t: " + jenis);
                System.out.println("    Saldo Awal \t\t: Rp. " + saldoAwal);
                System.out.println("    Setor Tabungan \t: Rp. " + uang);
                System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
            }
            else if(trans==3){
                System.out.print("  Masukkan nominal uang \t: Rp. ");
                int uang = sc.nextInt();
            
                int hasilAkhir = ambilTabungan (saldoAwal, uang);
            
                System.out.println();
                System.out.println("     =============== BANK BRI ===============");
                System.out.println("   ========= Hasil Transaksi Anda=============");
                System.out.println();
                System.out.println(     "Tanggal : " + tanggal);
                System.out.println("    Nama \t\t: " + nama);
                System.out.println("    No Rekening \t: " + + norek1 + "-01" + "-01" + norek2 + "-" + norek3 + "-" + norek4);
                System.out.println("    Jenis Tabungan \t: " + jenis);
                System.out.println("    Saldo Awal \t\t: Rp. " + saldoAwal);
                System.out.println("    Setor Tabungan \t: Rp. " + uang);
                System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
            }
            else if(trans==4){
                System.out.print("  Masukkan no rekening yang akan kamu tansfer \t:  ");
                float rekTransfer = sc.nextFloat();
                System.out.print("  Masukkan nama yang ingin kamu transfer \t:  ");
                String namaTransfer = sc.next();
            
                System.out.print("  Masukkan nominal uang \t\t\t: Rp. ");
                int uang = sc.nextInt();
           
                int hasilAkhir = transfer (saldoAwal, uang);
            
                System.out.println();
                System.out.println("     =============== BANK BRI ===============");
                System.out.println("   ========== Hasil Transaksi Anda=============");
                System.out.println();
                System.out.println(     "Tanggal : " + tanggal);
                System.out.println(" UNTUK  ");
                System.out.println("    Nama \t\t  : " + namaTransfer);
                System.out.println("    No Rekening \t  : " + rekTransfer);
                System.out.println(" DARI ");
                System.out.println("    Nama \t\t  : " + nama);
                System.out.println("    No Rekening \t  : " + + norek1 + "-01" + "-01" + norek2 + "-" + norek3 + "-" + norek4);
                System.out.println("    Jenis Tabungan \t  : " + jenis);
                System.out.println("    Saldo Awal \t\t  : Rp. " + saldoAwal);
                System.out.println("    Uang yang ditransfer  : Rp. " + uang);
                System.out.println("    Saldo Akhir Anda \t  : Rp. " + hasilAkhir );
            } else {
                System.out.println("    ### Anda tidak melakukan transaksi ###");
            }
        }
// Untuk fitur yang ke 2        
        else if (fitur.equalsIgnoreCase("Transaksi")){
            System.out.println("================================= SILAHKAN ISI BIODATA ANDA ==================================");
            System.out.println("================================ SEBELUM MELAKUKAN TRANSAKSI =================================");
                String rek1 = "3388-01-028216-53-5";
                String jenis1 = "Simpedas";
                int saldo1 = 11000000;
                String rek2 = "4610-01-010973-53-1";
                String jenis2 = "Briatama Bisnis";
                int saldo2 = 25000000;
                String rek3 = "7710-01-010918-53-9";
                String jenis3 = "BRI Junior";
                int saldo3 = 8000000;
                
                System.out.print(" Tanggal \t\t: ");
                String tanggalTrans = sc.nextLine();
                System.out.print(" Nama Lengkap \t\t: ");
                String namaNas= sc.nextLine();
                
            //Nasabah 1    
            if (namaNas.equalsIgnoreCase("Abd.Shomad")){
                System.out.println(" Jenis Tabungan \t: " + jenis1);
                System.out.println(" No Rekening \t\t: " + rek1 );
                System.out.print(" Isi PIN Anda \t\t: ");
                int pinNas= sc.nextInt();
                System.out.print(" Saldo Anda \t\t: Rp. " + saldo1);
                
                System.out.println();
                System.out.println("===== Lakukan transaksi dengan cara isi sesuai transaksi yang anda inginkan =====");
        
                String [][] transaksi = {
                            {"1. Cek Saldo"},
                            {"2. Setor Tabungan"},
                            {"3. Ambil Tabungan"},
                            {"4. Transfer"},
                            {"5. Keluar"},
                };
        
                for (int a =0; a<5; a++){
                    for (int i =0; i<1; i++){
                        System.out.println(transaksi[a][i]);
                    }
                }
        
                System.out.print("   Pilih no transaksi yang ingin anda akses : ");
                int trans = sc.nextInt();
                
                if(trans == 1){
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal \t\t: " + tanggalTrans);
                    System.out.println("    Nama \t\t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek1);
                    System.out.println("    Jenis Tabungan \t: " + jenis1);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + saldo1 );
                }
                else if(trans==2){
                    System.out.print("  Masukkan nominal uang \t: Rp. ");
                    int uang = sc.nextInt();
            
                    int hasilAkhir = setorTabungan (saldo1, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal \t\t: " + tanggalTrans);
                    System.out.println("    Nama \t\t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek1);
                    System.out.println("    Jenis Tabungan \t: " + jenis1);
                    System.out.println("    Saldo Awal \t\t: Rp. " + saldo1);
                    System.out.println("    Setor Tabungan \t: Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
                }
                else if(trans==3){
                    System.out.print("  Masukkan nominal uang \t: Rp. ");
                    int uang = sc.nextInt();
            
                    int hasilAkhir = ambilTabungan (saldo1, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========= Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal \t\t: " + tanggalTrans);
                    System.out.println("    Nama \t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek1);
                    System.out.println("    Jenis Tabungan \t: " + jenis1);
                    System.out.println("    Saldo Awal \t\t: Rp. " + saldo1);
                    System.out.println("    Setor Tabungan \t: Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
                }
                else if(trans==4){
                    System.out.print("  Masukkan no rekening yang akan kamu tansfer \t:  ");
                    float rekTransfer = sc.nextFloat();
                    System.out.print("  Masukkan nama yang ingin kamu transfer \t:  ");
                    String namaTransfer = sc.next();
            
                    System.out.print("  Masukkan nominal uang \t\t\t: Rp. ");
                    int uang = sc.nextInt();
            

                    int hasilAkhir = transfer (saldo1, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal \t\t: " + tanggalTrans);
                    System.out.println(" UNTUK  ");
                    System.out.println("    Nama \t\t  : " + namaTransfer);
                    System.out.println("    No Rekening \t  : " + rekTransfer);
                    System.out.println(" DARI ");
                    System.out.println("    Nama \t\t  : " + namaNas);
                    System.out.println("    No Rekening \t  : " + rek1);
                    System.out.println("    Jenis Tabungan \t  : " + jenis1);
                    System.out.println("    Saldo Awal \t\t  : Rp. " + saldo1);
                    System.out.println("    Uang yang ditransfer  : Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t  : Rp. " + hasilAkhir );
                } else {
                    System.out.println("    ### Anda tidak melakukan transaksi ###");
                }
            }
            
            // Nasabah 2
            else if (namaNas.equalsIgnoreCase("Sumiati")){
                System.out.println(" Jenis Tabungan \t: " + jenis2);
                System.out.println(" No Rekening \t\t: " + rek2); 
                System.out.print(" Isi PIN Anda \t\t: ");
                int pinNas= sc.nextInt();
                System.out.print(" Saldo Anda \t\t: Rp." + saldo2);
                
                System.out.println();
                System.out.println("===== Lakukan transaksi dengan cara isi sesuai transaksi yang anda inginkan =====");
        
                String [][] transaksi = {
                            {"1. Cek Saldo"},
                            {"2. Setor Tabungan"},
                            {"3. Ambil Tabungan"},
                            {"4. Transfer"},
                            {"5. Keluar"},
                };
        
                for (int a =0; a<5; a++){
                    for (int i =0; i<1; i++){
                        System.out.println(transaksi[a][i]);
                    }
                }
        
                System.out.print("   Pilih no transaksi yang ingin anda akses : ");
                int trans = sc.nextInt();
                
                if(trans == 1){
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal \t\t: " + tanggalTrans);
                    System.out.println("    Nama \t\t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek2);
                    System.out.println("    Jenis Tabungan \t: " + jenis2);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + saldo2 );
                }
                else if(trans==2){
                    System.out.print("  Masukkan nominal uang \t: Rp. ");
                    int uang = sc.nextInt();
            
                    int hasilAkhir = setorTabungan (saldo2, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal : " + tanggalTrans);
                    System.out.println("    Nama \t\t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek2);
                    System.out.println("    Jenis Tabungan \t: " + jenis2);
                    System.out.println("    Saldo Awal \t\t: Rp. " + saldo2);
                    System.out.println("    Setor Tabungan \t: Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
                }
                else if(trans==3){
                    System.out.print("  Masukkan nominal uang \t: Rp. ");
                    int uang = sc.nextInt();
            
                    int hasilAkhir = ambilTabungan (saldo2, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========= Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal : " + tanggalTrans);
                    System.out.println("    Nama \t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek2);
                    System.out.println("    Jenis Tabungan \t: " + jenis2);
                    System.out.println("    Saldo Awal \t\t: Rp. " + saldo2);
                    System.out.println("    Setor Tabungan \t: Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
                }
                else if(trans==4){
                    System.out.print("  Masukkan no rekening yang akan kamu tansfer \t:  ");
                    float rekTransfer = sc.nextFloat();
                    System.out.print("  Masukkan nama yang ingin kamu transfer \t:  ");
                    String namaTransfer = sc.next();
            
                    System.out.print("  Masukkan nominal uang \t\t\t: Rp. ");
                    int uang = sc.nextInt();
            

                    int hasilAkhir = transfer (saldo2, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal : " + tanggalTrans);
                    System.out.println(" UNTUK  ");
                    System.out.println("    Nama \t\t  : " + namaTransfer);
                    System.out.println("    No Rekening \t  : " + rekTransfer);
                    System.out.println(" DARI ");
                    System.out.println("    Nama \t\t  : " + namaNas);
                    System.out.println("    No Rekening \t  : " + rek2);
                    System.out.println("    Jenis Tabungan \t  : " + jenis2);
                    System.out.println("    Saldo Awal \t\t  : Rp. " + saldo2);
                    System.out.println("    Uang yang ditransfer  : Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t  : Rp. " + hasilAkhir );
                } else {
                    System.out.println("    ### Anda tidak melakukan transaksi ###");
                }
            } 
            
            // Nasabah 3
            else if (namaNas.equalsIgnoreCase("Aprilia")){
                System.out.println(" Jenis Tabungan \t: " + jenis3);
                System.out.println(" No Rekening \t\t: " + rek3); 
                System.out.print(" Isi PIN Anda \t\t: ");
                int pinNas= sc.nextInt();
                System.out.print(" Saldo Anda \t\t: " + saldo3);
                
                System.out.println();
                System.out.println("===== Lakukan transaksi dengan cara isi sesuai transaksi yang anda inginkan =====");
        
                String [][] transaksi = {
                            {"1. Cek Saldo"},
                            {"2. Setor Tabungan"},
                            {"3. Ambil Tabungan"},
                            {"4. Transfer"},
                            {"5. Keluar"},
                };
        
                for (int a =0; a<5; a++){
                    for (int i =0; i<1; i++){
                        System.out.println(transaksi[a][i]);
                    }
                }
        
                System.out.print("   Pilih no transaksi yang ingin anda akses : ");
                int trans = sc.nextInt();
                
                if(trans == 1){
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal : " + tanggalTrans);
                    System.out.println("    Nama \t\t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek3);
                    System.out.println("    Jenis Tabungan \t: " + jenis3);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + saldo3);
                }
                else if(trans==2){
                    System.out.print("  Masukkan nominal uang \t: Rp. ");
                    int uang = sc.nextInt();
            
                    int hasilAkhir = setorTabungan (saldo3, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal : " + tanggalTrans);
                    System.out.println("    Nama \t\t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek3);
                    System.out.println("    Jenis Tabungan \t: " + jenis3);
                    System.out.println("    Saldo Awal \t\t: Rp. " + saldo3);
                    System.out.println("    Setor Tabungan \t: Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
                }
                else if(trans==3){
                    System.out.print("  Masukkan nominal uang \t: Rp. ");
                    int uang = sc.nextInt();
            
                    int hasilAkhir = ambilTabungan (saldo3, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========= Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal : " + tanggalTrans);
                    System.out.println("    Nama \t: " + namaNas);
                    System.out.println("    No Rekening \t: " + rek3);
                    System.out.println("    Jenis Tabungan \t: " + jenis3);
                    System.out.println("    Saldo Awal \t\t: Rp. " + saldo3);
                    System.out.println("    Setor Tabungan \t: Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t: Rp. " + hasilAkhir );
                }
                else if(trans==4){
                    System.out.print("  Masukkan no rekening yang akan kamu tansfer \t:  ");
                    float rekTransfer = sc.nextFloat();
                    System.out.print("  Masukkan nama yang ingin kamu transfer \t:  ");
                    String namaTransfer = sc.next();
            
                    System.out.print("  Masukkan nominal uang \t\t\t: Rp. ");
                    int uang = sc.nextInt();
            

                    int hasilAkhir = transfer (saldo3, uang);
            
                    System.out.println();
                    System.out.println("     =============== BANK BRI ===============");
                    System.out.println("   ========== Hasil Transaksi Anda=============");
                    System.out.println();
                    System.out.println("    Tanggal : " + tanggalTrans);
                    System.out.println(" UNTUK  ");
                    System.out.println("    Nama \t\t  : " + namaTransfer);
                    System.out.println("    No Rekening \t  : " + rekTransfer);
                    System.out.println(" DARI ");
                    System.out.println("    Nama \t\t  : " + namaNas);
                    System.out.println("    No Rekening \t  : " + rek3);
                    System.out.println("    Jenis Tabungan \t  : " + jenis3);
                    System.out.println("    Saldo Awal \t\t  : Rp. " + saldo3);
                    System.out.println("    Uang yang ditransfer  : Rp. " + uang);
                    System.out.println("    Saldo Akhir Anda \t  : Rp. " + hasilAkhir );
                } else {
                    System.out.println("    ### Anda tidak melakukan transaksi ###");
                }
            }
        }        
    }
    
    // fungsi untuk fitur 1
    static void jenisTabungan (String jenis){
        if (jenis.equalsIgnoreCase("Simpedas")){ 
            System.out.println("    *Jenis tabungan anda adalah Simpedas*");
        }
        else if (jenis.equalsIgnoreCase("BRI Junior")){  
            System.out.println("    *Jenis tabungan anda adalah BRI junior*");
        }
        else if (jenis.equalsIgnoreCase("Britama Bisnis")){
            System.out.println("    *Jenis tabungan anda adalah Britama Bisnis*");
        }
        else if (jenis.equalsIgnoreCase("BritAma")){
            System.out.println("    *Jenis tabungan anda adalah BritAma*");
        }
        else{
            System.out.print("Maaf jenis tabungan yang anda pilih tidak tersedia di bank BRI");
        }
        
    }
    // fungsi fitur 1
    static void jumlahPin(int a){
        Scanner sc= new Scanner(System.in);
        if (a == 111111 || a == 222222 || a == 333333 || a == 444444 || a == 555555 || a == 666666 || a == 777777 || a == 888888 || a == 999999){ 
            System.out.println("     ***Pin Anda terlalu mudah ditebak***");
            System.out.print(" Masukkan ulang PIN \t : ");
            int pin = sc.nextInt();
        }
        else {
            System.out.println();
            System.out.print("     ***PIN Anda sudah terekam***");
        }
    } 
    // fungsi untuk fitur 1 
    // untuk transaksi semua
    static int cekSaldo (int saldo, int biaya){
        int hasil = saldo - biaya;
        return hasil;
    }
    // fungsi untuk fitur 1 dan 2
    static int setorTabungan (int saldo, int uang){
        int hasil = saldo + uang;
        return hasil;
    }
    static int ambilTabungan (int saldo, int uang){
        int hasil = saldo - uang;
        return hasil;
    }
    static int transfer (int saldo, int uang){
        int hasil = saldo - uang;
        return hasil;
    }
}