package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class BattleGroundDemo {
    public static void main(String[] args) {
        Warrior war = new Warrior("Artur", 100);
        System.out.println(war.getName());
        System.out.println(war.getHealth());
        war.setHealth(200);
        System.out.println(war.getHealth());
        Zombie zombie = new Zombie(200);
        war.attackEnemy(zombie);
        System.out.println(zombie.isAlive());
        System.out.println(zombie.getHealth());
        zombie.attackHero(war);
        System.out.println(war.isAlive());
        System.out.println(war.getHealth());
        zombie.superPower(zombie);
        System.out.println(zombie.getHealth());

        DarkElf elf = new DarkElf(300);
        Mag mag = new Mag("Greenberg", 200);

        System.out.println(mag.getName());
        System.out.println("Mag: " + mag.getHealth());
        System.out.println("Dark Elf: " + elf.getHealth());
        System.out.println("Warrior: " + war.getHealth());
        elf.attackHero(war);
        System.out.println("Warrior: " + war.getHealth());
        elf.attackHero(mag);
        System.out.println("Mag: " + mag.getHealth());


        war.attackEnemy(elf);
        System.out.println("Dark Elf: " + elf.getHealth());
        war.attackEnemy(elf);
        System.out.println("Dark Elf: " + elf.getHealth());
        elf.superPower(elf, zombie);
        System.out.println("Dark Elf: " + elf.getHealth());

        war.attackEnemy(elf);
        System.out.println("Dark Elf: " + elf.getHealth());
        war.attackEnemy(elf);
        System.out.println("Dark Elf: " + elf.getHealth());
        System.out.println("Zombie: " + zombie.getHealth());

        elf.superPower(elf, zombie);
        System.out.println("Dark Elf: " + elf.getHealth());
        System.out.println("Zombie: " + zombie.getHealth());

        elf.attackHero(war);
        elf.attackHero(war);
        elf.attackHero(war);

        Archer archer = new Archer("Lind", 60);
        elf.attackHero(archer);
        elf.attackHero(archer);
        System.out.println("Archer: " + archer.getHealth());
        System.out.println("Warrior: " + war.getHealth());
        mag.superPower(mag, archer, war, elf, zombie);
        System.out.println("Dark Elf: " + elf.getHealth());
        System.out.println("Zombie: " + zombie.getHealth());
    }
}
