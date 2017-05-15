package alsender.netherliving.registry;

import alsender.netherliving.item.ModItemPick;
import net.minecraft.item.Item;

/**
 * Created by alsender on 5/14/17.
 */
public class ToolRegistry {

    public static Item
            item_netherrack_pick;

    public static void init() {
        item_netherrack_pick = new ModItemPick(Item.ToolMaterial.STONE, "netherrack_pick");
    }

    public static void initModel() {
        ((ModItemPick)item_netherrack_pick).initModel();
    }
}
