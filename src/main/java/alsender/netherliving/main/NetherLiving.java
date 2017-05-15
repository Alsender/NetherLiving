package alsender.netherliving.main;

import alsender.netherliving.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by alsender on 05/14/17
 */
@Mod(modid = NetherLiving.modid, name = NetherLiving.name, version = NetherLiving.version)

public class NetherLiving {
	public static final String modid = "netherliving";
	public static final String name = "Nether Living";
	public static final String version = "0.0.1";

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@SidedProxy(serverSide = "alsender.netherliving.proxy.CommonProxy", clientSide = "alsender.netherliving.proxy.ClientProxy")
	public static CommonProxy proxy;
}