package net.minecraft.server;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import net.minecraft.server.World;
import net.minecraft.server.class_awf;
import net.minecraft.server.class_awg;
import net.minecraft.server.BlockPosition;
import net.minecraft.server.EnumDirection;
import net.minecraft.server.class_cy;
import net.minecraft.server.class_dn;
import net.minecraft.server.class_dy;
import net.minecraft.server.class_eb;
import net.minecraft.server.class_lg;
import net.minecraft.server.MathHelper;
import net.minecraft.server.class_pc;
import net.minecraft.server.class_pl;
import net.minecraft.server.class_pm;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_qa;
import net.minecraft.server.class_xj;
import net.minecraft.server.EnumDirection.EnumAxis;

public class class_xk extends class_pr {
	private class_qa a;
	private class_pr b;
	private EnumDirection c;
	private int d;
	private double e;
	private double f;
	private double g;
	private UUID h;
	private BlockPosition i;
	private UUID as;
	private BlockPosition at;

	public class_xk(World var1) {
		super(var1);
		this.a(0.3125F, 0.3125F);
		this.T = true;
	}

	public class_xk(World var1, class_qa var2, class_pr var3, EnumDirection.EnumAxis var4) {
		this(var1);
		this.a = var2;
		BlockPosition var5 = new BlockPosition(var2);
		double var6 = (double) var5.getX() + 0.5D;
		double var8 = (double) var5.getY() + 0.5D;
		double var10 = (double) var5.getZ() + 0.5D;
		this.b(var6, var8, var10, this.y, this.z);
		this.b = var3;
		this.c = EnumDirection.UP;
		this.a(var4);
	}

	protected void b(class_dn var1) {
		BlockPosition var2;
		class_dn var3;
		if (this.a != null) {
			var2 = new BlockPosition(this.a);
			var3 = class_dy.a(this.a.aM());
			var3.a("X", var2.getX());
			var3.a("Y", var2.getY());
			var3.a("Z", var2.getZ());
			var1.a((String) "Owner", (class_eb) var3);
		}

		if (this.b != null) {
			var2 = new BlockPosition(this.b);
			var3 = class_dy.a(this.b.aM());
			var3.a("X", var2.getX());
			var3.a("Y", var2.getY());
			var3.a("Z", var2.getZ());
			var1.a((String) "Target", (class_eb) var3);
		}

		if (this.c != null) {
			var1.a("Dir", this.c.getId());
		}

		var1.a("Steps", this.d);
		var1.a("TXD", this.e);
		var1.a("TYD", this.f);
		var1.a("TZD", this.g);
	}

	protected void a(class_dn var1) {
		this.d = var1.g("Steps");
		this.e = var1.j("TXD");
		this.f = var1.j("TYD");
		this.g = var1.j("TZD");
		if (var1.b("Dir", 99)) {
			this.c = EnumDirection.getById(var1.g("Dir"));
		}

		class_dn var2;
		if (var1.b("Owner", 10)) {
			var2 = var1.n("Owner");
			this.h = class_dy.b(var2);
			this.i = new BlockPosition(var2.g("X"), var2.g("Y"), var2.g("Z"));
		}

		if (var1.b("Target", 10)) {
			var2 = var1.n("Target");
			this.as = class_dy.b(var2);
			this.at = new BlockPosition(var2.g("X"), var2.g("Y"), var2.g("Z"));
		}

	}

	protected void h() {
	}

	private void a(EnumDirection var1) {
		this.c = var1;
	}

	private void a(EnumDirection.EnumAxis var1) {
		double var3 = 0.5D;
		BlockPosition var2;
		if (this.b != null) {
			var3 = (double) this.b.K * 0.5D;
			var2 = new BlockPosition(this.b.s, this.b.t + var3, this.b.u);
		} else {
			var2 = (new BlockPosition(this)).shiftDown();
		}

		double var5 = (double) var2.getX() + 0.5D;
		double var7 = (double) var2.getY() + var3;
		double var9 = (double) var2.getZ() + 0.5D;
		if (var2.distanceSquaredFromCenter(this.s, this.t, this.u) >= 4.0D) {
			BlockPosition var11 = new BlockPosition(this);
			ArrayList var12 = Lists.newArrayList();
			if (var1 != EnumDirection.EnumAxis.X) {
				if (var11.getX() < var2.getX() && this.o.d(var11.shiftEast())) {
					var12.add(EnumDirection.EAST);
				} else if (var11.getX() > var2.getX() && this.o.d(var11.shiftWest())) {
					var12.add(EnumDirection.WEST);
				}
			}

			if (var1 != EnumDirection.EnumAxis.Y) {
				if (var11.getY() < var2.getY() && this.o.d(var11.shiftUp())) {
					var12.add(EnumDirection.UP);
				} else if (var11.getY() > var2.getY() && this.o.d(var11.shiftDown())) {
					var12.add(EnumDirection.DOWN);
				}
			}

			if (var1 != EnumDirection.EnumAxis.Z) {
				if (var11.getZ() < var2.getZ() && this.o.d(var11.shiftSouth())) {
					var12.add(EnumDirection.SOUTH);
				} else if (var11.getZ() > var2.getZ() && this.o.d(var11.shiftNorth())) {
					var12.add(EnumDirection.NORTH);
				}
			}

			EnumDirection var13 = EnumDirection.getRandom(this.V);
			if (!var12.isEmpty()) {
				var13 = (EnumDirection) var12.get(this.V.nextInt(var12.size()));
			} else {
				for (int var14 = 5; !this.o.d(var11.shift(var13)) && var14 > 0; --var14) {
					var13 = EnumDirection.getRandom(this.V);
				}
			}

			var5 = this.s + (double) var13.getAdjacentX();
			var7 = this.t + (double) var13.getAdjacentY();
			var9 = this.u + (double) var13.getAdjacentZ();
			this.a(var13);
		} else {
			this.a((EnumDirection) null);
		}

		double var19 = var5 - this.s;
		double var20 = var7 - this.t;
		double var15 = var9 - this.u;
		double var17 = (double) MathHelper.sqrt(var19 * var19 + var20 * var20 + var15 * var15);
		if (var17 == 0.0) {
			this.f = 0.0;
			this.e = 0.0;
			this.g = 0.0;
		} else {
			this.e = var19 / var17 * 0.15;
			this.f = var20 / var17 * 0.15;
			this.g = var15 / var17 * 0.15;
		}
		this.ai = true;
		this.d = 10 + this.V.nextInt(5) * 10;
	}

	public void t_() {
		super.t_();
		if (!this.o.D) {
			List var1;
			Iterator var2;
			class_qa var3;
			if (this.b == null && this.as != null) {
				var1 = this.o.a(class_qa.class, new class_awf(this.at.add(-2, -2, -2), this.at.add(2, 2, 2)));
				var2 = var1.iterator();

				while (var2.hasNext()) {
					var3 = (class_qa) var2.next();
					if (var3.aM().equals(this.as)) {
						this.b = var3;
						break;
					}
				}

				this.as = null;
			}

			if (this.a == null && this.h != null) {
				var1 = this.o.a(class_qa.class, new class_awf(this.i.add(-2, -2, -2), this.i.add(2, 2, 2)));
				var2 = var1.iterator();

				while (var2.hasNext()) {
					var3 = (class_qa) var2.next();
					if (var3.aM().equals(this.h)) {
						this.a = var3;
						break;
					}
				}

				this.h = null;
			}

			if (this.b != null && !this.b.I) {
				this.e = MathHelper.clamp(this.e * 1.025D, -1.0D, 1.0D);
				this.f = MathHelper.clamp(this.f * 1.025D, -1.0D, 1.0D);
				this.g = MathHelper.clamp(this.g * 1.025D, -1.0D, 1.0D);
				this.v += (this.e - this.v) * 0.2D;
				this.w += (this.f - this.w) * 0.2D;
				this.x += (this.g - this.x) * 0.2D;
			} else {
				this.w -= 0.04D;
			}

			class_awg var4 = class_xj.a(this, true, false, this.a);
			if (var4 != null) {
				this.a(var4);
			}
		}

		this.b(this.s + this.v, this.t + this.w, this.u + this.x);
		class_xj.a(this, 0.5F);
		if (!this.o.D) {
			if (this.b != null && !this.b.I) {
				if (this.d > 0) {
					--this.d;
					if (this.d == 0) {
						this.a(this.c != null ? this.c.getAxis() : null);
					}
				}

				if (this.c != null) {
					BlockPosition var6 = new BlockPosition(this);
					EnumAxis axis = c.getAxis();
					if (this.o.d(var6.shift(c), false)) {
						this.a(axis);
					} else {
						BlockPosition var7 = new BlockPosition(this.b);
						if (axis == EnumDirection.EnumAxis.X && var6.getX() == var7.getX() || axis == EnumDirection.EnumAxis.Z && var6.getZ() == var7.getZ() || axis == EnumDirection.EnumAxis.Y && var6.getY() == var7.getY()) {
							this.a(axis);
						}
					}
				}
			}
		} else {
			this.o.a(class_cy.R, this.s - this.v, this.t - this.w + 0.15D, this.u - this.x, 0.0D, 0.0D, 0.0D, new int[0]);
		}

	}

	public boolean av() {
		return false;
	}

	public float c(float var1) {
		return 1.0F;
	}

	protected void a(class_awg var1) {
		if (var1.d != null) {
			boolean var2 = var1.d.a(class_pc.a((class_pr) this, (class_qa) this.a), 4.0F);
			if (var2) {
				this.a(this.a, var1.d);
				if (var1.d instanceof class_qa) {
					((class_qa) var1.d).c(new class_pl(class_pm.y, 200));
				}
			}
		} else {
			((class_lg) this.o).a(class_cy.b, this.s, this.t, this.u, 2, 0.2D, 0.2D, 0.2D, 0.0D, new int[0]);
			this.a("mob.irongolem.hit", 1.0F, 1.0F);
		}

		this.J();
	}

	public boolean ad() {
		return true;
	}

	public boolean a(class_pc var1, float var2) {
		if (!this.o.D) {
			this.a("mob.irongolem.hit", 1.0F, 1.0F);
			((class_lg) this.o).a(class_cy.j, this.s, this.t, this.u, 15, 0.2D, 0.2D, 0.2D, 0.0D, new int[0]);
			this.J();
		}

		return true;
	}
}
