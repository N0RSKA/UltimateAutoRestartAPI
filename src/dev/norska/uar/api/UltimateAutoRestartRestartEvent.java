package dev.norska.uar.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UltimateAutoRestartRestartEvent extends Event implements Cancellable {
    private boolean isCancelled;
    private static final HandlerList HANDLERS;
    
    static {
        HANDLERS = new HandlerList();
    }
    
    public UltimateAutoRestartRestartEvent() {
        this.isCancelled = false;
    }
    
    public boolean isCancelled() {
        return this.isCancelled;
    }
    
    public void setCancelled(final boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
    public HandlerList getHandlers() {
        return UltimateAutoRestartRestartEvent.HANDLERS;
    }
    
    public static HandlerList getHandlerList() {
        return UltimateAutoRestartRestartEvent.HANDLERS;
    }
}
