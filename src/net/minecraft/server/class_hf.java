package net.minecraft.server;

import java.io.IOException;
import net.minecraft.server.class_em;
import net.minecraft.server.class_ep;
import net.minecraft.server.class_ff;
import net.minecraft.server.class_fj;
import net.minecraft.server.class_pr;

public class class_hf implements class_ff {
   private int a;
   private byte b;

   public class_hf() {
   }

   public class_hf(class_pr var1, byte var2) {
      this.a = var1.F();
      this.b = var2;
   }

   public void a(class_em var1) throws IOException {
      this.a = var1.e();
      this.b = var1.readByte();
   }

   public void b(class_em var1) throws IOException {
      var1.b(this.a);
      var1.writeByte(this.b);
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
