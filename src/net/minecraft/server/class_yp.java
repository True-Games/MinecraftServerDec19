package net.minecraft.server;

import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_aau;
import net.minecraft.server.class_act;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_oj;
import net.minecraft.server.class_pw;
import net.minecraft.server.class_wz;
import net.minecraft.server.class_xa;
import net.minecraft.server.class_xz;
import net.minecraft.server.class_yg;
import net.minecraft.server.class_yv;
import net.minecraft.server.class_yw;
import net.minecraft.server.class_yx;
import net.minecraft.server.class_za;

public class class_yp extends class_xz {
   private static final class_pw[] h;
   public class_yg a = new class_yg(this, 2, 2);
   public class_oj f = new class_yv();
   public boolean g;
   private final class_xa i;

   public class_yp(final class_wz var1, boolean var2, class_xa var3) {
      this.g = var2;
      this.i = var3;
      this.a((class_yx)(new class_yw(var1.e, this.a, this.f, 0, 154, 28)));

      int var4;
      int var5;
      for(var4 = 0; var4 < 2; ++var4) {
         for(var5 = 0; var5 < 2; ++var5) {
            this.a((class_yx)(new class_yx(this.a, var5 + var4 * 2, 98 + var5 * 18, 18 + var4 * 18)));
         }
      }

      for(var4 = 0; var4 < 4; ++var4) {
         final class_pw var6 = h[var4];
         this.a((class_yx)(new class_yx(var1, 36 + (3 - var4), 8, 8 + var4 * 18) {
            public int a() {
               return 1;
            }

            public boolean a(class_aas var1) {
               return var1 == null?false:(var1.b() instanceof class_za?((class_za)var1.b()).b == var6:(var1.b() != class_aar.a(class_agk.aU) && var1.b() != class_aau.ca?false:var6 == class_pw.f));
            }
         }));
      }

      for(var4 = 0; var4 < 3; ++var4) {
         for(var5 = 0; var5 < 9; ++var5) {
            this.a((class_yx)(new class_yx(var1, var5 + (var4 + 1) * 9, 8 + var5 * 18, 84 + var4 * 18)));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.a((class_yx)(new class_yx(var1, var4, 8 + var4 * 18, 142)));
      }

      this.a((class_yx)(new class_yx(var1, 40, 77, 62) {
         public boolean a(class_aas var1) {
            return super.a(var1);
         }
      }));
      this.a((class_oj)this.a);
   }

   public void a(class_oj var1) {
      this.f.a(0, class_act.a().a(this.a, this.i.o));
   }

   public void b(class_xa var1) {
      super.b(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         class_aas var3 = this.a.b(var2);
         if(var3 != null) {
            var1.a(var3, false);
         }
      }

      this.f.a(0, (class_aas)null);
   }

   public boolean a(class_xa var1) {
      return true;
   }

   public class_aas b(class_xa var1, int var2) {
      class_aas var3 = null;
      class_yx var4 = (class_yx)this.c.get(var2);
      if(var4 != null && var4.e()) {
         class_aas var5 = var4.d();
         var3 = var5.k();
         if(var2 == 0) {
            if(!this.a(var5, 9, 45, true)) {
               return null;
            }

            var4.a(var5, var3);
         } else if(var2 >= 1 && var2 < 5) {
            if(!this.a(var5, 9, 45, false)) {
               return null;
            }
         } else if(var2 >= 5 && var2 < 9) {
            if(!this.a(var5, 9, 45, false)) {
               return null;
            }
         } else if(var3.b() instanceof class_za && !((class_yx)this.c.get(8 - ((class_za)var3.b()).b.b())).e()) {
            int var6 = 8 - ((class_za)var3.b()).b.b();
            if(!this.a(var5, var6, var6 + 1, false)) {
               return null;
            }
         } else if(var2 >= 9 && var2 < 36) {
            if(!this.a(var5, 36, 45, false)) {
               return null;
            }
         } else if(var2 >= 36 && var2 < 45) {
            if(!this.a(var5, 9, 36, false)) {
               return null;
            }
         } else if(!this.a(var5, 9, 45, false)) {
            return null;
         }

         if(var5.b == 0) {
            var4.d((class_aas)null);
         } else {
            var4.f();
         }

         if(var5.b == var3.b) {
            return null;
         }

         var4.a(var1, var5);
      }

      return var3;
   }

   public boolean a(class_aas var1, class_yx var2) {
      return var2.d != this.f && super.a(var1, var2);
   }

   static {
      h = new class_pw[]{class_pw.f, class_pw.e, class_pw.d, class_pw.c};
   }
}
