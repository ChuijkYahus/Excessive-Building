package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

public class EBLootModifiers {
    //MINECRAFT
    public static final Identifier SNIFFER_DIGGING = Identifier.ofVanilla("gameplay/sniffer_digging");
    public static final Identifier TRAIL_RUINS_RARE = Identifier.ofVanilla("archaeology/trail_ruins_rare");
    public static final Identifier DESERT_PYRAMID = Identifier.ofVanilla("archaeology/desert_pyramid");
    public static final Identifier DESERT_WELL = Identifier.ofVanilla("archaeology/desert_well");
    public static final Identifier OCEAN_RUIN_COLD = Identifier.ofVanilla("archaeology/ocean_ruin_cold");
    public static final Identifier OCEAN_RUIN_WARM = Identifier.ofVanilla("archaeology/ocean_ruin_warm");

    public static float trailRuinsRareSherdChance = 0.083F; //8.3%
    public static float desertPyramidSherdChance = 0.125F; //12.5%
    public static float desertWellSherdChance = 0.25F; //25%
    public static float oceanRuinSherdChance = 0.067F; //6.7%
//TODO: FIX LOOT MODIFIERS
    public static void modifyLoot() {
        LootTableEvents.MODIFY.register((key, builder, source, manager) -> {
            if (SNIFFER_DIGGING.equals(key.getValue()) && EBConfig.ENABLE_ANCIENT_SAPLINGS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(EBConfig.ANCIENT_SAPLING_CHANCE.get()))
                        .with(ItemEntry.builder(EBBlocks.ANCIENT_SAPLING)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                        .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_GLOOM_SEEDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(EBConfig.GLOOM_SEEDS_CHANCE.get()))
                        .with(ItemEntry.builder(EBBlocks.GLOOM_SEEDS)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(trailRuinsRareSherdChance))
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(trailRuinsRareSherdChance))
                        .with(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(trailRuinsRareSherdChance))
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(trailRuinsRareSherdChance))
                        .with(ItemEntry.builder(EBItems.SPRITE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(trailRuinsRareSherdChance))
                        .with(ItemEntry.builder(EBItems.RING_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(trailRuinsRareSherdChance))
                        .with(ItemEntry.builder(EBItems.ANCIENT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(trailRuinsRareSherdChance))
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.FORWARDS_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.PORTAL_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.BUSTLING_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.SNOUT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(oceanRuinSherdChance))
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.DESTRUCTION_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.WRATHFUL_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.ROYALTY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.DECAY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.LIFE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertPyramidSherdChance))
                        .with(ItemEntry.builder(EBItems.THIEF_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertWellSherdChance))
                        .with(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertWellSherdChance))
                        .with(ItemEntry.builder(EBItems.BITTER_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertWellSherdChance))
                        .with(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertWellSherdChance))
                        .with(ItemEntry.builder(EBItems.CHECKERED_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertWellSherdChance))
                        .with(ItemEntry.builder(EBItems.BOIN_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertWellSherdChance))
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_POTTERY_SHERDS.get()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(desertWellSherdChance))
                        .with(ItemEntry.builder(EBItems.HEXXED_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1)))
                                .build());
                builder.pool(poolBuilder.build());
            }
        });
    }
}
