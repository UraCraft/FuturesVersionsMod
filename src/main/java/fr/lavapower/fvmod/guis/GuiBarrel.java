package fr.lavapower.fvmod.guis;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.containers.ContainerBarrel;
import fr.lavapower.fvmod.tileentities.TileEntityBarrel;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBarrel extends GuiContainer
{
    private static final ResourceLocation GUI_CHEST = new ResourceLocation(FVMod.MODID, "textures/gui/container/barrel.png");
    private final InventoryPlayer player;
    private final TileEntityBarrel te;

    public GuiBarrel(InventoryPlayer player, TileEntityBarrel te, EntityPlayer playerE) {
        super(new ContainerBarrel(player, te, playerE));
        this.player = player;
        this.te = te;
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
        this.fontRenderer.drawString(te.getDisplayName().getUnformattedText(), 8, 6, 4210752);
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
