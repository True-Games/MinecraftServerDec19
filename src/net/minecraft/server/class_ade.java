package net.minecraft.server;

public class class_ade extends class_adi {
   public class_ade(class_adi.class_a_in_class_adi var1, EnumWearable... var2) {
      super(var1, class_adj.k, var2);
      this.c("arrowKnockback");
   }

   public int a(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   public int b(int var1) {
      return this.a(var1) + 25;
   }

   public int b() {
      return 2;
   }
}
