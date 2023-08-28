package net.entity0.portal.item;

import net.entity0.portal.LexicalPortals;
import net.entity0.portal.item.custom.Unopenedlex;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItems {
    public static final Item UNOPENEDLEX = registerItem("unopened_book", new Unopenedlex((new FabricItemSettings())));

    private static void AddItemsToFunctionalItemGroup(FabricItemGroupEntries entries) {
        entries.add(UNOPENEDLEX);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LexicalPortals.Mod_Id, name), item);
    }
    public static void registerModItems () {
        LexicalPortals.LOGGER.info("registering lexical items that portal for " + LexicalPortals.Mod_Id);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::AddItemsToFunctionalItemGroup);
    }
}
