package net.minecraft.server;

public class ItemArrow extends Item {
   public ItemArrow() {
      this.registerItemKey(CreativeTab.COMBAT);
   }

   public EntityArrow a(World var1, ItemStack var2, EntityLiving var3) {
      return new EntityArrow(var1, var3);
   }
}
