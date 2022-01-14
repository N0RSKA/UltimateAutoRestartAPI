package dev.norska.uar.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UltimateAutoRestartAutoDelayEvent extends Event implements Cancellable {
    private boolean isCancelled;
    private static final HandlerList HANDLERS;
    
    private int delayedBySeconds;
    
    static {
        HANDLERS = new HandlerList();
    }
    
    public UltimateAutoRestartAutoDelayEvent(int delayedBySeconds1) {
    	this.delayedBySeconds = delayedBySeconds1;
        this.isCancelled = false;
    }
    
    public int getDelayedBySeconds() {
    	return delayedBySeconds;
    }
    
    public void setDelayedBySeconds(int delayedBySeconds1) {
    	delayedBySeconds = delayedBySeconds1;
    }
    
    public boolean isCancelled() {
        return this.isCancelled;
    }
    
    public void setCancelled(final boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
    public HandlerList getHandlers() {
        return UltimateAutoRestartAutoDelayEvent.HANDLERS;
    }
    
    public static HandlerList getHandlerList() {
        return UltimateAutoRestartAutoDelayEvent.HANDLERS;
    }
}
