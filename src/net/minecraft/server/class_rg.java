package net.minecraft.server;

import net.minecraft.server.class_agj;
import net.minecraft.server.class_ahl;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_aut;
import net.minecraft.server.class_auv;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_qb;
import net.minecraft.server.class_rm;
import net.minecraft.server.class_tf;

public abstract class class_rg extends class_rm {
   protected class_qb a;
   protected class_cj b;
   protected class_ahl c;
   boolean d;
   float e;
   float f;

   public class_rg(class_qb var1) {
      this.b = class_cj.a;
      this.a = var1;
      if(!(var1.u() instanceof class_tf)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   public boolean a() {
      if(!this.a.D) {
         return false;
      } else {
         class_tf var1 = (class_tf)this.a.u();
         class_auv var2 = var1.j();
         if(var2 != null && !var2.b() && var1.g()) {
            for(int var3 = 0; var3 < Math.min(var2.e() + 2, var2.d()); ++var3) {
               class_aut var4 = var2.a(var3);
               this.b = new class_cj(var4.a, var4.b + 1, var4.c);
               if(this.a.e((double)this.b.n(), this.a.t, (double)this.b.p()) <= 2.25D) {
                  this.c = this.a(this.b);
                  if(this.c != null) {
                     return true;
                  }
               }
            }

            this.b = (new class_cj(this.a)).a();
            this.c = this.a(this.b);
            return this.c != null;
         } else {
            return false;
         }
      }
   }

   public boolean b() {
      return !this.d;
   }

   public void c() {
      this.d = false;
      this.e = (float)((double)((float)this.b.n() + 0.5F) - this.a.s);
      this.f = (float)((double)((float)this.b.p() + 0.5F) - this.a.u);
   }

   public void e() {
      float var1 = (float)((double)((float)this.b.n() + 0.5F) - this.a.s);
      float var2 = (float)((double)((float)this.b.p() + 0.5F) - this.a.u);
      float var3 = this.e * var1 + this.f * var2;
      if(var3 < 0.0F) {
         this.d = true;
      }

   }

   private class_ahl a(class_cj var1) {
      class_agj var2 = this.a.o.p(var1).c();
      return var2 instanceof class_ahl && var2.v() == class_atk.d?(class_ahl)var2:null;
   }
}
