package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_ago;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anz;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_atl;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_zu;

public class class_ajl extends class_ago {
   public static final class_anz a = class_anz.a("age", 0, 3);

   protected class_ajl() {
      super(class_atk.k, class_atl.D);
      this.j(this.M.b().a(a, Integer.valueOf(0)));
      this.a(true);
      float var1 = 0.5F;
      this.a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.a((class_zu)null);
   }

   protected boolean c(class_agj var1) {
      return var1 == class_agk.aW;
   }

   public boolean f(class_aen var1, class_cj var2, class_anl var3) {
      return this.c(var1.p(var2.b()).c());
   }

   public void b(class_aen var1, class_cj var2, class_anl var3, Random var4) {
      int var5 = ((Integer)var3.b(a)).intValue();
      if(var5 < 3 && var4.nextInt(10) == 0) {
         var3 = var3.a(a, Integer.valueOf(var5 + 1));
         var1.a((class_cj)var2, (class_anl)var3, 2);
      }

      super.b(var1, var2, var3, var4);
   }

   public void a(class_aen var1, class_cj var2, class_anl var3, float var4, int var5) {
      if(!var1.D) {
         int var6 = 1;
         if(((Integer)var3.b(a)).intValue() >= 3) {
            var6 = 2 + var1.s.nextInt(3);
            if(var5 > 0) {
               var6 += var1.s.nextInt(var5 + 1);
            }
         }

         for(int var7 = 0; var7 < var6; ++var7) {
            a(var1, var2, new class_aas(class_aau.bA));
         }

      }
   }

   public class_aar a(class_anl var1, Random var2, int var3) {
      return null;
   }

   public int a(Random var1) {
      return 0;
   }

   public class_anl a(int var1) {
      return this.S().a(a, Integer.valueOf(var1));
   }

   public int c(class_anl var1) {
      return ((Integer)var1.b(a)).intValue();
   }

   protected class_anm e() {
      return new class_anm(this, new class_aoa[]{a});
   }
}
