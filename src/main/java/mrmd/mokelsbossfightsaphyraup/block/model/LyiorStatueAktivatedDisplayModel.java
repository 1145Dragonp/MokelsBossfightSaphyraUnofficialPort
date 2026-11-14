package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.LyiorStatueAktivatedDisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LyiorStatueAktivatedDisplayModel extends GeoModel<LyiorStatueAktivatedDisplayItem> {
   public ResourceLocation getAnimationResource(LyiorStatueAktivatedDisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/lyiorstatue.animation.json");
   }

   public ResourceLocation getModelResource(LyiorStatueAktivatedDisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/lyiorstatue.geo.json");
   }

   public ResourceLocation getTextureResource(LyiorStatueAktivatedDisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/lyiorstatueanimatedtexture.png");
   }
}
