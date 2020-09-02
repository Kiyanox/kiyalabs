package com.kiyanox.kiyalabs;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class OreGeneration implements IWorldGenerator {
	
	private Block block;
	private int veinSize;
	
	OreGeneration(Block block, int veinSize)
	{
		this.block = block;
		this.veinSize = veinSize;
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		
		if(world.provider.dimensionId == 0)
		{
			this.runGenerator(new WorldGenMinable(block, veinSize), world, random, chunkX, chunkZ, 10, 0, 120);
		}
	}
	
	private void runGenerator (WorldGenerator generator, World world, Random rand, int chunk_x, int chunk_z, int spawnChance, int minHeight, int maxHeight) {
		
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		{
			throw new IllegalArgumentException("Illegal Arguments for WorldGen");
		}
		
		int diffHeight = maxHeight - minHeight + 1;
		
		
		for(int i = 0; i < spawnChance; i++)
		{
			int a = chunk_x * 16 + rand.nextInt(16);
			int b = chunk_z * 16 + rand.nextInt(16);
			int c = minHeight + rand.nextInt(diffHeight);
			generator.generate(world, rand, a, c, b);
		}
		
	}
}
