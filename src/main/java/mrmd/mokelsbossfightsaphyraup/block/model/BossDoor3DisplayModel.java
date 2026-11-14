package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.BossDoor3DisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BossDoor3DisplayModel extends GeoModel<BossDoor3DisplayItem> {
   public ResourceLocation getAnimationResource(BossDoor3DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/bossgateopen.animation.json");
   }

   public ResourceLocation getModelResource(BossDoor3DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/bossgateopen.geo.json");
   }

   public ResourceLocation getTextureResource(BossDoor3DisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/bossgatetexture.png");
   }
}
