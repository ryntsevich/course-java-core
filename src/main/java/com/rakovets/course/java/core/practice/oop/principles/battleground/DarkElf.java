package com.rakovets.course.java.core.practice.oop.principles.battleground;

public class DarkElf extends Enemy {
    private final int DAMAGE = 50;
    private int healthDarkElf;

    public DarkElf(int health) {
        super(health);
        this.healthDarkElf = health;
    }

    @Override
    public void attackHero(Hero man) {
        if (man instanceof Mag) {
            man.takeDamage(DAMAGE * 2);
        } else {
            man.takeDamage(DAMAGE);
        }
    }

    public void superPower(DarkElf elf, Zombie zombie) {
        if (elf.isAlive()) {
            if (elf.getHealth() < healthDarkElf / 2) {
                elf.setHealth(elf.getHealth() + 50);
                if(zombie.isAlive()) {
                    zombie.setHealth(zombie.getHealth() + 50);
                }
            }
        }
    }
}
