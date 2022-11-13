package fr.Lengthrequired.SyncRealDate;



import fr.Lengthrequired.SyncRealDate.FastInv.FastInvManager;
import fr.Lengthrequired.SyncRealDate.commands.ServerCommand;
import fr.Lengthrequired.SyncRealDate.commands.TimeTime;
import fr.Lengthrequired.SyncRealDate.commands.TimezoneCommand;
import fr.Lengthrequired.SyncRealDate.commands.timeproperties;
import fr.Lengthrequired.TabCompleter.SyncRealDate.SyncDateTabCompleter;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;


import java.time.*;
import java.util.*;

public class Main extends JavaPlugin {
    private static Main instance;


    Properties properties = new Properties();

    public Properties getProperties() {
        return this.properties;
    }
    @Override
    public void onEnable() {
        FastInvManager.register(this);
        World world = Bukkit.getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        timeproperties.createFileifNE();
        new TimeTime().runTaskTimer(this, (60 - LocalTime.now().getSecond()) * 20, 20 * 30);
        //System.out.println((60 - LocalTime.now().getSecond()) );
        instance = this;
        Bukkit.getConsoleSender().sendMessage(
                "§e" + getDescription().getName() + " active !\n" +
                        "§ePlugin creer par §c" + getDescription().getAuthors() + "§e\n" +
                        "§eVersion : " + getDescription().getVersion() + "\n" +
                        "§e" + getDescription().getDescription()
        );
        Objects.requireNonNull(getCommand("syncdate")).setExecutor( new ServerCommand());
        Objects.requireNonNull(getCommand("syncdate")).setTabCompleter(new SyncDateTabCompleter());
        Objects.requireNonNull(getCommand("timezone")).setExecutor( new TimezoneCommand());
        super.onEnable();
    }


    @Override
    public void onDisable() {
        Bukkit.getServer().getScheduler().cancelTasks(this);
    }


    public static Main getInstance(){
        return instance;
    }




}




