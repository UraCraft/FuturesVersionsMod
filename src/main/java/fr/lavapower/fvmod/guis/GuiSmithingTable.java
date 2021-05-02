package fr.lavapower.fvmod.guis;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.containers.ContainerSmithingTable;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GuiSmithingTable extends GuiContainer
{
    private static final ResourceLocation GUI_CHEST = new ResourceLocation(FVMod.MODID, "textures/gui/container/smithing.png");
    private final InventoryPlayer player;

    public GuiSmithingTable(InventoryPlayer player, World world, BlockPos pos) {
        super(new ContainerSmithingTable(player, world, pos));
        this.player = player;
        allowUserInput = false;
        ySize = 170;
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.fontRenderer.drawString(player.getDisplayName().getUnformattedText(), 8, this.ySize - 97, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1f, 1f, 1f, 1f);
        mc.getTextureManager().bindTexture(GUI_CHEST);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
