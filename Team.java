package ru.geekbrains.javacore.lesson1.chendyrevanastya;

import java.util.Random;
import java.util.Scanner;

public class Team {


    private String surname;
    private String name;


    public static void main(String[] args) {
        System.out.println("Team Library");

        Player[] player = {
                new Player("Archi", "Bachreyn", "captain", 0, 1000, 500),
                new Player("Bruce", "Wayne", "team member", 150, 500, 0),
                new Player("Evgeniy", "Yourov", "team member", 100, 0, 1000),
                new Player("Markus", "Beyker", "team member", 140, 2000, 1000),

        };

        System.out.println("--------------------------------------------------------");
        System.out.println("Team members:");
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i].getFullInfo());
        }

        System.out.println("--------------------------------------------------------");

    }
}

    class Player {


        private String surname;
        private String name;
        private String position;
        private int maxJump;
        private int maxRun;
        private int maxSwim;


        // Конструктор класса должен заполнять эти поля при создании объекта;
        Player(String surname, String name, String position, int maxJump, int maxRun, int maxSwim) {

            this.name = name;
            this.surname = surname;
            this.position = position;
            this.maxJump = maxJump;
            this.maxRun = maxRun;
            this.maxSwim = maxSwim;
        }

        public Player() {

        }


        String getFullInfo() {
            return
                    this.surname + " " +
                            this.name + " " +
                            this.position + " " +
                            this.maxJump + " " +
                            this.maxRun + " " +
                            this.maxSwim + " ";

        }
    }

    class Course extends Player{


        private String surname;
        private String name;
        private String position;
        private int maxRun;
        private int maxSwim;
        private int maxJump;
        private final Random random = new Random();
        private int height;
        private int jumpDiff;
        private int runDiff;
        private int swimDiff;

        Scanner scanner = new Scanner(System.in);



        public Course(int maxJump, int maxRun, int maxSwim) {
            super();
            this.maxJump = maxJump + jumpDiff;
            this.maxRun = maxRun + runDiff;
            this.maxSwim = maxSwim + swimDiff;
        }

        protected boolean run(int distance) {
            return (distance < maxRun);
        }

        public void infoRun(String surname, String name, int maxJump, int maxRun, int maxSwim) {
            System.out.println();
        }

        protected boolean swim(int distance) {
            return (distance < maxSwim);
        }

        public void infoSwim(String surname, String name, int maxJump, int maxRun, int maxSwim) {
            System.out.println();

        }

        protected boolean jump(int distance) {
            return (distance < maxJump);
        }

        public static void infoJump(String surname, String name, int maxJump, int maxRun, int maxSwim) {
            System.out.println();
        }

        public Course(String surname, String name, String position, int maxJump, int maxRun, int maxSwim, Player[] player) {
            this.name = name;
            this.surname = surname;
            this.position = position;
            this.maxJump = maxJump;
            this.maxRun = maxRun;
            this.maxSwim = maxSwim;


            System.out.println("--------------------------------------------------------");
            System.out.println("Team members:");
            for (int i = 0; i < player.length; i++) {
                System.out.println(player[i].getFullInfo());
            }

            System.out.println("--------------------------------------------------------");

        }
    }

