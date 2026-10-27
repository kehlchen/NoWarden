package info.plugin.minecraft.nowarden;

import org.bukkit.plugin.java.JavaPlugin;
import info.plugin.minecraft.nowarden.utils.UpdateChecker;

public class NoWarden extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        UpdateChecker.checkUpdate(getConfig());
        getLogger().info("NoWarden enabled!");
    }
}
