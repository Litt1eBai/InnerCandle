package net.littlebai.innercandle.init;

import net.littlebai.innercandle.InnerCandle;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InnerCandle.MOD_ID);

    public static final String INNER_CANDLE = "inner_candle";
    public static final RegistryObject<Item> INNER_CANDLE;



}
