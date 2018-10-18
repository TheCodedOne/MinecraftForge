/*
 * Minecraft Forge
 * Copyright (c) 2016-2018.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.debug.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = CreativeTabImageTest.MODID, name = "Custom Tab Image Test", version = "1.0", acceptableRemoteVersions = "*")
public class CreativeTabImageTest {
    public static final String MODID = "customtabimage";
    static final boolean ENABLED = false;
    public static final CreativeTabs TAB = !ENABLED ? null : new CreativeTabs("customtab"){
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.BANNER);
        }

        @Override
        public ResourceLocation getBackgroundImage()
        {
            return new ResourceLocation(MODID, "textures/gui/creative.png");
        }

        @Override
        public ResourceLocation getTabTexture(int selectedTabIndex)
        {
            if (selectedTabIndex != getTabIndex())
                return super.getTabTexture(selectedTabIndex);
            return new ResourceLocation(MODID, "textures/gui/tabs.png");
        }

        @Override
        public int getTabIconOffsetX(int selectedTabIndex)
        {
            return 1;
        }

        @Override
        public int getTabIconOffsetY(int selectedTabIndex)
        {
            return 1;
        }
    };
}
