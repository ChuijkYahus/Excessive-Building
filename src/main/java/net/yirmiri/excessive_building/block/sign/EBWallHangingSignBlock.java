package net.yirmiri.excessive_building.block.sign;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.block.entity.EBHangingSignBlockEntity;

public class EBWallHangingSignBlock extends WallHangingSignBlock {
    public EBWallHangingSignBlock(WoodType woodType, Settings settings) {
        super(woodType, settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EBHangingSignBlockEntity(pos, state);
    }
}
