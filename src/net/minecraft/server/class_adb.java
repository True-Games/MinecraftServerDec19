package net.minecraft.server;

import net.minecraft.server.class_adi;
import net.minecraft.server.class_adj;
import net.minecraft.server.class_pw;

public class class_adb extends class_adi {
   public class_adb(class_adi.class_a_in_class_adi var1, class_pw... var2) {
      super(var1, class_adj.k, var2);
      this.c("arrowDamage");
   }

   public int a(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   public int b(int var1) {
      return this.a(var1) + 15;
   }

   public int b() {
      return 5;
   }
}
