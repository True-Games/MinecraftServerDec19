package net.minecraft.server;

import java.util.Random;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_akd;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_aql;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;

public class class_ard extends class_aql {
   public boolean b(class_aen var1, Random var2, class_cj var3) {
      for(int var4 = 0; var4 < 64; ++var4) {
         class_cj var5 = var3.a(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
         if(var1.d(var5) && var1.p(var5.b()).c() == class_agk.c && class_agk.aU.d(var1, var5)) {
            var1.a((class_cj)var5, (class_anl)class_agk.aU.S().a(class_akd.O, class_cq.class_c_in_class_cq.a.a(var2)), 2);
         }
      }

      return true;
   }
}
