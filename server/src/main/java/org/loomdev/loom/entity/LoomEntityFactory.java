package org.loomdev.loom.entity;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Dolphin;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.animal.Panda;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.horse.Donkey;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.animal.horse.Mule;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.TraderLlama;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.decoration.LeashFenceKnotEntity;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Giant;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.EvokerFangs;
import net.minecraft.world.entity.projectile.EyeOfEnder;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.LlamaSpit;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.SpectralArrow;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.entity.projectile.ThrownExperienceBottle;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.entity.vehicle.MinecartChest;
import net.minecraft.world.entity.vehicle.MinecartCommandBlock;
import net.minecraft.world.entity.vehicle.MinecartFurnace;
import net.minecraft.world.entity.vehicle.MinecartHopper;
import net.minecraft.world.entity.vehicle.MinecartSpawner;
import net.minecraft.world.entity.vehicle.MinecartTNT;
import org.loomdev.loom.entity.animal.BeeImpl;
import org.loomdev.loom.entity.animal.CatImpl;
import org.loomdev.loom.entity.animal.ChickenImpl;
import org.loomdev.loom.entity.animal.GlowSquidImpl;
import org.loomdev.loom.entity.animal.SquidImpl;
import org.loomdev.loom.entity.animal.axolotl.AxolotlImpl;
import org.loomdev.loom.entity.animal.fish.CodImpl;
import org.loomdev.loom.entity.animal.CowImpl;
import org.loomdev.loom.entity.animal.DolphinImpl;
import org.loomdev.loom.entity.animal.FoxImpl;
import org.loomdev.loom.entity.animal.golem.IronGolemImpl;
import org.loomdev.loom.entity.animal.MooshroomImpl;
import org.loomdev.loom.entity.animal.OcelotImpl;
import org.loomdev.loom.entity.animal.PandaImpl;
import org.loomdev.loom.entity.animal.ParrotImpl;
import org.loomdev.loom.entity.animal.PigImpl;
import org.loomdev.loom.entity.animal.PolarBearImpl;
import org.loomdev.loom.entity.animal.RabbitImpl;
import org.loomdev.loom.entity.animal.fish.PufferfishImpl;
import org.loomdev.loom.entity.animal.fish.SalmonImpl;
import org.loomdev.loom.entity.animal.SheepImpl;
import org.loomdev.loom.entity.animal.golem.SnowGolemImpl;
import org.loomdev.loom.entity.animal.fish.TropicalFishImpl;
import org.loomdev.loom.entity.animal.TurtleImpl;
import org.loomdev.loom.entity.animal.WolfImpl;
import org.loomdev.loom.entity.animal.horse.DonkeyImpl;
import org.loomdev.loom.entity.animal.horse.HorseImpl;
import org.loomdev.loom.entity.animal.horse.LlamaImpl;
import org.loomdev.loom.entity.animal.horse.MuleImpl;
import org.loomdev.loom.entity.animal.horse.SkeletonHorseImpl;
import org.loomdev.loom.entity.animal.horse.TraderLlamaImpl;
import org.loomdev.loom.entity.animal.horse.ZombieHorseImpl;
import org.loomdev.loom.entity.boss.WitherImpl;
import org.loomdev.loom.entity.boss.enderdragon.EndCrystalImpl;
import org.loomdev.loom.entity.boss.enderdragon.EnderDragonImpl;
import org.loomdev.loom.entity.boss.enderdragon.EnderDragonPartImpl;
import org.loomdev.loom.entity.decoration.*;
import org.loomdev.loom.entity.effect.AreaEffectCloudImpl;
import org.loomdev.loom.entity.item.FallingBlockImpl;
import org.loomdev.loom.entity.item.ItemEntityImpl;
import org.loomdev.loom.entity.item.PrimedTntImpl;
import org.loomdev.loom.entity.misc.ExperienceOrbImpl;
import org.loomdev.loom.entity.misc.LightningBoltImpl;
import org.loomdev.loom.entity.monster.BlazeImpl;
import org.loomdev.loom.entity.monster.CaveSpiderImpl;
import org.loomdev.loom.entity.monster.CreeperImpl;
import org.loomdev.loom.entity.monster.zombie.DrownedImpl;
import org.loomdev.loom.entity.monster.ElderGuardianImpl;
import org.loomdev.loom.entity.monster.EndermanImpl;
import org.loomdev.loom.entity.monster.EndermiteImpl;
import org.loomdev.loom.entity.monster.illager.EvokerImpl;
import org.loomdev.loom.entity.monster.GhastImpl;
import org.loomdev.loom.entity.monster.zombie.GiantImpl;
import org.loomdev.loom.entity.monster.GuardianImpl;
import org.loomdev.loom.entity.monster.zombie.HuskImpl;
import org.loomdev.loom.entity.monster.illager.IllusionerImpl;
import org.loomdev.loom.entity.monster.MagmaCubeImpl;
import org.loomdev.loom.entity.monster.PhantomImpl;
import org.loomdev.loom.entity.monster.illager.PillagerImpl;
import org.loomdev.loom.entity.monster.illager.RavagerImpl;
import org.loomdev.loom.entity.monster.ShulkerImpl;
import org.loomdev.loom.entity.monster.SilverfishImpl;
import org.loomdev.loom.entity.monster.skeleton.SkeletonImpl;
import org.loomdev.loom.entity.monster.SlimeImpl;
import org.loomdev.loom.entity.monster.SpiderImpl;
import org.loomdev.loom.entity.monster.skeleton.StrayImpl;
import org.loomdev.loom.entity.monster.StriderImpl;
import org.loomdev.loom.entity.monster.illager.VexImpl;
import org.loomdev.loom.entity.monster.illager.VindicatorImpl;
import org.loomdev.loom.entity.monster.WitchImpl;
import org.loomdev.loom.entity.monster.skeleton.WitherSkeletonImpl;
import org.loomdev.loom.entity.monster.hoglin.ZoglinImpl;
import org.loomdev.loom.entity.monster.zombie.ZombieImpl;
import org.loomdev.loom.entity.monster.zombie.ZombieVillagerImpl;
import org.loomdev.loom.entity.monster.piglin.ZombifiedPiglinImpl;
import org.loomdev.loom.entity.monster.hoglin.HoglinImpl;
import org.loomdev.loom.entity.monster.piglin.PiglinBruteImpl;
import org.loomdev.loom.entity.monster.piglin.PiglinImpl;
import org.loomdev.loom.entity.passive.*;
import org.loomdev.loom.entity.npc.VillagerImpl;
import org.loomdev.loom.entity.npc.WanderingTraderImpl;
import org.loomdev.loom.entity.player.PlayerImpl;
import org.loomdev.loom.entity.projectile.*;
import org.loomdev.loom.entity.projectile.thrown.*;
import org.loomdev.loom.entity.vehicle.*;
import org.loomdev.loom.entity.vehicle.minecart.ChestMinecartImpl;
import org.loomdev.loom.entity.vehicle.minecart.CommandBlockMinecartImpl;
import org.loomdev.loom.entity.vehicle.minecart.FurnaceMinecartImpl;
import org.loomdev.loom.entity.vehicle.minecart.HopperMinecartImpl;
import org.loomdev.loom.entity.vehicle.minecart.MinecartImpl;
import org.loomdev.loom.entity.vehicle.minecart.SpawnerMinecartImpl;
import org.loomdev.loom.entity.vehicle.minecart.TntMinecartImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class LoomEntityFactory {

    private LoomEntityFactory() {
        throw new UnsupportedOperationException("LoomEntityFactory should never be instantiated");
    }

    private static final Map<Class<? extends Entity>, Class<? extends EntityImpl>> entityClassMappings = new HashMap<>();

    public static EntityImpl getLoomEntity(Entity entity) {
        if (!entityClassMappings.containsKey(entity.getClass())) {
            throw new IllegalStateException("No entity class mapping was found for " + entity.getClass());
        }

        try {
            Class<? extends EntityImpl> loomClass = entityClassMappings.get(entity.getClass());
            Constructor<? extends EntityImpl> ctor = loomClass.getConstructor(entity.getClass());
            return ctor.newInstance(entity);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    static {
        register(AreaEffectCloud.class, AreaEffectCloudImpl.class);
        register(ArmorStand.class, ArmorStandImpl.class);
        register(Arrow.class, ArrowImpl.class);
        register(Axolotl.class, AxolotlImpl.class);
        register(Bat.class, BatImpl.class);
        register(Bee.class, BeeImpl.class);
        register(Blaze.class, BlazeImpl.class);
        register(Boat.class, BoatImpl.class);
        register(Cat.class, CatImpl.class);
        register(CaveSpider.class, CaveSpiderImpl.class);
        register(MinecartChest.class, ChestMinecartImpl.class);
        register(Chicken.class, ChickenImpl.class);
        register(Cod.class, CodImpl.class);
        register(MinecartCommandBlock.class, CommandBlockMinecartImpl.class);
        register(Cow.class, CowImpl.class);
        register(Creeper.class, CreeperImpl.class);
        register(Dolphin.class, DolphinImpl.class);
        register(Donkey.class, DonkeyImpl.class);
        register(DragonFireball.class, DragonFireballImpl.class);
        register(Drowned.class, DrownedImpl.class);
        register(ThrownEgg.class, ThrownEggImpl.class);
        register(ElderGuardian.class, ElderGuardianImpl.class);
        register(EndCrystal.class, EndCrystalImpl.class);
        register(EnderDragon.class, EnderDragonImpl.class);
        register(ThrownEnderpearl.class, ThrownEnderpearlImpl.class);
        register(EnderDragonPart.class, EnderDragonPartImpl.class);
        register(EnderMan.class, EndermanImpl.class);
        register(Endermite.class, EndermiteImpl.class);
        register(Evoker.class, EvokerImpl.class);
        register(EvokerFangs.class, EvokerImpl.class);
        register(ThrownExperienceBottle.class, ThrownExperienceBottleImpl.class);
        register(ExperienceOrb.class, ExperienceOrbImpl.class);
        register(EyeOfEnder.class, ThrownEyeOfEnderImpl.class);
        register(FireworkRocketEntity.class, FireworkRocketImpl.class);
        register(FallingBlockEntity.class, FallingBlockImpl.class);
        register(FishingHook.class, FishingHookImpl.class);
        register(Fox.class, FoxImpl.class);
        register(Ghast.class, GhastImpl.class);
        register(Giant.class, GiantImpl.class);
        register(Guardian.class, GuardianImpl.class);
        register(Hoglin.class, HoglinImpl.class);
        register(Horse.class, HorseImpl.class);
        register(Husk.class, HuskImpl.class);
        register(Illusioner.class, IllusionerImpl.class);
        register(IronGolem.class, IronGolemImpl.class);
        register(ItemEntity.class, ItemEntityImpl.class);
        register(ItemFrame.class, ItemFrameImpl.class);
        register(LargeFireball.class, LargeFireballImpl.class);
        register(LeashFenceKnotEntity.class, LeashKnotImpl.class);
        register(LightningBolt.class, LightningBoltImpl.class);
        register(Llama.class, LlamaImpl.class);
        register(LlamaSpit.class, LlamaSpitImpl.class);
        register(MagmaCube.class, MagmaCubeImpl.class);
        register(MinecartFurnace.class, FurnaceMinecartImpl.class);
        register(MinecartHopper.class, HopperMinecartImpl.class);
        register(Minecart.class, MinecartImpl.class);
        register(MinecartSpawner.class, SpawnerMinecartImpl.class);
        register(MinecartTNT.class, TntMinecartImpl.class);
        register(Mule.class, MuleImpl.class);
        register(MushroomCow.class, MooshroomImpl.class);
        register(Ocelot.class, OcelotImpl.class);
        register(Painting.class, PaintingImpl.class);
        register(Panda.class, PandaImpl.class);
        register(Parrot.class, ParrotImpl.class);
        register(Phantom.class, PhantomImpl.class);
        register(Pig.class, PigImpl.class);
        register(Piglin.class, PiglinImpl.class);
        register(PiglinBrute.class, PiglinBruteImpl.class);
        register(Pillager.class, PillagerImpl.class);
        register(PolarBear.class, PolarBearImpl.class);
        register(PrimedTnt.class, PrimedTntImpl.class);
        register(Pufferfish.class, PufferfishImpl.class);
        register(Rabbit.class, RabbitImpl.class);
        register(Ravager.class, RavagerImpl.class);
        register(Salmon.class, SalmonImpl.class);
        register(Sheep.class, SheepImpl.class);
        register(Shulker.class, ShulkerImpl.class);
        register(ShulkerBullet.class, ShulkerBulletImpl.class);
        register(Silverfish.class, SilverfishImpl.class);
        register(Skeleton.class, SkeletonImpl.class);
        register(SkeletonHorse.class, SkeletonHorseImpl.class);
        register(Slime.class, SlimeImpl.class);
        register(SmallFireball.class, SmallFireballImpl.class);
        register(SnowGolem.class, SnowGolemImpl.class);
        register(Snowball.class, ThrownSnowballImpl.class);
        register(SpectralArrow.class, SpectralArrowImpl.class);
        register(Spider.class, SpiderImpl.class);
        register(Squid.class, SquidImpl.class);
        register(Stray.class, StrayImpl.class);
        register(Strider.class, StriderImpl.class);
        register(ThrownPotion.class, ThrownPotionImpl.class);
        register(Turtle.class, TurtleImpl.class);
        register(ThrownTrident.class, ThrownTridentImpl.class);
        register(TraderLlama.class, TraderLlamaImpl.class);
        register(TropicalFish.class, TropicalFishImpl.class);
        register(Vex.class, VexImpl.class);
        register(Villager.class, VillagerImpl.class);
        register(Vindicator.class, VindicatorImpl.class);
        register(WanderingTrader.class, WanderingTraderImpl.class);
        register(Witch.class, WitchImpl.class);
        register(WitherBoss.class, WitherImpl.class);
        register(WitherSkeleton.class, WitherSkeletonImpl.class);
        register(WitherSkull.class, WitherSkullImpl.class);
        register(Wolf.class, WolfImpl.class);
        register(Zoglin.class, ZoglinImpl.class);
        register(Zombie.class, ZombieImpl.class);
        register(ZombieHorse.class, ZombieHorseImpl.class);
        register(ZombieVillager.class, ZombieVillagerImpl.class);
        register(ZombifiedPiglin.class, ZombifiedPiglinImpl.class);
        register(ServerPlayer.class, PlayerImpl.class);
        register(GlowSquid.class, GlowSquidImpl.class);
    }

    private static void register(Class<? extends Entity> mcClass, Class<? extends EntityImpl> loomClass) {
        entityClassMappings.put(mcClass, loomClass);
    }
}
