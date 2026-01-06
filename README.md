#  <p align="center">🎮 Mini Arcade SOFTBOY</p>

**Tugas-Besar-Algoritma-Pemrograman -SOFTBOY-**
--- 
## 📌 Deskripsi Program

**Mini Arcade SOFTBOY** adalah aplikasi game berbasis **Java Console** yang berisi beberapa mini game dengan fitur **login, registrasi, dan leaderboard**.
Program ini dibuat sebagai **Tugas Besar Algoritma dan Pemrograman** untuk melatih pemahaman konsep dasar **Java** dan **Object Oriented Programming (OOP)**.

---

## 🧩 Fitur Program
- 🔐 Login & Registrasi User  
- 🎲 Game Tebak Angka (1–100)
- ❌⭕ Game Tic Tac Toe (vs Bot)
- 📊 Leaderboard untuk setiap game  
- 👤 Sistem user aktif (login session)

---

## 🛠️ Konsep yang Digunakan

Program ini menerapkan konsep dasar Java, antara lain:

- Class & Object (OOP)
- Array & ArrayList
- Method
- Percabangan (`if`, `switch`)
- Perulangan (`for`, `while`)
- Input & Output menggunakan `Scanner`

---

## 👤 Sistem User

User dapat:
- Melakukan registrasi akun
- Login ke sistem
- Bermain game menggunakan akun yang sedang login

Data user disimpan menggunakan struktur data `ArrayList` agar dapat menampung banyak akun:
```java
ArrayList<user> users = new ArrayList<>();
```
## 🎲 Game 1: Tebak Angka (1–100)

### 📖 Cara Bermain
- Sistem akan menghasilkan angka acak antara **1–100**
- User menebak angka sampai tebakan benar
- Sistem menghitung jumlah tebakan user

### 📊 Leaderboard Tebak Angka
- Menyimpan riwayat setiap permainan
- Satu user dapat muncul lebih dari satu kali
- Data disimpan berdasarkan jumlah tebakan

Contoh penyimpanan data:
```java
leaderboard.add(new leaderboardTebakangka(userLogin, jumlahTebakan));
```

## ❌⭕ Game 2: Tic Tac Toe
### 📖 Cara Bermain
- User bermain melawan bot
- User menggunakan simbol X
- Bot menggunakan simbol O
- Bot bergerak secara random

## 📊 Leaderboard Tic Tac Toe
- Menyimpan total menang dan kalah
- Setiap user hanya memiliki satu data
- Jika user bermain lagi, data akan diperbarui

Logika leaderboard:
```
void dataleaderboardTictakto(String username, boolean menang)
```

- 📌 Jika user sudah ada → update skor
- 📌 Jika user belum ada → buat data baru

### 📊 Tampilan Leaderboard
Leaderboard ditampilkan berdasarkan:

Tebak Angka → jumlah tebakan

Tic Tac Toe → total menang & kalah

Contoh output:
```
1. haditya | Menang: 2 | Kalah: 1
```

## ▶️ Cara Menjalankan Program
Pastikan Java sudah terinstall
Compile program:
```
javac tesLogin.java
```
Jalankan program:
```
java tesLogin
```
## 📚 Tujuan Pembuatan
- Program ini dibuat untuk:
- Memahami konsep dasar Java
- Menerapkan OOP secara sederhana
- Melatih penggunaan ArrayList dan method
- Membuat aplikasi console yang interaktif

### 👨‍💻 Author
```
Nama: Haditya
Bahasa: Java
Tipe Aplikasi: Console Application
 ```
