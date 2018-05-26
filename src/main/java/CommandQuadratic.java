import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;

public class CommandQuadratic implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        CommandSender p = commandSender;
        if (args.length < 3) {
            p.sendMessage(ChatColor.RED + "Usage: " + command.getUsage());
            return true;
        }
        float a = parseFloat(args[0]);
        float b = parseFloat(args[1]);
        float c = parseFloat(args[2]);
        float bSquared = b * b;
        float fourAC = 4 * a * c;
        float bSquaredMinusFourAC = bSquared -fourAC;
        float twoA = 2 * a;
        float ans = (-b + (float) Math.sqrt(bSquaredMinusFourAC)) / twoA;
        p.sendMessage(ChatColor.GOLD + "Answer: " + ChatColor.RED + ans);
        return true;
    }
}
