import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static java.lang.Float.parseFloat;

public class CommandSqrt implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        CommandSender p = commandSender;
        if (args.length == 0) {
            p.sendMessage(ChatColor.RED + "Usage: " + command.getUsage());
            return true;
        }
        p.sendMessage(ChatColor.GOLD + "Answer:" + ChatColor.RED + " " + Math.sqrt(parseFloat(args[0])));
        return true;
    }
}
