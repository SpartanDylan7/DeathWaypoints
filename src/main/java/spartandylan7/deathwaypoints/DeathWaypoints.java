package spartandylan7.deathwaypoints;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class DeathWaypoints extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("[DW] Starting.");
        System.out.println("[DW] Starting..");
        System.out.println("[DW] Starting...");
        System.out.println("[DW] Started");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        System.out.println("[DW] Disabling.");
        System.out.println("[DW] Disabling..");
        System.out.println("[DW] Disabling...");
        System.out.println("[DW] Disabled");
    }

    @EventHandler
    public void onDeath(PlayerRespawnEvent event) {
        Player p = event.getPlayer();
        p.sendMessage(ChatColor.GOLD + "You Death Location Is " + ChatColor.YELLOW
                + p.getLastDeathLocation().getX() + ", "+ p.getLastDeathLocation().getY() + ", " + + p.getLastDeathLocation().getZ());
    }
}
