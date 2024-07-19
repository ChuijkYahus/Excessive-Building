package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.concurrent.CompletableFuture;

public class EBEnUsLangGen extends FabricLanguageProvider {
    public EBEnUsLangGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup lookup, TranslationBuilder build) {
        //BLOCKS
        build.add(EBBlocks.OAK_MOSAIC, "Oak Mosaic");
        build.add(EBBlocks.OAK_MOSAIC_STAIRS, "Oak Mosaic Stairs");
        build.add(EBBlocks.OAK_MOSAIC_SLAB, "Oak Mosaic Slab");
        build.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, "Oak Mosaic Vertical Stairs");
        build.add(EBBlocks.SPRUCE_MOSAIC, "Spruce Mosaic");
        build.add(EBBlocks.SPRUCE_MOSAIC_STAIRS, "Spruce Mosaic Stairs");
        build.add(EBBlocks.SPRUCE_MOSAIC_SLAB, "Spruce Mosaic Slab");
        build.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, "Spruce Mosaic Vertical Stairs");
        build.add(EBBlocks.BIRCH_MOSAIC, "Birch Mosaic");
        build.add(EBBlocks.BIRCH_MOSAIC_STAIRS, "Birch Mosaic Stairs");
        build.add(EBBlocks.BIRCH_MOSAIC_SLAB, "Birch Mosaic Slab");
        build.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, "Birch Mosaic Vertical Stairs");
        build.add(EBBlocks.JUNGLE_MOSAIC, "Jungle Mosaic");
        build.add(EBBlocks.JUNGLE_MOSAIC_STAIRS, "Jungle Mosaic Stairs");
        build.add(EBBlocks.JUNGLE_MOSAIC_SLAB, "Jungle Mosaic Slab");
        build.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, "Jungle Mosaic Vertical Stairs");
        build.add(EBBlocks.ACACIA_MOSAIC, "Acacia Mosaic");
        build.add(EBBlocks.ACACIA_MOSAIC_STAIRS, "Acacia Mosaic Stairs");
        build.add(EBBlocks.ACACIA_MOSAIC_SLAB, "Acacia Mosaic Slab");
        build.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, "Acacia Mosaic Vertical Stairs");
        build.add(EBBlocks.DARK_OAK_MOSAIC, "Dark Oak Mosaic");
        build.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS, "Dark Oak Mosaic Stairs");
        build.add(EBBlocks.DARK_OAK_MOSAIC_SLAB, "Dark Oak Mosaic Slab");
        build.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, "Dark Oak Mosaic Vertical Stairs");
        build.add(EBBlocks.MANGROVE_MOSAIC, "Mangrove Mosaic");
        build.add(EBBlocks.MANGROVE_MOSAIC_STAIRS, "Mangrove Mosaic Stairs");
        build.add(EBBlocks.MANGROVE_MOSAIC_SLAB, "Mangrove Mosaic Slab");
        build.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, "Mangrove Mosaic Vertical Stairs");
        build.add(EBBlocks.CHERRY_MOSAIC, "Cherry Mosaic");
        build.add(EBBlocks.CHERRY_MOSAIC_STAIRS, "Cherry Mosaic Stairs");
        build.add(EBBlocks.CHERRY_MOSAIC_SLAB, "Cherry Mosaic Slab");
        build.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, "Cherry Mosaic Vertical Stairs");
        build.add(EBBlocks.CRIMSON_MOSAIC, "Crimson Mosaic");
        build.add(EBBlocks.CRIMSON_MOSAIC_STAIRS, "Crimson Mosaic Stairs");
        build.add(EBBlocks.CRIMSON_MOSAIC_SLAB, "Crimson Mosaic Slab");
        build.add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS, "Crimson Mosaic Vertical Stairs");
        build.add(EBBlocks.WARPED_MOSAIC, "Warped Mosaic");
        build.add(EBBlocks.WARPED_MOSAIC_STAIRS, "Warped Mosaic Stairs");
        build.add(EBBlocks.WARPED_MOSAIC_SLAB, "Warped Mosaic Slab");
        build.add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS, "Warped Mosaic Vertical Stairs");
        build.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, "Bamboo Mosaic Vertical Stairs");
        build.add(EBBlocks.COBBLESTONE_BRICKS, "Cobblestone Bricks");
        build.add(EBBlocks.COBBLESTONE_BRICK_STAIRS, "Cobblestone Brick Stairs");
        build.add(EBBlocks.COBBLESTONE_BRICK_SLAB, "Cobblestone Brick Slab");
        build.add(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS, "Cobblestone Brick Vertical Stairs");
        build.add(EBBlocks.CRACKED_COBBLESTONE_BRICKS, "Cracked Cobblestone Bricks");
        build.add(EBBlocks.MOSSY_COBBLESTONE_BRICKS, "Mossy Cobblestone Bricks");
        build.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS, "Mossy Cobblestone Brick Stairs");
        build.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, "Mossy Cobblestone Brick Slab");
        build.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS, "Mossy Cobblestone Brick Vertical Stairs");
        build.add(EBBlocks.COBBLED_DEEPSLATE_BRICKS, "Cobbled Deepslate Bricks");
        build.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS, "Cobbled Deepslate Brick Stairs");
        build.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB, "Cobbled Deepslate Brick Slab");
        build.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS, "Cobbled Deepslate Brick Vertical Stairs");
        build.add(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS, "Cracked Cobbled Deepslate Bricks");
        build.add(EBBlocks.BLACKSTONE_BRICKS, "Blackstone Bricks");
        build.add(EBBlocks.BLACKSTONE_BRICK_STAIRS, "Blackstone Brick Stairs");
        build.add(EBBlocks.BLACKSTONE_BRICK_SLAB, "Blackstone Brick Slab");
        build.add(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS, "Blackstone Brick Vertical Stairs");
        build.add(EBBlocks.CRACKED_BLACKSTONE_BRICKS, "Cracked Blackstone Bricks");
        build.add(EBBlocks.COBBLESTONE_BRICK_WALL, "Cobblestone Brick Wall");
        build.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL, "Mossy Cobblestone Brick Wall");
        build.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL, "Cobbled Deepslate Brick Wall");
        build.add(EBBlocks.BLACKSTONE_BRICK_WALL, "Blackstone Brick Wall");
        build.add(EBBlocks.LOGO, "Logo Block");
        build.add(EBBlocks.ANCIENT_PLANKS, "Ancient Planks");
        build.add(EBBlocks.ANCIENT_STAIRS, "Ancient Stairs");
        build.add(EBBlocks.ANCIENT_SLAB, "Ancient Slab");
        build.add(EBBlocks.ANCIENT_VERTICAL_STAIRS, "Ancient Vertical Stairs");
        build.add(EBBlocks.ANCIENT_MOSAIC, "Ancient Mosaic");
        build.add(EBBlocks.ANCIENT_MOSAIC_STAIRS, "Ancient Mosaic Stairs");
        build.add(EBBlocks.ANCIENT_MOSAIC_SLAB, "Ancient Mosaic Slab");
        build.add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS, "Ancient Mosaic Vertical Stairs");
        build.add(EBBlocks.ANCIENT_BUTTON, "Ancient Button");
        build.add(EBBlocks.ANCIENT_PRESSURE_PLATE, "Ancient Pressure Plate");
        build.add(EBBlocks.ANCIENT_DOOR, "Ancient Door");
        build.add(EBBlocks.ANCIENT_TRAPDOOR, "Ancient Trapdoor");
        build.add(EBBlocks.ANCIENT_LOG, "Ancient Log");
        build.add(EBBlocks.ANCIENT_WOOD, "Ancient Wood");
        build.add(EBBlocks.STRIPPED_ANCIENT_LOG, "Stripped Ancient Log");
        build.add(EBBlocks.STRIPPED_ANCIENT_WOOD, "Stripped Ancient Wood");
        build.add(EBBlocks.ANCIENT_LEAVES, "Ancient Leaves");
        build.add(EBBlocks.ANCIENT_FENCE, "Ancient Fence");
        build.add(EBBlocks.ANCIENT_FENCE_GATE, "Ancient Fence Gate");
        build.add(EBBlocks.ANCIENT_SAPLING, "Ancient Sapling");
        build.add(EBBlocks.POTTED_ANCIENT_SAPLING, "Potted Ancient Sapling");
        build.add(EBBlocks.CHISELED_OAK_PLANKS, "Chiseled Oak Planks");
        build.add(EBBlocks.CHISELED_SPRUCE_PLANKS, "Chiseled Spruce Planks");
        build.add(EBBlocks.CHISELED_BIRCH_PLANKS, "Chiseled Birch Planks");
        build.add(EBBlocks.CHISELED_JUNGLE_PLANKS, "Chiseled Jungle Planks");
        build.add(EBBlocks.CHISELED_ACACIA_PLANKS, "Chiseled Acacia Planks");
        build.add(EBBlocks.CHISELED_DARK_OAK_PLANKS, "Chiseled Dark Oak Planks");
        build.add(EBBlocks.CHISELED_MANGROVE_PLANKS, "Chiseled Mangrove Planks");
        build.add(EBBlocks.CHISELED_BAMBOO_PLANKS, "Chiseled Bamboo Planks");
        build.add(EBBlocks.CHISELED_CRIMSON_PLANKS, "Chiseled Crimson Planks");
        build.add(EBBlocks.CHISELED_WARPED_PLANKS, "Chiseled Warped Planks");
        build.add(EBBlocks.CHISELED_ANCIENT_PLANKS, "Chiseled Ancient Planks");
        build.add(EBBlocks.GLOOM_PLANKS, "Gloom Planks");
        build.add(EBBlocks.GLOOM_STAIRS, "Gloom Stairs");
        build.add(EBBlocks.GLOOM_SLAB, "Gloom Slab");
        build.add(EBBlocks.GLOOM_VERTICAL_STAIRS, "Gloom Vertical Stairs");
        build.add(EBBlocks.GLOOM_MOSAIC, "Gloom Mosaic");
        build.add(EBBlocks.GLOOM_MOSAIC_STAIRS, "Gloom Mosaic Stairs");
        build.add(EBBlocks.GLOOM_MOSAIC_SLAB, "Gloom Mosaic Slab");
        build.add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS, "Gloom Mosaic Vertical Stairs");
        build.add(EBBlocks.GLOOM_BUTTON, "Gloom Button");
        build.add(EBBlocks.GLOOM_PRESSURE_PLATE, "Gloom Pressure Plate");
        build.add(EBBlocks.GLOOM_DOOR, "Gloom Door");
        build.add(EBBlocks.GLOOM_TRAPDOOR, "Gloom Trapdoor");
        build.add(EBBlocks.GLOOM_LOG, "Gloom Log");
        build.add(EBBlocks.GLOOM_WOOD, "Gloom Wood");
        build.add(EBBlocks.STRIPPED_GLOOM_LOG, "Stripped Gloom Log");
        build.add(EBBlocks.STRIPPED_GLOOM_WOOD, "Stripped Gloom Wood");
        build.add(EBBlocks.GLOOM_FENCE, "Gloom Fence");
        build.add(EBBlocks.GLOOM_FENCE_GATE, "Gloom Fence Gate");
        build.add(EBBlocks.CHISELED_GLOOM_PLANKS, "Chiseled Gloom Planks");
        build.add(EBBlocks.COPPER_BRICKS, "Copper Bricks");
        build.add(EBBlocks.COPPER_BRICK_STAIRS, "Copper Stairs");
        build.add(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, "Copper Brick Vertical Stairs");
        build.add(EBBlocks.COPPER_BRICK_SLAB, "Copper Slab");
        build.add(EBBlocks.COPPER_PRESSURE_PLATE, "Copper Pressure Plate");
        build.add(EBBlocks.EXPOSED_COPPER_BRICKS, "Exposed Copper Bricks");
        build.add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS, "Exposed Copper Stairs");
        build.add(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, "Exposed Copper Brick Vertical Stairs");
        build.add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB, "Exposed Copper Slab");
        build.add(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, "Exposed Copper Pressure Plate");
        build.add(EBBlocks.WEATHERED_COPPER_BRICKS, "Weathered Copper Bricks");
        build.add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS, "Weathered Copper Stairs");
        build.add(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, "Weathered Copper Brick Vertical Stairs");
        build.add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB, "Weathered Copper Slab");
        build.add(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, "Weathered Copper Pressure Plate");
        build.add(EBBlocks.OXIDIZED_COPPER_BRICKS, "Oxidized Copper Bricks");
        build.add(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS, "Oxidized Copper Stairs");
        build.add(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, "Oxidized Copper Brick Vertical Stairs");
        build.add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB, "Oxidized Copper Slab");
        build.add(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, "Oxidized Copper Pressure Plate");
        build.add(EBBlocks.WAXED_COPPER_BRICKS, "Waxed Copper Bricks");
        build.add(EBBlocks.WAXED_COPPER_BRICK_STAIRS, "Waxed Copper Stairs");
        build.add(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS, "Waxed Copper Brick Vertical Stairs");
        build.add(EBBlocks.WAXED_COPPER_BRICK_SLAB, "Waxed Copper Slab");
        build.add(EBBlocks.WAXED_COPPER_PRESSURE_PLATE, "Waxed Copper Pressure Plate");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, "Waxed Exposed Copper Bricks");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS, "Waxed Exposed Copper Stairs");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, "Waxed Exposed Copper Brick Vertical Stairs");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB, "Waxed Exposed Copper Slab");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, "Waxed Exposed Copper Pressure Plate");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, "Waxed Weathered Copper Bricks");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS, "Waxed Weathered Copper Stairs");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, "Waxed Weathered Copper Brick Vertical Stairs");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB, "Waxed Weathered Copper Slab");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, "Waxed Weathered Copper Pressure Plate");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, "Waxed Oxidized Copper Bricks");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS, "Waxed Oxidized Copper Stairs");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, "Waxed Oxidized Copper Brick Vertical Stairs");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB, "Waxed Oxidized Copper Slab");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, "Waxed Oxidized Copper Pressure Plate");
        build.add(EBBlocks.COPPER_BUTTON, "Copper Button");
        build.add(EBBlocks.EXPOSED_COPPER_BUTTON, "Exposed Copper Button");
        build.add(EBBlocks.WEATHERED_COPPER_BUTTON, "Weathered Copper Button");
        build.add(EBBlocks.OXIDIZED_COPPER_BUTTON, "Oxidized Copper Button");
        build.add(EBBlocks.WAXED_COPPER_BUTTON, "Waxed Copper Button");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON, "Waxed Exposed Copper Button");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON, "Waxed Weathered Copper Button");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON, "Waxed Oxidized Copper Button");
        build.add(EBBlocks.IRON_BRICKS, "Iron Bricks");
        build.add(EBBlocks.IRON_BRICK_STAIRS, "Iron Brick Stairs");
        build.add(EBBlocks.IRON_BRICK_SLAB, "Iron Brick Slab");
        build.add(EBBlocks.IRON_BRICK_VERTICAL_STAIRS, "Iron Brick Vertical Stairs");
        build.add(EBBlocks.GOLD_BRICKS, "Gold Bricks");
        build.add(EBBlocks.GOLD_BRICK_STAIRS, "Gold Brick Stairs");
        build.add(EBBlocks.GOLD_BRICK_SLAB, "Gold Brick Slab");
        build.add(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS, "Gold Brick Vertical Stairs");
        build.add(EBBlocks.LAPIS_BRICKS, "Lapis Bricks");
        build.add(EBBlocks.LAPIS_BRICK_STAIRS, "Lapis Brick Stairs");
        build.add(EBBlocks.LAPIS_BRICK_SLAB, "Lapis Brick Slab");
        build.add(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS, "Lapis Brick Vertical Stairs");
        build.add(EBBlocks.EMERALD_BRICKS, "Emerald Bricks");
        build.add(EBBlocks.EMERALD_BRICK_STAIRS, "Emerald Brick Stairs");
        build.add(EBBlocks.EMERALD_BRICK_SLAB, "Emerald Brick Slab");
        build.add(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS, "Emerald Brick Vertical Stairs");
        build.add(EBBlocks.DIAMOND_BRICKS, "Diamond Bricks");
        build.add(EBBlocks.DIAMOND_BRICK_STAIRS, "Diamond Brick Stairs");
        build.add(EBBlocks.DIAMOND_BRICK_SLAB, "Diamond Brick Slab");
        build.add(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS, "Diamond Brick Vertical Stairs");
        build.add(EBBlocks.NETHERITE_BRICKS, "Netherite Bricks");
        build.add(EBBlocks.NETHERITE_BRICK_STAIRS, "Netherite Brick Stairs");
        build.add(EBBlocks.NETHERITE_BRICK_SLAB, "Netherite Brick Slab");
        build.add(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS, "Netherite Brick Vertical Stairs");
        build.add(EBBlocks.SEA_GLASS, "Sea Glass");
        build.add(EBBlocks.VERDANT_SEA_GLASS, "Verdant Sea Glass");
        build.add(EBBlocks.FUCHSIA_SEA_GLASS, "Fuchsia Sea Glass");
        build.add(EBBlocks.AQUA_SEA_GLASS, "Aqua Sea Glass");
        build.add(EBBlocks.SCARLET_SEA_GLASS, "Scarlet Sea Glass");
        build.add(EBBlocks.ROSE_SEA_GLASS, "Rose Sea Glass");
        build.add(EBBlocks.SEA_GLASS_PANE, "Sea Glass Pane");
        build.add(EBBlocks.VERDANT_SEA_GLASS_PANE, "Verdant Sea Glass Pane");
        build.add(EBBlocks.FUCHSIA_SEA_GLASS_PANE, "Fuchsia Sea Glass Pane");
        build.add(EBBlocks.AQUA_SEA_GLASS_PANE, "Aqua Sea Glass Pane");
        build.add(EBBlocks.SCARLET_SEA_GLASS_PANE, "Scarlet Sea Glass Pane");
        build.add(EBBlocks.ROSE_SEA_GLASS_PANE, "Rose Sea Glass Pane");
        build.add(EBBlocks.BONE_BRICKS, "Bone Bricks");
        build.add(EBBlocks.BONE_BRICK_STAIRS, "Bone Brick Stairs");
        build.add(EBBlocks.BONE_BRICK_SLAB, "Bone Brick Slab");
        build.add(EBBlocks.BONE_BRICK_VERTICAL_STAIRS, "Bone Brick Vertical Stairs");
        build.add(EBBlocks.BONE_BRICK_WALL, "Bone Brick Wall");

        //ITEMS
        build.add(EBItems.ANCIENT_SIGN, "Ancient Sign");
        build.add(EBItems.ANCIENT_HANGING_SIGN, "Ancient Hanging Sign");
        build.add(EBItems.ANCIENT_FRUIT, "Ancient Fruit");
        build.add(EBItems.GLOOM_SIGN, "Gloom Sign");
        build.add(EBItems.GLOOM_HANGING_SIGN, "Gloom Hanging Sign");

        //SHERDS
        build.add(EBItems.ROYALTY_POTTERY_SHERD, "Royalty Pottery Sherd");
        build.add(EBItems.ANCIENT_POTTERY_SHERD, "Ancient Pottery Sherd");
        build.add(EBItems.BITTER_POTTERY_SHERD, "Bitter Pottery Sherd");
        build.add(EBItems.BOIN_POTTERY_SHERD, "Boin Pottery Sherd");
        build.add(EBItems.BUSTLING_POTTERY_SHERD, "Bustling Pottery Sherd");
        build.add(EBItems.CHECKERED_POTTERY_SHERD, "Checkered Pottery Sherd");
        build.add(EBItems.DECAY_POTTERY_SHERD, "Decay Pottery Sherd");
        build.add(EBItems.DESTRUCTION_POTTERY_SHERD, "Destruction Pottery Sherd");
        build.add(EBItems.FORWARDS_POTTERY_SHERD, "Forwards Pottery Sherd");
        build.add(EBItems.HEXXED_POTTERY_SHERD, "Hexxed Pottery Sherd");
        build.add(EBItems.KITTEH_POTTERY_SHERD, "Kitteh Pottewy Shewd");
        build.add(EBItems.LIFE_POTTERY_SHERD, "Life Pottery Sherd");
        build.add(EBItems.MESMERIZE_POTTERY_SHERD, "Mesmerize Pottery Sherd");
        build.add(EBItems.PORTAL_POTTERY_SHERD, "Portal Pottery Sherd");
        build.add(EBItems.POTTERY_POTTERY_SHERD, "Pottery Pottery Sherd");
        build.add(EBItems.RING_POTTERY_SHERD, "Ring Pottery Sherd");
        build.add(EBItems.SNOUT_POTTERY_SHERD, "Snout Pottery Sherd");
        build.add(EBItems.SPRITE_POTTERY_SHERD, "Sprite Pottery Sherd");
        build.add(EBItems.TWINS_POTTERY_SHERD, "Twins Pottery Sherd");
        build.add(EBItems.WRATHFUL_POTTERY_SHERD, "Wrathful Pottery Sherd");
        build.add(EBItems.IS_THAT_POTTERY_SHERD, "Is That Pottery Sherd");
        build.add(EBItems.KOKOS_BUG_POTTERY_SHERD, "Kokos Bug Pottery Sherd");
        build.add(EBItems.THIEF_POTTERY_SHERD, "Thief Pottery Sherd");

        //TOOLTIPS
        build.add("tooltip.block.interact", "Upon Interaction:");
        build.add("tooltip.block.variant", "Cycles Block Variants:");
        build.add("tooltip.block.interact_sugar", "Interact with Sugar:");
        build.add("tooltip.block.swift", "Increases Movement Speed");
        build.add("tooltip.block.interact_soil", "Interact with Soil:");
        build.add("tooltip.block.fill", "Fills Up Pot");
        build.add("tooltip.block.interact_glow_removals", "Interact with Paper:");
        build.add("tooltip.block.glow_removal", "Removes it's Glow");
        build.add("tooltip.block.when_powered", "When Powered by Redstone:");
        build.add("tooltip.block.soul_magma", "Creates a Lifting Bubble Column");

        //MISC
        build.add("excessive_building.container.kiln", "Kiln");

        //ITEM GROUPS
        build.add("itemgroup.excessive_building", "Excessive Building");

        //PAINTING TITLES
        build.add("painting.excessive_building.forgotten_kingdom.title", "Forgotten Kingdom");
        build.add("painting.excessive_building.beacon_of_the_desert.title", "Beacon of the Desert");
        build.add("painting.excessive_building.beacon_of_the_desert_trimmed.title", "Beacon of the Desert (Trimmed)");
        build.add("painting.excessive_building.burrito.title", "Burrito?");
        build.add("painting.excessive_building.courbet_original.title", "Courbet (Original)");
        build.add("painting.excessive_building.crash_landing.title", "Crash Landing");
        build.add("painting.excessive_building.fit_for_a_queen.title", "Fit for a Queen");
        build.add("painting.excessive_building.floors.title", "Floors");
        build.add("painting.excessive_building.horizon.title", "Shine");
        build.add("painting.excessive_building.imminent_detonation.title", "Imminent Detonation");
        build.add("painting.excessive_building.kolos_bug.title", "Kolos Bug");
        build.add("painting.excessive_building.lone_bridge.title", "Lone Bridge");
        build.add("painting.excessive_building.long_trips.title", "Long Trips");
        build.add("painting.excessive_building.paleobotany.title", "Paleobotany");
        build.add("painting.excessive_building.pufferlight.title", "Pufferlight");
        build.add("painting.excessive_building.scourge_bringer.title", "Scourge Bringer");
        build.add("painting.excessive_building.sniffing_in_the_pine_forest.title", "Sniffing in the Pine Forest");
        build.add("painting.excessive_building.stage_original.title", "Stage (Original)");
        build.add("painting.excessive_building.the_end.title", "The End");
        build.add("painting.excessive_building.the_lone_tree.title", "The Lone Tree");
        build.add("painting.excessive_building.thine_holy_peanut.title", "Thine Holy Peanut");
        build.add("painting.excessive_building.why_do_my_eyes_hurt.title", "Bleeding Eclipse");
        build.add("painting.excessive_building.evil_eye.title", "Evil Eye");
        build.add("painting.excessive_building.rebellious.title", "Rebellious");
        build.add("painting.excessive_building.catastrophes_before_the_calamity.title", "Catastrophes Before the Calamity");

        //PAINTING AUTHORS
        build.add("painting.excessive_building.forgotten_kingdom.author", "Yirmiri");
        build.add("painting.excessive_building.beacon_of_the_desert.author", "Brickerman");
        build.add("painting.excessive_building.beacon_of_the_desert_trimmed.author", "Brickerman");
        build.add("painting.excessive_building.burrito.author", "Drisfish");
        build.add("painting.excessive_building.courbet_original.author", "Kristoffer Zetterstrand");
        build.add("painting.excessive_building.crash_landing.author", "BackupCup");
        build.add("painting.excessive_building.fit_for_a_queen.author", "Yirmiri");
        build.add("painting.excessive_building.floors.author", "Brickerman");
        build.add("painting.excessive_building.horizon.author", "HaWii");
        build.add("painting.excessive_building.imminent_detonation.author", "BackupCup");
        build.add("painting.excessive_building.kolos_bug.author", "Kolos");
        build.add("painting.excessive_building.lone_bridge.author", "Nebula");
        build.add("painting.excessive_building.long_trips.author", "SmillyScarfs");
        build.add("painting.excessive_building.paleobotany.author", "Hecco");
        build.add("painting.excessive_building.pufferlight.author", "Pepagg");
        build.add("painting.excessive_building.scourge_bringer.author", "BackupCup");
        build.add("painting.excessive_building.sniffing_in_the_pine_forest.author", "Brickerman");
        build.add("painting.excessive_building.stage_original.author", "Kristoffer Zetterstrand");
        build.add("painting.excessive_building.the_end.author", "BackupCup");
        build.add("painting.excessive_building.the_lone_tree.author", "SuperMightByte");
        build.add("painting.excessive_building.thine_holy_peanut.author", "YesMan2");
        build.add("painting.excessive_building.why_do_my_eyes_hurt.author", "BackupCup");
        build.add("painting.excessive_building.evil_eye.author", "Yirmiri");
        build.add("painting.excessive_building.rebellious.author", "Rebel (the dog)");
        build.add("painting.excessive_building.catastrophes_before_the_calamity.author", "BackupCup");

        //EFFECTS
        build.add("effect.excessive_building.reaching", "Reaching");
        build.add("effect.excessive_building.reaching.description", "Increases the interaction reach of the user, this does not affect attack reach.");

        build.add("item.minecraft.potion.effect.reaching_potion", "Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.reaching_potion", "Splash Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.reaching_potion", "Lingering Potion of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.reaching_potion", "Arrow of Reaching");

        build.add("item.minecraft.potion.effect.long_reaching_potion", "Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.long_reaching_potion", "Splash Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.long_reaching_potion", "Lingering Potion of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.long_reaching_potion", "Arrow of Reaching");

        build.add("item.minecraft.potion.effect.strong_reaching_potion", "Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.strong_reaching_potion", "Splash Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.strong_reaching_potion", "Lingering Potion of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.strong_reaching_potion", "Arrow of Reaching");

        build.add("effect.excessive_building.shortening", "Shortening");
        build.add("effect.excessive_building.shortening.description", "Decreases the interaction reach of the user, this does not affect attack reach.");

        build.add("item.minecraft.potion.effect.shortening_potion", "Potion of Shortening");
        build.add("item.minecraft.splash_potion.effect.shortening_potion", "Splash Potion of Shortening");
        build.add("item.minecraft.lingering_potion.effect.shortening_potion", "Lingering Potion of Shortening");
        build.add("item.minecraft.tipped_arrow.effect.shortening_potion", "Arrow of Shortening");

        build.add("item.minecraft.potion.effect.long_shortening_potion", "Potion of Shortening");
        build.add("item.minecraft.splash_potion.effect.long_shortening_potion", "Splash Potion of Shortening");
        build.add("item.minecraft.lingering_potion.effect.long_shortening_potion", "Lingering Potion of Shortening");
        build.add("item.minecraft.tipped_arrow.effect.long_shortening_potion", "Arrow of Shortening");

        build.add("item.minecraft.potion.effect.strong_shortening_potion", "Potion of Shortening");
        build.add("item.minecraft.splash_potion.effect.strong_shortening_potion", "Splash Potion of Shortening");
        build.add("item.minecraft.lingering_potion.effect.strong_shortening_potion", "Lingering Potion of Shortening");
        build.add("item.minecraft.tipped_arrow.effect.strong_shortening_potion", "Arrow of Shortening");

        //YAPPING TOOLTIPS [COMPAT]
        //TODO: ADD
    }
}
