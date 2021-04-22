package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class Mag extends Hero {
    private final int DAMAGE = 70;

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy angryMan) {
        angryMan.takeDamage(DAMAGE);
    }

    /*
    Изменить параметры на массивы Hero[] heroes, Enemy[] enemies
     */
    public void superPower(Mag mag, Archer archer, Warrior war, DarkElf elf, Zombie zombie) {
        if (mag.isAlive() && (!archer.isAlive()) && (!war.isAlive())) {
            int superDamage = DAMAGE + elf.getHealth() + zombie.getHealth();
            elf.takeDamage(superDamage);
            zombie.takeDamage(superDamage);
        }
    }
}
