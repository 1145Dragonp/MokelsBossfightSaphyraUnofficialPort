package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.OddmentHallowedTowerDisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OddmentHallowedTowerDisplayModel extends GeoModel<OddmentHallowedTowerDisplayItem> {
   public ResourceLocation getAnimationResource(OddmentHallowedTowerDisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/losthopestage2.animation.json");
   }

   public ResourceLocation getModelResource(OddmentHallowedTowerDisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/losthopestage2.geo.json");
   }

   public ResourceLocation getTextureResource(OddmentHallowedTowerDisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/losthopetexture.png");
   }
}
