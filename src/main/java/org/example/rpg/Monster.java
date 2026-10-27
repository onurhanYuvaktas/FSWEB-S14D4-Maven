package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public double attack() {
        double calculatedDamage = getDamage();

        // Eğer bu nesne Poisonable özelliğine sahipse poison ekle
        if (this instanceof Poisonable) {
            calculatedDamage += ((Poisonable) this).poison();
        }

        // Eğer bu nesne Bleedable özelliğine sahipse bleed ekle
        if (this instanceof Bleedable) {
            calculatedDamage += ((Bleedable) this).bleed();
        }

        return calculatedDamage;
    }
}
