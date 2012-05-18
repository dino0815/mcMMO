package com.gmail.nossr50.skills.repair;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface RepairManager {
    /**
     * Register a repairable with the RepairManager
     *
     * @param repairable Repairable to register
     */
    public void registerRepairable(Repairable repairable);

    /**
     * Register a list of repairables with the RepairManager
     *
     * @param repairable List<Repairable> to register
     */
    public void registerRepairables(List<Repairable> repairables);

    /**
     * Checks if an item is repairable
     *
     * @param itemId id to check if repairable
     * @return true if repairable, false if not
     */
    public boolean isRepairable(int itemId);

    /**
     * Handle the repairing of this object
     *
     * @param player Player that is repairing an item
     * @param item ItemStack that is being repaired
     */
    public void handleRepair(Player player, ItemStack item);
}
