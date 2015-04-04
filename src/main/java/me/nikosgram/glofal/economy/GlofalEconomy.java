package me.nikosgram.glofal.economy;

import me.nikosgram.glofal.economy.api.EconomyPlugin;
import me.nikosgram.glofal.economy.api.service.EconomyService;

public final class GlofalEconomy
{
    private static EconomyPlugin plugin = null;

    public static void invoke( EconomyPlugin plugin )
    {
        if ( GlofalEconomy.plugin != null )
        {
            throw new RuntimeException( "You can't invoke again this class." );
        }
        GlofalEconomy.plugin = plugin;
    }

    public static EconomyPlugin getPlugin()
    {
        return plugin;
    }

    public static EconomyService getEconomyService()
    {
        return plugin.getEconomyService();
    }
}
