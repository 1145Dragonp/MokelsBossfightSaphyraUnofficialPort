package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.entity.LyiorStatueTileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LyiorStatueBlockModel extends GeoModel<LyiorStatueTileEntity> {
   public ResourceLocation getAnimationResource(LyiorStatueTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/lyiorstatue.animation.json");
   }

   public ResourceLocation getModelResource(LyiorStatueTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/lyiorstatue.geo.json");
   }

   public ResourceLocation getTextureResource(LyiorStatueTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/lyiorstatuetexture.png");
   }
}
