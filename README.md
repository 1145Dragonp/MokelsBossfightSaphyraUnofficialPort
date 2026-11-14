<div align="center">

# Mokels The Shattered Goddess — Unofficial Port

**A story-driven boss-fight adventure mod for Minecraft, unofficially ported to NeoForge.**

English | [简体中文](README_zh-CN.md)

</div>

---

## About

**Mokels The Shattered Goddess** (original name *Mokels Bossfight: Saphyra*) is a story-driven boss-fight adventure mod. This repository is an **unofficial port** of the original Forge 1.20.1 (MCreator) mod to **Minecraft 1.21.1**.




## Requirements

| Dependency | Version |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | ~21.1.244 |
| GeckoLib | 4.9.3 |
| PlayerAnimator | 1.21.1-compatible |
| Curios | 1.21.1-compatible |




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


## Credits

- **Original mod**: *Mokels Bossfight: Saphyra* by **Mokels** (MCreator, Forge 1.20.1)
- **Port**: ported to NeoForge 1.21.1 with a new localization system
- License follows the original mod: [Academic Free License v3.0](https://opensource.org/license/afl-3-0-php/)


<br><br><br><br><br>


### Rant
#### It seems the original author doesn’t know how to use a for loop. The old [ExudationRulePowerProcedure.java](https://raw.githubusercontent.com/1145Dragonp/MokelsBossfightSaphyraDecompiledSourceCode/refs/heads/main/src/main/java/mrmd/mokelsbossfightsaphyraup/procedures/ExudationRulePowerProcedure.java) has 120 identical nested blocks, over 6,000 lines of code. It made javac in Java 21 run out of memory even with 4GB allocated, couldn’t compile, and wasted me 2 hours trying to find the problem. Truly shitty code, basically the same as using 6,000 lines of code just to check if a number is odd or even.