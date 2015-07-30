package net.minecraft.server;

import java.util.List;
import net.minecraft.server.World;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_awg;
import net.minecraft.server.Vec3D;
import net.minecraft.server.MathHelper;
import net.minecraft.server.class_pr;

public final class class_xj {
   public static class_awg a(class_pr var0, boolean var1, boolean var2, class_pr var3) {
      double var4 = var0.s;
      double var6 = var0.t;
      double var8 = var0.u;
      double var10 = var0.v;
      double var12 = var0.w;
      double var14 = var0.x;
      World var16 = var0.o;
      Vec3D var17 = new Vec3D(var4, var6, var8);
      Vec3D var18 = new Vec3D(var4 + var10, var6 + var12, var8 + var14);
      class_awg var19 = var16.a(var17, var18, false, true, false);
      if(var1) {
         if(var19 != null) {
            var18 = new Vec3D(var19.c.x, var19.c.y, var19.c.z);
         }

         class_pr var20 = null;
         List var21 = var16.b(var0, var0.aT().a(var10, var12, var14).b(1.0D, 1.0D, 1.0D));
         double var22 = 0.0D;

         for(int var24 = 0; var24 < var21.size(); ++var24) {
            class_pr var25 = (class_pr)var21.get(var24);
            if(var25.ad() && (var2 || !var25.k(var3)) && !var25.T) {
               float var26 = 0.3F;
               class_awf var27 = var25.aT().b((double)var26, (double)var26, (double)var26);
               class_awg var28 = var27.a(var17, var18);
               if(var28 != null) {
                  double var29 = var17.distanceSquared(var28.c);
                  if(var29 < var22 || var22 == 0.0D) {
                     var20 = var25;
                     var22 = var29;
                  }
               }
            }
         }

         if(var20 != null) {
            var19 = new class_awg(var20);
         }
      }

      return var19;
   }

   public static final void a(class_pr var0, float var1) {
      double var2 = var0.v;
      double var4 = var0.w;
      double var6 = var0.x;
      float var8 = MathHelper.sqrt(var2 * var2 + var6 * var6);
      var0.y = (float)(MathHelper.b(var6, var2) * 180.0D / 3.1415927410125732D) + 90.0F;

      for(var0.z = (float)(MathHelper.b((double)var8, var4) * 180.0D / 3.1415927410125732D) - 90.0F; var0.z - var0.B < -180.0F; var0.B -= 360.0F) {
         ;
      }

      while(var0.z - var0.B >= 180.0F) {
         var0.B += 360.0F;
      }

      while(var0.y - var0.A < -180.0F) {
         var0.A -= 360.0F;
      }

      while(var0.y - var0.A >= 180.0F) {
         var0.A += 360.0F;
      }

      var0.z = var0.B + (var0.z - var0.B) * var1;
      var0.y = var0.A + (var0.y - var0.A) * var1;
   }
}
