package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class DarkElf extends Enemy {
    private final int DAMAGE = 50;
    private int health;

    public DarkElf(int health) {
        super(health);
        this.health = health;
    }

    @Override
    public void attackHero(Hero man) {
        if (man instanceof Mag) {
            man.takeDamage(DAMAGE * 2);
        } else {
            man.takeDamage(DAMAGE);
        }
    }

    /*
    Изменить параметры на массивы
     */
    public void superPower(DarkElf elf, Zombie zombie) {
        if (elf.isAlive()) {
            if (elf.getHealth() < health / 2) {
                elf.setHealth(elf.getHealth() + 50);
                if (zombie.isAlive()) {
                    zombie.setHealth(zombie.getHealth() + 50);
                }
            }
        }
    }
}
