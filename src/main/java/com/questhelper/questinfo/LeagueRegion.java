/*
 * Copyright (c) 2026, Syrif <https://github.com/syrifgit>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.questhelper.questinfo;

import lombok.Getter;

/**
 * Regions available in OSRS leagues. Area codes match param 1017 values from the game cache.
 */
public enum LeagueRegion
{
	MISTHALIN("Misthalin", 1, 2731),
	KARAMJA("Karamja", 2, 2732),
	ASGARNIA("Asgarnia", 3, 2733),
	KANDARIN("Kandarin", 4, 2737),
	MORYTANIA("Morytania", 5, 2735),
	DESERT("Desert", 6, 2734),
	TIRANNWN("Tirannwn", 7, 2739),
	FREMENNIK("Fremennik Province", 8, 2738),
	KOUREND("Kourend & Kebos", 10, 5468),
	WILDERNESS("Wilderness", 11, 2736),
	VARLAMORE("Varlamore", 21, 5887);

	@Getter
	private final String displayName;

	@Getter
	private final int areaCode;

	@Getter
	private final int spriteId;

	LeagueRegion(String displayName, int areaCode, int spriteId)
	{
		this.displayName = displayName;
		this.areaCode = areaCode;
		this.spriteId = spriteId;
	}

	public static LeagueRegion fromAreaCode(int areaCode)
	{
		for (LeagueRegion region : values())
		{
			if (region.areaCode == areaCode)
			{
				return region;
			}
		}
		return null;
	}
}
