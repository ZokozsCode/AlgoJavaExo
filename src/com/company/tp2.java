package com.company;

public class tp2 {

    public static class Main {

        public static void printScores(int scores[]) {
            for (int i = 0; i < scores.length; i++) {
                System.out.println(scores[i]);
            }

        }
        public static int highScore(int scores[]) {
            int highScore = 0 ;
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] > highScore){
                    highScore = scores[i];
                }
            }
            return highScore;}

        public static boolean isSuperiorTen(int scores[]) {
            int a  = 10;
            boolean isSuperior = false;
            for (int i = 0; i < scores.length;i++) {
                if(scores[i] >= a ){
                    isSuperior = true;
                }
            }
            return  isSuperior;}



        public static void main(String[] args) {
            int scores[] = {13,34,45,23,64,11,21};

            printScores(scores);
            System.out.println("valeur la plus grande" + highScore(scores));
            isSuperiorTen(scores);
            System.out.println("valeur superieure a 10?" + isSuperiorTen(scores));

        }

    }
}

