import java.util.*;

class user {

    String username;
    String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class leaderboardTebakangka {

    String username;
    int jumlahTebakan;

    public leaderboardTebakangka(String username, int jumlahTebakan) {
        this.username = username;
        this.jumlahTebakan = jumlahTebakan;
    }
}

class leaderboardTictakto {

    String username;
    int menang, kalah;

    public leaderboardTictakto(String username) {
        this.username = username;
        this.menang = 0;
        this.kalah = 0;
    }
}

public class Tubes {

    static Random gen = new Random();
    static Scanner input = new Scanner(System.in);
    static ArrayList<user> users = new ArrayList<>();
    static ArrayList<leaderboardTebakangka> leaderboard = new ArrayList<>();
    static ArrayList<leaderboardTictakto> lTictakto = new ArrayList<>();
    static char[] papan = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    String userLogin;

    public static void main(String[] args) {
        Tubes app = new Tubes();
        app.menu();
    }

    void menu() {
        int pilihMenu;

        do {
            System.out.println("=== ARCADE MINI SOFTBOY ===");
            System.out.println("SELAMAT DATANG DI GAME KAMI");
            System.out.println("1. Login");
            System.out.println("2. Registrasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            input.nextLine();

            switch (pilihMenu) {
                case 1:
                    if (login()) {
                        menuGame();
                    }
                    break;
                case 2:
                    registrasi();
                    break;
                case 3:
                    System.out.print("Makasih Sudah Memaikan Game Kami\n");
                    break;
                default:
                    System.out.println("Salah Menu, Coba lagi\n");
            }
        } while (pilihMenu != 3);
    }

    void menuTebakangka() {
        int pilihAngka;

        do {
            System.out.println("\n=== TEBAK ANGKA 1 - 100 ===");
            System.out.println("1. Mului");
            System.out.println("2. Leaderboard");
            System.out.println("3. Kembali");
            System.out.print("Pilih Menu : ");
            pilihAngka = input.nextInt();
            input.nextLine();

            switch (pilihAngka) {
                case 1:
                    mainTebak();
                    break;
                case 2:
                    lihatLeaderboard();
                    break;
                case 3:
                    System.out.println("Yokk cobakk game lain yang seru\n");
                    break;
                default:
                    System.out.print("Salah Menu, Coba Lagi!!\n");
            }
        } while (pilihAngka != 3);
    }

    void menuGame() {
        int pilih;

        do {
            System.out.println("=== SELAMAT MENIKMATI ARCADE MINI SOFTBOY ===");
            System.out.println("1. TicTakTo");
            System.out.println("2. Tebak Angka 1 - 100");
            System.out.println("3. Kembali");
            System.out.print("Pilih Game : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    menuTictakto();
                    break;
                case 2:
                    menuTebakangka();
                    break;
                case 3:
                    System.out.println("Makasih Sudah Memaikan Game Kami\n");
                    break;
                default:
                    System.out.println("Salah Menu!!\n");
            }
        } while (pilih != 3);
    }

    void mainTebak() {
        System.out.println("\n========================");
        System.out.print("Tebak angka antara 0 - 100 : ");
        int nilai = gen.nextInt(100);

        int batasAtas = 100;
        int batasBawah = 0;
        int jumlahTebakan = 0;
        boolean tebak = false;

        while (!tebak) {
            int n = input.nextInt();
            jumlahTebakan++;

            if (nilai == n) {
                tebak = true;
                System.out.println("=======================");
                System.out.println("yee bener : " + n);
                System.out.println("Banyak banget nebak : " + jumlahTebakan + "\n=======================\n");
            } else if (n > nilai && n < batasAtas) {
                batasAtas = n;
                System.out.println("Tebakan anda lebih Kecil");
            } else if (n < nilai && n > batasBawah) {
                batasBawah = n;
                System.out.println("Tebakan lebih besar");
            } else {
                System.out.println("Bang salahh bangg!!");
            }
            System.out.print("Tebakan angka antara " + batasBawah + " - " + batasAtas + " : ");
        }
        leaderboard.add(new leaderboardTebakangka(userLogin, jumlahTebakan));
    }

    void lihatLeaderboard() {
        System.out.println("\n=== SKOR TEBAK ANGKA 1 - 100 ===");

        if (leaderboard.isEmpty()) {
            System.out.println("Belum ada data permainan\n");
            return;
        }

        for (int i = 0; i < leaderboard.size(); i++) {
            leaderboardTebakangka data = leaderboard.get(i);
            System.out.println((i + 1) + ". " + data.username + " | Jumlah Tebakan : " + data.jumlahTebakan);
        }
        System.out.println();

    }

    void mejaTiktaktoe() {
        System.out.println("=== TIK - TAK - TOE ===");
        System.out.println("     /-----------\\");
        System.out.println("     | " + papan[0] + " | " + papan[1] + " | " + papan[2] + " |");
        System.out.println("     |-----------|");
        System.out.println("     | " + papan[3] + " | " + papan[4] + " | " + papan[5] + " |");
        System.out.println("     |-----------|");
        System.out.println("     | " + papan[6] + " | " + papan[7] + " | " + papan[8] + " |");
        System.out.println("     \\-----------/");
        System.out.println("=======================");
    }

    void mainTictakto() {
        int pilih;

        while (true) {
            System.out.print(userLogin +" Pilih Angka 1 - 9 : ");
            pilih = input.nextInt();

            if (pilih >= 1 && pilih <= 9 && papan[pilih - 1] != 'X' && papan[pilih - 1] != 'O') {
                papan[pilih - 1] = 'X';
                break;
            } else {
                System.out.println("Pilihan Salah!!");
            }
        }
    }

    void jalanTictakto() {
        boolean jalan = true;

        while (jalan) {
            mejaTiktaktoe();
            mainTictakto();

            if (cekMenang('X')) {
                mejaTiktaktoe();
                dataleaderboardTictakto(userLogin, true);
                System.out.println(userLogin + " Kamu Menang!!\n");
                resetPapanTictakto();
                menuTictakto();
                break;
            }

            if (cekSeriTictakto()) {
                mejaTiktaktoe();
                System.out.println("Yahh Serii nihh\n");
                resetPapanTictakto();
                menuTictakto();
                break;
            }

            botGerak();
            if (cekMenang('O')) {
                mejaTiktaktoe();
                dataleaderboardTictakto(userLogin, false);
                System.out.println("wkwkkk " + userLogin + " kalah sama bot!!\n");
                resetPapanTictakto();
                menuTictakto();
                break;
            }
        }
    }

    // --- Untuk bot bergerak secara random ---
    void botGerak() {
        int pilih;
        while (true) {
            pilih = gen.nextInt(9) + 1;

            if (pilih >= 1 && pilih <= 9 && papan[pilih - 1] != 'O' && papan[pilih - 1] != 'X') {
                papan[pilih - 1] = 'O';
                break;
            }
        }
        System.out.println("Bot SOFTBOY pilih : " + pilih + "\n");
    }
    
    boolean cekSeriTictakto() {
        for (char c : papan) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
    }

    void resetPapanTictakto() {
        for (int i = 0; i < papan.length; i++) {
            papan[i] = (char) ('1' + i);
        }
    }

    boolean cekMenang(char t) {
        return (papan[0] == t && papan[1] == t && papan[2] == t) || (papan[3] == t && papan[4] == t && papan[5] == t) || (papan[6] == t && papan[7] == t && papan[8] == t)
                || (papan[0] == t && papan[3] == t && papan[6] == t) || (papan[1] == t && papan[4] == t && papan[7] == t) || (papan[2] == t && papan[5] == t && papan[8] == t)
                || (papan[0] == t && papan[4] == t && papan[8] == t) || (papan[2] == t && papan[4] == t && papan[6] == t);
    }

    // === Menu Utama dari game Tic - Tak - Toe ===
    void menuTictakto() {
        int piliTictakto;

        System.out.println("\n=== Tic - Tak - Toe ===");
        System.out.println("1. Mulai");
        System.out.println("2. Leaderboard");
        System.out.println("3. Kembali");
        System.out.print("Pilih Menu : ");
        piliTictakto = input.nextInt();

        switch (piliTictakto) {
            case 1:
                resetPapanTictakto();
                jalanTictakto();
                break;
            case 2:
                leaderboardTictakto();
                menuTictakto();
                break;
            case 3:
                System.out.println("Makasih Sudah Maen Tic-Tak-Toe\n");
                break;
            default:
                System.out.println("Salah Menu Bang!!\n");
        }
    }

    void leaderboardTictakto() {
        System.out.println("\n=== SKOR TICTAKTOE ===");
        if (lTictakto.isEmpty()) {
            System.out.println("Belum Ada Data permainan\n");
            return;
        }
        for (int i = 0; i < lTictakto.size(); i++) {
            leaderboardTictakto baru = lTictakto.get(i);
            System.out.println((i + 1) + ". " + baru.username + " | Menang: " + baru.menang + " | Kalah: " + baru.kalah);
        }
    }

    void dataleaderboardTictakto(String username, boolean menang) {
        for (int i = 0; i < lTictakto.size(); i++) {
            if (lTictakto.get(i).username.equals(username)) {
                if (menang) {
                    lTictakto.get(i).menang++;
                } else {
                    lTictakto.get(i).kalah++;
                }
                return;
            }
        }
        leaderboardTictakto baru = new leaderboardTictakto(username);
        if (menang) {
            baru.menang++;
        } else {
            baru.kalah++;
        }

        lTictakto.add(baru);
    }

    void registrasi() {
        System.out.println("=== REGISTRASI ===");
        System.out.print("Username : ");
        String username = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();

        for(user use : users){
            if(use.username.equals(username)){
                System.out.println("Username Sudah Digunakan, Silahkan Coba Lagi!!\n");
                return;
            }
        }
        users.add(new user(username, password));
        System.out.println("Registrasi Akun Berhasil\n");
    }

    boolean login() {
        System.out.println("=== LOGIN ===");
        System.out.print("Username : ");
        String username = input.nextLine();
        System.out.print("Password : ");
        String password = input.nextLine();

        for (user use : users) {
            if (use.username.equals(username) && use.password.equals(password)) {
                userLogin = username;
                System.out.println("Login Berhasil\n");
                return true;
            }
        }

        System.out.println("Login Gagal, coba lagi!!\n");
        return false;
    }
}
