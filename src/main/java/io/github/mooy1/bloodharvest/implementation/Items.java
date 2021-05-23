package io.github.mooy1.bloodharvest.implementation;

import javax.annotation.Nonnull;
import lombok.experimental.UtilityClass;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.mooy1.bloodharvest.BloodHarvest;
import io.github.mooy1.bloodharvest.implementation.blocks.AlchemyCauldron;
import io.github.mooy1.bloodharvest.implementation.blocks.BloodAltar;
import io.github.mooy1.bloodharvest.implementation.tools.EssenceTalisman;
import io.github.mooy1.bloodharvest.implementation.tools.SacrificialDagger;
import io.github.mooy1.bloodharvest.util.Util;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

/**
 * Items added in this addon
 */
@UtilityClass
public final class Items {

    public static final SlimefunItemStack TEST_POTION = Util.createPotion(
            Color.RED,
            "&4Test",
            "&7testing",
            new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1200, 1),
            new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 1)
    );

    public static final SlimefunItemStack GROWTH_ESSENCE = new SlimefunItemStack(
            "GROWTH_ESSENCE",
            Material.LIME_DYE,
            "&aGrowth Essence",
            "&7The essence of a growing organism"
    );

    public static final SlimefunItemStack HARVEST_ESSENCE = new SlimefunItemStack(
            "HARVEST_ESSENCE",
            Material.YELLOW_DYE,
            "&eHarvest Essence",
            "&7The essence of a harvested plant"
    );

    public static final SlimefunItemStack TERRA_ESSENCE = new SlimefunItemStack(
            "TERRA_ESSENCE",
            Material.BROWN_DYE,
            "&6Terra Essence",
            "&7The essence of the earth"
    );

    public static final SlimefunItemStack DEEP_ESSENCE = new SlimefunItemStack(
            "DEEP_ESSENCE",
            Material.GRAY_DYE,
            "&8Deep Essence",
            "&7The essence of the deep"
    );

    public static final SlimefunItemStack BLOOD = new SlimefunItemStack(
            "BLOOD",
            Material.RED_DYE,
            "&cBlood",
            "&7Gleaming with potential power"
    );

    public static final SlimefunItemStack INFUSED_BLOOD = new SlimefunItemStack(
            "INFUSED_BLOOD",
            Material.RED_DYE,
            "&cInfused Blood",
            "&7Gleaming with power, infused with essence"
    );

    public static void setup(@Nonnull BloodHarvest plugin, @Nonnull Category category) {

        new SlimefunItem(category, BLOOD, SacrificialDagger.TYPE, new ItemStack[] {
                new CustomItem(Material.ZOMBIE_HEAD, "&7Kill any mob"),
                null, null, null, null, null, null, null, null
        }).register(plugin);

        new SlimefunItem(category, DEEP_ESSENCE, EssenceTalisman.TYPE, new ItemStack[] {
                new CustomItem(Material.STONE, "&7Mine any stone variant"),
                new CustomItem(Material.IRON_ORE, "&7Mine are variant"),
                null, null, null, null, null, null, null
        }).register(plugin);

        new SlimefunItem(category, GROWTH_ESSENCE, EssenceTalisman.TYPE, new ItemStack[] {
                new CustomItem(Material.OAK_LOG, "&7Chop any log variant"),
                new CustomItem(Material.OAK_LEAVES, "&7Harvest any leaf variant"),
                null, null, null, null, null, null, null
        }).register(plugin);

        new SlimefunItem(category, TERRA_ESSENCE, EssenceTalisman.TYPE, new ItemStack[] {
                new CustomItem(Material.DIRT, "&7Mine any dirt variant"),
                new CustomItem(Material.SAND, "&7Mine any sand variant"),
                new CustomItem(Material.GRAVEL, "&7Mine gravel"),
                null, null, null, null, null, null
        }).register(plugin);

        new SlimefunItem(category, HARVEST_ESSENCE, EssenceTalisman.TYPE, new ItemStack[] {
                new CustomItem(Material.WHEAT, "&7Harvest any crop variant"),
                null, null, null, null, null, null, null, null
        }).register(plugin);

        new SlimefunItem(category, INFUSED_BLOOD, BloodAltar.TYPE, new ItemStack[] {
                BLOOD, DEEP_ESSENCE, GROWTH_ESSENCE, HARVEST_ESSENCE, TERRA_ESSENCE, null, null, null, null
        }).register(plugin);

        new SlimefunItem(category, TEST_POTION, AlchemyCauldron.TYPE, new ItemStack[] {

        }).register(plugin);

    }

}
