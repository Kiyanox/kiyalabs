package com.kiyanox.kiyalabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KiyaItem extends Item
{
    public KiyaItem(String itemName)
    {
        this.setUnlocalizedName(itemName);
        this.setTextureName(Kiyalabs_main.MODID + ":" + itemName);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

}
