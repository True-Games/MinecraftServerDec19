package net.minecraft.server;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_aql;
import net.minecraft.server.class_cj;

public class class_apz extends class_aql {
   private final class_agj a;
   private final int b;

   public class_apz(class_agj var1, int var2) {
      super(false);
      this.a = var1;
      this.b = var2;
   }

   public boolean b(class_aen var1, Random var2, class_cj var3) {
      while(true) {
         label50: {
            if(var3.o() > 3) {
               if(var1.d(var3.b())) {
                  break label50;
               }

               class_agj var4 = var1.p(var3.b()).c();
               if(var4 != class_agk.c && var4 != class_agk.d && var4 != class_agk.b) {
                  break label50;
               }
            }

            if(var3.o() <= 3) {
               return false;
            }

            int var12 = this.b;

            for(int var5 = 0; var12 >= 0 && var5 < 3; ++var5) {
               int var6 = var12 + var2.nextInt(2);
               int var7 = var12 + var2.nextInt(2);
               int var8 = var12 + var2.nextInt(2);
               float var9 = (float)(var6 + var7 + var8) * 0.333F + 0.5F;
               Iterator var10 = class_cj.a(var3.a(-var6, -var7, -var8), var3.a(var6, var7, var8)).iterator();

               while(var10.hasNext()) {
                  class_cj var11 = (class_cj)var10.next();
                  if(var11.i(var3) <= (double)(var9 * var9)) {
                     var1.a((class_cj)var11, (class_anl)this.a.S(), 4);
                  }
               }

               var3 = var3.a(-(var12 + 1) + var2.nextInt(2 + var12 * 2), 0 - var2.nextInt(2), -(var12 + 1) + var2.nextInt(2 + var12 * 2));
            }

            return true;
         }

         var3 = var3.b();
      }
   }
}
