package com.mcbrosa.inventorycount;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

import java.awt.*;

@ConfigGroup(InventoryCountConfig.GROUP)
public interface InventoryCountConfig extends Config {
	String GROUP = "InventoryCount";

	@ConfigItem(
			keyName = "renderOnInventory",
			name = "Render on inventory icon",
			description = "Disable for infobox, enable for text overlay on inventory icon"
	)
	default boolean renderOnInventory() {
		return false;
	}

	@ConfigItem(keyName = "inventoryItemIdCheck", name = "Check for item", description = "item ID to check for in inventory")
	default int inventoryItemIdCheck()
	{
		return 371;
	}

	@ConfigItem(keyName = "inventoryItemCountCheck", name = "Check for number of items", description = "number of items to check of in inventory")
	@Range(
			min = 0,
			max = 28
	)
	default int inventoryItemCountCheck() {
		return 26;
	}

	@ConfigItem(
			position = 1,
			keyName = "itemCheckNegativeColor",
			name = "Items not in inventory",
			description = "Color displayed when conditions are not met for inventory"
	)
	default Color itemCheckNegativeColor()
	{
		return new Color(255, 0, 0);
	}

	@ConfigItem(
			position = 1,
			keyName = "itemCheckPositiveColor",
			name = "Items in inventory",
			description = "Color displayed when conditions are met for inventory"
	)
	default Color itemCheckPositiveColor()
	{
		return new Color(0, 255, 0);
	}
}