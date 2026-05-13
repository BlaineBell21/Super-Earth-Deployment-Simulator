package com.pluralsight.model.players;

public enum Specialty {
    SHOCK_TROOPER(20),
    SUPPORT_SPECIALIST(10),
    RECON_OPERATIVE(15),
    HEAVY_WEAPONS_SPECIALIST(30);

    private final int combatBonus;

    Specialty(int combatBonus){
        this.combatBonus = combatBonus;
    }

    public int getCombatBonus() {
        return combatBonus;
    }
}
