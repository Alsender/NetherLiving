package alsender.netherliving.proxy;

import alsender.netherliving.registry.ToolRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Alsender on 05/14/17
 */
public class CommonProxy {
    
    public void preInit(FMLPreInitializationEvent event) {

        ToolRegistry.init();
    } 
   
    public void init(FMLInitializationEvent event) {
    
    }
    
    public void postInit(FMLPostInitializationEvent event) {
    
    }
}