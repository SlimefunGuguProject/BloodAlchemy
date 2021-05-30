package io.github.mooy1.bloodalchemy;

import javax.annotation.Nonnull;

import org.bukkit.Material;

import io.github.mooy1.bloodalchemy.implementation.Items;
import io.github.mooy1.infinitylib.AbstractAddon;
import io.github.mooy1.infinitylib.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public final class BloodAlchemy extends AbstractAddon {
    
    private static BloodAlchemy instance;
    
    public static BloodAlchemy inst() {
        return instance;
    }
    
    @Override
    protected void onAddonEnable() {
        // All of the config and auto update stuff is taken care of in AbstractAddon#onEnable
        instance = this;

        Category category = new Category(getKey("blood_alchemy"),
                new CustomItem(Material.NETHER_WART_BLOCK, "&4Blood Alchemy"));

        Items.setup(this, category);
    }

    @Override
    protected void onAddonDisable() {
        instance = null;
    }

    @Override
    protected Metrics setupMetrics() {
        return new Metrics(this, 11483);
    }

    @Nonnull
    @Override
    protected String getGithubPath() {
        return "Mooy1/BloodAlchemy/master";
    }
    
}
