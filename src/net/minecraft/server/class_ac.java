package net.minecraft.server;

import net.minecraft.server.class_bz;
import net.minecraft.server.class_cf;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_ec;
import net.minecraft.server.class_ed;
import net.minecraft.server.class_i;
import net.minecraft.server.class_m;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_xa;

public class class_ac extends class_i {
   public String c() {
      return "entitydata";
   }

   public int a() {
      return 2;
   }

   public String c(class_m var1) {
      return "commands.entitydata.usage";
   }

   public void a(class_m var1, String[] var2) throws class_bz {
      if(var2.length < 2) {
         throw new class_cf("commands.entitydata.usage", new Object[0]);
      } else {
         class_pr var3 = b(var1, var2[0]);
         if(var3 instanceof class_xa) {
            throw new class_bz("commands.entitydata.noPlayers", new Object[]{var3.f_()});
         } else {
            class_dn var4 = new class_dn();
            var3.e(var4);
            class_dn var5 = (class_dn)var4.b();

            class_dn var6;
            try {
               var6 = class_ed.a(a(var1, var2, 1).c());
            } catch (class_ec var8) {
               throw new class_bz("commands.entitydata.tagError", new Object[]{var8.getMessage()});
            }

            var6.p("UUIDMost");
            var6.p("UUIDLeast");
            var4.a(var6);
            if(var4.equals(var5)) {
               throw new class_bz("commands.entitydata.failed", new Object[]{var4.toString()});
            } else {
               var3.f(var4);
               a(var1, this, "commands.entitydata.success", new Object[]{var4.toString()});
            }
         }
      }
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 0;
   }
}
