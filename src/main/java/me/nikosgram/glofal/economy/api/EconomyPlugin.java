package me.nikosgram.glofal.economy.api;

import me.nikosgram.glofal.economy.api.service.EconomyService;

public interface EconomyPlugin
{
    String getVersion();

    EconomyService getEconomyService();
}
