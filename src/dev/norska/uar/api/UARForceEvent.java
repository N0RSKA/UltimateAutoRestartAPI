package dev.norska.uar.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UARForceEvent extends Event implements Cancellable {
    private boolean isCancelled;
    private int seconds;
    private static final HandlerList HANDLERS;
    
    static {
        HANDLERS = new HandlerList();
    }
    
    public UARForceEvent(int seconds1) {
        this.isCancelled = false;
        this.seconds = seconds1;
    }
    
    public boolean isCancelled() {
        return this.isCancelled;
    }
    
    public void setCancelled(final boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
    public void setSeconds(int seconds1) {
    	seconds = seconds1;
    }
    
    public int getSeconds() {
    	return seconds;
    }
    
    public HandlerList getHandlers() {
        return UARForceEvent.HANDLERS;
    }
    
    public static HandlerList getHandlerList() {
        return UARForceEvent.HANDLERS;
    }
}
