package net.minecraft.server;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.server.class_em;
import net.minecraft.server.class_ep;
import net.minecraft.server.class_ff;
import net.minecraft.server.class_fj;

public class class_fi implements class_ff {
   private double a;
   private double b;
   private double c;
   private float d;
   private float e;
   private Set f;

   public class_fi() {
   }

   public class_fi(double var1, double var3, double var5, float var7, float var8, Set var9) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var8;
      this.f = var9;
   }

   public void a(class_em var1) throws IOException {
      this.a = var1.readDouble();
      this.b = var1.readDouble();
      this.c = var1.readDouble();
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      this.f = class_fi.class_a_in_class_fi.a(var1.readUnsignedByte());
   }

   public void b(class_em var1) throws IOException {
      var1.writeDouble(this.a);
      var1.writeDouble(this.b);
      var1.writeDouble(this.c);
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      var1.writeByte(class_fi.class_a_in_class_fi.a(this.f));
   }

   public void a(class_fj var1) {
      var1.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void a(class_ep var1) {
      this.a((class_fj)var1);
   }

   public static enum class_a_in_class_fi {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4);

      private int f;

      private class_a_in_class_fi(int var3) {
         this.f = var3;
      }

      private int a() {
         return 1 << this.f;
      }

      private boolean b(int var1) {
         return (var1 & this.a()) == this.a();
      }

      public static Set a(int var0) {
         EnumSet var1 = EnumSet.noneOf(class_fi.class_a_in_class_fi.class);
         class_fi.class_a_in_class_fi[] var2 = values();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            class_fi.class_a_in_class_fi var5 = var2[var4];
            if(var5.b(var0)) {
               var1.add(var5);
            }
         }

         return var1;
      }

      public static int a(Set var0) {
         int var1 = 0;

         class_fi.class_a_in_class_fi var3;
         for(Iterator var2 = var0.iterator(); var2.hasNext(); var1 |= var3.a()) {
            var3 = (class_fi.class_a_in_class_fi)var2.next();
         }

         return var1;
      }
   }
}
