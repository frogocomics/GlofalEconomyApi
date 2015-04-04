/*
 * This is part of GlofalEconomy: https://github.com/nikosgram13/GlofalEconomy
 *
 * Copyright 2014-2015 Nikos Grammatikos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://raw.githubusercontent.com/nikosgram13/GlofalEconomy/master/LICENSE
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
