package fr.Lengthrequired.SyncRealDate.commands;



import fr.Lengthrequired.SyncRealDate.FastInv.FastInv;
import fr.Lengthrequired.SyncRealDate.FastInv.ItemBuilder;
import net.minecraft.network.chat.ChatHexColor;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class TimezoneCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;
        System.out.println(player.getName()+" has opened the timezone menu");


        new timeZoneInventory().open(player);

        return true;
    }
}
class timeZoneInventory extends FastInv {

    public timeZoneInventory() {

        super(54, ChatColor.LIGHT_PURPLE + "Timezone");
        net.md_5.bungee.api.ChatColor orange = net.md_5.bungee.api.ChatColor.of("#FFA500");
        String s = "§6You have set the timezone to";

        setCloseFilter(p->true);


        setItems(getBorders(),new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).name(ChatColor.RED+"ඞ").build());
        setItem(10,new ItemBuilder(Material.LIGHT_BLUE_WOOL).name(ChatColor.AQUA+"UTC-9").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-9);
            e.getWhoClicked().sendMessage(s+" UTC-9");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(11,new ItemBuilder(Material.PURPLE_WOOL).name(ChatColor.LIGHT_PURPLE+"UTC-8").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-8);
            e.getWhoClicked().sendMessage(s+" UTC-8");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(12,new ItemBuilder(Material.RED_WOOL).name(ChatColor.RED+"UTC-7").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-7);
            e.getWhoClicked().sendMessage(s+" UTC-7");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(13,new ItemBuilder(Material.ORANGE_WOOL).name(orange + "UTC-6").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-6);
            e.getWhoClicked().sendMessage(s+" UTC-6");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });

        setItem(14,new ItemBuilder(Material.YELLOW_WOOL).name(ChatColor.YELLOW+"UTC-5").build(), e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-5);
            e.getWhoClicked().sendMessage(s + " UTC-5");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(15,new ItemBuilder(Material.LIME_WOOL).name(ChatColor.GREEN+"UTC-4").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-4);
            e.getWhoClicked().sendMessage(s + " UTC-4");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(16,new ItemBuilder(Material.LIGHT_BLUE_WOOL).name(ChatColor.AQUA+"UTC-3").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-3);
            e.getWhoClicked().sendMessage(s + " UTC-3");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(19,new ItemBuilder(Material.PURPLE_WOOL).name(ChatColor.LIGHT_PURPLE+"UTC-2").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-2);
            e.getWhoClicked().sendMessage(s + " UTC-2");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(20,new ItemBuilder(Material.RED_WOOL).name(ChatColor.RED+"UTC-1").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(-1);
            e.getWhoClicked().sendMessage(s + " UTC-1");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(21,new ItemBuilder(Material.ORANGE_WOOL).name(orange+"UTC").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(0);
            e.getWhoClicked().sendMessage(s + " UTC");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(22,new ItemBuilder(Material.YELLOW_WOOL).name(ChatColor.YELLOW+"UTC+1").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(1);
            e.getWhoClicked().sendMessage(s + " UTC+1");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(23,new ItemBuilder(Material.LIME_WOOL).name(ChatColor.GREEN+"UTC+2").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(2);
            e.getWhoClicked().sendMessage(s + " UTC+2");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(24,new ItemBuilder(Material.LIGHT_BLUE_WOOL).name(ChatColor.AQUA+"UTC+3").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(3);
            e.getWhoClicked().sendMessage(s + " UTC+3");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(25,new ItemBuilder(Material.PURPLE_WOOL).name(ChatColor.LIGHT_PURPLE+"UTC+4").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(4);
            e.getWhoClicked().sendMessage(s + " UTC+4");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(28,new ItemBuilder(Material.RED_WOOL).name(ChatColor.RED+"UTC+5").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(5);
            e.getWhoClicked().sendMessage(s + " UTC+5");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(29,new ItemBuilder(Material.ORANGE_WOOL).name(orange+"UTC+6").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(6);
            e.getWhoClicked().sendMessage(s + " UTC+6");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(30,new ItemBuilder(Material.YELLOW_WOOL).name(ChatColor.YELLOW+"UTC+7").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(7);
            e.getWhoClicked().sendMessage(s + " UTC+7");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(31,new ItemBuilder(Material.LIME_WOOL).name(ChatColor.GREEN+"UTC+8").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(8);
            e.getWhoClicked().sendMessage(s + " UTC+8");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(32,new ItemBuilder(Material.LIGHT_BLUE_WOOL).name(ChatColor.AQUA+"UTC+9").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(9);
            e.getWhoClicked().sendMessage(s + " UTC+9");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(33,new ItemBuilder(Material.PURPLE_WOOL).name(ChatColor.LIGHT_PURPLE+"UTC+10").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(10);
            e.getWhoClicked().sendMessage(s + " UTC+10");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(34,new ItemBuilder(Material.RED_WOOL).name(ChatColor.RED+"UTC+11").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(11);
            e.getWhoClicked().sendMessage(s + " UTC+11");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(39,new ItemBuilder(Material.ORANGE_WOOL).name(orange+"UTC+12").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(12);
            e.getWhoClicked().sendMessage(s + " UTC+12");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(40,new ItemBuilder(Material.YELLOW_WOOL).name(ChatColor.YELLOW+"UTC+13").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(13);
            e.getWhoClicked().sendMessage(s + " UTC+13");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(41,new ItemBuilder(Material.LIME_WOOL).name(ChatColor.GREEN+"UTC+14").build(),e->{
            setCloseFilter(p->false);
            timeproperties.setTimezone(14);
            e.getWhoClicked().sendMessage(s + " UTC+14");
            e.getWhoClicked().closeInventory();
            ServerCommand.SetTime();
        });
        setItem(43,new ItemBuilder(Material.CLOCK).name(ChatColor.GOLD+"DayLight Saving").build(),e->{

            timeproperties.setDaylightsaving(!timeproperties.getDaylightsaving());
            if(timeproperties.getDaylightsaving()){
                e.getWhoClicked().sendMessage("§6DayLight Saving is now §aenabled");
            }else{
                e.getWhoClicked().sendMessage("§6DayLight Saving is now §cdisabled");
            }

            ServerCommand.SetTime();
        });


    }

    @Override
    public void onOpen(InventoryOpenEvent event){

    }
}
