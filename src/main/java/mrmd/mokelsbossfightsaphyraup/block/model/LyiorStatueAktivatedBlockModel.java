package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.entity.LyiorStatueAktivatedTileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LyiorStatueAktivatedBlockModel extends GeoModel<LyiorStatueAktivatedTileEntity> {
   public ResourceLocation getAnimationResource(LyiorStatueAktivatedTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/lyiorstatue.animation.json");
   }

   public ResourceLocation getModelResource(LyiorStatueAktivatedTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/lyiorstatue.geo.json");
   }

   public ResourceLocation getTextureResource(LyiorStatueAktivatedTileEntity animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/lyiorstatueanimatedtexture.png");
   }
}
