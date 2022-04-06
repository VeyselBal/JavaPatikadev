package MineSweeper;

import java.util.Scanner;

public class MineSweeper {

    Scanner inp = new Scanner(System.in);
    int row;
    int col;
    String[][] matris;
    int bomb;
    int count = 0;
    int lives = 0;
    String[][] fake;
    int a;
    int b;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.bomb = (row * col) / 4;
        this.matris = new String[this.row + 2][this.col + 2];
        this.fake = new String[this.row + 2][this.col + 2];
        this.count = (row * col) - (row * col) / 4;
    }

    void run() {
        for (int i = 0; i < this.row + 2; i++) {
            for (int j = 0; j < this.col + 2; j++) {
                this.matris[i][j] = "-";
            }
        }
        for (int i = 0; i < this.row + 2; i++) {
            for (int j = 0; j < this.col + 2; j++) {
                this.fake[i][j] = "-";
            }
        }

        while (this.bomb > 0) {
            int n = (int) (Math.random() * this.row) + 1;
            int r = (int) (Math.random() * this.col) + 1;

            if (!(this.matris[n][r].equals("*"))) {
                this.matris[n][r] = "*";
                this.bomb--;
            }
        }
        for (int i = 1; i <= this.row; i++) {
            for (int j = 1; j <= this.col; j++) {
                System.out.print(this.matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================================================================");

        for (int i = 1; i <= this.row; i++) {
            for (int j = 1; j <= this.col; j++) {
                System.out.print(this.fake[i][j] + " ");
            }
            System.out.println();
        }

        while (lives < this.count) {
            while (true) {
                System.out.print("satır seç : ");
                a = inp.nextInt();
                System.out.print("Sutun seç : ");
                b = inp.nextInt();
                if (((a <= 0) || (a > row)) || ((b <= 0) || (b > col))) {
                    System.out.println("matris dışında değerler girdiniz tekrar deneyin");
                } else if (!(this.fake[a][b].equals("*") || this.fake[a][b].equals("-"))) {
                    System.out.println("aynı sutun veya satır denenmiştir lütfen tekrar deneyiniz");
                } else {
                    break;
                }
            }
            if (this.matris[a][b].equals("*")) {
                System.out.println("Malesef mayına bastınız Oyunu kaybettiniz");
                break;
            } else {
                for (int i = a - 1; i <= a + 1; i++) {
                    for (int j = b - 1; j <= b + 1; j++) {
                        if ((this.matris[i][j].equals("*"))) {
                            this.bomb++;
                        }
                    }
                }
                for (int i = 1; i <= this.row; i++) {
                    for (int j = 1; j <= this.col; j++) {
                        if (i == a && j == b) {
                            this.fake[i][j] = String.valueOf(this.bomb);
                        }
                        System.out.print(this.fake[i][j] + " ");
                    }
                    System.out.println();
                }
                this.bomb = 0;
            }
            lives++;
        }
        if (lives == 7) System.out.println("Tebrikler Oyunu Kazandınız !!!");
    }
}
