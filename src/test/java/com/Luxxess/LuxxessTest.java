package com.Luxxess;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LuxxessTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LuxxessPlugin.class);
		RuneLite.main(args);
	}
}