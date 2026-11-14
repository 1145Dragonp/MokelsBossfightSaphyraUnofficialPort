package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.OddmentStage2DisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OddmentStage2DisplayModel extends GeoModel<OddmentStage2DisplayItem> {
   public ResourceLocation getAnimationResource(OddmentStage2DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/losthopestage2.animation.json");
   }

   public ResourceLocation getModelResource(OddmentStage2DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/losthopestage2.geo.json");
   }

   public ResourceLocation getTextureResource(OddmentStage2DisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/losthopetexture.png");
   }
}
