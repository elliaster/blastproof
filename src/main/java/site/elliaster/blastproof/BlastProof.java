package site.elliaster.blastproof;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
//import org.bukkit.event.block.BlockExplodeEvent;
//import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;
//import java.util.List;
import org.bukkit.block.Block;
import org.bukkit.Material;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public final class BlastProof extends JavaPlugin implements Listener {

    Block b;
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
    public void onEntityExplode(EntityExplodeEvent eee){
	List<Block> blockList = eee.blockList();

	for(Iterator<Block> iterator = blockList.iterator(); iterator.hasNext();){
		Block b = iterator.next();
		if(b.getType().toString().equals("GLASS")){
			iterator.remove();
		}
	}
    }


}
