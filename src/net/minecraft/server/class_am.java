package net.minecraft.server;

import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_bz;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_i;
import net.minecraft.server.class_lh;
import net.minecraft.server.class_m;
import net.minecraft.server.class_pr;

public class class_am extends class_i {
   public String c() {
      return "kill";
   }

   public int a() {
      return 2;
   }

   public String c(class_m var1) {
      return "commands.kill.usage";
   }

   public void a(class_m var1, String[] var2) throws class_bz {
      if(var2.length == 0) {
         class_lh var4 = b(var1);
         var4.G();
         a(var1, this, "commands.kill.successful", new Object[]{var4.f_()});
      } else {
         class_pr var3 = b(var1, var2[0]);
         var3.G();
         a(var1, this, "commands.kill.successful", new Object[]{var3.f_()});
      }
   }

   public boolean b(String[] var1, int var2) {
      return var2 == 0;
   }

   public List a(class_m var1, String[] var2, class_cj var3) {
      return var2.length == 1?a(var2, MinecraftServer.N().K()):null;
   }
}
