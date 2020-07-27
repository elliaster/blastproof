package site.elliaster.blastproof;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import net.minecraft.server.v1_16_R1.Block;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlastProof extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[BLAST PROOF] ENABLED");
        Bukkit.getPluginManager().registerEvents(this,this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        System.out.println(e.getBlock().getType().getBlastResistance());
        Material material = e.getBlock().getBlockData().getMaterial();
        material.
    }


}
