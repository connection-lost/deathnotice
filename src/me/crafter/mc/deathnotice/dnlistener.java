package me.crafter.mc.deathnotice;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class dnlistener implements Listener {
	


	@EventHandler

	public void onPlayerDeath(PlayerDeathEvent death) {
		Player p = death.getEntity().getPlayer();
		Location loc = p.getLocation();
		String msg = "Your death location is: X:"+Integer.toString(loc.getBlockX())+" Y:"+Integer.toString(loc.getBlockY())+" Z:"+Integer.toString(loc.getBlockZ())+".";
		p.sendMessage(ChatColor.RED+msg);
			
	}
}


