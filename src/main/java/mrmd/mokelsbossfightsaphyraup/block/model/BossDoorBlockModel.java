package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.entity.BossDoorTileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BossDoorBlockModel extends GeoModel<BossDoorTileEntity> {
   public ResourceLocation getAnimationResource(BossDoorTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/bossgate.animation.json");
   }

   public ResourceLocation getModelResource(BossDoorTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/bossgate.geo.json");
   }

   public ResourceLocation getTextureResource(BossDoorTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/bossgatetexture.png");
   }
}
