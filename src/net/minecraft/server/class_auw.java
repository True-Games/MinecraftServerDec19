package net.minecraft.server;

import net.minecraft.server.class_aer;
import net.minecraft.server.class_aus;
import net.minecraft.server.class_aut;
import net.minecraft.server.class_auu;
import net.minecraft.server.class_auv;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_pr;

public class class_auw {
   private class_aus a = new class_aus();
   private class_aut[] b = new class_aut[32];
   private class_auu c;

   public class_auw(class_auu var1) {
      this.c = var1;
   }

   public class_auv a(class_aer var1, class_pr var2, class_pr var3, float var4) {
      return this.a(var1, var2, var3.s, var3.aT().b, var3.u, var4);
   }

   public class_auv a(class_aer var1, class_pr var2, class_cj var3, float var4) {
      return this.a(var1, var2, (double)((float)var3.n() + 0.5F), (double)((float)var3.o() + 0.5F), (double)((float)var3.p() + 0.5F), var4);
   }

   private class_auv a(class_aer var1, class_pr var2, double var3, double var5, double var7, float var9) {
      this.a.a();
      this.c.a(var1, var2);
      class_aut var10 = this.c.a(var2);
      class_aut var11 = this.c.a(var2, var3, var5, var7);
      class_auv var12 = this.a(var2, var10, var11, var9);
      this.c.a();
      return var12;
   }

   private class_auv a(class_pr var1, class_aut var2, class_aut var3, float var4) {
      var2.e = 0.0F;
      var2.f = var2.b(var3);
      var2.g = var2.f;
      this.a.a();
      this.a.a(var2);
      class_aut var5 = var2;

      while(!this.a.e()) {
         class_aut var6 = this.a.c();
         if(var6.equals(var3)) {
            return this.a(var2, var3);
         }

         if(var6.b(var3) < var5.b(var3)) {
            var5 = var6;
         }

         var6.i = true;
         int var7 = this.c.a(this.b, var1, var6, var3, var4);

         for(int var8 = 0; var8 < var7; ++var8) {
            class_aut var9 = this.b[var8];
            float var10 = var6.e + var6.b(var9);
            if(var10 < var4 * 2.0F && (!var9.a() || var10 < var9.e)) {
               var9.h = var6;
               var9.e = var10;
               var9.f = var9.b(var3);
               if(var9.a()) {
                  this.a.a(var9, var9.e + var9.f);
               } else {
                  var9.g = var9.e + var9.f;
                  this.a.a(var9);
               }
            }
         }
      }

      if(var5 == var2) {
         return null;
      } else {
         return this.a(var2, var5);
      }
   }

   private class_auv a(class_aut var1, class_aut var2) {
      int var3 = 1;

      class_aut var4;
      for(var4 = var2; var4.h != null; var4 = var4.h) {
         ++var3;
      }

      class_aut[] var5 = new class_aut[var3];
      var4 = var2;
      --var3;

      for(var5[var3] = var2; var4.h != null; var5[var3] = var4) {
         var4 = var4.h;
         --var3;
      }

      return new class_auv(var5);
   }
}
