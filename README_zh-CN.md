<div align="center">

# Mokels The Shattered Goddess — 非官方移植版

**一款剧情驱动的 Minecraft Boss 战冒险模组，非官方移植至 NeoForge。**

[English](README.md) | 简体中文

</div>

---

## 关于

**Mokels The Shattered Goddess**（原名 *Mokels Bossfight: Saphyra*）是一款剧情驱动的 Boss 战冒险模组。本仓库是将原版 Forge 1.20.1（MCreator 制作）模组**非官方移植**到 **NeoForge 21.1.244 / Minecraft 1.21.1** 的社区版本，基于 GeckoLib 4.9.3 与 PlayerAnimator 重建。

跟随破碎女神萨菲拉的剧情：与神秘的莉娜拉相遇、帮助学者玛琳、唤醒莱约尔雕像、挑战无名守门人，最终在观测台直面象牙恶魔——直至第一章完结。

## 特性

- **剧情 Boss** —— 无名守门人、象牙恶魔（第一形态）、萨菲拉（第二形态），各自拥有专属 AI、攻击方式与演出式登场
- **可探索结构** —— 断裂钟楼、誓约脓疮教堂、三圣塔与观测台（生成稀疏且彼此相距极远，可用 `/locate` 查找）
- **对话与任务链** —— 莉娜拉的指引、玛琳的书与记忆任务、萨菲拉的试炼；对话全部数据驱动（可被资源包覆盖）
- **圣印升级** —— 通过神龛与残件逐级升级红日圣印
- **钥匙屏障** —— 脓印/神圣符印钥匙可击碎封锁塔层与 Boss 竞技场的迷雾屏障
- **自定义装备** —— 太刀、巨剑、镜刃、女巫法杖、律系列魔法卷轴、记忆剧情物品等
- **自定义动画与音效** —— GeckoLib 实体动画、PlayerAnimator 玩家动画（冲刺等）、专属音乐与音效
- **多语言** —— 游戏内英文与简体中文（559 条词条），跟随 Minecraft 语言设置自动切换

## 环境要求

| 依赖 | 版本 |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.244 |
| GeckoLib | 4.9.3 |
| PlayerAnimator | 1.21.1 兼容版 |
| Curios | 1.21.1 兼容版 |

## 安装

1. 安装 **Minecraft 1.21.1** + **NeoForge 21.1.244**
2. 将本模组 jar 以及 **GeckoLib、PlayerAnimator、Curios** 放入 `mods` 文件夹
3. 启动游戏即可。开始剧情：进入一个新世界——断裂钟楼在召唤你……

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

## 进度与已知限制

- 第一章内容完整（"第一章 完"）；第二章原模组亦未发布
- 本仓库为**非官方移植**——移植相关的 bug 请提交到本仓库，勿扰原作者
- Boss 登场任务不跨服务器重启持久化，请避免在 Boss 演出中途重启存档
- "破碎"雾门所需的神圣符印钥尚无生存获取途径

## 致谢

- **原模组**：*Mokels Bossfight: Saphyra*，作者 **Mokels**（MCreator，Forge 1.20.1）
- **移植**：社区移植至 NeoForge 1.21.1——重建生成/动画/结构层，并新增本地化体系
- 许可证遵循原模组：[Academic Free License v3.0](https://opensource.org/license/afl-3-0-php/)
