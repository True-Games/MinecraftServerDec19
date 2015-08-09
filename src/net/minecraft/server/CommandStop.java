package net.minecraft.server;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_bz;
import net.minecraft.server.CommandAbstract;
import net.minecraft.server.ICommandListener;

public class CommandStop extends CommandAbstract {
   public String getCommand() {
      return "stop";
   }

   public String c(ICommandListener var1) {
      return "commands.stop.usage";
   }

   public void execute(ICommandListener var1, String[] var2) throws class_bz {
      if(MinecraftServer.N().d != null) {
         a(var1, this, "commands.stop.start", new Object[0]);
      }

      MinecraftServer.N().w();
   }
}
