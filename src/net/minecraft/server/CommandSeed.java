package net.minecraft.server;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.World;
import net.minecraft.server.class_bz;
import net.minecraft.server.ChatMessage;
import net.minecraft.server.CommandAbstract;
import net.minecraft.server.ICommandListener;
import net.minecraft.server.EntityHuman;

public class CommandSeed extends CommandAbstract {
   public boolean canUse(ICommandListener var1) {
      return MinecraftServer.N().isLocal() || super.canUse(var1);
   }

   public String getCommand() {
      return "seed";
   }

   public int a() {
      return 2;
   }

   public String c(ICommandListener var1) {
      return "commands.seed.usage";
   }

   public void execute(ICommandListener var1, String[] var2) throws class_bz {
      Object var3 = var1 instanceof EntityHuman?((EntityHuman)var1).world:MinecraftServer.N().getWorldServer(0);
      var1.sendMessage(new ChatMessage("commands.seed.success", new Object[]{Long.valueOf(((World)var3).K())}));
   }
}
