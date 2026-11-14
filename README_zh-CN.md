<div align="center">

# Mokels The Shattered Goddess — 非官方移植版

**一款剧情驱动的 Minecraft Boss 战冒险模组，非官方移植至 NeoForge。**

[English](README.md) | 简体中文

</div>

---

## 关于

**Mokels The Shattered Goddess**（原名 *Mokels Bossfight: Saphyra*）是一款剧情驱动的 Boss 战冒险模组。本仓库是将原版 Forge 1.20.1（MCreator 制作）模组**非官方移植**到  Minecraft 1.21.1** 版本。





## 环境要求

| 依赖 | 版本 |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.244 左右|
| GeckoLib | 4.9.3 |
| PlayerAnimator | 1.21.1 兼容版 |
| Curios | 1.21.1 兼容版 |




## 从源码构建

```bash
git clone <本仓库>
cd MokelsBossfightSaphyraUnofficialPort
./gradlew build
# 产物：build/libs/<mod>-<version>.jar
```

运行开发环境客户端：

```bash
./gradlew runClient
```


## 致谢

- **原模组**：*Mokels Bossfight: Saphyra*，作者 **Mokels**（MCreator，Forge 1.20.1）
- **移植**：移植至 NeoForge 1.21.1 并新增本地化体系
- 许可证遵循原模组：[Academic Free License v3.0](https://opensource.org/license/afl-3-0-php/)


<br><br><br><br><br>

### 吐槽
#### 原作者貌似不会for循环，旧的[ExudationRulePowerProcedure.java](https://raw.githubusercontent.com/1145Dragonp/MokelsBossfightSaphyraDecompiledSourceCode/refs/heads/main/src/main/java/mrmd/mokelsbossfightsaphyraup/procedures/ExudationRulePowerProcedure.java),120次相同嵌套，6000多行代码，卡的java21的javac给4GB运行内存都OOM了，无法编译，害的我浪费了2小时在找问题，正宗屎山代码，和使用6000行代码判断奇偶数没有区别
