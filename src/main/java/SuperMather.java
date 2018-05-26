import org.bukkit.plugin.java.JavaPlugin;

public class SuperMather extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SuperMather has been enabled!");
        getCommand("add").setExecutor(new CommandAdd());
        getCommand("subtract").setExecutor(new CommandSubtract());
        getCommand("multiply").setExecutor(new CommandMultiply());
        getCommand("divide").setExecutor(new CommandDivide());
        // getCommand("quadratic").setExecutor(new CommandQuadratic());
        getCommand("sqrt").setExecutor(new CommandSqrt());
        getCommand("exponent").setExecutor(new CommandExponent());
    }

    @Override
    public void onDisable() {
        getLogger().info("SuperMather shutting down.");
    }
}
