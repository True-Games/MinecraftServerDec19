package net.minecraft.server;

import java.io.IOException;
import net.minecraft.server.class_em;
import net.minecraft.server.class_ep;
import net.minecraft.server.class_ff;
import net.minecraft.server.class_fj;

public class class_hp implements class_ff {
   private float a;
   private int b;
   private float c;

   public class_hp() {
   }

   public class_hp(float var1, int var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(class_em var1) throws IOException {
      this.a = var1.readFloat();
      this.b = var1.e();
      this.c = var1.readFloat();
   }

   public void b(class_em var1) throws IOException {
      var1.writeFloat(this.a);
      var1.b(this.b);
      var1.writeFloat(this.c);
   }

   public void a(class_fj var1) {
      var1.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void a(class_ep var1) {
      this.a((class_fj)var1);
   }
}
