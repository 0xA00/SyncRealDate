package fr.Lengthrequired.TabCompleter.SyncRealDate;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class SyncDateTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (player.hasPermission("SyncRealDate.admin")) {
                if (strings.length == 1) {
                    return Arrays.asList("start", "stop", "set");
                }
            }
        }
        return null;
    }
}
