# 📝 Tugas 7 : Polymorphisme

## 💼 Analisa Percobaan dan Studi Kasus

Halo semuanya, selamat datang di week 7 sebagai intern di PT Kesoku Band. Pada week ke 7, Bocchi menyadari beberapa dari kalian terlihat sudah pasrah dan capek setelah mengerjakan assessment yang sudah diberikan oleh Ryo kemarin. Bahkan Bocchi mendengar kabar bahwasannya ada yang berharap bahwa mereka seharusnya ketolak saja ketika melamar ke PT Kesoku Band dan melamar di perusahaan sebelah saja yang lebih manusiawi dibanding PT Kesoku Band. 

Mendengar kabar burung tersebut, Bocchi langsung memberikan kalian tugas lagi dan lagi yang berbentuk modul yang membosankan seperti biasa tetapi dengan twist sedikit. Kali ini Bocchi akan memberikan poin bonus yang banyak bagi para intern yang akan mengerjakan optional requirement yang akan diberikan Bocchi.

Seperti biasa, Bocchi akan membagi tugas yang dalam bentuk modul menjadi 2, yaitu bagian Analisis Percobaan dan Tugas Praktikum yang wajib kalian kerjakan dua-duanya.

Modul dapat kamu akses pada file berikut : [File Modul](./modules/Modul%203%20Bab%207%20Polymorfisme-1.pdf)

Bocchi senpai kali ini tidak memberikan catatan seperti biasa karena isinya juga sama dengan tugas kemarin.

### ✅ Must Requirements
Berikut adalah requirements yang harus dipenuhi pada bagian Tugas Praktikum

1. Terapkan konsep class and object pada program yang kalian buat
2. Terapkan konsep inheritance pada program yang kalian buat
3. Terapkan konsep abstract class beserta abstract method pada program yang kalian buat
3. Program harus memenuhi kebutuhan yang ada pada deskripsi **Tugas Praktikum**

### 👌 Optional Requirements
Optional requirements hanya berlaku pada tugas praktikum

1. Terjemahkan kodingan bagian tugas praktikum menjadi class diagram dan pastikan sudah sesuai akses modifiernya beserta tipe data / tipe return data ```10 Points``` (kumpulkan gambar class diagram di folder img)

Contoh : 

dari kodingan berikut

```java
class Mahasiswa {
    public String nama;
    protected String nim;
    private String tglLahir;
    String prodi

    public String misuh2(String siapa) {
        return "Kenapa dapatnya " + siapa;
    }

    private void berharap() {
        System.out.print("Ya Tuhan semoga semester depan ...")
    }
}

```

menjadi

| Mahasiswa |
| - |
| +nama : String |
| #nim : String |
| -tglLahir : String |
| prodi : String |
| ---------------------- |
| +misuh2(siapa : String) : String |
| -berharap() : void |


2. Terapkan konsep enkapsulasi ke semua class yang ada ```20 Points```
3. Buatlah program yang ada menjadi interaktif sehingga User bisa memilih opsi menu dari poin 3 ```20 Points```

Opsi menu yang dimaksud yaitu : 

    - Tampilkan semua kue dan harus ditampilkan jenis kuenya
    - Hitung total harga yang didapat dari semua jenis kue
    - Hitung total harga dan total berat dari KuePesanan
    - Hitung total harga dan total jumlah dari KueJadi
    - Tampilkan informasi kue dengan harga (harga akhir) terbesar

4. Buatlah sebuah subclass tambahan bernama KueBasi yang mewarisi superclass Kue ```30 Points```      
KueBasi memiliki properti sebagai berikut          
Class Diagram KueBasi :

| KueBasi |
| - |
| -lamaHari : int |
| ---------------------- |
| +hitungHarga() : double |

Hitung harga pada KueBasi berdasarkan rumus : ``` harga - (lamaHari * (harga * 0.1))```          
Lalu tambahkan beberapa KueBasi ke dalam array yang sudah ada dan tambahkan opsi menu :

    - Hitung total harga dan total lama hari dari KueBasi



### 📕 Module
Untuk modul yang digunakan pada week ke 6 ini bisa kalian temui pada folder [modules](./modules/)

## ⏳ Deadline

Bocchi senpai yang baik hati memberikan deadline 8 hari.

## 📤 Pengumpulan

- Buat folder ```Tugas 7```
- Dalam folder ```Tugas 7```, buatlah folder bernama ```src``` dan folder ```img```
- Isi identitas kamu sesuai template pada pada file berikut : [File Template](./src/README.md)
- Pisahkan 2 bagian source code menjadi folder ```Analisis Percobaan``` dan folder ```Tugas Praktikum``` dalam folder ```src```
- Kumpulkan source code bagian Analisis Percobaan ke folder ```Analisis Percobaan```
- Kumpulkan source code bagian Tugas Praktikum ke folder ```Tugas Praktikum```
- Kumpulkan gambar ke dalam folder [```img```](./img/) apabila ada
- Jalankan command git berikut di terminal untuk mengupdate github repo kalian
```zsh
git add . 
git commit -m "sambat2 dah wkwk"
git push origin master
```
- Buatlah video penjelasan mengenai class diagram yang kamu buat apabila ada
- Maksimal durasi video 20 menit, apabila lebih dari 20 menit akan mengalami pengurangan nilai sebesar 1 poin per menit
- Upload video penjelasan ke youtube dan batasi videonya hanya yang memiliki link yang dapat melihat

## 💯 Total Bonus Points
Apabila kamu memenuhi semua optional requirements yang diberikan oleh Bocchi senpai, kamu akan mendapatkan poin bonus sebesar **80 Poin** yang bisa membantu kamu saat UTP/UAP nanti

## 👥 Contacts

Apabila masih kebingungan dengan tugas ini silahkan menghubungi asisten praktikum, ganbatee!!!

![gif](https://media1.tenor.com/m/3L3IbgFoAzMAAAAd/poniedzia%C5%82ek-znowu-poniedzia%C5%82ek.gif)