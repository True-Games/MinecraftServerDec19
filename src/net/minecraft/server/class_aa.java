package net.minecraft.server;

import java.util.List;

public class class_aa extends class_i {
	@Override
	public String c() {
		return "me";
	}

	@Override
	public int a() {
		return 0;
	}

	@Override
	public String c(class_m var1) {
		return "commands.me.usage";
	}

	@Override
	public void a(class_m var1, String[] var2) throws class_bz {
		if (var2.length <= 0) {
			throw new class_cf("commands.me.usage", new Object[0]);
		} else {
			class_eu var3 = b(var1, var2, 0, !(var1 instanceof class_yu));
			MinecraftServer.P().ar().a((new class_fb("chat.type.emote", new Object[] { var1.f_(), var3 })));
		}
	}

	@Override
	public List a(class_m var1, String[] var2, class_cj var3) {
		return a(var2, MinecraftServer.P().M());
	}
}