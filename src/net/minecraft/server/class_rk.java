package net.minecraft.server;

public class class_rk extends class_rm {
   private EntityTameable d;
   private EntityLiving e;
   World a;
   private double f;
   private class_tg g;
   private int h;
   float b;
   float c;
   private boolean i;

   public class_rk(EntityTameable var1, double var2, float var4, float var5) {
      this.d = var1;
      this.a = var1.world;
      this.f = var2;
      this.g = var1.u();
      this.c = var4;
      this.b = var5;
      this.a(3);
      if(!(var1.u() instanceof class_tf)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   public boolean a() {
      EntityLiving var1 = this.d.cD();
      if(var1 == null) {
         return false;
      } else if(var1 instanceof EntityHuman && ((EntityHuman)var1).isSpectator()) {
         return false;
      } else if(this.d.cC()) {
         return false;
      } else if(this.d.h(var1) < (double)(this.c * this.c)) {
         return false;
      } else {
         this.e = var1;
         return true;
      }
   }

   public boolean b() {
      return !this.g.m() && this.d.h(this.e) > (double)(this.b * this.b) && !this.d.cC();
   }

   public void c() {
      this.h = 0;
      this.i = ((class_tf)this.d.u()).e();
      ((class_tf)this.d.u()).a(false);
   }

   public void d() {
      this.e = null;
      this.g.n();
      ((class_tf)this.d.u()).a(true);
   }

   private boolean a(BlockPosition var1) {
      IBlockData var2 = this.a.getType(var1);
      Block var3 = var2.getBlock();
      return var3 == Blocks.AIR?true:!var3.isFullCube();
   }

   public void e() {
      this.d.q().a(this.e, 10.0F, (float)this.d.cd());
      if(!this.d.cC()) {
         if(--this.h <= 0) {
            this.h = 10;
            if(!this.g.a((Entity)this.e, this.f)) {
               if(!this.d.cq()) {
                  if(this.d.h(this.e) >= 144.0D) {
                     int var1 = MathHelper.floor(this.e.locX) - 2;
                     int var2 = MathHelper.floor(this.e.locZ) - 2;
                     int var3 = MathHelper.floor(this.e.getBoundingBox().yMin);

                     for(int var4 = 0; var4 <= 4; ++var4) {
                        for(int var5 = 0; var5 <= 4; ++var5) {
                           if((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && World.a((IBlockAccess)this.a, (BlockPosition)(new BlockPosition(var1 + var4, var3 - 1, var2 + var5))) && this.a(new BlockPosition(var1 + var4, var3, var2 + var5)) && this.a(new BlockPosition(var1 + var4, var3 + 1, var2 + var5))) {
                              this.d.setPositionRotation((double) ((float) (var1 + var4) + 0.5F), (double) var3, (double) ((float) (var2 + var5) + 0.5F), this.d.yaw, this.d.pitch);
                              this.g.n();
                              return;
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }
}
