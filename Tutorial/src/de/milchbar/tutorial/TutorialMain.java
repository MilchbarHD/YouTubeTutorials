package de.milchbar.tutorial;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

/**
 * Created by Jonas on 16.11.2015.
 */

public class TutorialMain extends JavaPlugin {

    public void onEnable(){
        this.getLogger().info("Your plugin has been enabled!");
        Bukkit.spigot().restart();
    }

    public void onDisable(){
        this.getLogger().info("Your plugin has been disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = null;
        if (sender instanceof Player) {
            p = (Player) sender;
        }

        if (cmd.getName().equalsIgnoreCase("heal")){ // Wenn der Spieler /basic eingegeben hat, dann mache das folgende...
            // tue etwas...
            p.setHealth( p.getMaxHealth() );
            p.setFoodLevel( 20 );
            p.sendMessage( "§aDu bist nun geheilt." );
            return true;
        }
        return false;
    }








}
