package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_aio;
import net.minecraft.server.class_akq;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anw;
import net.minecraft.server.class_any;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_atl;
import net.minecraft.server.class_di;
import net.minecraft.server.class_ny;
import net.minecraft.server.class_zu;

public abstract class class_ajp extends class_aio {
   public static final class_anw b = class_anw.a("seamless");
   public static final class_any N = class_any.a("variant", class_ajp.class_a_in_class_ajp.class);

   public class_ajp() {
      super(class_atk.e);
      class_anl var1 = this.M.b();
      if(this.l()) {
         var1 = var1.a(b, Boolean.valueOf(false));
      } else {
         var1 = var1.a(a, class_aio.class_a_in_class_aio.b);
      }

      this.j(var1.a(N, class_ajp.class_a_in_class_ajp.a));
      this.a((class_zu)class_zu.b);
   }

   public String f() {
      return class_di.a(this.a() + ".red_sandstone.name");
   }

   public class_aar a(class_anl var1, Random var2, int var3) {
      return class_aar.a((class_agj)class_agk.cP);
   }

   public String b(int var1) {
      return super.a() + "." + class_ajp.class_a_in_class_ajp.a(var1).d();
   }

   public class_aoa n() {
      return N;
   }

   public Object a(class_aas var1) {
      return class_ajp.class_a_in_class_ajp.a(var1.i() & 7);
   }

   public class_anl a(int var1) {
      class_anl var2 = this.S().a(N, class_ajp.class_a_in_class_ajp.a(var1 & 7));
      if(this.l()) {
         var2 = var2.a(b, Boolean.valueOf((var1 & 8) != 0));
      } else {
         var2 = var2.a(a, (var1 & 8) == 0?class_aio.class_a_in_class_aio.b:class_aio.class_a_in_class_aio.a);
      }

      return var2;
   }

   public int c(class_anl var1) {
      byte var2 = 0;
      int var3 = var2 | ((class_ajp.class_a_in_class_ajp)var1.b(N)).a();
      if(this.l()) {
         if(((Boolean)var1.b(b)).booleanValue()) {
            var3 |= 8;
         }
      } else if(var1.b(a) == class_aio.class_a_in_class_aio.a) {
         var3 |= 8;
      }

      return var3;
   }

   protected class_anm e() {
      return this.l()?new class_anm(this, new class_aoa[]{b, N}):new class_anm(this, new class_aoa[]{a, N});
   }

   public class_atl g(class_anl var1) {
      return ((class_ajp.class_a_in_class_ajp)var1.b(N)).c();
   }

   public int a(class_anl var1) {
      return ((class_ajp.class_a_in_class_ajp)var1.b(N)).a();
   }

   public static enum class_a_in_class_ajp implements class_ny {
      a(0, "red_sandstone", class_akq.class_a_in_class_akq.b.c());

      private static final class_ajp.class_a_in_class_ajp[] b;
      private final int c;
      private final String d;
      private final class_atl e;

      private class_a_in_class_ajp(int var3, String var4, class_atl var5) {
         this.c = var3;
         this.d = var4;
         this.e = var5;
      }

      public int a() {
         return this.c;
      }

      public class_atl c() {
         return this.e;
      }

      public String toString() {
         return this.d;
      }

      public static class_ajp.class_a_in_class_ajp a(int var0) {
         if(var0 < 0 || var0 >= b.length) {
            var0 = 0;
         }

         return b[var0];
      }

      public String l() {
         return this.d;
      }

      public String d() {
         return this.d;
      }

      static {
         b = new class_ajp.class_a_in_class_ajp[values().length];
         class_ajp.class_a_in_class_ajp[] var0 = values();
         int var1 = var0.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            class_ajp.class_a_in_class_ajp var3 = var0[var2];
            b[var3.a()] = var3;
         }

      }
   }
}
