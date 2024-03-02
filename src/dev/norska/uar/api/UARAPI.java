package dev.norska.uar.api;

import dev.norska.uar.UltimateAutoRestart;
import lombok.Getter;
import lombok.Setter;

public class UARAPI {

	@Getter
	@Setter
	public static String forceRestartReason = "N/A";

	public static int getInterval(UltimateAutoRestart instance) {
		return 0;
	}
	
	public static void setInterval(UltimateAutoRestart instance, int seconds) {
		
	}

}
