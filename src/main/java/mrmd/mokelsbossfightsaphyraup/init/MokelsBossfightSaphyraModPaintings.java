package mrmd.mokelsbossfightsaphyraup.init;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;

/**
 * 1.21.1 中 PaintingVariant 改为数据包驱动注册表 (data/<ns>/painting_variant/*.json)，
 * 无法再通过 BuiltInRegistries 在代码中注册。
 * 已生成数据包文件: data/mokels_bossfight_saphyra/painting_variant/saphyra_by_allan_72a.json
 */
public class MokelsBossfightSaphyraModPaintings {
   public static final Holder<PaintingVariant> SAPHYRA_BY_ALLAN_72A = Holder.direct(new PaintingVariant(
      64, 32, ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "saphyra_by_allan_72a")));
}
