package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.World;
import net.minecraft.server.BlockStainedGlassPane;
import net.minecraft.server.BlockTallPlant;
import net.minecraft.server.class_aql;
import net.minecraft.server.BlockPosition;

public class class_aqh extends class_aql {
   private BlockTallPlant.class_b_in_class_ahm a;

   public void a(BlockTallPlant.class_b_in_class_ahm var1) {
      this.a = var1;
   }

   public boolean b(World var1, Random var2, BlockPosition var3) {
      boolean var4 = false;

      for(int var5 = 0; var5 < 64; ++var5) {
         BlockPosition var6 = var3.add(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
         if(var1.isEmpty(var6) && (!var1.worldProvider.m() || var6.getY() < 254) && BlockStainedGlassPane.DOUBLE_PLANT.canPlace(var1, var6)) {
            BlockStainedGlassPane.DOUBLE_PLANT.a(var1, var6, this.a, 2);
            var4 = true;
         }
      }

      return var4;
   }
}
