package net.minecraft.server;

import java.io.IOException;

public class class_ih implements Packet {
	private class_ih.class_a_in_class_ih a;

	public class_ih() {
	}

	public class_ih(class_ih.class_a_in_class_ih var1) {
		a = var1;
	}

	@Override
	public void decode(PacketDataSerializer var1) throws IOException {
		a = (class_ih.class_a_in_class_ih) var1.a(class_ih.class_a_in_class_ih.class);
	}

	@Override
	public void encode(PacketDataSerializer var1) throws IOException {
		var1.a(a);
	}

	public void a(class_id var1) {
		var1.a(this);
	}

	public class_ih.class_a_in_class_ih a() {
		return a;
	}

	// $FF: synthetic method
	// $FF: bridge method
	@Override
	public void handle(PacketListener var1) {
		this.a((class_id) var1);
	}

	public static enum class_a_in_class_ih {
		a,
		b,
		c;
	}
}
