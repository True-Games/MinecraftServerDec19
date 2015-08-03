package net.minecraft.server;

import net.minecraft.server.class_aac;
import net.minecraft.server.class_aad;
import net.minecraft.server.class_aal;
import net.minecraft.server.Item;
import net.minecraft.server.class_aax;
import net.minecraft.server.class_abe;
import net.minecraft.server.class_abl;
import net.minecraft.server.MinecraftKey;
import net.minecraft.server.Bootstrap;
import net.minecraft.server.ItemArmor;
import net.minecraft.server.class_zb;
import net.minecraft.server.class_zl;

public class Items {

	public static final Item IRON_SHOVEL;
	public static final Item IRON_PICKAXE;
	public static final Item IRON_AXE;
	public static final Item FLINT_AND_STEEL;
	public static final Item APPLE;
	public static final class_zl BOW;
	public static final Item ARROW;
	public static final Item SPECTRAL_ARROW;
	public static final Item TIPPED_ARROW;
	public static final Item COAL;
	public static final Item DIAMOND;
	public static final Item IRON_INGOT;
	public static final Item GOLD_INGOT;
	public static final Item IRON_SWORD;
	public static final Item WOODEN_SWORD;
	public static final Item WOODEN_SHOVEL;
	public static final Item WOODEN_PICKAXE;
	public static final Item WOODEN_AXE;
	public static final Item STONE_SWORD;
	public static final Item STONE_SHOVEL;
	public static final Item STONE_PICKAXE;
	public static final Item STONE_AXE;
	public static final Item DIAMOND_SWORD;
	public static final Item DIAMOND_SHOVEL;
	public static final Item DIAMOND_PICKAXE;
	public static final Item DIAMOND_AXE;
	public static final Item STICK;
	public static final Item BOWL;
	public static final Item MUSHROOM_STEW;
	public static final Item GOLDEN_SWORD;
	public static final Item GOLDEN_SHOVEL;
	public static final Item GOLDEN_PICKAXE;
	public static final Item G;
	public static final Item H;
	public static final Item I;
	public static final Item J;
	public static final Item K;
	public static final Item L;
	public static final Item M;
	public static final Item N;
	public static final Item O;
	public static final Item P;
	public static final Item Q;
	public static final Item R;
	public static final ItemArmor S;
	public static final ItemArmor T;
	public static final ItemArmor U;
	public static final ItemArmor V;
	public static final ItemArmor W;
	public static final ItemArmor X;
	public static final ItemArmor Y;
	public static final ItemArmor Z;
	public static final ItemArmor aa;
	public static final ItemArmor ab;
	public static final ItemArmor ac;
	public static final ItemArmor ad;
	public static final ItemArmor ae;
	public static final ItemArmor af;
	public static final ItemArmor ag;
	public static final ItemArmor ah;
	public static final ItemArmor ai;
	public static final ItemArmor aj;
	public static final ItemArmor ak;
	public static final ItemArmor al;
	public static final Item am;
	public static final Item an;
	public static final Item ao;
	public static final Item ap;
	public static final Item aq;
	public static final Item ar;
	public static final Item as;
	public static final Item at;
	public static final Item au;
	public static final Item av;
	public static final Item aw;
	public static final Item ax;
	public static final Item ay;
	public static final Item az;
	public static final Item aA;
	public static final Item aB;
	public static final Item aC;
	public static final Item aD;
	public static final Item aE;
	public static final Item aF;
	public static final Item aG;
	public static final Item aH;
	public static final Item aI;
	public static final Item aJ;
	public static final Item aK;
	public static final Item aL;
	public static final Item aM;
	public static final Item aN;
	public static final Item aO;
	public static final Item aP;
	public static final Item aQ;
	public static final Item aR;
	public static final Item aS;
	public static final class_aal aT;
	public static final Item aU;
	public static final Item aV;
	public static final Item aW;
	public static final Item aX;
	public static final Item aY;
	public static final Item aZ;
	public static final Item ba;
	public static final Item bb;
	public static final Item bc;
	public static final Item bd;
	public static final Item be;
	public static final class_aax bf;
	public static final class_abl bg;
	public static final Item bh;
	public static final Item bi;
	public static final Item bj;
	public static final Item bk;
	public static final Item bl;
	public static final Item bm;
	public static final Item bn;
	public static final Item bo;
	public static final Item bp;
	public static final Item bq;
	public static final Item br;
	public static final Item bs;
	public static final Item bt;
	public static final Item bu;
	public static final Item bv;
	public static final Item bw;
	public static final Item bx;
	public static final Item by;
	public static final Item bz;
	public static final Item bA;
	public static final class_abe bB;
	public static final class_abe bC;
	public static final Item bD;
	public static final Item bE;
	public static final Item bF;
	public static final Item bG;
	public static final Item bH;
	public static final Item bI;
	public static final Item bJ;
	public static final Item bK;
	public static final Item bL;
	public static final Item bM;
	public static final Item bN;
	public static final Item bO;
	public static final Item bP;
	public static final Item bQ;
	public static final Item bR;
	public static final Item bS;
	public static final Item bT;
	public static final Item bU;
	public static final Item bV;
	public static final Item bW;
	public static final Item bX;
	public static final class_aac bY;
	public static final Item bZ;
	public static final Item ca;
	public static final Item cb;
	public static final Item cc;
	public static final Item cd;
	public static final Item ce;
	public static final Item cf;
	public static final class_aad cg;
	public static final Item ch;
	public static final Item ci;
	public static final Item cj;
	public static final Item ck;
	public static final Item cl;
	public static final class_zb cm;
	public static final Item cn;
	public static final Item co;
	public static final Item cp;
	public static final Item cq;
	public static final Item cr;
	public static final Item cs;
	public static final Item ct;
	public static final Item cu;
	public static final Item cv;
	public static final Item cw;
	public static final Item cx;
	public static final Item cy;
	public static final Item cz;
	public static final Item cA;
	public static final Item cB;
	public static final Item cC;
	public static final Item cD;
	public static final Item cE;
	public static final Item cF;
	public static final Item cG;
	public static final Item cH;
	public static final Item cI;
	public static final Item cJ;
	public static final Item cK;
	public static final Item cL;
	public static final Item cM;

	private static Item getByName(String name) {
		Item item = Item.ITEM_REGISTRY.get(new MinecraftKey(name));
		if (item == null) {
			throw new IllegalStateException("Invalid Item requested: " + name);
		} else {
			return item;
		}
	}

	static {
		if (!Bootstrap.isInitDone()) {
			throw new RuntimeException("Accessed Items before Bootstrap!");
		} else {
			IRON_SHOVEL = getByName("iron_shovel");
			IRON_PICKAXE = getByName("iron_pickaxe");
			IRON_AXE = getByName("iron_axe");
			FLINT_AND_STEEL = getByName("flint_and_steel");
			APPLE = getByName("apple");
			BOW = (class_zl) getByName("bow");
			ARROW = getByName("arrow");
			SPECTRAL_ARROW = getByName("spectral_arrow");
			TIPPED_ARROW = getByName("tipped_arrow");
			COAL = getByName("coal");
			DIAMOND = getByName("diamond");
			IRON_INGOT = getByName("iron_ingot");
			GOLD_INGOT = getByName("gold_ingot");
			IRON_SWORD = getByName("iron_sword");
			WOODEN_SWORD = getByName("wooden_sword");
			WOODEN_SHOVEL = getByName("wooden_shovel");
			WOODEN_PICKAXE = getByName("wooden_pickaxe");
			WOODEN_AXE = getByName("wooden_axe");
			STONE_SWORD = getByName("stone_sword");
			STONE_SHOVEL = getByName("stone_shovel");
			STONE_PICKAXE = getByName("stone_pickaxe");
			STONE_AXE = getByName("stone_axe");
			DIAMOND_SWORD = getByName("diamond_sword");
			DIAMOND_SHOVEL = getByName("diamond_shovel");
			DIAMOND_PICKAXE = getByName("diamond_pickaxe");
			DIAMOND_AXE = getByName("diamond_axe");
			STICK = getByName("stick");
			BOWL = getByName("bowl");
			MUSHROOM_STEW = getByName("mushroom_stew");
			GOLDEN_SWORD = getByName("golden_sword");
			GOLDEN_SHOVEL = getByName("golden_shovel");
			GOLDEN_PICKAXE = getByName("golden_pickaxe");
			G = getByName("golden_axe");
			H = getByName("string");
			I = getByName("feather");
			J = getByName("gunpowder");
			K = getByName("wooden_hoe");
			L = getByName("stone_hoe");
			M = getByName("iron_hoe");
			N = getByName("diamond_hoe");
			O = getByName("golden_hoe");
			P = getByName("wheat_seeds");
			Q = getByName("wheat");
			R = getByName("bread");
			S = (ItemArmor) getByName("leather_helmet");
			T = (ItemArmor) getByName("leather_chestplate");
			U = (ItemArmor) getByName("leather_leggings");
			V = (ItemArmor) getByName("leather_boots");
			W = (ItemArmor) getByName("chainmail_helmet");
			X = (ItemArmor) getByName("chainmail_chestplate");
			Y = (ItemArmor) getByName("chainmail_leggings");
			Z = (ItemArmor) getByName("chainmail_boots");
			aa = (ItemArmor) getByName("iron_helmet");
			ab = (ItemArmor) getByName("iron_chestplate");
			ac = (ItemArmor) getByName("iron_leggings");
			ad = (ItemArmor) getByName("iron_boots");
			ae = (ItemArmor) getByName("diamond_helmet");
			af = (ItemArmor) getByName("diamond_chestplate");
			ag = (ItemArmor) getByName("diamond_leggings");
			ah = (ItemArmor) getByName("diamond_boots");
			ai = (ItemArmor) getByName("golden_helmet");
			aj = (ItemArmor) getByName("golden_chestplate");
			ak = (ItemArmor) getByName("golden_leggings");
			al = (ItemArmor) getByName("golden_boots");
			am = getByName("flint");
			an = getByName("porkchop");
			ao = getByName("cooked_porkchop");
			ap = getByName("painting");
			aq = getByName("golden_apple");
			ar = getByName("sign");
			as = getByName("wooden_door");
			at = getByName("spruce_door");
			au = getByName("birch_door");
			av = getByName("jungle_door");
			aw = getByName("acacia_door");
			ax = getByName("dark_oak_door");
			ay = getByName("bucket");
			az = getByName("water_bucket");
			aA = getByName("lava_bucket");
			aB = getByName("minecart");
			aC = getByName("saddle");
			aD = getByName("iron_door");
			aE = getByName("redstone");
			aF = getByName("snowball");
			aG = getByName("boat");
			aH = getByName("leather");
			aI = getByName("milk_bucket");
			aJ = getByName("brick");
			aK = getByName("clay_ball");
			aL = getByName("reeds");
			aM = getByName("paper");
			aN = getByName("book");
			aO = getByName("slime_ball");
			aP = getByName("chest_minecart");
			aQ = getByName("furnace_minecart");
			aR = getByName("egg");
			aS = getByName("compass");
			aT = (class_aal) getByName("fishing_rod");
			aU = getByName("clock");
			aV = getByName("glowstone_dust");
			aW = getByName("fish");
			aX = getByName("cooked_fish");
			aY = getByName("dye");
			aZ = getByName("bone");
			ba = getByName("sugar");
			bb = getByName("cake");
			bc = getByName("bed");
			bd = getByName("repeater");
			be = getByName("cookie");
			bf = (class_aax) getByName("filled_map");
			bg = (class_abl) getByName("shears");
			bh = getByName("melon");
			bi = getByName("pumpkin_seeds");
			bj = getByName("melon_seeds");
			bk = getByName("beef");
			bl = getByName("cooked_beef");
			bm = getByName("chicken");
			bn = getByName("cooked_chicken");
			bo = getByName("mutton");
			bp = getByName("cooked_mutton");
			bq = getByName("rabbit");
			br = getByName("cooked_rabbit");
			bs = getByName("rabbit_stew");
			bt = getByName("rabbit_foot");
			bu = getByName("rabbit_hide");
			bv = getByName("rotten_flesh");
			bw = getByName("ender_pearl");
			bx = getByName("blaze_rod");
			by = getByName("ghast_tear");
			bz = getByName("gold_nugget");
			bA = getByName("nether_wart");
			bB = (class_abe) getByName("potion");
			bC = (class_abe) getByName("splash_potion");
			bD = getByName("glass_bottle");
			bE = getByName("spider_eye");
			bF = getByName("fermented_spider_eye");
			bG = getByName("blaze_powder");
			bH = getByName("magma_cream");
			bI = getByName("brewing_stand");
			bJ = getByName("cauldron");
			bK = getByName("ender_eye");
			bL = getByName("speckled_melon");
			bM = getByName("spawn_egg");
			bN = getByName("experience_bottle");
			bO = getByName("fire_charge");
			bP = getByName("writable_book");
			bQ = getByName("written_book");
			bR = getByName("emerald");
			bS = getByName("item_frame");
			bT = getByName("flower_pot");
			bU = getByName("carrot");
			bV = getByName("potato");
			bW = getByName("baked_potato");
			bX = getByName("poisonous_potato");
			bY = (class_aac) getByName("map");
			bZ = getByName("golden_carrot");
			ca = getByName("skull");
			cb = getByName("carrot_on_a_stick");
			cc = getByName("nether_star");
			cd = getByName("pumpkin_pie");
			ce = getByName("fireworks");
			cf = getByName("firework_charge");
			cg = (class_aad) getByName("enchanted_book");
			ch = getByName("comparator");
			ci = getByName("netherbrick");
			cj = getByName("quartz");
			ck = getByName("tnt_minecart");
			cl = getByName("hopper_minecart");
			cm = (class_zb) getByName("armor_stand");
			cn = getByName("iron_horse_armor");
			co = getByName("golden_horse_armor");
			cp = getByName("diamond_horse_armor");
			cq = getByName("lead");
			cr = getByName("name_tag");
			cs = getByName("command_block_minecart");
			ct = getByName("record_13");
			cu = getByName("record_cat");
			cv = getByName("record_blocks");
			cw = getByName("record_chirp");
			cx = getByName("record_far");
			cy = getByName("record_mall");
			cz = getByName("record_mellohi");
			cA = getByName("record_stal");
			cB = getByName("record_strad");
			cC = getByName("record_ward");
			cD = getByName("record_11");
			cE = getByName("record_wait");
			cF = getByName("prismarine_shard");
			cG = getByName("prismarine_crystals");
			cH = getByName("banner");
			cI = getByName("chorus_fruit");
			cJ = getByName("chorus_fruit_popped");
			cK = getByName("beetroot_seeds");
			cL = getByName("beetroot");
			cM = getByName("beetroot_soup");
		}
	}

}
