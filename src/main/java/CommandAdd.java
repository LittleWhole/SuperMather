import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static java.lang.Float.parseFloat;

public class CommandAdd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
            CommandSender p = commandSender;
            if (args.length < 2) {
                p.sendMessage(ChatColor.RED + "Usage: " + command.getUsage());
                return true;
            }
            float ans = parseFloat(args[0]) + parseFloat(args[1]);
            p.sendMessage(ChatColor.GOLD + "Answer:" + ChatColor.RED + " " + ans);
            return true;
    }
}
