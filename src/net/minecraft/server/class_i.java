package net.minecraft.server;

import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.gson.JsonParseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.exception.ExceptionUtils;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.Item;
import net.minecraft.server.Block;
import net.minecraft.server.class_bz;
import net.minecraft.server.class_ca;
import net.minecraft.server.class_cb;
import net.minecraft.server.class_cd;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.IChatBaseComponent;
import net.minecraft.server.ChatComponentText;
import net.minecraft.server.class_h;
import net.minecraft.server.MinecraftKey;
import net.minecraft.server.ICommand;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.class_m;
import net.minecraft.server.class_o;
import net.minecraft.server.Entity;

public abstract class class_i implements ICommand {
   private static class_h a;

   protected static class_cc a(JsonParseException jsonParseException) {
       Throwable throwable = ExceptionUtils.getRootCause((Throwable)jsonParseException);
       String string = "";
       if (throwable == null || !(string = throwable.getMessage()).contains((CharSequence)"setLenient")) return new class_cc("commands.tellraw.jsonException", new Object[]{string});
       string = string.substring(string.indexOf("to accept ") + 10);
       return new class_cc("commands.tellraw.jsonException", new Object[]{string});
   }

   public int a() {
      return 4;
   }

   public List b() {
      return Collections.emptyList();
   }

   public boolean canUse(class_m var1) {
      return var1.a(this.a(), this.getCommand());
   }

   public List tabComplete(class_m var1, String[] var2, BlockPosition var3) {
      return null;
   }

   public static int a(String var0) throws class_cb {
      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var2) {
         throw new class_cb("commands.generic.num.invalid", new Object[]{var0});
      }
   }

   public static int a(String var0, int var1) throws class_cb {
      return a(var0, var1, Integer.MAX_VALUE);
   }

   public static int a(String var0, int var1, int var2) throws class_cb {
      int var3 = a(var0);
      if(var3 < var1) {
         throw new class_cb("commands.generic.num.tooSmall", new Object[]{Integer.valueOf(var3), Integer.valueOf(var1)});
      } else if(var3 > var2) {
         throw new class_cb("commands.generic.num.tooBig", new Object[]{Integer.valueOf(var3), Integer.valueOf(var2)});
      } else {
         return var3;
      }
   }

   public static long b(String var0) throws class_cb {
      try {
         return Long.parseLong(var0);
      } catch (NumberFormatException var2) {
         throw new class_cb("commands.generic.num.invalid", new Object[]{var0});
      }
   }

   public static long a(String var0, long var1, long var3) throws class_cb {
      long var5 = b(var0);
      if(var5 < var1) {
         throw new class_cb("commands.generic.num.tooSmall", new Object[]{Long.valueOf(var5), Long.valueOf(var1)});
      } else if(var5 > var3) {
         throw new class_cb("commands.generic.num.tooBig", new Object[]{Long.valueOf(var5), Long.valueOf(var3)});
      } else {
         return var5;
      }
   }

   public static BlockPosition a(class_m var0, String[] var1, int var2, boolean var3) throws class_cb {
      BlockPosition var4 = var0.c();
      return new BlockPosition(b((double)var4.getX(), var1[var2], -30000000, 30000000, var3), b((double)var4.getY(), var1[var2 + 1], 0, 256, false), b((double)var4.getZ(), var1[var2 + 2], -30000000, 30000000, var3));
   }

   public static double c(String var0) throws class_cb {
      try {
         double var1 = Double.parseDouble(var0);
         if(!Doubles.isFinite(var1)) {
            throw new class_cb("commands.generic.num.invalid", new Object[]{var0});
         } else {
            return var1;
         }
      } catch (NumberFormatException var3) {
         throw new class_cb("commands.generic.num.invalid", new Object[]{var0});
      }
   }

   public static double a(String var0, double var1) throws class_cb {
      return a(var0, var1, Double.MAX_VALUE);
   }

   public static double a(String var0, double var1, double var3) throws class_cb {
      double var5 = c(var0);
      if(var5 < var1) {
         throw new class_cb("commands.generic.double.tooSmall", new Object[]{Double.valueOf(var5), Double.valueOf(var1)});
      } else if(var5 > var3) {
         throw new class_cb("commands.generic.double.tooBig", new Object[]{Double.valueOf(var5), Double.valueOf(var3)});
      } else {
         return var5;
      }
   }

   public static boolean d(String var0) throws class_bz {
      if(!var0.equals("true") && !var0.equals("1")) {
         if(!var0.equals("false") && !var0.equals("0")) {
            throw new class_bz("commands.generic.boolean.invalid", new Object[]{var0});
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static EntityPlayer b(class_m var0) throws class_cd {
      if(var0 instanceof EntityPlayer) {
         return (EntityPlayer)var0;
      } else {
         throw new class_cd("You must specify which player you wish to perform this action on.", new Object[0]);
      }
   }

   public static EntityPlayer a(class_m var0, String var1) throws class_cd {
      EntityPlayer var2 = class_o.a(var0, var1);
      if(var2 == null) {
         try {
            var2 = MinecraftServer.N().getPlayerList().getPlayer(UUID.fromString(var1));
         } catch (IllegalArgumentException var4) {
            ;
         }
      }

      if(var2 == null) {
         var2 = MinecraftServer.N().getPlayerList().a(var1);
      }

      if(var2 == null) {
         throw new class_cd();
      } else {
         return var2;
      }
   }

   public static Entity b(class_m var0, String var1) throws class_ca {
      return a(var0, var1, Entity.class);
   }

   public static Entity a(class_m var0, String var1, Class var2) throws class_ca {
      Object var3 = class_o.a(var0, var1, var2);
      MinecraftServer var4 = MinecraftServer.N();
      if(var3 == null) {
         var3 = var4.getPlayerList().a(var1);
      }

      if(var3 == null) {
         try {
            UUID var5 = UUID.fromString(var1);
            var3 = var4.a(var5);
            if(var3 == null) {
               var3 = var4.getPlayerList().getPlayer(var5);
            }
         } catch (IllegalArgumentException var6) {
            throw new class_ca("commands.generic.entity.invalidUuid", new Object[0]);
         }
      }

      if(var3 != null && var2.isAssignableFrom(var3.getClass())) {
         return (Entity)var3;
      } else {
         throw new class_ca();
      }
   }

   public static List c(class_m var0, String var1) throws class_ca {
      return (List)(class_o.b(var1)?class_o.b(var0, var1, Entity.class):Lists.newArrayList((Object[])(new Entity[]{b(var0, var1)})));
   }

   public static String d(class_m var0, String var1) throws class_cd {
      try {
         return a(var0, var1).getName();
      } catch (class_cd var3) {
         if(class_o.b(var1)) {
            throw var3;
         } else {
            return var1;
         }
      }
   }

   public static String e(class_m var0, String var1) throws class_ca {
      try {
         return a(var0, var1).getName();
      } catch (class_cd var5) {
         try {
            return b(var0, var1).aM().toString();
         } catch (class_ca var4) {
            if(class_o.b(var1)) {
               throw var4;
            } else {
               return var1;
            }
         }
      }
   }

   public static IChatBaseComponent a(class_m var0, String[] var1, int var2) throws class_cd {
      return b(var0, var1, var2, false);
   }

   public static IChatBaseComponent b(class_m var0, String[] var1, int var2, boolean var3) throws class_cd {
      ChatComponentText var4 = new ChatComponentText("");

      for(int var5 = var2; var5 < var1.length; ++var5) {
         if(var5 > var2) {
            var4.a(" ");
         }

         Object var6 = new ChatComponentText(var1[var5]);
         if(var3) {
            IChatBaseComponent var7 = class_o.b(var0, var1[var5]);
            if(var7 == null) {
               if(class_o.b(var1[var5])) {
                  throw new class_cd();
               }
            } else {
               var6 = var7;
            }
         }

         var4.addSibling((IChatBaseComponent)var6);
      }

      return var4;
   }

   public static String a(String[] var0, int var1) {
      StringBuilder var2 = new StringBuilder();

      for(int var3 = var1; var3 < var0.length; ++var3) {
         if(var3 > var1) {
            var2.append(" ");
         }

         String var4 = var0[var3];
         var2.append(var4);
      }

      return var2.toString();
   }

   public static class_i.class_a_in_class_i a(double var0, String var2, boolean var3) throws class_cb {
      return a(var0, var2, -30000000, 30000000, var3);
   }

   public static class_i.class_a_in_class_i a(double var0, String var2, int var3, int var4, boolean var5) throws class_cb {
      boolean var6 = var2.startsWith("~");
      if(var6 && Double.isNaN(var0)) {
         throw new class_cb("commands.generic.num.invalid", new Object[]{Double.valueOf(var0)});
      } else {
         double var7 = 0.0D;
         if(!var6 || var2.length() > 1) {
            boolean var9 = var2.contains(".");
            if(var6) {
               var2 = var2.substring(1);
            }

            var7 += c(var2);
            if(!var9 && !var6 && var5) {
               var7 += 0.5D;
            }
         }

         if(var3 != 0 || var4 != 0) {
            if(var7 < (double)var3) {
               throw new class_cb("commands.generic.double.tooSmall", new Object[]{Double.valueOf(var7), Integer.valueOf(var3)});
            }

            if(var7 > (double)var4) {
               throw new class_cb("commands.generic.double.tooBig", new Object[]{Double.valueOf(var7), Integer.valueOf(var4)});
            }
         }

         return new class_i.class_a_in_class_i(var7 + (var6?var0:0.0D), var7, var6);
      }
   }

   public static double b(double var0, String var2, boolean var3) throws class_cb {
      return b(var0, var2, -30000000, 30000000, var3);
   }

   public static double b(double var0, String var2, int var3, int var4, boolean var5) throws class_cb {
      boolean var6 = var2.startsWith("~");
      if(var6 && Double.isNaN(var0)) {
         throw new class_cb("commands.generic.num.invalid", new Object[]{Double.valueOf(var0)});
      } else {
         double var7 = var6?var0:0.0D;
         if(!var6 || var2.length() > 1) {
            boolean var9 = var2.contains(".");
            if(var6) {
               var2 = var2.substring(1);
            }

            var7 += c(var2);
            if(!var9 && !var6 && var5) {
               var7 += 0.5D;
            }
         }

         if(var3 != 0 || var4 != 0) {
            if(var7 < (double)var3) {
               throw new class_cb("commands.generic.double.tooSmall", new Object[]{Double.valueOf(var7), Integer.valueOf(var3)});
            }

            if(var7 > (double)var4) {
               throw new class_cb("commands.generic.double.tooBig", new Object[]{Double.valueOf(var7), Integer.valueOf(var4)});
            }
         }

         return var7;
      }
   }

   public static Item f(class_m var0, String var1) throws class_cb {
      MinecraftKey var2 = new MinecraftKey(var1);
      Item var3 = (Item)Item.ITEM_REGISTRY.get(var2);
      if(var3 == null) {
         throw new class_cb("commands.give.item.notFound", new Object[]{var2});
      } else {
         return var3;
      }
   }

   public static Block g(class_m var0, String var1) throws class_cb {
      MinecraftKey var2 = new MinecraftKey(var1);
      if(!Block.BLOCK_REGISTRY.has(var2)) {
         throw new class_cb("commands.give.block.notFound", new Object[]{var2});
      } else {
         Block var3 = (Block)Block.BLOCK_REGISTRY.get(var2);
         if(var3 == null) {
            throw new class_cb("commands.give.block.notFound", new Object[]{var2});
         } else {
            return var3;
         }
      }
   }

   public static String a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2].toString();
         if(var2 > 0) {
            if(var2 == var0.length - 1) {
               var1.append(" and ");
            } else {
               var1.append(", ");
            }
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   public static IChatBaseComponent a(List var0) {
      ChatComponentText var1 = new ChatComponentText("");

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         if(var2 > 0) {
            if(var2 == var0.size() - 1) {
               var1.a(" and ");
            } else if(var2 > 0) {
               var1.a(", ");
            }
         }

         var1.addSibling((IChatBaseComponent)var0.get(var2));
      }

      return var1;
   }

   public static String a(Collection var0) {
      return a(var0.toArray(new String[var0.size()]));
   }

   public static List a(String[] var0, int var1, BlockPosition var2) {
      if(var2 == null) {
         return null;
      } else {
         int var4 = var0.length - 1;
         String var3;
         if(var4 == var1) {
            var3 = Integer.toString(var2.getX());
         } else if(var4 == var1 + 1) {
            var3 = Integer.toString(var2.getY());
         } else {
            if(var4 != var1 + 2) {
               return null;
            }

            var3 = Integer.toString(var2.getZ());
         }

         return Lists.newArrayList((Object[])(new String[]{var3}));
      }
   }

   public static List b(String[] var0, int var1, BlockPosition var2) {
      if(var2 == null) {
         return null;
      } else {
         int var4 = var0.length - 1;
         String var3;
         if(var4 == var1) {
            var3 = Integer.toString(var2.getX());
         } else {
            if(var4 != var1 + 1) {
               return null;
            }

            var3 = Integer.toString(var2.getZ());
         }

         return Lists.newArrayList((Object[])(new String[]{var3}));
      }
   }

   public static boolean a(String var0, String var1) {
      return var1.regionMatches(true, 0, var0, 0, var0.length());
   }

   public static List a(String[] var0, String... var1) {
      return a((String[])var0, (Collection)Arrays.asList(var1));
   }

   public static List a(String[] var0, Collection var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = Lists.newArrayList();
      if(!var1.isEmpty()) {
         Iterator var4 = Iterables.transform(var1, Functions.toStringFunction()).iterator();

         while(var4.hasNext()) {
            String var5 = (String)var4.next();
            if(a(var2, var5)) {
               var3.add(var5);
            }
         }

         if(var3.isEmpty()) {
            var4 = var1.iterator();

            while(var4.hasNext()) {
               Object var6 = var4.next();
               if(var6 instanceof MinecraftKey && a(var2, ((MinecraftKey)var6).getName())) {
                  var3.add(String.valueOf(var6));
               }
            }
         }
      }

      return var3;
   }

   public boolean isListStart(String[] var1, int var2) {
      return false;
   }

   public static void a(class_m var0, ICommand var1, String var2, Object... var3) {
      a(var0, var1, 0, var2, var3);
   }

   public static void a(class_m var0, ICommand var1, int var2, String var3, Object... var4) {
      if(a != null) {
         a.a(var0, var1, var2, var3, var4);
      }

   }

   public static void a(class_h var0) {
      a = var0;
   }

   public int a(ICommand var1) {
      return this.getCommand().compareTo(var1.getCommand());
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((ICommand)var1);
   }

   public static class class_a_in_class_i {
      private final double a;
      private final double b;
      private final boolean c;

      protected class_a_in_class_i(double var1, double var3, boolean var5) {
         this.a = var1;
         this.b = var3;
         this.c = var5;
      }

      public double a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public boolean c() {
         return this.c;
      }
   }
}
