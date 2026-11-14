package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.entity.OddmentHallowedTowerTileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OddmentHallowedTowerBlockModel extends GeoModel<OddmentHallowedTowerTileEntity> {
   public ResourceLocation getAnimationResource(OddmentHallowedTowerTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/losthopestage2.animation.json");
   }

   public ResourceLocation getModelResource(OddmentHallowedTowerTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/losthopestage2.geo.json");
   }

   public ResourceLocation getTextureResource(OddmentHallowedTowerTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/losthopetexture.png");
   }
}
