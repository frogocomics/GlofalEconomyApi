package me.nikosgram.glofal.economy.api.service;

import org.spongepowered.api.entity.player.Player;

public interface EconomyService
{
    double getBalance( Player player );

    void setBalance( Player player, double balance );

    void appendBalance( Player player, double balance );

    void removeBalance( Player player, double balance );

    void saveChanges();
}
