package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.class_bz;
import net.minecraft.server.class_cf;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.CommandAbstract;
import net.minecraft.server.ICommandListener;

public class CommandPardon extends CommandAbstract {
   public String getCommand() {
      return "pardon";
   }

   public int a() {
      return 3;
   }

   public String c(ICommandListener var1) {
      return "commands.unban.usage";
   }

   public boolean canUse(ICommandListener var1) {
      return MinecraftServer.getServer().getPlayerList().h().b() && super.canUse(var1);
   }

   public void execute(ICommandListener var1, String[] var2) throws class_bz {
      if(var2.length == 1 && var2[0].length() > 0) {
         MinecraftServer var3 = MinecraftServer.getServer();
         GameProfile var4 = var3.getPlayerList().h().a(var2[0]);
         if(var4 == null) {
            throw new class_bz("commands.unban.failed", new Object[]{var2[0]});
         } else {
            var3.getPlayerList().h().c(var4);
            a(var1, this, "commands.unban.success", new Object[]{var2[0]});
         }
      } else {
         throw new class_cf("commands.unban.usage", new Object[0]);
      }
   }

   public List tabComplete(ICommandListener var1, String[] var2, BlockPosition var3) {
      return var2.length == 1?a(var2, MinecraftServer.getServer().getPlayerList().h().a()):null;
   }
}
