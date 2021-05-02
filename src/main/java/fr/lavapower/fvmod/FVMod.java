package fr.lavapower.fvmod;

import fr.lavapower.fvmod.world.WorldGenCustomStructures;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid= FVMod.MODID, name="Futures Versions Mod", version="1.0.0", acceptedMinecraftVersions = "[1.12.2]")
public class FVMod
{
    public static final String MODID = "fvmod";

    @Mod.Instance(FVMod.MODID)
    public static FVMod instance;

    @SidedProxy(clientSide = "fr.lavapower.fvmod.FVClient", serverSide = "fr.lavapower.fvmod.FVServer")
    public static FVCommon proxy;

    public static Logger logger;
    public static final FVTab tab = new FVTab();

    public FVMod() {
        MinecraftForge.EVENT_BUS.register(new RegisteringHandler());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(new FVCommonEvent());
        GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        RegisteringHandler.registerEntities();
        RegisteringHandler.registerRecipes();
        NetworkRegistry.INSTANCE.registerGuiHandler(FVMod.instance, new GuiHandler());
    }
}
