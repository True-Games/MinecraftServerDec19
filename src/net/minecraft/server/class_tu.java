package net.minecraft.server;

import java.util.Calendar;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_nu;
import net.minecraft.server.class_pc;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_qi;
import net.minecraft.server.class_qk;
import net.minecraft.server.class_tt;
import net.minecraft.server.class_wl;
import net.minecraft.server.class_xa;

public class class_tu extends class_tt {
   private static final int a = class_qi.a(class_tu.class);
   private class_cj b;

   public class_tu(class_aen var1) {
      super(var1);
      this.a(0.5F, 0.9F);
      this.a(true);
   }

   protected void h() {
      super.h();
      this.ac.a(a, new Byte((byte)0));
   }

   protected float bC() {
      return 0.1F;
   }

   protected float bD() {
      return super.bD() * 0.95F;
   }

   protected String C() {
      return this.n() && this.V.nextInt(4) != 0?null:"mob.bat.idle";
   }

   protected String bp() {
      return "mob.bat.hurt";
   }

   protected String bq() {
      return "mob.bat.death";
   }

   public boolean ae() {
      return false;
   }

   protected void s(class_pr var1) {
   }

   protected void bM() {
   }

   protected void aY() {
      super.aY();
      this.a((class_qk)class_wl.a).a(6.0D);
   }

   public boolean n() {
      return (this.ac.a(a) & 1) != 0;
   }

   public void a(boolean var1) {
      byte var2 = this.ac.a(a);
      if(var1) {
         this.ac.b(a, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.ac.b(a, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public void t_() {
      super.t_();
      if(this.n()) {
         this.v = this.w = this.x = 0.0D;
         this.t = (double)class_nu.c(this.t) + 1.0D - (double)this.K;
      } else {
         this.w *= 0.6000000238418579D;
      }

   }

   protected void cc() {
      super.cc();
      class_cj var1 = new class_cj(this);
      class_cj var2 = var1.a();
      if(this.n()) {
         if(!this.o.p(var2).c().x()) {
            this.a(false);
            this.o.a((class_xa)null, 1015, var1, 0);
         } else {
            if(this.V.nextInt(200) == 0) {
               this.aN = (float)this.V.nextInt(360);
            }

            if(this.o.a(this, 4.0D) != null) {
               this.a(false);
               this.o.a((class_xa)null, 1015, var1, 0);
            }
         }
      } else {
         if(this.b != null && (!this.o.d(this.b) || this.b.o() < 1)) {
            this.b = null;
         }

         if(this.b == null || this.V.nextInt(30) == 0 || this.b.c((double)((int)this.s), (double)((int)this.t), (double)((int)this.u)) < 4.0D) {
            this.b = new class_cj((int)this.s + this.V.nextInt(7) - this.V.nextInt(7), (int)this.t + this.V.nextInt(6) - 2, (int)this.u + this.V.nextInt(7) - this.V.nextInt(7));
         }

         double var3 = (double)this.b.n() + 0.5D - this.s;
         double var5 = (double)this.b.o() + 0.1D - this.t;
         double var7 = (double)this.b.p() + 0.5D - this.u;
         this.v += (Math.signum(var3) * 0.5D - this.v) * 0.10000000149011612D;
         this.w += (Math.signum(var5) * 0.699999988079071D - this.w) * 0.10000000149011612D;
         this.x += (Math.signum(var7) * 0.5D - this.x) * 0.10000000149011612D;
         float var9 = (float)(class_nu.b(this.x, this.v) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var10 = class_nu.g(var9 - this.y);
         this.bd = 0.5F;
         this.y += var10;
         if(this.V.nextInt(100) == 0 && this.o.p(var2).c().x()) {
            this.a(true);
         }
      }

   }

   protected boolean s_() {
      return false;
   }

   public void e(float var1, float var2) {
   }

   protected void a(double var1, boolean var3, class_agj var4, class_cj var5) {
   }

   public boolean aK() {
      return true;
   }

   public boolean a(class_pc var1, float var2) {
      if(this.b(var1)) {
         return false;
      } else {
         if(!this.o.D && this.n()) {
            this.a(false);
         }

         return super.a(var1, var2);
      }
   }

   public void a(class_dn var1) {
      super.a(var1);
      this.ac.b(a, Byte.valueOf(var1.e("BatFlags")));
   }

   public void b(class_dn var1) {
      super.b(var1);
      var1.a("BatFlags", this.ac.a(a));
   }

   public boolean cf() {
      class_cj var1 = new class_cj(this.s, this.aT().b, this.u);
      if(var1.o() >= this.o.G()) {
         return false;
      } else {
         int var2 = this.o.l(var1);
         byte var3 = 4;
         if(this.a(this.o.Z())) {
            var3 = 7;
         } else if(this.V.nextBoolean()) {
            return false;
         }

         return var2 > this.V.nextInt(var3)?false:super.cf();
      }
   }

   private boolean a(Calendar var1) {
      return var1.get(2) + 1 == 10 && var1.get(5) >= 20 || var1.get(2) + 1 == 11 && var1.get(5) <= 3;
   }

   public float aU() {
      return this.K / 2.0F;
   }
}
