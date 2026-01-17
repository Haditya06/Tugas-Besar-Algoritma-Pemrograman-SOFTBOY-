# 🎮 Mini Arcade SOFTBOY

Mini Arcade SOFTBOY adalah aplikasi game berbasis Java Console yang berisi beberapa mini-game lengkap dengan sistem registrasi/login dan leaderboard. Proyek ini dibuat sebagai Tugas Besar Mata Kuliah Algoritma dan Pemrograman untuk memperkuat pemahaman konsep Java dan OOP.

---
 
## 🔎 Ringkasan
- Bahasa: Java (Console)
- Fitur utama: Registrasi & Login, Tebak Angka (1–100), Tic Tac Toe vs Bot, Leaderboard, Session user aktif
- Tujuan: Latihan OOP, ArrayList, struktur data sederhana, dan I/O dasar

---

## ✨ Fitur
- Sistem user: registrasi, login, logout
- Game Tebak Angka (1–100) — hitung jumlah tebakan
- Game Tic Tac Toe melawan bot sederhana (gerakan bot acak)
- Leaderboard terpisah untuk setiap game
  - Tebak Angka: diurutkan berdasarkan jumlah tebakan (semakin sedikit semakin baik)
  - Tic Tac Toe: menyimpan total menang & kalah per user
- Session login: bermain dengan akun yang sedang aktif

---

## 🔧 Persyaratan
- Java Development Kit (JDK) terinstal (Java 8 atau lebih baru)
- Terminal / Command Prompt

---

## 🚀 Cara Menjalankan
Buka terminal di folder proyek lalu kompilasi semua file Java:
```bash
javac *.java
```
Jalankan program utama (contoh nama kelas utama: `tesLogin`):
```bash
java tesLogin
```
Catatan: Jika kelas utama berbeda, sesuaikan perintah `java`.

---

## 🕹 Cara Bermain — Ringkasan
1. Registrasi (jika belum punya akun)
2. Login menggunakan username yang terdaftar
3. Pilih game dari menu:
   - Tebak Angka:
     - Sistem memilih angka acak 1–100
     - Tebak sampai benar; sistem menghitung jumlah tebakan
     - Hasil disimpan di leaderboard
   - Tic Tac Toe:
     - User = X, Bot = O
     - Bot melakukan langkah acak
     - Setelah permainan, hasil menang/kalah akan memperbarui leaderboard

---

## 📊 Detail Leaderboard
- Tebak Angka:
  - Menyimpan setiap sesi permainan sebagai entri terpisah:
    ```java
    leaderboard.add(new leaderboardTebakangka(userLogin, jumlahTebakan));
    ```
  - Diurutkan berdasarkan `jumlahTebakan` (ascending)
- Tic Tac Toe:
  - Menyimpan rekap per user (satu data per user). Jika user bermain lagi, data di-update:
    ```java
    void dataleaderboardTictakto(String username, boolean menang)
    ```
  - Format tampilan:
    ```
    1. haditya | Menang: 2 | Kalah: 1
    ```

---

## 🧠 Struktur Konsep yang Digunakan
- Object Oriented Programming (Class & Object)
- Koleksi: `ArrayList` untuk menyimpan user dan leaderboard
- Kontrol alur: `if`, `switch`
- Perulangan: `for`, `while`
- Input: `Scanner`
- Randomization: `Random` untuk angka tebak dan langkah bot Tic Tac Toe

---

## ✅ Saran Pengembangan Berikutnya (opsional)
- Simpan data ke file (serialized/CSV/JSON) agar leaderboard persist setelah program ditutup
- Tingkatkan AI bot Tic Tac Toe (minimax)
- Tambah lebih banyak mini-games
- Antarmuka grafis sederhana (Swing/JavaFX) untuk pengalaman lebih baik
---

## 🛠 Kontribusi
Kontribusi, saran, atau laporan bug sangat diterima. Silakan buka issue atau kirim pull request di repository ini.

---

## 👨‍💻 Author
Nama: Haditya  
Bahasa: Java  
Tipe Aplikasi: Console Application

---

Terima kasih telah melihat proyek ini — semoga membantu belajar Java dan OOP! Jika ingin, saya bisa bantu:
- Menulis contoh file penyimpanan leaderboard ke file (CSV/JSON)
- Membuat README versi bahasa Inggris
- Menambahkan instruksi compile/run yang lebih spesifik sesuai struktur proyek
