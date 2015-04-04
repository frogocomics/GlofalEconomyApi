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

package me.nikosgram.glofal.economy.api.event;

import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.event.AbstractEvent;
import org.spongepowered.api.util.event.Cancellable;

public class ChangeBalanceEvent extends AbstractEvent implements Cancellable
{
    private final Player player;
    private final double oldBalance;
    private       double newBalance;

    private boolean cancelled = false;

    public ChangeBalanceEvent( Player player, double oldBalance, double newBalance )
    {
        this.player = player;
        this.oldBalance = oldBalance;
        this.newBalance = newBalance;
    }

    public Player getPlayer()
    {
        return player;
    }

    public double getOldBalance()
    {
        return oldBalance;
    }

    public double getNewBalance()
    {
        return newBalance;
    }

    public void setNewBalance( double newBalance )
    {
        this.newBalance = newBalance;
    }

    public double getDifference()
    {
        return newBalance - oldBalance;
    }

    @Override
    public boolean isCancelled()
    {
        return cancelled;
    }

    @Override
    public void setCancelled( boolean cancelled )
    {
        this.cancelled = cancelled;
    }
}
