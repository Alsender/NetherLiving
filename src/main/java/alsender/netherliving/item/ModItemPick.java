package alsender.netherliving.item;

import alsender.netherliving.main.NetherLiving;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 5/14/17.
 */
public class ModItemPick extends ItemPickaxe {

    public ModItemPick(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(NetherLiving.modid + name);
        setRegistryName(name);
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
