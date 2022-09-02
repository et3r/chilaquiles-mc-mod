package net.et3r.chilaquiles.item;

import net.et3r.chilaquiles.Chilaquiles;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_CHILAQUILES = registerItem("raw_chilaquiles",
            new Item(new FabricItemSettings().group(ModItemGroup.CHILAQUILES)));

    public static final Item CHILAQUILES = registerItem("chilaquiles",
            new Item(new FabricItemSettings().group(ModItemGroup.CHILAQUILES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Chilaquiles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Chilaquiles.LOGGER.debug( "Registering Mod Items for " + Chilaquiles.MOD_ID );
    }

}
