package net.minecraft.server;

import com.google.common.base.Predicate;
import net.minecraft.server.class_aar;
import net.minecraft.server.class_aas;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_aje;
import net.minecraft.server.class_ajw;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_any;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atl;

public class class_ajt extends class_aje {
   public static final class_any b = class_any.a("variant", class_ajw.class_a_in_class_ajw.class, new Predicate() {
      public boolean a(class_ajw.class_a_in_class_ajw var1) {
         return var1.a() < 4;
      }

      // $FF: synthetic method
      public boolean apply(Object var1) {
         return this.a((class_ajw.class_a_in_class_ajw)var1);
      }
   });

   public class_ajt() {
      this.j(this.M.b().a(b, class_ajw.class_a_in_class_ajw.a).a(a, class_aje.class_a_in_class_aje.b));
   }

   public class_atl g(class_anl var1) {
      class_ajw.class_a_in_class_ajw var2 = (class_ajw.class_a_in_class_ajw)var1.b(b);
      switch(class_ajt.SyntheticClass_1.b[((class_aje.class_a_in_class_aje)var1.b(a)).ordinal()]) {
      case 1:
      case 2:
      case 3:
      default:
         switch(class_ajt.SyntheticClass_1.a[var2.ordinal()]) {
         case 1:
         default:
            return class_ajw.class_a_in_class_ajw.b.c();
         case 2:
            return class_ajw.class_a_in_class_ajw.f.c();
         case 3:
            return class_atl.p;
         case 4:
            return class_ajw.class_a_in_class_ajw.b.c();
         }
      case 4:
         return var2.c();
      }
   }

   public class_anl a(int var1) {
      class_anl var2 = this.S().a(b, class_ajw.class_a_in_class_ajw.a((var1 & 3) % 4));
      switch(var1 & 12) {
      case 0:
         var2 = var2.a(a, class_aje.class_a_in_class_aje.b);
         break;
      case 4:
         var2 = var2.a(a, class_aje.class_a_in_class_aje.a);
         break;
      case 8:
         var2 = var2.a(a, class_aje.class_a_in_class_aje.c);
         break;
      default:
         var2 = var2.a(a, class_aje.class_a_in_class_aje.d);
      }

      return var2;
   }

   public int c(class_anl var1) {
      byte var2 = 0;
      int var3 = var2 | ((class_ajw.class_a_in_class_ajw)var1.b(b)).a();
      switch(class_ajt.SyntheticClass_1.b[((class_aje.class_a_in_class_aje)var1.b(a)).ordinal()]) {
      case 1:
         var3 |= 4;
         break;
      case 2:
         var3 |= 8;
         break;
      case 3:
         var3 |= 12;
      }

      return var3;
   }

   protected class_anm e() {
      return new class_anm(this, new class_aoa[]{b, a});
   }

   protected class_aas i(class_anl var1) {
      return new class_aas(class_aar.a((class_agj)this), 1, ((class_ajw.class_a_in_class_ajw)var1.b(b)).a());
   }

   public int a(class_anl var1) {
      return ((class_ajw.class_a_in_class_ajw)var1.b(b)).a();
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] a;
      // $FF: synthetic field
      static final int[] b = new int[class_aje.class_a_in_class_aje.values().length];

      static {
         try {
            b[class_aje.class_a_in_class_aje.a.ordinal()] = 1;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            b[class_aje.class_a_in_class_aje.c.ordinal()] = 2;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            b[class_aje.class_a_in_class_aje.d.ordinal()] = 3;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            b[class_aje.class_a_in_class_aje.b.ordinal()] = 4;
         } catch (NoSuchFieldError var5) {
            ;
         }

         a = new int[class_ajw.class_a_in_class_ajw.values().length];

         try {
            a[class_ajw.class_a_in_class_ajw.a.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            a[class_ajw.class_a_in_class_ajw.b.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            a[class_ajw.class_a_in_class_ajw.c.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            a[class_ajw.class_a_in_class_ajw.d.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
