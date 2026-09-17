package net.delvat1n.huntersbestiary.datagen;

import net.delvat1n.huntersbestiary.HuntersBestiary;
import net.delvat1n.huntersbestiary.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, HuntersBestiary.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.BESTIARY.get(), ModelTemplates.FLAT_ITEM);


    }
}
