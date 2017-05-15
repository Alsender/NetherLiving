package alsender.netherliving.proxy;

import alsender.netherliving.registry.ToolRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by alsender on 5/14/17.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        ToolRegistry.initModel();
    }
}
