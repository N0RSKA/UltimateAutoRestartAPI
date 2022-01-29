package dev.norska.uar.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UARIntervalChangeEvent extends Event implements Cancellable {
    private boolean isCancelled;
    private int interval;
    private static final HandlerList HANDLERS;
    
    static {
        HANDLERS = new HandlerList();
    }
    
    public UARIntervalChangeEvent(int interval1) {
        this.isCancelled = false;
        this.interval = interval1;
    }
    
    public boolean isCancelled() {
        return this.isCancelled;
    }
    
    public void setCancelled(final boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
    public void setInterval(int interval1) {
    	interval = interval1;
    }
    
    public int getInterval() {
    	return interval;
    }
    
    public HandlerList getHandlers() {
        return UARIntervalChangeEvent.HANDLERS;
    }
    
    public static HandlerList getHandlerList() {
        return UARIntervalChangeEvent.HANDLERS;
    }
}
