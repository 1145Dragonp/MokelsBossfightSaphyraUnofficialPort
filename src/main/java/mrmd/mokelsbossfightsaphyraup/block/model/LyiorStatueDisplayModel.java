package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.LyiorStatueDisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LyiorStatueDisplayModel extends GeoModel<LyiorStatueDisplayItem> {
   public ResourceLocation getAnimationResource(LyiorStatueDisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/lyiorstatue.animation.json");
   }

   public ResourceLocation getModelResource(LyiorStatueDisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/lyiorstatue.geo.json");
   }

   public ResourceLocation getTextureResource(LyiorStatueDisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/lyiorstatuetexture.png");
   }
}
