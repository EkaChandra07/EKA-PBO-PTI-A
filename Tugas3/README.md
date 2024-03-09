# 📝 Tugas 3 : Class Diagram

## 💼 Studi Kasus

Selamat datang di week ketiga kelas praktikum PBO. Pada kesempatan kali ini, Bocchi senpai akan memberikan kamu tugas untuk merancang class diagram sesuai tema yang kamu pilih pada spreadsheet yang sudah disebar di grup whatsapp. Rancangan yang kamu buat harus memiliki requirement sebagai berikut

### ✅ Must Requirements
1. Membuat minimal 3 class diagram 
2. Masing-masing class diagram wajib memiliki minimal 2 attribut dan 3 method
3. Class diagram yang dirancang wajib mengikuti tema yang kamu pilih
4. Wajib memiliki 1 method yang berparameter

### 👌 Optional Requirements
1. Menerjemahkan semua class diagram yang telah dibuat ke dalam bentuk kodingan Java **(+5 Points)**   
Contoh : 

Class Diagram :

| Mahasiswa |
| - |
| +nama : String |
| +NIM : String |
| ---------------------- |
| +ngelaprak() : void |


Kodingan Java :

```java
class Mahasiswa 
{
    public String nama;
    public String NIM;

    public void ngelaprak() {

    }
}
```

2. Membuat 1 objek dari masing-masing class diagram yang telah dibuat, menginisalisasi nilai attribut masing-masing objek dan memanggil minimal 1 method atau behaviour yang sudah terdefinisi **(+15 Points)**

Contoh : 

```java
Mahasiswa mhs = new Mahasiswa();
mhs.nama = "Alex";
mhs.NIM = "235150600000";

mhs.ngelaprak();
```
3. Membuat aplikasi interaktif yang menerima input pengguna dan menerapkan konsep [CRUD](https://www.freecodecamp.org/news/crud-operations-explained/) **(+30 Points)**

Referensi : https://github.com/dvnf10cpp/CRUD-OOP-Java

## ⏳ Deadline

Bocchi senpai yang baik hati memberikan deadline 10 hari sejak tugas ini dipublish di classroom.

## 📤 Pengumpulan

- Jangan lupa untuk membuat folder Tugas 3
- Pada folder Tugas 3, buatlah 1 folder dengan nama [```diagrams```](./diagrams/) dan 1 folder dengan nama [```src```](./src/)
- Letakkan gambar hasil rancangan class diagram ke folder [```diagrams```](./diagrams/)
- Isi identitas kamu beserta tema yang dipilih dan class diagram yang dibikin sesuai template yang bisa kamu temui pada file berikut : [File Template](./diagrams/README.md)
- Apabila submisi kalian ada kodingan, kumpulkan source code kodingan kalian ke folder [```src```](./src/)
- Jalankan command git berikut di terminal
```zsh
git add . 
git commit -m "selesai tugas 3"
git push origin master
```
- Pastikan gambar sudah ada di github repository milik kamu
- Buatlah video penjelasan mengenai class diagram yang kamu buat
- Maksimal durasi video 20 menit
- Upload video penjelasan ke youtube dan batasi videonya hanya yang memiliki link yang dapat melihat
- Kumpulkan juga gambar rancangan class diagram ke classroom

## 💯 Total Bonus Points
Apabila kalian memenuhi semua optional requirements, maka Bocchi Senpai akan memberikan kalian total bonus poin sebesar 50 poin yang dapat membantu kalian saat UTP/UAP nanti

## 👥 Contacts

Apabila masih kebingngan dengan tugas ini silahkan menghubungi asisten praktikum, ganbatee!!!

![gif](https://i.pinimg.com/originals/48/c9/52/48c9522aaa31a27582216bec737e92ce.gif)