package fr.Lengthrequired.SyncRealDate.commands;


import fr.Lengthrequired.SyncRealDate.Main;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class ServerCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
    Player player = (Player) sender;
    World world = Bukkit.getWorld("world");

        if(args[0]==null){
            player.sendMessage("§cErreur : veuillez spécifier une commande");
            player.sendMessage("§c/syncdate start : §8Lance le plugin");
            player.sendMessage("§c/syncdate stop : §8Arrête le plugin");
            player.sendMessage("§c/syncdate set : §8Définit l'heure du serveur");

        }
        if (args[0].equalsIgnoreCase("start")) {
            //System.out.println(60 - LocalTime.now().getSecond());
            new TimeTime().runTaskTimer(Main.getInstance(), (60 - LocalTime.now().getSecond()) * 20, 20 * 30);
            assert world != null;
            world.setGameRule(org.bukkit.GameRule.DO_DAYLIGHT_CYCLE, false);
        } else if (args[0].equalsIgnoreCase("stop")) {
            Bukkit.getServer().getScheduler().cancelTasks(Main.getInstance());
            Bukkit.getConsoleSender().sendMessage("§6plugin stop");

            assert world != null;
            world.setGameRule(org.bukkit.GameRule.DO_DAYLIGHT_CYCLE, true);
        } else if (args[0].equalsIgnoreCase("set")) {
            SetTime();
        }
        return false;
    }

    public static void SetTime() {
        int Hticks = LocalTime.now().getHour() * 1000 - 6000;
        int Mticks = LocalTime.now().getMinute() * 16;
        TimeZone tz = TimeZone.getDefault();
        Calendar cal = GregorianCalendar.getInstance(tz);
        long UTC = (tz.getOffset(cal.getTimeInMillis()) / 3600000)*1000 ;
        World world = Bukkit.getWorld("world");
        int timezone = timeproperties.getTimezone()*1000;
        if(timeproperties.getDaylightsaving()){
            world.setTime((Hticks + Mticks + timezone) - UTC+1000);
        }
        else {
            world.setTime((Hticks + Mticks + timezone) - UTC);
        }

    }


}
