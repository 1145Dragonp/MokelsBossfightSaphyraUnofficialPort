<div align="center">

# Mokels The Shattered Goddess — Unofficial Port

**A story-driven boss-fight mod for Minecraft, unofficially ported to NeoForge.**

English | [简体中文](README_zh-CN.md)

</div>

---

## About

**Mokels The Shattered Goddess** (original name *Mokels Bossfight: Saphyra*) is a story-driven boss-fight adventure mod. This is an **unofficial community port** of the original Forge 1.20.1 (MCreator) mod to **NeoForge 21.1.244 / Minecraft 1.21.1**, rebuilt on modern loaders with GeckoLib 4.9.3 and PlayerAnimator.

Follow the story of Saphyra, the Shattered Goddess: meet the mysterious Linara, help the scholar Marlene, awaken the Lyior statues, challenge the Nameless Gatekeeper and face the Ivory Devil at the Observatory — leading up to the end of Chapter 1.

## Features

- **Story bosses** — the Nameless Gatekeeper, the Ivory Devil (first form) and Saphyra the Witch (second form), each with custom AI, attacks and cutscene-style entrances
- **Explorable structures** — Fractured Clocktower, Church of the Oath Pus, Three Hallowed Towers and the Observatory (rare, far-apart spawns; use `/locate`)
- **Dialogue & quest chain** — Linara's guidance, Marlene's book-and-memory quest, Saphyra's trial; dialogue is fully data-driven (resource-pack friendly)
- **Sigil progression** — upgrade the Sigil of the Red Sun through stages via shrines and oddments
- **Key-gated barriers** — Pus/Hallowed sigil keys break fog barriers blocking tower floors and boss arenas
- **Custom gear** — katana, claymore, mirror blade, witch staff, rule-type magic scrolls, Remembrance story items and more
- **Custom animations & sounds** — GeckoLib entity animations, PlayerAnimator player animations (dash etc.), custom music and sound effects
- **Localization** — English & 简体中文 in-game (559 keys), fully switchable via Minecraft's language settings

## Requirements

| Dependency | Version |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.244 |
| GeckoLib | 4.9.3 |
| PlayerAnimator | 1.21.1-compatible |
| Curios | 1.21.1-compatible |

## Installation

1. Install **Minecraft 1.21.1** with **NeoForge 21.1.244**
2. Drop the mod jar **plus GeckoLib, PlayerAnimator and Curios** into your `mods` folder
3. Launch and play. To start the story, log into a new world — the fractured clocktower calls to you…

## Building from source

```bash
git clone <this-repo>
cd MokelsBossfightSaphyraUnofficialPort
./gradlew build
# output: build/libs/<mod>-<version>.jar
```

Run a dev client with:

```bash
./gradlew runClient
```

## Status & Known Limitations

- Chapter 1 content is complete ("END OF CHAPTER 1"); Chapter 2 is not yet written (also true of the original mod)
- This is an **unofficial port** — report porting-specific bugs to this repository, not to the original author
- Boss-spawn tasks are not persisted across server restarts; avoid restarting mid-boss-cinematic
- The hallowed key used for the "Shattered" fog has no survival acquisition route yet

## Credits

- **Original mod**: *Mokels Bossfight: Saphyra* by **Mokels** (MCreator, Forge 1.20.1)
- **Port**: community port to NeoForge 1.21.1 — rebuilt spawn/animation/structure layer, added localization infrastructure
- License follows the original mod: [Academic Free License v3.0](https://opensource.org/license/afl-3-0-php/)
