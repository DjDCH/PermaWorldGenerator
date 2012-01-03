package com.djdch.bukkit.permaworldgenerator.mc100;

import java.util.Random;

import net.minecraft.server.Block;
import net.minecraft.server.Material;
import net.minecraft.server.World;

public class WorldGenClay extends WorldGenerator {
    private int a;
    private int b;

    public WorldGenClay(int paramInt) {
        this.a = Block.CLAY.id;
        this.b = paramInt;
    }

    @Override
    public boolean a(World paramWorld, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
        if (paramWorld.getMaterial(paramInt1, paramInt2, paramInt3) != Material.WATER)
            return false;
        int i = paramRandom.nextInt(this.b - 2) + 2;
        int j = 1;
        for (int k = paramInt1 - i; k <= paramInt1 + i; k++) {
            for (int m = paramInt3 - i; m <= paramInt3 + i; m++) {
                int n = k - paramInt1;
                int i1 = m - paramInt3;
                if (n * n + i1 * i1 <= i * i) {
                    for (int i2 = paramInt2 - j; i2 <= paramInt2 + j; i2++) {
                        int i3 = paramWorld.getTypeId(k, i2, m);
                        if ((i3 == Block.DIRT.id) || (i3 == Block.CLAY.id)) {
                            paramWorld.setRawTypeId(k, i2, m, this.a);
                        }
                    }
                }
            }

        }

        return true;
    }
}
