package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import net.minecraft.server.class_aen;
import net.minecraft.server.class_agj;
import net.minecraft.server.class_agk;
import net.minecraft.server.class_anl;
import net.minecraft.server.class_anm;
import net.minecraft.server.class_anw;
import net.minecraft.server.class_aoa;
import net.minecraft.server.class_atk;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_cq;
import net.minecraft.server.class_di;
import net.minecraft.server.class_ob;
import net.minecraft.server.class_zu;

public class class_ala extends class_agj {
   public static final class_anw a = class_anw.a("wet");

   protected class_ala() {
      super(class_atk.m);
      this.j(this.M.b().a(a, Boolean.valueOf(false)));
      this.a(class_zu.b);
   }

   public String f() {
      return class_di.a(this.a() + ".dry.name");
   }

   public int a(class_anl var1) {
      return ((Boolean)var1.b(a)).booleanValue()?1:0;
   }

   public void c(class_aen var1, class_cj var2, class_anl var3) {
      this.e(var1, var2, var3);
   }

   public void a(class_aen var1, class_cj var2, class_anl var3, class_agj var4) {
      this.e(var1, var2, var3);
      super.a(var1, var2, var3, var4);
   }

   protected void e(class_aen var1, class_cj var2, class_anl var3) {
      if(!((Boolean)var3.b(a)).booleanValue() && this.e(var1, var2)) {
         var1.a((class_cj)var2, (class_anl)var3.a(a, Boolean.valueOf(true)), 2);
         var1.b(2001, var2, class_agj.a((class_agj)class_agk.j));
      }

   }

   private boolean e(class_aen var1, class_cj var2) {
      LinkedList var3 = Lists.newLinkedList();
      ArrayList var4 = Lists.newArrayList();
      var3.add(new class_ob(var2, Integer.valueOf(0)));
      int var5 = 0;

      class_cj var7;
      while(!var3.isEmpty()) {
         class_ob var6 = (class_ob)var3.poll();
         var7 = (class_cj)var6.a();
         int var8 = ((Integer)var6.b()).intValue();
         class_cq[] var9 = class_cq.values();
         int var10 = var9.length;

         for(int var11 = 0; var11 < var10; ++var11) {
            class_cq var12 = var9[var11];
            class_cj var13 = var7.a(var12);
            if(var1.p(var13).c().v() == class_atk.h) {
               var1.a((class_cj)var13, (class_anl)class_agk.a.S(), 2);
               var4.add(var13);
               ++var5;
               if(var8 < 6) {
                  var3.add(new class_ob(var13, Integer.valueOf(var8 + 1)));
               }
            }
         }

         if(var5 > 64) {
            break;
         }
      }

      Iterator var14 = var4.iterator();

      while(var14.hasNext()) {
         var7 = (class_cj)var14.next();
         var1.c(var7, class_agk.a);
      }

      return var5 > 0;
   }

   public class_anl a(int var1) {
      return this.S().a(a, Boolean.valueOf((var1 & 1) == 1));
   }

   public int c(class_anl var1) {
      return ((Boolean)var1.b(a)).booleanValue()?1:0;
   }

   protected class_anm e() {
      return new class_anm(this, new class_aoa[]{a});
   }
}
