package net.entity0.portal.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.NbtTextContent;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Unopenedlex extends Item {
    public Unopenedlex(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!user.getStackInHand(hand).hasNbt()); {
                NbtCompound Nbtdata = new NbtCompound();
                Nbtdata.putDouble("savedX", user.getX());
                Nbtdata.putDouble("savedY", user.getY());
                Nbtdata.putDouble("savedZ", user.getZ());
                user.getStackInHand(hand).setNbt(Nbtdata);
        }
        return super.use(world, user, hand);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.hasNbt();
    }

}









