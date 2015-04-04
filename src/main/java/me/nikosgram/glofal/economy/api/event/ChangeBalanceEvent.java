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
