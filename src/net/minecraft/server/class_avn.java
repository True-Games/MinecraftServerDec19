package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_ael;
import net.minecraft.server.class_aeq;
import net.minecraft.server.class_aes;
import net.minecraft.server.class_aoz;
import net.minecraft.server.class_c;
import net.minecraft.server.class_cj;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_eb;
import net.minecraft.server.class_om;

public class class_avn {
   public static final class_om a;
   private long b;
   private class_aes c;
   private String d;
   private int e;
   private int f;
   private int g;
   private long h;
   private long i;
   private long j;
   private long k;
   private class_dn l;
   private int m;
   private String n;
   private int o;
   private int p;
   private boolean q;
   private int r;
   private boolean s;
   private int t;
   private class_aeq.class_a_in_class_aeq u;
   private boolean v;
   private boolean w;
   private boolean x;
   private boolean y;
   private class_om z;
   private boolean A;
   private double B;
   private double C;
   private double D;
   private long E;
   private double F;
   private double G;
   private double H;
   private int I;
   private int J;
   private final Map K;
   private class_ael L;

   protected class_avn() {
      this.c = class_aes.b;
      this.d = "";
      this.B = 0.0D;
      this.C = 0.0D;
      this.D = 6.0E7D;
      this.E = 0L;
      this.F = 0.0D;
      this.G = 5.0D;
      this.H = 0.2D;
      this.I = 5;
      this.J = 15;
      this.K = Maps.newEnumMap(class_aoz.class);
      this.L = new class_ael();
   }

   public class_avn(class_dn var1) {
      this.c = class_aes.b;
      this.d = "";
      this.B = 0.0D;
      this.C = 0.0D;
      this.D = 6.0E7D;
      this.E = 0L;
      this.F = 0.0D;
      this.G = 5.0D;
      this.H = 0.2D;
      this.I = 5;
      this.J = 15;
      this.K = Maps.newEnumMap(class_aoz.class);
      this.L = new class_ael();
      this.b = var1.h("RandomSeed");
      if(var1.b("generatorName", 8)) {
         String var2 = var1.k("generatorName");
         this.c = class_aes.a(var2);
         if(this.c == null) {
            this.c = class_aes.b;
         } else if(this.c.f()) {
            int var3 = 0;
            if(var1.b("generatorVersion", 99)) {
               var3 = var1.g("generatorVersion");
            }

            this.c = this.c.a(var3);
         }

         if(var1.b("generatorOptions", 8)) {
            this.d = var1.k("generatorOptions");
         }
      }

      this.u = class_aeq.class_a_in_class_aeq.a(var1.g("GameType"));
      if(var1.b("MapFeatures", 99)) {
         this.v = var1.o("MapFeatures");
      } else {
         this.v = true;
      }

      this.e = var1.g("SpawnX");
      this.f = var1.g("SpawnY");
      this.g = var1.g("SpawnZ");
      this.h = var1.h("Time");
      if(var1.b("DayTime", 99)) {
         this.i = var1.h("DayTime");
      } else {
         this.i = this.h;
      }

      this.j = var1.h("LastPlayed");
      this.k = var1.h("SizeOnDisk");
      this.n = var1.k("LevelName");
      this.o = var1.g("version");
      this.p = var1.g("clearWeatherTime");
      this.r = var1.g("rainTime");
      this.q = var1.o("raining");
      this.t = var1.g("thunderTime");
      this.s = var1.o("thundering");
      this.w = var1.o("hardcore");
      if(var1.b("initialized", 99)) {
         this.y = var1.o("initialized");
      } else {
         this.y = true;
      }

      if(var1.b("allowCommands", 99)) {
         this.x = var1.o("allowCommands");
      } else {
         this.x = this.u == class_aeq.class_a_in_class_aeq.c;
      }

      if(var1.b("Player", 10)) {
         this.l = var1.n("Player");
         this.m = this.l.g("Dimension");
      }

      if(var1.b("GameRules", 10)) {
         this.L.a(var1.n("GameRules"));
      }

      if(var1.b("Difficulty", 99)) {
         this.z = class_om.a(var1.e("Difficulty"));
      }

      if(var1.b("DifficultyLocked", 1)) {
         this.A = var1.o("DifficultyLocked");
      }

      if(var1.b("BorderCenterX", 99)) {
         this.B = var1.j("BorderCenterX");
      }

      if(var1.b("BorderCenterZ", 99)) {
         this.C = var1.j("BorderCenterZ");
      }

      if(var1.b("BorderSize", 99)) {
         this.D = var1.j("BorderSize");
      }

      if(var1.b("BorderSizeLerpTime", 99)) {
         this.E = var1.h("BorderSizeLerpTime");
      }

      if(var1.b("BorderSizeLerpTarget", 99)) {
         this.F = var1.j("BorderSizeLerpTarget");
      }

      if(var1.b("BorderSafeZone", 99)) {
         this.G = var1.j("BorderSafeZone");
      }

      if(var1.b("BorderDamagePerBlock", 99)) {
         this.H = var1.j("BorderDamagePerBlock");
      }

      if(var1.b("BorderWarningBlocks", 99)) {
         this.I = var1.g("BorderWarningBlocks");
      }

      if(var1.b("BorderWarningTime", 99)) {
         this.J = var1.g("BorderWarningTime");
      }

      if(var1.b("DimensionData", 10)) {
         class_dn var5 = var1.n("DimensionData");
         Iterator var6 = var5.c().iterator();

         while(var6.hasNext()) {
            String var4 = (String)var6.next();
            this.K.put(class_aoz.a(Integer.parseInt(var4)), var5.n(var4));
         }
      }

   }

   public class_avn(class_aeq var1, String var2) {
      this.c = class_aes.b;
      this.d = "";
      this.B = 0.0D;
      this.C = 0.0D;
      this.D = 6.0E7D;
      this.E = 0L;
      this.F = 0.0D;
      this.G = 5.0D;
      this.H = 0.2D;
      this.I = 5;
      this.J = 15;
      this.K = Maps.newEnumMap(class_aoz.class);
      this.L = new class_ael();
      this.a(var1);
      this.n = var2;
      this.z = a;
      this.y = false;
   }

   public void a(class_aeq var1) {
      this.b = var1.d();
      this.u = var1.e();
      this.v = var1.g();
      this.w = var1.f();
      this.c = var1.h();
      this.d = var1.j();
      this.x = var1.i();
   }

   public class_avn(class_avn var1) {
      this.c = class_aes.b;
      this.d = "";
      this.B = 0.0D;
      this.C = 0.0D;
      this.D = 6.0E7D;
      this.E = 0L;
      this.F = 0.0D;
      this.G = 5.0D;
      this.H = 0.2D;
      this.I = 5;
      this.J = 15;
      this.K = Maps.newEnumMap(class_aoz.class);
      this.L = new class_ael();
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.u = var1.u;
      this.v = var1.v;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.l = var1.l;
      this.m = var1.m;
      this.n = var1.n;
      this.o = var1.o;
      this.r = var1.r;
      this.q = var1.q;
      this.t = var1.t;
      this.s = var1.s;
      this.w = var1.w;
      this.x = var1.x;
      this.y = var1.y;
      this.L = var1.L;
      this.z = var1.z;
      this.A = var1.A;
      this.B = var1.B;
      this.C = var1.C;
      this.D = var1.D;
      this.E = var1.E;
      this.F = var1.F;
      this.G = var1.G;
      this.H = var1.H;
      this.J = var1.J;
      this.I = var1.I;
   }

   public class_dn a() {
      class_dn var1 = new class_dn();
      this.a(var1, this.l);
      return var1;
   }

   public class_dn a(class_dn var1) {
      class_dn var2 = new class_dn();
      this.a(var2, var1);
      return var2;
   }

   private void a(class_dn var1, class_dn var2) {
      var1.a("RandomSeed", this.b);
      var1.a("generatorName", this.c.a());
      var1.a("generatorVersion", this.c.d());
      var1.a("generatorOptions", this.d);
      var1.a("GameType", this.u.a());
      var1.a("MapFeatures", this.v);
      var1.a("SpawnX", this.e);
      var1.a("SpawnY", this.f);
      var1.a("SpawnZ", this.g);
      var1.a("Time", this.h);
      var1.a("DayTime", this.i);
      var1.a("SizeOnDisk", this.k);
      var1.a("LastPlayed", MinecraftServer.az());
      var1.a("LevelName", this.n);
      var1.a("version", this.o);
      var1.a("clearWeatherTime", this.p);
      var1.a("rainTime", this.r);
      var1.a("raining", this.q);
      var1.a("thunderTime", this.t);
      var1.a("thundering", this.s);
      var1.a("hardcore", this.w);
      var1.a("allowCommands", this.x);
      var1.a("initialized", this.y);
      var1.a("BorderCenterX", this.B);
      var1.a("BorderCenterZ", this.C);
      var1.a("BorderSize", this.D);
      var1.a("BorderSizeLerpTime", this.E);
      var1.a("BorderSafeZone", this.G);
      var1.a("BorderDamagePerBlock", this.H);
      var1.a("BorderSizeLerpTarget", this.F);
      var1.a("BorderWarningBlocks", (double)this.I);
      var1.a("BorderWarningTime", (double)this.J);
      if(this.z != null) {
         var1.a("Difficulty", (byte)this.z.a());
      }

      var1.a("DifficultyLocked", this.A);
      var1.a((String)"GameRules", (class_eb)this.L.a());
      class_dn var3 = new class_dn();
      Iterator var4 = this.K.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var3.a(String.valueOf(((class_aoz)var5.getKey()).a()), (class_eb)var5.getValue());
      }

      var1.a((String)"DimensionData", (class_eb)var3);
      if(var2 != null) {
         var1.a((String)"Player", (class_eb)var2);
      }

   }

   public long b() {
      return this.b;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public int e() {
      return this.g;
   }

   public long f() {
      return this.h;
   }

   public long g() {
      return this.i;
   }

   public class_dn i() {
      return this.l;
   }

   public void b(long var1) {
      this.h = var1;
   }

   public void c(long var1) {
      this.i = var1;
   }

   public void a(class_cj var1) {
      this.e = var1.n();
      this.f = var1.o();
      this.g = var1.p();
   }

   public String k() {
      return this.n;
   }

   public void a(String var1) {
      this.n = var1;
   }

   public int l() {
      return this.o;
   }

   public void e(int var1) {
      this.o = var1;
   }

   public int A() {
      return this.p;
   }

   public void i(int var1) {
      this.p = var1;
   }

   public boolean n() {
      return this.s;
   }

   public void a(boolean var1) {
      this.s = var1;
   }

   public int o() {
      return this.t;
   }

   public void f(int var1) {
      this.t = var1;
   }

   public boolean p() {
      return this.q;
   }

   public void b(boolean var1) {
      this.q = var1;
   }

   public int q() {
      return this.r;
   }

   public void g(int var1) {
      this.r = var1;
   }

   public class_aeq.class_a_in_class_aeq r() {
      return this.u;
   }

   public boolean s() {
      return this.v;
   }

   public void f(boolean var1) {
      this.v = var1;
   }

   public void a(class_aeq.class_a_in_class_aeq var1) {
      this.u = var1;
   }

   public boolean t() {
      return this.w;
   }

   public void g(boolean var1) {
      this.w = var1;
   }

   public class_aes u() {
      return this.c;
   }

   public void a(class_aes var1) {
      this.c = var1;
   }

   public String B() {
      return this.d;
   }

   public boolean v() {
      return this.x;
   }

   public void c(boolean var1) {
      this.x = var1;
   }

   public boolean w() {
      return this.y;
   }

   public void d(boolean var1) {
      this.y = var1;
   }

   public class_ael x() {
      return this.L;
   }

   public double C() {
      return this.B;
   }

   public double D() {
      return this.C;
   }

   public double E() {
      return this.D;
   }

   public void a(double var1) {
      this.D = var1;
   }

   public long F() {
      return this.E;
   }

   public void e(long var1) {
      this.E = var1;
   }

   public double G() {
      return this.F;
   }

   public void b(double var1) {
      this.F = var1;
   }

   public void c(double var1) {
      this.C = var1;
   }

   public void d(double var1) {
      this.B = var1;
   }

   public double H() {
      return this.G;
   }

   public void e(double var1) {
      this.G = var1;
   }

   public double I() {
      return this.H;
   }

   public void f(double var1) {
      this.H = var1;
   }

   public int J() {
      return this.I;
   }

   public int K() {
      return this.J;
   }

   public void j(int var1) {
      this.I = var1;
   }

   public void k(int var1) {
      this.J = var1;
   }

   public class_om y() {
      return this.z;
   }

   public void a(class_om var1) {
      this.z = var1;
   }

   public boolean z() {
      return this.A;
   }

   public void e(boolean var1) {
      this.A = var1;
   }

   public void a(class_c var1) {
      var1.a("Level seed", new Callable() {
         public String a() throws Exception {
            return String.valueOf(class_avn.this.b());
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level generator", new Callable() {
         public String a() throws Exception {
            return String.format("ID %02d - %s, ver %d. Features enabled: %b", new Object[]{Integer.valueOf(class_avn.this.c.g()), class_avn.this.c.a(), Integer.valueOf(class_avn.this.c.d()), Boolean.valueOf(class_avn.this.v)});
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level generator options", new Callable() {
         public String a() throws Exception {
            return class_avn.this.d;
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level spawn location", new Callable() {
         public String a() throws Exception {
            return class_c.a((double)class_avn.this.e, (double)class_avn.this.f, (double)class_avn.this.g);
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level time", new Callable() {
         public String a() throws Exception {
            return String.format("%d game time, %d day time", new Object[]{Long.valueOf(class_avn.this.h), Long.valueOf(class_avn.this.i)});
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level dimension", new Callable() {
         public String a() throws Exception {
            return String.valueOf(class_avn.this.m);
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level storage version", new Callable() {
         public String a() throws Exception {
            String var1 = "Unknown?";

            try {
               switch(class_avn.this.o) {
               case 19132:
                  var1 = "McRegion";
                  break;
               case 19133:
                  var1 = "Anvil";
               }
            } catch (Throwable var3) {
               ;
            }

            return String.format("0x%05X - %s", new Object[]{Integer.valueOf(class_avn.this.o), var1});
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level weather", new Callable() {
         public String a() throws Exception {
            return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[]{Integer.valueOf(class_avn.this.r), Boolean.valueOf(class_avn.this.q), Integer.valueOf(class_avn.this.t), Boolean.valueOf(class_avn.this.s)});
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
      var1.a("Level game mode", new Callable() {
         public String a() throws Exception {
            return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[]{class_avn.this.u.b(), Integer.valueOf(class_avn.this.u.a()), Boolean.valueOf(class_avn.this.w), Boolean.valueOf(class_avn.this.x)});
         }

         // $FF: synthetic method
         public Object call() throws Exception {
            return this.a();
         }
      });
   }

   public class_dn a(class_aoz var1) {
      class_dn var2 = (class_dn)this.K.get(var1);
      return var2 == null?new class_dn():var2;
   }

   public void a(class_aoz var1, class_dn var2) {
      this.K.put(var1, var2);
   }

   static {
      a = class_om.c;
   }
}
