package net.entity0.portal;

import net.entity0.portal.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class LexicalPortalsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
